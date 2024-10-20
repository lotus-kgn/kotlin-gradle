// 1. Предварительные задачи на использование методов.

// Задачи на приведение коллекций к значению

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // 1. Проверить, что размер коллекции больше 5 элементов
    if (numbers.size > 5) {
        println("Коллекция содержит больше 5 элементов")
    }

    // 2. Проверить, что коллекция пустая
    if (numbers.isEmpty()) {
        println("Коллекция пустая")
    }

    // 3. Проверить, что коллекция не пустая
    if (numbers.isNotEmpty()) {
        println("Коллекция не пустая")
    }

    // 4. Взять элемент по индексу или создать значение, если индекса не существует
    val valueOrDefault = numbers.getOrElse(10) { 42 }
    println("Элемент по индексу или значение по умолчанию: $valueOrDefault")

    // 5. Собрать коллекцию в строку
    val joinedString = numbers.joinToString(", ")
    println("Коллекция в строке: $joinedString")

    // 6. Посчитать сумму всех значений
    val sum = numbers.sum()
    println("Сумма всех значений: $sum")

    // 7. Посчитать среднее
    val average = numbers.average()
    println("Среднее значение: $average")

    // 8. Взять максимальное число
    val max = numbers.maxOrNull()
    println("Максимальное число: $max")

    // 9. Взять минимальное число
    val min = numbers.minOrNull()
    println("Минимальное число: $min")

    // 10. Взять первое число или null
    val first = numbers.firstOrNull()
    println("Первое число или null: $first")

    // 11. Проверить, что коллекция содержит элемент
    val containsValue = numbers.contains(3)
    if (containsValue) {
        println("Коллекция содержит число 3")
    }
}

// Задачи на обработку коллекций

fun main() {
    val numbers = listOf(10, 15, 20, 25, 30, 35, 40)
    val words = listOf("apple", "banana", "cherry", "date", null, "fig", "grape")

    // 1. Отфильтровать коллекцию по диапазону 18-30
    val filteredByRange = numbers.filter { it in 18..30 }
    println("Отфильтровано по диапазону 18-30: $filteredByRange")

    // 2. Выбрать числа, которые не делятся на 2 и 3 одновременно
    val filteredByCondition = numbers.filterNot { it % 2 == 0 && it % 3 == 0 }
    println("Числа, не делящиеся на 2 и 3 одновременно: $filteredByCondition")

    // 3. Очистить текстовую коллекцию от null элементов
    val cleanedWords = words.filterNotNull()
    println("Коллекция без null: $cleanedWords")

    // 4. Преобразовать текстовую коллекцию в коллекцию длин слов
    val wordLengths = cleanedWords.map { it.length }
    println("Длины слов: $wordLengths")

    // 5. Преобразовать текстовую коллекцию в map, где ключи - слова, а значения - перевёрнутые слова
    val wordMap = cleanedWords.associate { it to it.reversed() }
    println("Слова и перевёрнутые слова: $wordMap")

    // 6. Отсортировать список в алфавитном порядке
    val sortedWords = cleanedWords.sorted()
    println("Отсортированный список: $sortedWords")

    // 7. Отсортировать список по убыванию
    val sortedDescendingWords = cleanedWords.sortedDescending()
    println("Список по убыванию: $sortedDescendingWords")

    // 8. Распечатать квадраты элементов списка
    val squaredNumbers = numbers.map { it * it }
    println("Квадраты чисел: $squaredNumbers")

    // 9. Группировать список по первой букве слов
    val groupedByFirstLetter = cleanedWords.groupBy { it.first() }
    println("Группировка по первой букве: $groupedByFirstLetter")

    // 10. Очистить список от дублей
    val distinctNumbers = numbers.distinct()
    println("Список без дублей: $distinctNumbers")

    // 11. Взять первые 3 элемента списка
    val firstThree = numbers.take(3)
    println("Первые 3 элемента: $firstThree")

    // 12. Взять последние 3 элемента списка
    val lastThree = numbers.takeLast(3)
    println("Последние 3 элемента: $lastThree")
}

// Задание 2: Характеристика числовой коллекции

//Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции используя конструкцию when

