var number100: Int = 100

// 함수 선언
fun plusNumbers(firstNum: Int, secondNum: Int): Int {
    val RESULT: Int = firstNum + secondNum
    return RESULT
}

// 함수 호출
plusNumbers(firstNum = 10, secondNum = 20)
plusNumbers(10, 20)

val RESULT: Int = plusNumbers(firstNum = 5, secondNum = 7)
println(RESULT)

// 기본값이 있는 함수 선언
fun plusNumbersWithDefault(firstNum: Int, secondNum: Int = 10): Int {
    return firstNum + secondNum
}

val RESULT2: Int = plusNumbersWithDefault(firstNum = 10)
println(RESULT2)
val RESULT3: Int = plusNumbersWithDefault(firstNum = 10, secondNum = 20)
println(RESULT3)

fun plusNumberWithNoReturn(firstNum: Int, secondNum: Int): Unit {
    val RESULT: Int = firstNum + secondNum
    println(RESULT)
}

fun plusNumberWithNoReturn2(firstNum: Int, secondNum: Int) {
    val RESULT: Int = firstNum + secondNum
    println(RESULT)
}

fun plusNumberWithNoReturn3(firstNum: Int, secondNum: Int) {
    val RESULT: Int = firstNum + secondNum
    println(RESULT)
    return
}

plusNumberWithNoReturn(100, 200)
plusNumberWithNoReturn2(100, 200)
plusNumberWithNoReturn3(100, 200)

// 함수 선언을 간단하게 하는 방법
fun shortPlusNumbers(firstNum: Int, secondNum: Int) = firstNum + secondNum
val RESULT4: Int = shortPlusNumbers(firstNum = 10, secondNum = 100)
println(RESULT4)

// 가변인자를 갖는 함수
fun plusMulipleNumbers(vararg numbers: Int): Unit {
    for (number in numbers) {
        println(number)
    }
}
plusMulipleNumbers(1, 2, 3, 4, 5)

number100 = 200
println(number100)