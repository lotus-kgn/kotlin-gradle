// Задание 1: Создание Пустого Словаря
val emptyMap: Map<Int, Int> = mapOf()

// Задание 2: Создание и Инициализация Словаря
val initializedMap: Map<Float, Double> = mapOf(
    1.1f to 2.2,
    3.3f to 4.4,
    5.5f to 6.6
)

// Задание 3: Создание Изменяемого Словаря
val mutableMap: MutableMap<Int, String> = mutableMapOf()

// Задание 4: Добавление Элементов в Словарь
val mutableMap: MutableMap<Int, String> = mutableMapOf()

mutableMap[1] = "Первый элемент"
mutableMap[2] = "Второй элемент"
mutableMap[3] = "Третий элемент"

// Задание 5: Получение Значений из Словаря
val mutableMap: MutableMap<Int, String> = mutableMapOf(
    1 to "Первый элемент",
    2 to "Второй элемент",
    3 to "Третий элемент"
)

// Получение значения по существующему ключу
val value1 = mutableMap[1]
println("Значение с ключом 1: $value1")

// Попытка получить значение по несуществующему ключу
val value4 = mutableMap[4]
println("Значение с ключом 4: $value4") // Здесь будет null, так как ключа 4 нет

// Задание 6: Удаление Элементов из Словаря
val mutableMap: MutableMap<Int, String> = mutableMapOf(
    1 to "Первый элемент",
    2 to "Второй элемент",
    3 to "Третий элемент"
)

// Удаление элемента с ключом 2
mutableMap.remove(2)

println("Словарь после удаления ключа 2: $mutableMap")

// Задание 7: Перебор Словаря в Цикле
val map: Map<Double, Int> = mapOf(
    10.0 to 2,
    20.0 to 4,
    30.0 to 0,
    40.0 to 5
)

for ((key, value) in map) {
    if (value == 0) {
        println("Ключ $key: бесконечность (деление на 0)")
    } else {
        val result = key / value
        println("Ключ $key: результат деления = $result")
    }
}

// Задание 8: Перезапись Элементов Словаря
val mutableMap: MutableMap<Int, String> = mutableMapOf(
    1 to "Первый элемент",
    2 to "Второй элемент",
    3 to "Третий элемент"
)

// Перезапись значения для ключа 2
mutableMap[2] = "Обновленный второй элемент"

println("Словарь после перезаписи значения для ключа 2: $mutableMap")

// Задание 9: Сложение Двух Словарей
val map1: Map<Int, String> = mapOf(
    1 to "Первый из первого",
    2 to "Второй из первого"
)

val map2: Map<Int, String> = mapOf(
    3 to "Первый из второго",
    4 to "Второй из второго"
)

// Создание изменяемого словаря для объединения
val combinedMap: MutableMap<Int, String> = mutableMapOf()

// Объединение элементов из первого словаря
for ((key, value) in map1) {
    combinedMap[key] = value
}

// Объединение элементов из второго словаря
for ((key, value) in map2) {
    combinedMap[key] = value
}

println("Объединенный словарь: $combinedMap")

// Задание 10: Словарь с Сложными Типами
val complexMap: MutableMap<String, List<Int>> = mutableMapOf()

// Добавление нескольких элементов в словарь
complexMap["первый"] = listOf(1, 2, 3)
complexMap["второй"] = listOf(4, 5, 6)
complexMap["третий"] = listOf(7, 8, 9)

println("Словарь с сложными типами: $complexMap")

// Задание 11: Использование Множества в Качестве Значения
val setMap: MutableMap<Int, MutableSet<String>> = mutableMapOf()

// Добавление данных в словарь
setMap[1] = mutableSetOf("Первый", "Второй")
setMap[2] = mutableSetOf("Третий", "Четвертый")

// Получение множества по ключу 1
val setForKey1 = setMap[1]

// Добавление новой строки в множество
setForKey1?.add("Новый элемент")

// Распечатка полученного множества
println("Множество для ключа 1 после добавления: $setForKey1")

// Задание 12: Поиск Элемента по Значению
val pairMap: Map<Pair<Int, Int>, String> = mapOf(
    Pair(1, 2) to "Элемент 1-2",
    Pair(5, 3) to "Элемент 5-3",
    Pair(4, 5) to "Элемент 4-5",
    Pair(6, 7) to "Элемент 6-7"
)

// Перебор словаря и поиск пары с цифрой 5
for ((key, value) in pairMap) {
    if (key.first == 5 || key.second == 5) {
        println("Найдена пара с 5: $key, значение: $value")
    }
}

//допы

// Задание 6: Словарь Библиотека
val library: MutableMap<String, List<String>> = mutableMapOf()

// Добавление авторов и их книг
library["Лев Толстой"] = listOf("Война и мир", "Анна Каренина")
library["Федор Достоевский"] = listOf("Преступление и наказание", "Идиот")
library["Антуан де Сент-Экзюпери"] = listOf("Маленький принц")

println("Библиотека: $library")

// Задание 12: Справочник Растений
val plantDirectory: MutableMap<String, List<String>> = mutableMapOf()

// Добавление типов растений и их названий
plantDirectory["Цветы"] = listOf("Роза", "Тюльпан", "Подсолнух")
plantDirectory["Деревья"] = listOf("Дуб", "Береза", "Клен")
plantDirectory["Кустарники"] = listOf("Малина", "Смородина")

println("Справочник растений: $plantDirectory")

// Задание 8: Четвертьфинала
val quarterFinals: MutableMap<String, List<String>> = mutableMapOf()

// Добавление команд и списков их игроков
quarterFinals["Команда А"] = listOf("Игрок 1", "Игрок 2", "Игрок 3")
quarterFinals["Команда Б"] = listOf("Игрок 4", "Игрок 5", "Игрок 6")

println("Четвертьфиналы: $quarterFinals")

// Задание 9: Курс лечения
val treatmentPlan: MutableMap<String, List<String>> = mutableMapOf()

// Добавление дат и соответствующих препаратов
treatmentPlan["2024-10-01"] = listOf("Препарат 1", "Препарат 2")
treatmentPlan["2024-10-02"] = listOf("Препарат 3", "Препарат 4")

println("Курс лечения: $treatmentPlan")

// Задание 10: Словарь Путешественника
val travelDictionary: MutableMap<String, MutableMap<String, List<String>>> = mutableMapOf()

// Добавление стран, городов и интересных мест
travelDictionary["Франция"] = mutableMapOf(
"Париж" to listOf("Эйфелева башня", "Лувр"),
"Лион" to listOf("Базилика Нотр-Дам-де-Фурвьер", "Римский театр")
)

travelDictionary["Япония"] = mutableMapOf(
"Токио" to listOf("Токийская башня", "Императорский дворец"),
"Киото" to listOf("Храм Фусими Инари", "Золотой павильон")
)

println("Словарь путешественника: $travelDictionary")
