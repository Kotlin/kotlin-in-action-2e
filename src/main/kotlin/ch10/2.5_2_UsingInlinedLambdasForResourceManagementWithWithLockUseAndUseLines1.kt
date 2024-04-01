package ch10.ex5_2_UsingInlinedLambdasForResourceManagementWithWithLockUseAndUseLines1

import kotlin.io.path.Path
import kotlin.io.path.useLines

fun readFirstLineFromFile(fileName: String): String {
    Path(fileName).useLines {
        return it.first()
    }
}
