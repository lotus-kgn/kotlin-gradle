// Дополнительное задание для тех, кому очень скучно (Мне нет, я поплыл уже от этого всего)

fun printMap(xSize: Int, ySize: Int) {
    if (xSize == 0) throw IllegalArgumentException("xSize не должно быть равным нулю")
    if (ySize == 0) throw IllegalArgumentException("ySize не должно быть равным нулю")

    // Вспомогательная функция для создания форматированной строки
    fun getFormatterSize(size: Int): Int {
        return " $size".length
    }

    // Вспомогательная функция для генерации диапазона
    fun createRange(size: Int): IntProgression {
        return if (size > 0) 0..size else 0 downTo size
    }

    val formatterSize = getFormatterSize(xSize)
    val xRange = createRange(xSize)
    val yRange = createRange(ySize)

    // Вывод первой строки с горизонтальной разметкой
    print(" ".repeat(formatterSize))
    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()

    // Вывод значений таблицы
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in xRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "*" else "#"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
    println()
}

// Пример использования
fun main() {
    printMap(3, -3)
}
