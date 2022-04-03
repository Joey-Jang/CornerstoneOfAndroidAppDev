// if
val NUMBER1: Int = 10

if (NUMBER1 == 10) { // 조건식은 true 또는 false로 결과가 나와야 함
    // 위 조건을 만족하는 경우
    println("10입니다.")
} else if (NUMBER1 == 20) {
    // 위 조건을 만족하는 경우
    println("20입니다.")
} else {
    // 위 2가지 조건을 모두 만족하지 않는 경우
    println("10, 20 둘 다 아닙니다.")
}

if (NUMBER1 == 10) println("10입니다.")
else if (NUMBER1 == 20) println("20입니다.")
else println("10, 20 둘 다 아닙니다.")

val NUMBER2: Int = 10 + 20 // 값이 오면 됨. -> 식이 와도 됨.
val NUMBER3: Int = if (NUMBER2 > 30) 40 else 50
println(NUMBER3)

// 표현과 식
// 표현
// - 어떤 것을 표현하기 위해서 사용되는 문법적인 요소
// - val, var, Int, Short -> 키워드
// 식
// - 값을 만들어냄
// - 10 + 20, 10 * 20

// when
val NUMBER4: Int = 5
when (NUMBER4) {
    5 -> {
        println("5입니다.")
    }
    6 -> {
        println("6입니다.")
    }
    else -> {
        println("모르겠습니다.")
    }
}

when (NUMBER4) {
    5 -> println("5입니다")
    6 -> println("6입니다")
    else -> println("모르겠습니다.")
}

when (NUMBER4) {
    4 -> println("number is 4")
    "안녕하세요" -> println("hello")
    is Boolean -> println("Boolean")
}

when (NUMBER4) {
    in 1..10 -> println("number is in 1..10")
    in 20..30 -> println("number is in 20..30")
    in 40..60 -> println("number is in 40..60")
}