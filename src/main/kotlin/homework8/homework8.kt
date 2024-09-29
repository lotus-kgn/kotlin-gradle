//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая текст более ироничным или забавным

fun main(){

    fun convert(string: String): String {
        return when {
            string.contains("невозможно", ) -> string.replace("невозможно", "совершенно точно возможно, просто требует времени")
            string.startsWith("Я не уверен", ) -> "$string , но моя интуиция говорит об обратном"
            string.contains("катастрофа", ) -> string.replace("катастрофа", "интересное событие")
            string.endsWith("без проблем", ) -> string.replace("без проблем", "с парой интересных вызовов на пути")
            string.split(" ").size == 1 -> "Иногда, $string , но не всегда"

            else -> ""
        }
    }
    println(convert("удача"))

// Задание 1: Извлечение Даты из Строки Лога
    fun extractDateFromLog(log: String) {
        val datePart = log.split("->")[1].trim()
        val (date, time) = datePart.split(" ")
        println(date) // Вывод даты
        println(time) // Вывод времени
    }

    fun main() {
        extractDateFromLog("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    }

// Задание 2: Маскирование Личных Данных
    fun maskCreditCard(cardNumber: String) {
        val masked = "*".repeat(cardNumber.length - 4) + cardNumber.takeLast(4)
        println(masked) // Вывод замаскированного номера карты
    }

    fun main() {
        maskCreditCard("4539 1488 0343 6467")
    }

// Задание 3: Форматирование Адреса Электронной Почты
fun formatEmail(email: String) {
    val formattedEmail = email.replace("@", " [at] ").replace(".", " [dot] ")
    println(formattedEmail) // Вывод отформатированного адреса
}

    fun main() {
        formatEmail("username@example.com")
    }

// Задание 4: Извлечение Имени Файла из Пути
fun extractFileName(filePath: String) {
    val fileName = filePath.split("/").last()
    println(fileName) // Вывод имени файла с расширением
}

    fun main() {
        extractFileName("C:/Пользователи/Документы/report.txt")
    }

//Задание 5: Создание Аббревиатуры из Фразы
