package ch13.ex2_InvokeConventionInDSLs

class DependencyHandler {
    fun implementation(coordinate: String) {
        println("Added dependency on $coordinate")
    }

    operator fun invoke(
        body: DependencyHandler.() -> Unit,
    ) {
        body()
    }
}

fun main() {
    val dependencies = DependencyHandler()
    dependencies.implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    // Added dependency on org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0
    dependencies {
        implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
    }
    // Added dependency on org.jetbrains.kotlinx:kotlinx-datetime:0.5.0
}
