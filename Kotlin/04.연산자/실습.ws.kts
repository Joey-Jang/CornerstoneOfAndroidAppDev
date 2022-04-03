// 04. 연산자

// 산술 연산자
var number1: Int = 1 + 10
var number2: Int = 2 - 10
var number3: Int = 2 * 40
var number4: Int = 40 / 2
var number5: Int = 45 % 7
println(number5)
var number6 = 10 * 427 % 73 + 108 // 할당하려는 값의 타입을 알기 어려운 경우에는 코틀린에게 타입추론을 맡겨도 됨
println(number6)

// 대입 연산자
var number7: Int = 22
println(number7)
number7 = 100
println(number7)


// 복합대입 연산자
var number8: Int = 12
number8 += 8
number8 -= 10
number8 *= 2
number8 /= 5
println(number8)

// 증감 연산자
var number9: Int = 9
println(number9++)
println(++number9)

// 비교 연산자
var number10: Int = 1
var number11: Int = 2
var result: Boolean = number10 > number11
println(result)
var result2: Boolean = number10 == number11
println(result2)
var result3: Boolean = number10 != number11
println(result3)

var str1: String = "안녕"
var str2: String = String(StringBuffer("안녕"))
var result4: Boolean = str1 == str2
var result5: Boolean = str1 === str2
println("값 비교" + result4)
println("주소값 비교" + result5)

// 논리 연산자
var boolean1: Boolean = true
var boolean2: Boolean = false
var result6: Boolean = boolean1 && boolean2
println(result6)
var result7: Boolean = boolean1 || boolean2
println(result7)
