package org.example.lesson_1

fun main() {

//    Скопируй решение из задачи 1 в новый файл с задачей 2. Теперь необходимо дописать реализацию программы для новых целей. Имитируем логи с сервера.
//
//    – Для начала выведи в консоль значения всех объявленных ранее переменных;
//    – Далее нужно сделать так, чтобы программа хранила количество работников данного интернет-магазина (2000). Подбери подходящее наименование переменной, присвой ей значение и распечатай;
//    – Далее представим, что один работник уволился. Закомментируй предыдущий код с распечаткой количества работников, присвой новое значение количества работников этой переменной и распечатай в консоль.
//
//    Оценивается не только правильная последовательность действий, но и грамотная организация кода (порядок объявления, отступы и так далее).

    val countOrders: Int = 75
    val textThanks: String = "Thanks for order!"
    var countEmployee = 2000

    println(countOrders)
    println(textThanks)

    //println("\nTill: " + countEmployee)

    countEmployee = 1999
    println("After: " + countEmployee)
}

