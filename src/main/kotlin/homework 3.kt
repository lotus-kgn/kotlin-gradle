package com.lotus

const val event: String = "Hackathon Survival" // Название мероприятия
val dateEvent: String = "15.09.2024" // Дата проведения
lateinit var locationEvent: String = "Sinopskaya, 22" // Место проведения
val budgetEvent: Int = 300000 // Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
var numberOfParticipants: Int = 0 //Количество участников
var duration: Int = 8*60*60 //Длительность хакатона
private lateinit var ContactInformation: String //Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
var statusEvent: String = "Organization"  //Текущее состояние хакатона (статус)
var ListOfSponsors: String = "Gazprom"// Список спонсоров
val budget: Int = 13000// Бюджет мероприятия
var internetAccesslevel: String = "Stable"// Текущий уровень доступа к интернету
var transportationInformation: String = ""// Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
var numberOfTeams: Int = 0// Количество команд
val listOfTasks: String = ""// Перечень задач
val evacuationPlan: String = ""// План эвакуации
var listAvailableEquipment: String = ""// Список доступного оборудования
var listFreeEquipment: String = ""// Список свободного оборудования
lateinit var mealSchedule: String = ""// График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
var emergencyPlan: String = ""// План мероприятий на случай сбоев
val listExperts: String = ""// Список экспертов и жюри
lateinit var MethodsOfCollectingFeedback: String// Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
private var  privacyPolicy: String = ""// Политика конфиденциальности
private var privateReviews: String = ""// Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
var currentTemperature: Int = 20// Текущая температура в помещении
var Monitoring: String = ""// Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var lightLevel: Int = 50// Уровень освещения
var eventLog: String = ""// Лог событий мероприятия
var ambulance: Boolean = true // Доступность медицинской помощи
var safetyplan: String = ""// Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
val eventNumber: Int = 1234// Регистрационный номер мероприятия
val maxNoiseLevel: Int = 45// Максимально допустимый уровень шума в помещении хакатона.
var noiseLevelIndicator: String = ""// Индикатор превышения уровня шума в помещениях
var eventFormat: String = ""// Формат мероприятия (зависит от геополитической обстановки)
var numberOfAvailableSeats: Int = 100// Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
var mediaplan: String = ""// План взаимодействия с прессой
lateinit var teamProjectsDetails: String// Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
var permissionStatus: Boolean = true // Статус получения всех необходимых разрешений
var exclusiveAccess: Boolean = true// Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
val listOfEventPartners: String = "gazprom" // Список партнеров мероприятия
// Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
var distributionOfPrizes: String = ""// План распределения призов
// Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
var specialConditions: String = ""// Особые условия для участников с ограниченными возможностями
// Общее настроение участников (определяется опросами)
val detailedPlan: String = ""// Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
var specialQuest: String = ""// Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
val maximumNumberOfPeople: Int = 500// Максимальное количество людей, которое может вместить место проведения.
var numberOfHours: Int = 4*60*60// Стандартное количество часов, отведенное каждой команде для работы над проектом.

-