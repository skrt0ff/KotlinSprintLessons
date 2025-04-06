package org.example

fun main() {
//    Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//    - Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//    - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//    - Значения часов, минут и секунд отображать двумя цифрами.

    val totalSeconds = 6480
    val timeValue = 60

    val hours = totalSeconds / (timeValue * timeValue)
    val remainingSecond = totalSeconds % (timeValue * timeValue)
    val minutes = remainingSecond / timeValue
    val seconds = remainingSecond % timeValue

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formattedTime)

}