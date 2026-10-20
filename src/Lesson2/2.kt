package Lesson2

class Car(
    var wheel: Int = 4,
    var brand: String = "Lada"
    ) {
    init {
        var new = false
    }
    override fun toString(): String {
        return "Car(wheel=$wheel, brand='$brand')"
    }
}

class Person(
    public var name: String,
    private var age: Int
    ) {

    // Реализация геттеров и сеттеров
    fun getAge() = age
    fun setAge(age: Int) { this.age = age }

    
}

fun main() {
    val car = Car(2, "Volga")
    println(car)

    val narrator = Person("Narrator", 23)

}