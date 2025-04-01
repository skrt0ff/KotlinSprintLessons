package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//    - Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//    - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//    - Значения часов, минут и секунд отображать двумя цифрами.

    val totalSeconds = 6480

    val hours = totalSeconds / (60 * 60)
    val remainingSeconds = totalSeconds % (60 * 60)
    val minutes = remainingSeconds / 60
    val seconds = remainingSeconds % 60

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formattedTime)

}