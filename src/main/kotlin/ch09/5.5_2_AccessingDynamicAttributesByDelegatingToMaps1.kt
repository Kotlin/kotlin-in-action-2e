package ch09.ex5_2_AccessingDynamicAttributesByDelegatingToMaps1

class Person {
    private val _attributes = mutableMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    var name: String by _attributes
}
