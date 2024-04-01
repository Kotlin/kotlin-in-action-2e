package ch05.ex4_2_3_InitializingAndConfiguringObjectsApply2

fun main() {
    val fibonacci = buildList {
        addAll(listOf(1, 1, 2))
        add(3)
        add(index = 0, element = 3)
    }

    val shouldAdd = true

    val fruits = buildSet {
        add("Apple")
        if(shouldAdd) {
            addAll(listOf("Apple", "Banana", "Cherry"))
        }
    }

    val medals = buildMap<String, Int> {
        put("Gold", 1)
        putAll(listOf("Silver" to 2, "Bronze" to 3))
    }
}
