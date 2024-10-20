fun main() {
    // Пример данных для словарей
    val testExecutionTime: Map<String, Int> = mapOf("test1" to 10, "test2" to 15, "test3" to 20) // время выполнения тестов
    val testMetadata: Map<String, String> = mapOf("test1" to "Meta1", "test2" to "Meta2", "test3" to "Meta3") // метаданные тестов
    val testResults: MutableMap<String, String> = mutableMapOf("test1" to "Success", "test2" to "Failure") // результаты тестов

    // №1 Определить среднее время выполнения тестов
    val avgTime = testExecutionTime.values.average()
    println("Среднее время выполнения тестов: $avgTime")

    // №2 Вывести список всех тестовых методов с метаданными
    println("Метаданные тестов:")
    testMetadata.forEach { (test, meta) -> println("$test: $meta") }

    // №3 Добавить новый тест с результатом
    testResults["test4"] = "Success"
    println("Результаты тестов после добавления нового: $testResults")

    // №4 Подсчитать количество успешных тестов
    val successfulTestsCount = testResults.count { it.value == "Success" }
    println("Количество успешных тестов: $successfulTestsCount")

    // №5 Удалить запись о баге, который был исправлен
    testResults.remove("test2")
    println("Результаты тестов после удаления бага: $testResults")

    // №6 Вывести сообщение о статусе проверки веб-страниц
    val webTestResults: Map<String, String> = mapOf("http://example.com" to "200 OK", "http://test.com" to "404 Not Found")
    webTestResults.forEach { (url, status) ->
        println("Страница $url имеет статус: $status")
    }

    // №7 Найти тесты с временем ответа, превышающим заданный порог
    val responseThreshold = 15
    val longResponseTests = testExecutionTime.filter { it.value > responseThreshold }
    println("Тесты с долгим временем ответа: $longResponseTests")

    // №8 Найти статус ответа для указанного API, если отсутствует - предположить, что не протестировано
    val apiResults: Map<String, String?> = mapOf("api/v1/resource" to "200 OK", "api/v1/unknown" to null)
    val endpoint = "api/v1/unknown"
    val status = apiResults[endpoint] ?: "Не протестировано"
    println("Статус для $endpoint: $status")

    // №9 Получить значение параметра конфигурации
    val configMap: Map<String, String?> = mapOf("browserType" to "Chrome", "timeout" to null)
    val browserType = configMap["browserType"]
    println("Тип браузера: $browserType")

    // №10 Создать копию словаря с версиями ПО для добавления новой версии
    val softwareVersions: Map<String, String> = mapOf("version1" to "1.0", "version2" to "2.0")
    val newSoftwareVersions = softwareVersions.toMutableMap()
    newSoftwareVersions["version3"] = "3.0"
    println("Версии ПО после добавления новой: $newSoftwareVersions")

    // №11 Вернуть настройки для модели устройства
    val deviceSettings: Map<String, Map<String, String>> = mapOf(
        "iPhone12" to mapOf("OS" to "iOS 14"),
        "Pixel5" to mapOf("OS" to "Android 11")
    )
    val model = "iPhone12"
    val settings = deviceSettings[model]
    println("Настройки для $model: $settings")

    // №12 Проверить содержит ли словарь ошибки (код ошибки или сообщение)
    val testErrors: Map<String, String?> = mapOf("test1" to "Error 404", "test2" to null, "test3" to "Error 500")
    val hasErrors = testErrors.values.any { it != null }
    println("Есть ли ошибки в тестах: $hasErrors")

    // №13 Отфильтровать словарь, оставив только тесты, идентификаторы которых соответствуют определённой версии
    val testScenarios: Map<String, String> = mapOf("Test1_1.0" to "Passed", "Test2_1.0" to "Failed", "Test1_2.0" to "Skipped")
    val version = "1.0"
    val filteredScenarios = testScenarios.filterKeys { it.contains(version) }
    println("Тестовые сценарии для версии $version: $filteredScenarios")

    // №14 Проверить, есть ли модули с неудачным тестированием
    val moduleTestResults: Map<String, String> = mapOf("module1" to "Success", "module2" to "Failure")
    val failedModules = moduleTestResults.filter { it.value == "Failure" }
    println("Модули с неудачным тестированием: $failedModules")

    // №15 Добавить настройки тестовой среды из другого словаря
    val testEnvSettings: MutableMap<String, String> = mutableMapOf("browser" to "Chrome", "timeout" to "30s")
    val additionalSettings: Map<String, String> = mapOf("resolution" to "1920x1080")
    testEnvSettings.putAll(additionalSettings)
    println("Настройки тестовой среды: $testEnvSettings")

    // №16 Объединить два словаря с данными о багах
    val bugTracker1: Map<String, String> = mapOf("bug1" to "Fixed", "bug2" to "Open")
    val bugTracker2: Map<String, String> = mapOf("bug3" to "In Progress")
    val combinedBugs = bugTracker1 + bugTracker2
    println("Объединенные баг-трекеры: $combinedBugs")

    // №17 Очистить изменяемый словарь с временными данными
    val temporaryData: MutableMap<String, String> = mutableMapOf("temp1" to "data1", "temp2" to "data2")
    temporaryData.clear()
    println("Временные данные после очистки: $temporaryData")

    // №18 Исключить из отчета тесты со статусом "skipped"
    val reportResults = testResults.filterNot { it.value == "Skipped" }
    println("Результаты тестов без 'skipped': $reportResults")

    // №19 Удалить устаревшие конфигурации из словаря
    val configMap: MutableMap<String, String> = mutableMapOf("config1" to "v1", "config2" to "v2")
    configMap.remove("config1")
    println("Конфигурации после удаления устаревших: $configMap")

    // №20 Создать отчет с преобразованием словаря тестов в список
    val testResultsForReport: Map<String, String> = mapOf("testID1" to "Passed", "testID2" to "Failed")
    val report = testResultsForReport.map { "Test ID: ${it.key}, Результат: ${it.value}" }
    println("Отчет по тестам: $report")

    // №21 Преобразовать словарь с результатами тестирования в массив для архивации
    val archivedTestResults = testResults.toList().toTypedArray()
    println("Массив для архивации: ${archivedTestResults.joinToString()}")

    // №22 Преобразовать словарь с заменой идентификаторов на имена тестов
    val testNames: Map<String, String> = mapOf("id1" to "LoginTest", "id2" to "LogoutTest")
    val testExecutionData: Map<String, Int> = mapOf("id1" to 5, "id2" to 10)
    val renamedTests = testExecutionData.mapKeys { testNames[it.key] ?: "UnknownTest" }
    println("Словарь после замены идентификаторов: $renamedTests")

    // №23 Увеличить оценки производительности (время выполнения) на 10%, учитывая новые условия тестирования
    val updatedTestExecutionTime = testExecutionTime.mapValues { (key, value) ->
        (value * 1.1).toInt()  // Увеличиваем на 10% и округляем до целого
    }
    println("Время выполнения тестов после увеличения на 10%: $updatedTestExecutionTime")

    // №24 Проверить, пуст ли словарь с ошибками компиляции тестов (используем testResults, где 'Failure' — ошибка)
    val compilationErrors = testResults.filter { it.value == "Failure" }
    val isCompilationErrorEmpty = compilationErrors.isEmpty()
    println("Словарь ошибок компиляции пуст: $isCompilationErrorEmpty")

    // №25 Убедиться, что словарь с результатами нагрузочного тестирования не пуст (используем testResults как пример)
    val isLoadTestResultsNotEmpty = testResults.isNotEmpty()
    println("Словарь результатов тестов не пуст: $isLoadTestResultsNotEmpty")

    // №26 Проверить, прошли ли успешно все автоматизированные тесты (Success) в словаре с результатами
    val allAutomatedTestsPassed = testResults.values.all { it == "Success" }
    println("Все автоматизированные тесты прошли успешно: $allAutomatedTestsPassed")

    // №27 Определить, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой ('Failure')
    val containsError = testResults.values.any { it == "Failure" }
    println("Содержит ли словарь хотя бы один тест с ошибкой: $containsError")

    // №28 Отфильтровать словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии 'test'
    val filteredServiceResults = testResults.filter {
        it.value != "Success" && it.key.contains("test")
    }
    println("Отфильтрованные результаты тестов: $filteredServiceResults")
}
