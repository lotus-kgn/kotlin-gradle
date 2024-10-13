fun main() {

//Задание 1: Создание и Инициализация Массива
    val array1 = arrayOf(1, 2, 3, 4, 5)

//Задание 2: Создание Пустого Массива
    val array2 = Array(10) { "" }

//Задание 3: Заполнение Массива в Цикле
    val array3 = Array(5) { i -> i * 2.0 }

//Задание 4: Изменение Элементов Массива
    val array4 = Array(5) { i -> i * 3 }

//Задание 5: Работа с Nullable Элементами
    val array5 = arrayOf<String?>(null, "Hello", "World")

//Задание 6: Копирование Массива
    val originalArray = arrayOf(1, 2, 3, 4, 5)
    val copiedArray = Array(originalArray.size) { i -> originalArray[i] }

//Задание 7: Разница Двух Массивов
    val arrayA = arrayOf(10, 20, 30, 40)
    val arrayB = arrayOf(5, 15, 25, 35)
    val arrayDifference = Array(arrayA.size) { i -> arrayA[i] - arrayB[i] }

//Задание 8: Поиск Индекса Элемента
    val array8 = arrayOf(1, 2, 3, 4, 6)
    var index = -1
    var i = 0
    while (i < array8.size) {
        if (array8[i] == 5) {
            index = i
            break
        }
        i++
    }
    println(index)  // Вернет -1, так как 5 нет в массиве

//Задание 9: Перебор Массива
    val array9 = arrayOf(1, 2, 3, 4, 5)
    for (element in array9) {
        if (element % 2 == 0) {
            println("$element четное")
        } else {
            println("$element нечетное")
        }
    }

    //Задание 10: Поиск Значения в Массиве по вхождению
    fun findStringContainingSubstring(array: Array<String>, searchString: String): String? {
        for (element in array) {
            if (element.contains(searchString)) {
                return element
            }
        }
        return null
    }

    val array10 = arrayOf("apple", "banana", "cherry")
    val result = findStringContainingSubstring(array10, "na")
    println(result)  // Выведет "banana"
}