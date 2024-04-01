package ch09.ex3_3_ImplementingYourOwnDelegatedProperties2

import ch09.ImplementingDelegatedProperties.Observable
import kotlin.reflect.KProperty

class ObservableProperty(var propValue: Int, val observable: Observable) {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): Int = propValue

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        observable.notifyObservers(prop.name, oldValue, newValue)
    }
}

class Person(val name: String, age: Int, salary: Int) : Observable() {
    var age by ObservableProperty(age, this)
    var salary by ObservableProperty(salary, this)
}
