package com.lotus.homework17

// Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
class ShoppingCart {
    // Поле для хранения товаров: ID товара и его количество
    private val items = mutableMapOf<Int, Int>()

    // Базовый метод добавления одной единицы товара
    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    // Перегрузка метода: принимает ID товара и количество
    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    // Перегрузка метода: принимает словарь из ID и количества
    fun addToCart(itemsMap: Map<Int, Int>) {
        for ((itemId, amount) in itemsMap) {
            items[itemId] = items.getOrDefault(itemId, 0) + amount
        }
    }

    // Перегрузка метода: принимает список ID товаров
    fun addToCart(itemIds: List<Int>) {
        for (itemId in itemIds) {
            items[itemId] = items.getOrDefault(itemId, 0) + 1
        }
    }

    // Метод для вывода корзины в консоль
    fun printCart() {
        if (items.isEmpty()) {
            println("Корзина пуста")
        } else {
            println("Корзина:")
            items.forEach { (itemId, quantity) ->
                println("Товар ID: $itemId, Количество: $quantity")
            }
        }
    }

    // Переопределение метода toString для красивого вывода корзины
    override fun toString(): String {
        val sb = StringBuilder()
        var totalItems = 0
        var totalQuantity = 0

        sb.append("Корзина товаров:\n")
        sb.append("ID товара\tКоличество\n")
        sb.append("-------------------------\n")
        items.forEach { (itemId, quantity) ->
            sb.append("$itemId\t\t$quantity\n")
            totalItems++
            totalQuantity += quantity
        }
        sb.append("-------------------------\n")
        sb.append("Всего артикулов: $totalItems\n")
        sb.append("Общее количество товаров: $totalQuantity\n")

        return sb.toString()
    }
}

// Пример использования
fun main() {
    val cart = ShoppingCart()

    // Добавляем товары разными способами
    cart.addToCart(1)                  // Добавление одной единицы товара с ID 1
    cart.addToCart(2, 3)               // Добавление трех единиц товара с ID 2
    cart.addToCart(mapOf(3 to 2, 4 to 5))  // Добавление товаров через словарь
    cart.addToCart(listOf(1, 2, 3))    // Добавление списка товаров (по одной единице каждого)

    // Печать корзины
    cart.printCart()

    // Вывод корзины через toString
    println(cart.toString())
}


// Класс Логгер
class Logger {
    // Базовый метод для вывода сообщения с уровнем INFO
    fun log(message: String) {
        println("[INFO]: $message")
    }

    // Перегрузка метода: принимает уровень логирования и сообщение
    fun log(level: LogLevel, message: String) {
        when (level) {
            LogLevel.INFO -> println("[INFO]: $message")
            LogLevel.WARNING -> println("\u001B[33m[WARNING]: $message\u001B[0m")  // Желтый цвет
            LogLevel.ERROR -> println("\u001B[31;47m[ERROR]: $message\u001B[0m")    // Белый цвет на красном фоне
            LogLevel.DEBUG -> println("[DEBUG]: $message")
        }
    }

    // Перегрузка метода: принимает список сообщений и выводит их с уровнем INFO
    fun log(messages: List<String>) {
        messages.forEach { println("[INFO]: $it") }
    }

    // Перегрузка метода: принимает объект типа Exception и выводит его сообщение с уровнем ERROR
    fun log(exception: Exception) {
        println("\u001B[31;47m[ERROR]: ${exception.message}\u001B[0m")
    }
}

// Перечисление уровней логирования
enum class LogLevel {
    INFO,
    WARNING,
    ERROR,
    DEBUG
}

// Пример использования
fun main() {
    val logger = Logger()

    // Выводим сообщения разными способами
    logger.log("Это информационное сообщение.")
    logger.log(LogLevel.WARNING, "Это предупреждающее сообщение.")
    logger.log(LogLevel.ERROR, "Это сообщение об ошибке.")
    logger.log(LogLevel.DEBUG, "Это отладочное сообщение.")

    // Выводим список сообщений
    logger.log(listOf("Первое сообщение", "Второе сообщение", "Третье сообщение"))

    // Выводим сообщение об ошибке из Exception
    logger.log(Exception("Это исключение"))
}
