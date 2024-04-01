package ch11.ex1_1_LimitationsToFindingTypeInformationOfAGenericClassAtRunTimeTypeChecksAndCasts

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}
