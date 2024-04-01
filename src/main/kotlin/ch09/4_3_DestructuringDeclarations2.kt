package ch09.exkt

data class NameComponents(
    val name: String,
    val extension: String,
)

fun splitFilename(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}
