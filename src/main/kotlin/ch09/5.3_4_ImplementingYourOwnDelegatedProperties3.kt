package ch09.ex3_4_ImplementingYourOwnDelegatedProperties3

import ch09.ImplementingDelegatedProperties.Observable
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Person(val name: String, age: Int, salary: Int) : Observable() {
    private val onChange = {
            property: KProperty<*>, oldValue: Any?,
            newValue: Any?,
        ->
        notifyObservers(property.name, oldValue, newValue)
    }

    var age by Delegates.observable(age, onChange)
    var salary by Delegates.observable(salary, onChange)
}
