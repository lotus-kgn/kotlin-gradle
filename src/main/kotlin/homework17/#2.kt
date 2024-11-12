package com.lotus.homework17

// Абстрактный класс Materials
abstract class Materials {
    protected val materials = mutableListOf<String>()

    abstract fun addMaterial(material: String)
    abstract fun addMaterials(materialsList: List<String>)

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

// Первый подкласс
class InsertAtBeginning : Materials() {
    override fun addMaterial(material: String) {
        materials.add(0, material)
    }

    override fun addMaterials(materialsList: List<String>) {
        materialsList.reversed().forEach { addMaterial(it) }
    }
}

// Второй подкласс
class InsertMultipleAtBeginning : Materials() {
    override fun addMaterial(material: String) {
        addMaterials(listOf(material))
    }

    override fun addMaterials(materialsList: List<String>) {
        materials.addAll(0, materialsList)
    }
}

// Третий подкласс
class InsertInReverseOrder : Materials() {
    override fun addMaterial(material: String) {
        materials.add(material)
    }

    override fun addMaterials(materialsList: List<String>) {
        materialsList.reversed().forEach { materials.add(it) }
    }
}

// Четвертый подкласс
class InsertAlphabetically : Materials() {
    override fun addMaterial(material: String) {
        materials.add(material)
        materials.sort()
    }

    override fun addMaterials(materialsList: List<String>) {
        materials.addAll(materialsList)
        materials.sort()
    }
}