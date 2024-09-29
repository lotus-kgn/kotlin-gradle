package com.lotus.homework6

// Задание 1: "Определение Сезона"

    fun determineSeason(month: Int): String {
      if (month < 1 || month > 12) {
        throw IllegalArgumentException("Номер месяца должен быть в диапазоне от 1 до 12.")
    }

    return when (month) {
        12, 1, 2 -> "Зима"
        3, 4, 5 -> "Весна"
        6, 7, 8 -> "Лето"
        9, 10, 11 -> "Осень"
        else -> throw IllegalStateException("Эта строка никогда не должна быть достигнута.")
    }

//Задание 2: "Расчет Возраста Питомца"

    fun calculatePetAge(dogAge: Double): Double {
        if (dogAge < 0) {
            throw IllegalArgumentException("Возраст собаки не может быть отрицательным.")
        }
        return if (dogAge <= 2) {
            dogAge * 10.5
        } else {
            2 * 10.5 + (dogAge - 2) * 4
        }

//Задание 3 "Определение Вида Транспорта"

        fun determineTransportMode(distance: Double): String {
            if (distance < 0) {
                throw IllegalArgumentException("Длина маршрута не может быть отрицательной.")
            }

            return when {
                distance <= 1 -> "пешком"
                distance <= 5 -> "велосипед"
                else -> "автотранспорт"
            }
        }

//Задание 4: "Расчет Бонусных Баллов"

        fun calculateBonusPoints(purchaseAmount: Double): Int {
            if (purchaseAmount < 0) {
                throw IllegalArgumentException("Сумма покупки не может быть отрицательной.")
            }

            return if (purchaseAmount <= 1000) {
                (purchaseAmount / 100 * 2).toInt()
            } else {
                (10 + (purchaseAmount - 1000) / 100 * 5).toInt()
            }
        }

//Задание 5 "Определение Типа Документа"

        fun determineDocumentType(fileExtension: String): String {
            if (fileExtension.isEmpty()) {
                throw IllegalArgumentException("Расширение файла не может быть пустым.")
            }

            return when (fileExtension.lowercase()) {
                "txt", "doc", "docx" -> "Текстовый документ"
                "jpg", "jpeg", "png", "gif" -> "Изображение"
                "xls", "xlsx", "csv" -> "Таблица"
                else -> "Неизвестный тип"
            }
        }

//Задание 6 "Конвертация Температуры"

        fun convertTemperature(value: Double, unit: Char): String {
            if (unit.uppercase() !in listOf('C', 'F')) {
                throw IllegalArgumentException("Указанная единица измерения должна быть 'C' (Цельсий) или 'F' (Фаренгейт).")
            }

            return if (unit.uppercase() == 'C') {
                val fahrenheit = value * 9 / 5 + 32
                "$fahrenheit F"
            } else {
                val celsius = (value - 32) * 5 / 9
                "$celsius C"
            }
        }

        //Задание 7 "Подбор Одежды по Погоде"

        fun recommendClothing(temperature: Double): String {
            // Валидация входящего значения
            if (temperature < -30 || temperature > 35) {
                return "Не выходите из дома."
            }

            return when {
                temperature < 0 -> "куртка и шапка"
                temperature in 0.0..15.0 -> "ветровка"
                else -> "футболка и шорты"
            }
        }

        //Задание 8 "Выбор Фильма по Возрасту"

        fun selectMovieCategory(age: Int): String {
            // Валидация входящего значения
            if (age < 0) {
                throw IllegalArgumentException("Возраст не может быть отрицательным.")
            }

            return when {
                age < 12 -> "детские"
                age in 12..17 -> "подростковые"
                else -> "18+"
            }
        }