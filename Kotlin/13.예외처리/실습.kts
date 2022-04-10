import java.lang.IllegalArgumentException

val NUMBERS = listOf<Int>(1, 2, 3)

try {
    NUMBERS.get(5)
} catch (e: Exception) {
    println(e)
}

try {
    NUMBERS.get(5)
} catch (e: IllegalArgumentException) {
    println("IllegalArgumentException")
} catch (e: ArrayIndexOutOfBoundsException) {
    println("ArrayIndexOutOfBoundsException")
} finally {
    println("finally")
}
