package org.example.lesson_1


fun main() {

//    В любом учебнике есть задачи про космос. Объяви переменные и выведи данные о полете в космос первого человека.
//
//    – Запиши в новую переменную year год полета Юрия Гагарина в космос;
//    – Объяви и проинициализируй переменные hour и minute – час и минуту взлета соответственно;
//    – Выведи год, час и минуту взлета по одной переменной на каждую строку;
//    – Затем измени значения переменных hour и minute, чтобы они теперь имели значение часа и минуты посадки;
//    – Выведи время посадки в одной строке в формате [часы:минуты]. Пример: 10:55.
//
//    Определи, где в программе переменные должны задаваться через val, а где через var.
//
//    Данные для задачи:
//    Год полета – 1961
//    Взлет – 09:07
//    Посадка – 10:55
//
//    Подсказка для вывода: какой метод печати в консоль не делает перенос в конце строки?

    val year = 1961
    var hour = "09"
    var minute = "10"

    println(year)
    println(hour)
    println(minute)
    println()

    hour = "10"
    minute = "55"

    print(hour)
    print(":")
    print(minute)
}