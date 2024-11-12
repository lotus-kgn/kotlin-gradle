package com.lotus.homework20

// Животные и их звуки
// Базовый класс Animal
open class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

// Класс Dog, переопределение makeSound() с цветом
class Dog : Animal() {
    override fun makeSound() {
        println("\u001B[34mBark\u001B[0m")  // Синий цвет для Dog
    }
}

// Класс Cat, переопределение makeSound() с цветом
class Cat : Animal() {
    override fun makeSound() {
        println("\u001B[35mMeow\u001B[0m")  // Фиолетовый цвет для Cat
    }
}

// Класс Bird, переопределение makeSound() с цветом
class Bird : Animal() {
    override fun makeSound() {
        println("\u001B[32mTweet\u001B[0m")  // Зеленый цвет для Bird
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

// Геометрические фигуры и их площадь
import kotlin.math.PI
import kotlin.math.sin

// Абстрактный класс Shape с методом area()
abstract class Shape {
    open fun area(): Double {
        return 0.0
    }
}

// Класс Circle, вычисление площади круга (π * r^2)
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return PI * radius * radius
    }
}

// Класс Square, вычисление площади квадрата (side * side)
class Square(private val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

// Класс Triangle, вычисление площади треугольника (0.5 * a * b * sin(angle))
class Triangle(private val sideA: Double, private val sideB: Double, private val angle: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * sideA * sideB * sin(Math.toRadians(angle))
    }
}

fun main() {
    // Создаем набор геометрических фигур
    val shapes: List<Shape> = listOf(
        Circle(5.0),        // Радиус = 5
        Square(4.0),        // Сторона = 4
        Triangle(3.0, 4.0, 90.0)  // Стороны = 3, 4 и угол = 90 градусов
    )

    // Выводим площадь каждой фигуры
    for (shape in shapes) {
        println("Площадь фигуры: ${shape.area()}")
    }
}

// Принтер
// Абстрактный класс Printer с абстрактным методом printText()
abstract class Printer {
    // Абстрактный метод печати, принимает строку текста
    abstract fun printText(text: String)

    // Защищенный метод для разбивки текста на слова, общий для всех классов-наследников
    protected fun splitTextIntoWords(text: String): List<String> {
        return text.split(" ")
    }
}

// Лазерный принтер, выводит каждое слово черными буквами на белом фоне
class LaserPrinter : Printer() {
    override fun printText(text: String) {
        val words = splitTextIntoWords(text)
        words.forEach { word ->
            println("\u001B[30;47m$word\u001B[0m")  // Черный текст на белом фоне
        }
    }
}

// Струйный принтер, выводит каждое слово цветными буквами на цветном фоне
class InkjetPrinter : Printer() {
    // Цветные пары текста и фона
    private val colorPairs = listOf(
        "\u001B[31;43m", // Красный текст на желтом фоне
        "\u001B[32;45m", // Зеленый текст на фиолетовом фоне
        "\u001B[34;46m", // Синий текст на голубом фоне
        "\u001B[35;42m", // Фиолетовый текст на зеленом фоне
        "\u001B[36;41m"  // Голубой текст на красном фоне
    )

    override fun printText(text: String) {
        val words = splitTextIntoWords(text)
        var colorIndex = 0
        words.forEach { word ->
            // Выбираем цвет из списка циклически
            print(colorPairs[colorIndex] + word + "\u001B[0m ")
            colorIndex = (colorIndex + 1) % colorPairs.size
        }
        println() // Переход на новую строку
    }
}

fun main() {
    val longText = "This is a test of the printing system. Each printer will print the words separately."

    // Проверяем работу лазерного принтера
    val laserPrinter = LaserPrinter()
    println("Laser Printer Output:")
    laserPrinter.printText(longText)

    // Проверяем работу струйного принтера
    val inkjetPrinter = InkjetPrinter()
    println("\nInkjet Printer Output:")
    inkjetPrinter.printText(longText)
}
