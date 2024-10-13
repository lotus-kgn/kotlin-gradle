// Функция, которая не принимает аргументов и не возвращает значения
fun example1(): Unit {
    // Тело функции
}

// Функция, которая принимает два целых числа и возвращает их сумму
fun example2(a: Int, b: Int): Int {
    return a + b
}

// Функция, которая принимает строку и ничего не возвращает
fun example3(str: String): Unit {
    // Тело функции
}

// Функция, которая принимает список целых чисел и возвращает среднее значение типа Double
fun example4(numbers: List<Int>): Double {
    return numbers.average()
}

// Функция, которая принимает nullable строку и возвращает её длину в виде nullable целого числа
fun example5(str: String?): Int? {
    return str?.length
}

// Функция, которая не принимает аргументов и возвращает nullable вещественное число
fun example6(): Double? {
    return null // Пример
}

// Функция, которая принимает nullable список целых чисел и не возвращает значения
fun example7(numbers: List<Int>?): Unit {
    // Тело функции
}

// Функция, которая принимает целое число и возвращает nullable строку
fun example8(num: Int): String? {
    return num.toString() // Пример
}

// Функция, которая не принимает аргументов и возвращает список nullable строк
fun example9(): List<String?> {
    return listOf("Пример", null, "Тест")
}

// Функция, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение
fun example10(str: String?, num: Int?): Boolean? {
    return str?.isNotEmpty() ?: false && num != null
}


// Напиши рабочий код для следующих задач

// Задание 1: Функция, которая принимает целое число и возвращает его, умноженное на 2
fun multiplyByTwo(number: Int): Int {
    return number * 2
}

// Пример использования
fun main() {
    val result = multiplyByTwo(5)
    println("Результат умножения: $result") // Вывод: Результат умножения: 10
}

// Задание 2: Функция, которая принимает целое число и возвращает true, если число чётное, и false в противном случае
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// Пример использования
fun main() {
    val number = 4
    val result = isEven(number)
    println("Число $number чётное: $result") // Вывод: Число 4 чётное: true
}

// Задание 3: Функция, которая принимает целое число n и выводит числа от 1 до n
fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return // Прекращаем выполнение, если n меньше 1
    }

    for (i in 1..n) {
        println(i)
    }
}

// Пример использования
fun main() {
    printNumbersUntil(5) // Вывод: 1 2 3 4 5
    printNumbersUntil(0) // Ничего не выведет
}

// Задание 4: Функция, которая принимает список целых чисел и возвращает первое отрицательное число, или null, если их нет
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null // Если отрицательных чисел нет
}

// Пример использования
fun main() {
    val numbers = listOf(1, 2, -3, 4, -5)
    val firstNegative = findFirstNegative(numbers)
    println("Первое отрицательное число: $firstNegative") // Вывод: Первое отрицательное число: -3

    val noNegatives = listOf(1, 2, 3, 4)
    val result = findFirstNegative(noNegatives)
    println("Первое отрицательное число: $result") // Вывод: Первое отрицательное число: null
}

// Задание 5: Функция, которая принимает список строк и выводит каждую строку. Прекращает выполнение при встрече null.
fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) {
            return // Прекращаем выполнение, если встречаем null
        }
        println(str)
    }
}

// Пример использования
fun main() {
    val strings = listOf("Первая строка", "Вторая строка", null, "Четвёртая строка")
    processList(strings)
    // Вывод: Первая строка
    //        Вторая строка
    // Прекращает выполнение на null
}
