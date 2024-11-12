package com.lotus.homework20

//Корзина товаров
class ShoppingCart {
    // Словарь для хранения товаров: ключ - ID товара, значение - количество
    private val items = mutableMapOf<String, Int>()

    // Базовый метод добавления товара по ID (одна единица)
    fun addToCart(itemId: String) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    // Перегруженный метод для добавления товара по ID и количеству
    fun addToCart(itemId: String, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    // Перегруженный метод для добавления товаров из словаря (ID и количество)
    fun addToCart(itemsMap: Map<String, Int>) {
        for ((itemId, amount) in itemsMap) {
            items[itemId] = items.getOrDefault(itemId, 0) + amount
        }
    }

    // Перегруженный метод для добавления товаров из списка ID (по одной единице каждого)
    fun addToCart(itemIds: List<String>) {
        for (itemId in itemIds) {
            items[itemId] = items.getOrDefault(itemId, 0) + 1
        }
    }

    // Переопределенный метод toString для красивого вывода содержимого корзины
    override fun toString(): String {
        val itemList = StringBuilder("Содержимое корзины:\n")
        var totalItems = 0
        var totalQuantity = 0

        itemList.append(String.format("%-10s %-10s\n", "ID Товара", "Количество"))
        itemList.append("=".repeat(20)).append("\n")

        for ((itemId, quantity) in items) {
            itemList.append(String.format("%-10s %-10d\n", itemId, quantity))
            totalItems += 1
            totalQuantity += quantity
        }

        itemList.append("=".repeat(20)).append("\n")
        itemList.append("Всего уникальных товаров: $totalItems\n")
        itemList.append("Общее количество товаров: $totalQuantity\n")

        return itemList.toString()
    }
}

fun main() {
    val cart = ShoppingCart()

    // Добавление товара разными способами
    cart.addToCart("item1")                          // Одна единица товара с ID "item1"
    cart.addToCart("item2", 3)                       // Три единицы товара с ID "item2"
    cart.addToCart(mapOf("item3" to 2, "item4" to 5)) // Добавление товаров из словаря
    cart.addToCart(listOf("item1", "item3", "item5")) // Добавление товаров из списка ID

    // Печать содержимого корзины
    println(cart)
}

// Логгер
class Logger {

    // Базовый метод log(message) с уровнем INFO
    fun log(message: String) {
        println("INFO: $message")
    }

    // Перегруженный метод log(level, message) для вывода с разными уровнями
    fun log(level: String, message: String) {
        when (level.uppercase()) {
            "WARNING" -> println("\u001B[33mWARNING: $message\u001B[0m") // Желтый цвет для WARNING
            "ERROR" -> println("\u001B[37;41mERROR: $message\u001B[0m")  // Белый текст на красном фоне для ERROR
            "DEBUG" -> println("DEBUG: $message")                        // DEBUG выводим без цвета
            else -> println("INFO: $message")                           // INFO по умолчанию
        }
    }

    // Перегруженный метод log(messages: List<String>) для вывода списка сообщений с уровнем INFO
    fun log(messages: List<String>) {
        messages.forEach { message ->
            println("INFO: $message")
        }
    }

    // Перегруженный метод log(exception: Exception) для вывода исключений с уровнем ERROR
    fun log(exception: Exception) {
        println("\u001B[37;41mERROR: ${exception.message}\u001B[0m")  // Белый текст на красном фоне для ERROR
    }
}

fun main() {
    val logger = Logger()

    // Логирование одного сообщения с уровнем INFO (базовый метод)
    logger.log("Application started")

    // Логирование с уровнем WARNING
    logger.log("WARNING", "Low disk space")

    // Логирование с уровнем ERROR
    logger.log("ERROR", "Failed to connect to database")

    // Логирование с уровнем DEBUG
    logger.log("DEBUG", "User authentication successful")

    // Логирование списка сообщений с уровнем INFO
    val messages = listOf("Initializing components", "Loading configuration", "Connecting to services")
    logger.log(messages)

    // Логирование исключения
    val exception = Exception("Null pointer exception occurred")
    logger.log(exception)
}
