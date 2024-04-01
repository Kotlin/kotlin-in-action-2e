package ch09.ex2_2_LazyInitialization1

class Email { /*...*/ }

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

class Person(val name: String) {
    val emails by lazy { loadEmails(this) }
}
