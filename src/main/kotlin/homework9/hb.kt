package com.lotus.homework9

import kotlin.math.absoluteValue

fun main() {
    val size = 6  // Размер сердечка

    for (y in size downTo -size) {
        for (x in -size..size) {
            val equation = (x * x + y * y - size * size - (size / 2) * (y + x).absoluteValue).toDouble()
            if (equation <= 0) {
                print("* ")  // Символ для рисования сердечка
            } else {
                print("  ")  // Пустое пространство
            }
        }
        println()
    }

    println("С Днём Рождения, Александр!")
}
