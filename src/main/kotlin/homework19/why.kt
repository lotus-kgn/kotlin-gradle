package com.lotus.homework19

abstract class BaseClass(
    // Это поле объявлено как `private`, и оно недоступно напрямую из класса-наследника или main().
    // Однако оно передается через конструктор, что позволяет его значение установить в `ChildrenClass`.
    private val privateVal: String,
    // Это поле объявлено как `protected`, и оно доступно для чтения и изменения из класса-наследника `ChildrenClass`,
    // но недоступно из main(), так как protected разрешает доступ только для наследников.
    protected val protectedVal: String,
    // Это поле объявлено как `public`, поэтому оно доступно для чтения из main().
    val publicVal: String
) {

    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            // Метод `verifyPublicField` проверяет значение перед его установкой, чтобы оно соответствовало
            // определенным требованиям, в данном случае длина должна быть меньше 3 символов.
            if (verifyPublicField(value)) {
                field = value
            }
        }

    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"

    // Это поле `private`, и к нему нельзя получить доступ из main().
    // Поэтому его необходимо доработать с публичным сеттером в `ChildrenClass`.
    private var privateField = "добавь сеттер чтобы изменить меня из main()"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // Эта функция `protected`, что позволяет вызывать её только из наследников или внутри самого класса.
    // Если бы она была публичной, то можно было бы получать доступ к `ProtectedClass` вне иерархии наследования,
    // что нарушило бы инкапсуляцию.
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // Функция `private` доступна только внутри класса `BaseClass`.
    // Если бы она была публичной или protected, то `PrivateClass` был бы доступен для использования в наследниках,
    // что нарушило бы принципы инкапсуляции для `PrivateClass`.
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // Этот аргумент конструктора имеет модификатор `val`, что позволяет сделать его доступным для чтения из main(),
    // так как он объявляется как свойство в `ChildrenClass` и доступен, как обычное поле.
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {

    // Функция `getAll()` определена в `BaseClass` как публичная,
    // поэтому она наследуется и доступна из `ChildrenClass`, не требуя переопределения.
    // Это позволяет вызвать её в main() и получить доступ ко всем полям и их значениям.

    // Переопределение функции `printText()` не происходит, так как `privatePrint` является `private` в `BaseClass`.
    // Это значит, что `privatePrint` в `ChildrenClass` не связан с `privatePrint` в `BaseClass` и не переопределяет его.
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    // Добавляем публичный метод для изменения `privateField`, который был приватным в `BaseClass`
    fun setPrivateField(value: String) {
        // Обновляем `privateField` в базовом классе через дополнительный публичный метод
        super.apply { this@BaseClass.privateField = value }
    }

    // Для изменения `protectedField` добавляем сеттер
    fun setProtectedField(value: String) {
        protectedField = value
    }
}


