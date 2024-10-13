// Сделай рефакторинг функции, через определение вспомогательных приватных функций. Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.

fun drawRectangle(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

    // Вспомогательная функция для рисования горизонтальных границ
    fun drawHorizontalBorder(): String {
        var borderLine = "+"
        for (i in 1 until width - 1) {
            borderLine += "-"
        }
        borderLine += "+\n"
        return borderLine
    }

    // Вспомогательная функция для рисования боковых границ
    fun drawMiddleLines(): String {
        var result = ""
        for (i in 1 until height - 1) {
            var middleLine = "|"
            for (j in 1 until width - 1) {
                middleLine += " "
            }
            middleLine += "|\n"
            result += middleLine
        }
        return result
    }

    // Рисуем прямоугольник, используя вспомогательные функции
    print(drawHorizontalBorder())   // Верхняя граница
    print(drawMiddleLines())        // Боковые границы
    print(drawHorizontalBorder())   // Нижняя граница
}

// Пример использования
fun main() {
    drawRectangle(5, 3)
}
