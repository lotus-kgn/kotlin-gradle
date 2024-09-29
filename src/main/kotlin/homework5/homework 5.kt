package com.lotus.homework5

// Задача №1

fun calculateSoundIntensity(initialIntensity: Double, dampingCoefficient: Double?): Double {
    // Используем оператор Элвиса для определения коэффициента затухания
    val effectiveDampingCoefficient = dampingCoefficient ?: 0.5
    return initialIntensity * effectiveDampingCoefficient
}

fun main() {
    val initialIntensity = 100.0

    // Пример с известным коэффициентом затухания
    val intensityWithKnownDamping = calculateSoundIntensity(initialIntensity, 0.7)
    println("Интенсивность звука с известным коэффициентом затухания: $intensityWithKnownDamping")

    // Пример с неизвестным коэффициентом затухания (null)
    val intensityWithUnknownDamping = calculateSoundIntensity(initialIntensity, null)
    println("Интенсивность звука с неизвестным коэффициентом затухания: $intensityWithUnknownDamping")
}


// Задача №2

fun calculateTotalDeliveryCost(cargoValue: Double?): Double {
    // Стандартная стоимость доставки
    val standardDeliveryCost = 50.0
    // Рассчитываем стоимость груза с помощью оператора Элвиса
    val effectiveCargoValue = cargoValue ?: standardDeliveryCost

    // Страховка составляет 0.5% от стоимости груза
    val insurance = effectiveCargoValue * 0.005

    // Полная стоимость доставки
    return standardDeliveryCost + insurance
}

fun main() {
    // Пример с известной стоимостью груза
    val totalCostWithKnownValue = calculateTotalDeliveryCost(200.0)
    println("Полная стоимость доставки с известной стоимостью груза: $$totalCostWithKnownValue")

    // Пример с неизвестной стоимостью груза (null)
    val totalCostWithUnknownValue = calculateTotalDeliveryCost(null)
    println("Полная стоимость доставки с неизвестной стоимостью груза: $$totalCostWithUnknownValue")
}



// Задача №3

fun checkAtmosphericPressure(pressure: Double?): Double {
    // Проверяем значение давления с использованием оператора Элвиса
    return pressure ?: throw IllegalArgumentException("Ошибка: отсутствуют показания атмосферного давления.")
}

fun main() {
    try {
        // Пример с известным значением давления
        val validPressure = checkAtmosphericPressure(1013.25)
        println("Атмосферное давление: $validPressure hPa")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        // Пример с отсутствующим значением давления (null)
        val invalidPressure = checkAtmosphericPressure(null)
        println("Атмосферное давление: $invalidPressure hPa")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}