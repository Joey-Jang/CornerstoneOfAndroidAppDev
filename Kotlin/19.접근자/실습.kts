// Scope
var number: Int = 1

fun changeNumber() {
    var internalNumber: Int = 2
    number = 20 // 하위 스코프에서 상위 스코프 멤버에 접근 가능
    var number: String = "재정의" // 하위 스코프에서 상위 스코프 멤버 재정의 가능
    println(number)
}
//internalNumber = 30 // 상위 스코프에서 하위 스코프 멤버에 접근 불가능
changeNumber()
println(number)


// 접근제한자
class Numbers(private var number: Int = 10) {
    fun changeNumber() {
        this.number = 100 // Numbers라는 스코프 안에 존재하기 때문에 private number에 접근/변경 가능
    }

    fun whatIsNumber(): Int {
        return this.number
    }
}

val NUMBERS = Numbers()
println(NUMBERS.whatIsNumber()) // Numbers라는 스코프 밖에 존재하기 때문에 private number에 접근/변경 불가능
//NUMBERS.number = 100 // Numbers라는 스코프 밖에 존재하기 때문에 private number에 접근/변경 불가능
NUMBERS.changeNumber()
println(NUMBERS.whatIsNumber())
