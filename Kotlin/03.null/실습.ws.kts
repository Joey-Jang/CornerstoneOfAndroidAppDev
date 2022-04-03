// 03. null

val NUMBER: Int? = null // null이 들어갈 수 있는 변수 -> nullable
//val NUMBER2: Int = null // null이 들어갈 수 없는 변수 -> non-null

val NUM1: Int = 2 + 5
val NUM2: Int = 10
val NUM3: Int = NUM1 + NUM2
println(NUM3)

val NUMBER2: Int? = 2 + 5
val NUMBER3: Int? = 10
val NUMBER4: Int? = NUMBER2!! + NUMBER3!!
// !!로 null이 아님을 보장할 수 있음
// 하지만 실제로 null인 경우에는 NPE 발생 가능
// 정말 100% 확신이 있는 경우가 아니면 사용하지 말 것
println(NUMBER4)

if (null == 5) { // == 비교연산은 가능
    println("same")
} else {
    println("not same")
}

if (null == null) { // == 비교연산은 가능
    println("same")
} else {
    println("not same")
}
