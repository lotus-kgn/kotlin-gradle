fun main() {
    // Задание 1: Создание Пустого Множества
    val emptySet: Set<Int> = setOf()

    // Задание 2: Создание и Инициализация Множества
    val intSet: Set<Int> = setOf(1, 2, 3)

    // Задание 3: Создание Изменяемого Множества
    val mutableSet: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")

    // Задание 4: Добавление Элементов в Множество
    mutableSet.add("Swift")
    mutableSet.add("Go")

    // Задание 5: Удаление Элементов из Множества
    val mutableIntSet: MutableSet<Int> = mutableSetOf(1, 2, 3)
    mutableIntSet.remove(2)

    // Задание 6: Перебор Множества в Цикле
    val numberSet: Set<Int> = setOf(1, 2, 3, 4, 5)
    for (number in numberSet) {
        println(number)
    }

    // Задание 7: Проверка Наличия Элемента в Множестве
    fun containsString(set: Set<String>, searchString: String): Boolean {
        for (element in set) {
            if (element == searchString) {
                return true
            }
        }
        return false
    }
    val stringSet: Set<String> = setOf("apple", "banana", "cherry")
    println(containsString(stringSet, "banana"))  // Вернет true

    // Задание 8: Объединение Двух Множеств
    val set1: Set<String> = setOf("A", "B", "C")
    val set2: Set<String> = setOf("C", "D", "E")
    val unionSet: MutableSet<String> = mutableSetOf()

    for (element in set1) {
        unionSet.add(element)
    }
    for (element in set2) {
        unionSet.add(element)
    }
    println(unionSet)  // Выведет [A, B, C, D, E]

    // Задание 9: Нахождение Пересечения Множеств
    val setA: Set<Int> = setOf(1, 2, 3, 4)
    val setB: Set<Int> = setOf(3, 4, 5, 6)
    val intersectionSet: MutableSet<Int> = mutableSetOf()

    for (elementA in setA) {
        for (elementB in setB) {
            if (elementA == elementB) {
                intersectionSet.add(elementA)
            }
        }
    }
    println(intersectionSet)  // Выведет [3, 4]

    // Задание 10: Нахождение Разности Множеств
    val setX: Set<String> = setOf("A", "B", "C")
    val setY: Set<String> = setOf("B", "C", "D")
    val differenceSet: MutableSet<String> = mutableSetOf()

    for (elementX in setX) {
        var found = false
        for (elementY in setY) {
            if (elementX == elementY) {
                found = true
                break
            }
        }
        if (!found) {
            differenceSet.add(elementX)
        }
    }
    println(differenceSet)  // Выведет [A]

    // Задание 11: Конвертация Множества в Список
    val setToConvert: Set<String> = setOf("Kotlin", "Java", "Scala")
    val convertedList: MutableList<String> = mutableListOf()

    for (element in setToConvert) {
        convertedList.add(element)
    }
    println(convertedList)  // Выведет [Kotlin, Java, Scala]
}
