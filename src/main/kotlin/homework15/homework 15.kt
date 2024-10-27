// № 1 Событие: Вечеринка
class Party(val location: String, val attendees: Int) {
    fun details() {
        println("Место вечеринки: $location, количество гостей: $attendees")
    }
}

// № 2 Аспект реальности: Эмоция
class Emotion(val type: String, val intensity: Int) {
    fun express() {
        println("Эмоция: $type, интенсивность: $intensity")
    }
}

// № 3 Природное явление: Луна
class Moon(var isVisible: Boolean, var phase: String) {
    fun showPhase() {
        println("Фаза Луны: $phase")
    }
}

// № 4 Покупка: Продукт
data class Product(val name: String, val price: Double, val quantity: Int)

// № 5 Мероприятие: Концерт
class Concert(
    val group: String,
    val location: String,
    val price: Double,
    val capacity: Int
) {
    private var ticketsSold: Int = 0

    fun info() {
        println("Концерт группы: $group, место проведения: $location, стоимость: $price, вместимость зала: $capacity")
    }

    fun buyTicket() {
        if (ticketsSold < capacity) {
            ticketsSold++
            println("Билет куплен! Проданных билетов: $ticketsSold")
        } else {
            println("Все билеты проданы!")
        }
    }
}
