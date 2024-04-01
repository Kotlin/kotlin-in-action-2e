package ch09.ImplementingDelegatedProperties

fun interface Observer {
    fun onChange(name: String, oldValue: Any?, newValue: Any?)
}

open class Observable {
    val observers = mutableListOf<Observer>()
    fun notifyObservers(propName: String, oldValue: Any?, newValue: Any?) {
        for (obs in observers) {
            obs.onChange(propName, oldValue, newValue)
        }
    }
}


class Person(val name: String, age: Int, salary: Int) : Observable() {
    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue
            notifyObservers(
                "age", oldValue, newValue
            )
        }

    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            notifyObservers(
                "salary", oldValue, newValue
            )
        }
}

fun main() {
    val p = Person("Seb", 28, 1000)
    p.observers += Observer { propName, oldValue, newValue ->
        println(
            """
            Property $propName changed from $oldValue to $newValue!
            """.trimIndent()
        )
    }
    p.age = 29
    // Property age changed from 28 to 29!
    p.salary = 1500
    // Property salary changed from 1000 to 1500!
}
