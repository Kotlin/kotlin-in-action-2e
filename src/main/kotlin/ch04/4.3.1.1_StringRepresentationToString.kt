package ch04.ex3_1_1_StringRepresentationToString

class Customer(val name: String, val postalCode: Int) {
    override fun toString() = "Customer(name=$name, postalCode=$postalCode)"
}
