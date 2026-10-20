package Lesson2

fun main() {
    // null безопасность
    var s:String? = "Hi"
    println(s)
    s = null

    // Оператор безопасного вызова ?.
    println(s?.length)

    // Оператор небезопасного вызова !!.
    // println(s!!.length)

    // Оператор Элвиса ?. ... ?: value
    println(s?.length ?: 0)

    // Data Structures

    // List - неизменяемая структура данных
    val cities = listOf("Москва", "Иваново", "Саратов")
    println(cities)
    println(cities[2])
    println(cities.indexOf("Иваново"))
    println(cities.getOrNull(10))

    // Set - неизменяемая коллекция (множество), хранятся только уникальные элементы
    val nums = setOf(1,2,3,4,5,2,3,4)
    println(nums)

    println(12 in nums)

    // Map - неизменяемая коллекция, где данные хранятся в формате "ключ - значение"
    val cities2 = mapOf(
        "Россия" to "Москва",
        "Франция" to "Париж"
    )

    println(cities2)
    println(cities2.keys)
    println(cities2.values)

    // Mutable List
    val people = mutableListOf<String>("Борис", "Анна")
    people.addFirst("Евгений")
    people.addLast("Петр")

    println(people)

    println(
        people.filter {
            // Обращение к элементам списка
            it.length > 4
        }
    )

    println(people.map { it.length })

    // lowercase и uppercase для повышения и понижения регистра
    println(people.map { it.lowercase() })

    println(people.sortedBy { it.length })
    println(people.sortedByDescending { it.length })

    println(people.take(2))
    println(people.drop(2))
}