package ch10.ex5_1_UsingInlinedLambdasForResourceManagementWithWithLockUseAndUseLines

import java.io.BufferedReader
import java.io.FileReader

fun readFirstLineFromFile(fileName: String): String {
    BufferedReader(FileReader(fileName)).use { br ->
        return br.readLine()
    }
}
