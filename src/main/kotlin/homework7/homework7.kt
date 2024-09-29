package com.lotus.homework7

// Задания для Цикла for

// Прямой Диапазон

// Вывод чисел от 1 до 5
fun main() {
    for (i in 1..5) {
        println(i)
    }
}

// Вывод четных чисел от 1 до 10
fun main() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

// Обратный диапазон

// Вывод чисел от 5 до 1
fun main() {
    for (i in 5 downTo 1) {
        println(i)
    }
}

//Вывод чисел от 10 до 1, уменьшая их на 2
fun main() {
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}

// С шагом (step)

// Цикл с шагом 2 для вывода чисел от 1 до 9
fun main() {
    for (i in 1..9 step 2) {
        println(i)
    }
}

// Вывод каждого третьего числа в диапазоне от 1 до 20
fun main() {
    for (i in 1..20 step 3) {
        println(i)
    }
}

// Использование До (until)

// Вывод чисел из диапазона 1-9 (9 не включается)
fun main() {
    for (i in 1 until 9) {
        println(i)
    }
}

// Вывод чисел от 3 до 15, не включая 15

fun main() {
    for (i in 3 until 15) {
        println(i)
    }
}

// Цикл while

// Цикл, который выводит квадраты чисел от 1 до 5
fun main() {
    var i = 1
    while (i <= 5) {
        println(i * i)
        i++
    }
}

// Цикл, который уменьшает число от 10 до 5 и выводит результат
fun main() {
    var number = 10
    while (number >= 5) {
        println(number)
        number--
    }
}

// Цикл do...while

// Цикл, который выводит числа от 5 до 1
fun main() {
    var i = 5
    do {
        println(i)
        i--
    } while (i >= 1)
}

// Цикл, который повторяется, пока счетчик меньше 10, начиная с 5
fun main() {
    var counter = 5
    do {
        println(counter)
        counter++
    } while (counter < 10)
}

// Задания для Прерывания и Пропуска Итерации

// Цикл for от 1 до 10 с break при достижении 6
fun main() {
    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println(i)
    }
}

// Цикл while, который бесконечно выводит числа, прерывается при достижении 10
fun main() {
    var number = 1
    while (true) {
        if (number == 10) {
            break
        }
        println(number)
        number++
    }
}

//Использование continue

//Цикл for от 1 до 10 с continue, чтобы пропустить четные числа
fun main() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
}

//Цикл while, который выводит числа от 1 до 10, пропуская числа, кратные 3
fun main() {
    var number = 1
    while (number <= 10) {
        if (number % 3 == 0) {
            number++
            continue
        }
        println(number)
        number++
    }
}

// Задача на вложенный цикл
fun main() {
    for (i in 1..10) { // Внешний цикл
        for (j in 1..10) { // Внутренний цикл
            print("${i * j} ") // Вывод результата умножения с пробелом
        }
        println() // Пустая строка для перехода на следующую строку
    }
}