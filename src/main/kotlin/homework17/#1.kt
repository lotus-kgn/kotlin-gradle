package com.lotus.homework17

// Задание № 1

// Базовый класс "Геометрическая Фигура"
open class GeometricShape(
    val name: String
) {
    open fun area(): Double {
        return 0.0
    }

    open fun perimeter(): Double {
        return 0.0
    }
}

// Производный класс "Многоугольник"
open class Polygon(
    name: String,
    val numberOfSides: Int
) : GeometricShape(name) {
    override fun perimeter(): Double {
        // Пример базового поведения для многоугольников (реализация может быть изменена в производных классах)
        return 0.0
    }
}

// Производный класс "Круг"
class Circle(
    val radius: Double
) : GeometricShape("Circle") {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

// Дополнительное разветвление для класса "Многоугольник" — "Треугольник"
class Triangle(
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) : Polygon("Triangle", 3) {
    override fun area(): Double {
        val s = (sideA + sideB + sideC) / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }

    override fun perimeter(): Double {
        return sideA + sideB + sideC
    }
}

// Дополнительное разветвление для класса "Многоугольник" — "Четырехугольник"
open class Quadrilateral(
    val side1: Double,
    val side2: Double,
    val side3: Double,
    val side4: Double
) : Polygon("Quadrilateral", 4) {
    override fun perimeter(): Double {
        return side1 + side2 + side3 + side4
    }
}

// Пример класса "Прямоугольник", производного от "Четырехугольник"
class Rectangle(
    val length: Double,
    val width: Double
) : Quadrilateral(length, width, length, width) {
    override fun area(): Double {
        return length * width
    }
}


// Базовый класс "Учебное Заведение"
open class EducationalInstitution(
    val name: String,
    val location: String
) {
    open fun getInstitutionType(): String {
        return "Образовательное заведение"
    }

    open fun getDetails(): String {
        return "Название: $name, Местоположение: $location"
    }
}

// Производный класс "Школа"
open class School(
    name: String,
    location: String,
    val level: String // начальная, средняя, старшая
) : EducationalInstitution(name, location) {
    override fun getInstitutionType(): String {
        return "Школа ($level)"
    }
}

// Производный класс "Университет"
open class University(
    name: String,
    location: String,
    val accreditationLevel: String // бакалавриат, магистратура, докторантура
) : EducationalInstitution(name, location) {
    override fun getInstitutionType(): String {
        return "Университет"
    }

    open fun getAccreditation(): String {
        return "Уровень аккредитации: $accreditationLevel"
    }
}

// Дополнительное разветвление для "Университет" — "Факультет"
class Faculty(
    name: String,
    location: String,
    accreditationLevel: String,
    val facultyName: String,
    val departments: List<String> // список кафедр
) : University(name, location, accreditationLevel) {
    override fun getDetails(): String {
        return super.getDetails() + ", Факультет: $facultyName, Кафедры: ${departments.joinToString()}"
    }
}

// Производный класс "Колледж"
open class College(
    name: String,
    location: String,
    val programType: String // профессиональная подготовка, прикладное образование
) : EducationalInstitution(name, location) {
    override fun getInstitutionType(): String {
        return "Колледж ($programType)"
    }
}

// Дополнительное разветвление для "Школа" — "Специализированная Школа"
class SpecializedSchool(
    name: String,
    location: String,
    level: String,
    val specialization: String // например, искусство, спорт
) : School(name, location, level) {
    override fun getDetails(): String {
        return super.getDetails() + ", Специализация: $specialization"
    }
}


// Базовый класс "Мебель"
open class Furniture(
    val material: String,
    val color: String
) {
    open fun getDescription(): String {
        return "Материал: $material, Цвет: $color"
    }
}

// Производный класс "Стол"
open class Table(
    material: String,
    color: String,
    val shape: String, // круглый, квадратный, прямоугольный
    val height: Double
) : Furniture(material, color) {
    override fun getDescription(): String {
        return super.getDescription() + ", Форма: $shape, Высота: $height см"
    }
}

// Дополнительное разветвление для "Стол" — "Обеденный Стол"
class DiningTable(
    material: String,
    color: String,
    shape: String,
    height: Double,
    val seatingCapacity: Int // количество мест
) : Table(material, color, shape, height) {
    override fun getDescription(): String {
        return super.getDescription() + ", Количество мест: $seatingCapacity"
    }
}

// Производный класс "Стул"
open class Chair(
    material: String,
    color: String,
    val hasBackrest: Boolean, // с спинкой или без
    val isFoldable: Boolean
) : Furniture(material, color) {
    override fun getDescription(): String {
        val backrest = if (hasBackrest) "Со спинкой" else "Без спинки"
        val foldable = if (isFoldable) "Складной" else "Нескладной"
        return super.getDescription() + ", $backrest, $foldable"
    }
}

// Дополнительное разветвление для "Стул" — "Офисный Стул"
class OfficeChair(
    material: String,
    color: String,
    hasBackrest: Boolean,
    isFoldable: Boolean,
    val hasWheels: Boolean, // наличие колес
    val adjustableHeight: Boolean // возможность регулировки высоты
) : Chair(material, color, hasBackrest, isFoldable) {
    override fun getDescription(): String {
        val wheels = if (hasWheels) "На колесиках" else "Без колесиков"
        val adjustable = if (adjustableHeight) "С регулировкой высоты" else "Без регулировки высоты"
        return super.getDescription() + ", $wheels, $adjustable"
    }
}

// Производный класс "Шкаф"
open class Cabinet(
    material: String,
    color: String,
    val doors: Int, // количество дверей
    val hasShelves: Boolean
) : Furniture(material, color) {
    override fun getDescription(): String {
        val shelves = if (hasShelves) "С полками" else "Без полок"
        return super.getDescription() + ", Дверей: $doors, $shelves"
    }
}

// Дополнительное разветвление для "Шкаф" — "Книжный Шкаф"
class Bookshelf(
    material: String,
    color: String,
    doors: Int,
    hasShelves: Boolean,
    val shelfCount: Int // количество полок
) : Cabinet(material, color, doors, hasShelves) {
    override fun getDescription(): String {
        return super.getDescription() + ", Количество полок: $shelfCount"
    }
}
