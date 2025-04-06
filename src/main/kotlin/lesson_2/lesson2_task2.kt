package lesson_2

fun main() {
//    В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//    – Расходы на выплату зарплаты постоянных сотрудников;
//    – Общие расходы по ЗП после прихода стажеров;
//    – Среднюю ЗП одного сотрудника после устройства стажеров.
//
//    Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.

    val employees = 50
    val gradeEmployee = 30000
    val interns = 30
    val gradeInterns = 20000

    val costEmployee = employees * gradeEmployee
    val costInterns = interns * gradeInterns

    val costGeneral = costEmployee + costInterns

    val amountEmployeeAndIntern = 50 + 30

    val averageOnePerson = costGeneral / amountEmployeeAndIntern

    println()
    println("Расходы на выплату зарплаты потоянных сотрудников: $costEmployee")
    println("Общие расходы по ЗП после приохда стажеров: $costGeneral")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageOnePerson")

}