package com.lotus.homework19

// Игровой автомат

class ArcadeMachine(private val color: String, private val model: String, private var owner: String, private val supportPhone: String) {

    private var isPoweredOn: Boolean = false
    private var isOSLoaded: Boolean = false
    private var availableGames: List<String> = listOf()
    private var hasJoystick: Boolean = true
    private var funds: Double = 0.0

    // Включить автомат
    fun powerOn() {
        isPoweredOn = true
        println("The arcade machine is now powered on.")
    }

    // Выключить автомат
    fun powerOff() {
        isPoweredOn = false
        println("The arcade machine is now powered off.")
    }

    // Загрузить ОС
    fun loadOS() {
        if (isPoweredOn) {
            isOSLoaded = true
            println("Operating system is now loaded.")
        } else {
            println("Cannot load OS. The machine is powered off.")
        }
    }

    // Завершить работу ОС
    fun shutdownOS() {
        if (isOSLoaded) {
            isOSLoaded = false
            println("Operating system is now shut down.")
        } else {
            println("OS is not loaded.")
        }
    }

    // Показать список игр
    fun showAvailableGames(): List<String> {
        return availableGames
    }

    // Включить игру
    fun startGame(gameName: String) {
        if (isPoweredOn && isOSLoaded && availableGames.contains(gameName)) {
            println("Starting the game: $gameName")
        } else {
            println("Cannot start the game. Check if the machine is on, OS is loaded, and game is available.")
        }
    }

    // Оплатить игровой сеанс
    fun payForSession(amount: Double) {
        funds += amount
        println("Session paid. Current balance: $$funds")
    }

    // Открыть сейф и выдать наличные
    fun openSafe(): Double {
        val amount = funds
        funds = 0.0
        println("Funds have been withdrawn: $$amount")
        return amount
    }

    // Выплатить выигрыш
    fun payoutPrize(amount: Double) {
        if (funds >= amount) {
            funds -= amount
            println("Prize payout: $$amount")
        } else {
            println("Insufficient funds for payout.")
        }
    }
}
