package com.lotus.homework18

// Животные и Их Звуки

// Определяем базовый класс Animal
open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

// Подкласс Dog переопределяет метод makeSound
class Dog : Animal() {
    override fun makeSound() {
        println("\u001B[33mBark\u001B[0m") // желтый цвет
    }
}

// Подкласс Cat переопределяет метод makeSound
class Cat : Animal() {
    override fun makeSound() {
        println("\u001B[32mMeow\u001B[0m") // зеленый цвет
    }
}

// Подкласс Bird переопределяет метод makeSound
class Bird : Animal() {
    override fun makeSound() {
        println("\u001B[36mTweet\u001B[0m") // голубой цвет
    }
}

fun main() {
    // Создаем список животных
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())

    // Вызываем метод makeSound() для каждого животного
    for (animal in animals) {
        animal.makeSound()
    }
}


// Геометрические Фигуры и Их Площадь
import kotlin.math.PI
import kotlin.math.sin

// Определяем абстрактный класс Shape
abstract class Shape {
    open fun area(): Double {
        return 0.0
    }
}

// Подкласс Circle с радиусом и расчетом площади
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return PI * radius * radius
    }
}

// Подкласс Square с длиной стороны и расчетом площади
class Square(private val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

// Подкласс Triangle с двумя сторонами и углом между ними для расчета площади
class Triangle(private val sideA: Double, private val sideB: Double, private val angleInDegrees: Double) : Shape() {
    override fun area(): Double {
        val angleInRadians = Math.toRadians(angleInDegrees)
        return 0.5 * sideA * sideB * sin(angleInRadians)
    }
}

fun main() {
    // Создаем список фигур с разными параметрами
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 4.0, 90.0)
    )

    // Выводим площадь каждой фигуры
    for (shape in shapes) {
        println("Площадь фигуры: ${shape.area()}")
    }
}


// Принтер
// Абстрактный класс Printer
abstract class Printer {
    // Абстрактный метод печати, который должны реализовать наследники
    abstract fun print(text: String)

    // Защищенный метод для разбиения текста на слова
    protected fun splitTextToWords(text: String): List<String> {
        return text.split(" ")
    }
}

// Класс LaserPrinter с черным текстом на белом фоне
class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = splitTextToWords(text)
        for (word in words) {
            println("\u001B[30;47m$word\u001B[0m") // Черный текст на белом фоне
        }
    }
}

// Класс InkjetPrinter с разноцветным текстом на цветном фоне
class InkjetPrinter : Printer() {
    private val colorPairs = listOf(
        "\u001B[31;47m", // Красный текст на белом фоне
        "\u001B[32;43m", // Зеленый текст на желтом фоне
        "\u001B[34;45m", // Синий текст на фиолетовом фоне
        "\u001B[35;42m", // Фиолетовый текст на зеленом фоне
        "\u001B[36;41m"  // Голубой текст на красном фоне
    )

    override fun print(text: String) {
        val words = splitTextToWords(text)
        var colorIndex = 0
        for (word in words) {
            val colorCode = colorPairs[colorIndex % colorPairs.size]
            println("$colorCode$word\u001B[0m") // Цветное слово
            colorIndex++
        }
    }
}

fun main() {
    val text = "This is a long text that we are going to print using both printers to see the color differences"

    println("Laser Printer Output:")
    val laserPrinter = LaserPrinter()
    laserPrinter.print(text)

    println("\nInkjet Printer Output:")
    val inkjetPrinter = InkjetPrinter()
    inkjetPrinter.print(text)
}