// 1.
val A1: Int = 10
val B1: Int = 20
val C1: Boolean = if (A1 == B1) true else false
println(C1)

// 2.
val A2: Int = 10
val B2: Int = A2 * 2
println(B2)

// 3.
fun calcGrade(score: Int): String {
    if (score >= 90) return "A"
    else if (score >= 80) return "B"
    else if (score >= 70) return "C"
    else return "F"

//    when (score) {
//        in 90..100 -> return "A"
//        in 80..89 -> return "B"
//        in 70..79 -> return "C"
//        else -> return "F"
//    }
}
println(calcGrade(85))

// 4.
fun calcScore(correctCnt: Int): Int {
    return correctCnt * 5
}
//fun calcScore(correctCnt: Int): Int = correctCnt * 5
println(calcScore(11))

// 5.
fun plusNullabeInt(num1: Int?, num2: Int?): Int {
    // 함수에서 받은 인자는 val임 // 새로 변수 선언해서 값 받아주기
    var first: Int = if (num1 == null) 0 else num1
    var second: Int = if (num2 == null) 0 else num2

    // 함수 안에서 인자와 같은 이름을 갖는 변수를 선언하면 안됨 // warning: name shadowed
//    val num1: Int = if (num1 == null) 0 else num1
//    val num2: Int = if (num2 == null) 0 else num2

    return first + second
}
println(plusNullabeInt(null, 22))