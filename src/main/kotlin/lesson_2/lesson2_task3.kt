package lesson_2

fun main() {
//    Сайт с расписанием поездов получает данные с сервера.
//    Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
//
//    – Создай целочисленные переменные и проинициализируй их этими данными;
//    – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
//    – Выведи результат в консоль.

    val departureHours = 9
    val departureMinutes = 39
    val travelTimeMinutes = 457

    val generalTimeMinutes = (departureHours * 60) + departureMinutes + travelTimeMinutes

//    println(generalTimeMinutes)

    val arrivalTimeHours: Int = generalTimeMinutes / 60
//    println("arrivalTimeHours: $arrivalTimeHours")
    val arrivalTimeMinutes = generalTimeMinutes % 60

    println("Время прибытия: $arrivalTimeHours:$arrivalTimeMinutes")

}