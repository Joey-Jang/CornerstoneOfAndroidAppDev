fun addTwoNumbers(number1: Int, number2: Int): Int {
    return number1 + number2
}

// 고차함수
fun addTenNine(function: (Int, Int) -> Int) {
    val RESULT: Int = function(10, 9)
    println("결과는 ${RESULT}입니다.")
}
print("[고차함수] ")
addTenNine(::addTwoNumbers)

// 람다
// 풀버전 (생략이 없는 버전)
var addTwoNumbers2: (Int, Int) -> Int = { number1: Int, number2: Int ->
    number1 + number2
}
print("[람다 - 풀버전] ")
addTenNine(addTwoNumbers2) // 람다함수를 인자로 사용하는 경우에는 ::을 사용할 필요가 없음

// 생략버전 1
var addTwoNumbers3: (Int, Int) -> Int = { number1, number2 ->
    number1 + number2
}
print("[람다 - 생략버전 1] ")
addTenNine(addTwoNumbers3)

// 생략버전 2
var addTwoNumbers4 = { number1: Int, number2: Int ->
    number1 + number2
}
print("[람다 - 생략버전 2] ")
addTenNine(addTwoNumbers4)

// 인자로 넘기는 함수가 간단한 경우
print("[인자로 넘기는 함수가 간단한 경우] ")
addTenNine {number1, number2 -> number1 + number2}

// 파라미터가 없는 람다 함수
var addTenNine2: () -> Int = {
    10 + 9
}

// 파라미터가 한 개인 경우에는 it을 사용
var addNumNine: (Int) -> Int = {
    it + 9
}