fun describeCollection(numbers: List<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"
        numbers.size < 5 -> "Короткая"
        numbers.firstOrNull() == 0 -> "Стартовая"
        numbers.sum() > 10000 -> "Массивная"
        numbers.average() == 10.0 -> "Сбалансированная"
        numbers.joinToString("").length == 20 -> "Клейкая"
        numbers.maxOrNull() ?: Int.MIN_VALUE < -10 -> "Отрицательная"
        numbers.minOrNull() ?: Int.MAX_VALUE > 1000 -> "Положительная"
        numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

fun main() {
    // Примеры вызова метода для каждой из веток:

    println(describeCollection(emptyList()))  // Пусто
    println(describeCollection(listOf(1, 2, 3)))  // Короткая
    println(describeCollection(listOf(0, 1, 2, 3)))  // Стартовая
    println(describeCollection(listOf(5000, 6000)))  // Массивная
    println(describeCollection(listOf(10, 10, 10)))  // Сбалансированная
    println(describeCollection(listOf(11111, 22222)))  // Клейкая (сумма строк элементов длиной 20)
    println(describeCollection(listOf(-15, -20, -30)))  // Отрицательная
    println(describeCollection(listOf(2000, 3000, 4000)))  // Положительная
    println(describeCollection(listOf(3, 14, 5, 9)))  // Пи***тая
    println(describeCollection(listOf(7, 13, 19)))  // Уникальная
}

// Задание 3: Анализ Учебных Оценок

fun main() {
    // Начальные значения
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

    // Отфильтровать удовлетворительные оценки, отсортировать и взять первые 3
    val top3SatisfactoryGrades = grades
        .filter { it >= 60 }         // Оставляем только оценки >= 60
        .sorted()                    // Сортируем оставшиеся оценки по возрастанию
        .take(3)                     // Берём первые 3

    println("Три лучшие удовлетворительные оценки: $top3SatisfactoryGrades")
}

// Задание 4: Создание каталога по первой букве.

fun main() {
    // Начальные значения
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковёр", "Шкаф", "часы", "Люстра",
        "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка",
        "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка",
        "Абажур", "диван", "Кресло", "заначка", "Бра", "пепельница", "Глобус", "статуэтка",
        "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы",
        "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда",
        "Настольная лампа", "торшер", "Этажерка"
    )

    // Приводим слова к нижнему регистру и группируем по первой букве
    val groupedCatalog = list
        .map { it.lowercase() } // Приводим все слова к нижнему регистру
        .groupBy { it.first() }  // Группируем по первой букве

    // Выводим результат
    groupedCatalog.forEach { (letter, words) ->
        println("Буква '$letter': ${words.joinToString(", ")}")
    }
}

// Задание 5: Подсчёт средней длины слов в списке.

fun main() {
    // Начальные значения из задачи 3 (слова)
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковёр", "Шкаф", "часы", "Люстра",
        "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка",
        "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка",
        "Абажур", "диван", "Кресло", "заначка", "Бра", "пепельница", "Глобус", "статуэтка",
        "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы",
        "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда",
        "Настольная лампа", "торшер", "Этажерка"
    )

    // Преобразуем слова в их длины и считаем среднее
    val averageLength = list
        .map { it.length }         // Преобразуем слова в длины
        .average()                 // Вычисляем среднее значение

    // Форматируем результат с двумя знаками после запятой
    println("Средняя длина слов: %.2f".format(averageLength))
}

// Задание 6: Категоризация чисел.

fun main() {
    // Начальные значения
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

    // Отбираем уникальные числа, сортируем по убыванию и группируем по чётности
    val categorizedNumbers = numbers
        .distinct()                         // Убираем дубликаты
        .sortedDescending()                 // Сортируем по убыванию
        .groupBy { it % 2 == 0 }            // Группируем по чётности (чётные или нечётные)

    // Выводим результат
    categorizedNumbers.forEach { (isEven, nums) ->
        val category = if (isEven) "Чётные" else "Нечётные"
        println("$category: ${nums.joinToString(", ")}")
    }
}

// Задание 7: Поиск первого подходящего элемента

fun main() {
    // Начальные значения
    val ages = listOf(22, 18, 30, 45, 17, null, 60)

    // Поиск первого возраста больше 18, преобразование в строку или вывод сообщения
    val result = ages
        .firstOrNull { it != null && it > 18 } // Ищем первый элемент > 18
        ?.toString()                           // Преобразуем найденный элемент в строку
        ?: "Подходящий возраст не найден"      // Если не найден, выводим сообщение

    println(result)
}
