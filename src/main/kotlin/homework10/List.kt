fun main() {
    // Задание 1: Создание Пустого Списка
    val emptyList: List<Int> = listOf()

    // Задание 2: Создание и Инициализация Списка
    val stringList: List<String> = listOf("Hello", "World", "Kotlin")

    // Задание 3: Создание Изменяемого Списка
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    // Задание 4: Добавление Элементов в Список
    mutableList.addAll(listOf(6, 7, 8))  // Добавляем 6, 7, 8

    // Задание 5: Удаление Элементов из Списка
    val mutableStringList: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    mutableStringList.remove("World")  // Удаляем "World"

    // Задание 6: Перебор Списка в Цикле
    val numberList: List<Int> = listOf(1, 2, 3, 4, 5)
    for (number in numberList) {
        println(number)
    }

    // Задание 7: Получение Элементов Списка по Индексу
    val wordList: List<String> = listOf("Apple", "Banana", "Cherry")
    val secondElement = wordList[1]  // Получаем элемент по индексу 1 (второй элемент)
    println(secondElement)  // Выведет "Banana"

    // Задание 8: Перезапись Элементов Списка по Индексу
    val mutableNumberList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    mutableNumberList[2] = 10  // Заменяем элемент на позиции 2 на 10

    // Задание 9: Объединение Двух Списков
    val list1: List<String> = listOf("A", "B", "C")
    val list2: List<String> = listOf("D", "E", "F")
    val combinedList: MutableList<String> = mutableListOf()

    for (element in list1) {
        combinedList.add(element)
    }
    for (element in list2) {
        combinedList.add(element)
    }
    println(combinedList)  // Выведет [A, B, C, D, E, F]

    // Задание 10: Нахождение Минимального/Максимального Элемента
    val numberList2: List<Int> = listOf(10, 20, 5, 30, 15)
    var min = numberList2[0]
    var max = numberList2[0]

    for (number in numberList2) {
        if (number < min) {
            min = number
        }
        if (number > max) {
            max = number
        }
    }
    println("Минимум: $min, Максимум: $max")  // Выведет Минимум: 5, Максимум: 30

    // Задание 11: Фильтрация Списка
    val numberList3: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers: MutableList<Int> = mutableListOf()

    for (number in numberList3) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }
    println(evenNumbers)  // Выведет [2, 4, 6]
}
