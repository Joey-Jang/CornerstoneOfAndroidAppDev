import java.lang.NumberFormatException
import java.nio.charset.Charset
import java.util.*

// 계산기1
class Calculator1 {
    fun printResult(result: Number): Unit {
        println(result)
    }

    fun plus(num1: Int, num2: Int): Unit {
        return printResult(num1 + num2)
    }

    fun minus(num1: Int, num2: Int): Unit {
        return printResult(num1 - num2)
    }

    fun mutiply(num1: Int, num2: Int): Unit {
        return printResult(num1 * num2)
    }

    fun divide(num1: Int, num2: Int): Unit {
        return printResult(num1.toDouble() / num2)
    }
}
//val CALC_1 = Calculator1()
//CALC_1.plus(1, 3)
//CALC_1.divide(1, 3)

// 계산기2
class Calculator2(initNumber: Number = 0) {
    var initNumber: Number
    var result: Number
    val operators: Set<Char> = setOf<Char>('+', '-', '*', '/')

    init {
        this.initNumber = initNumber
        this.result = initNumber
    }

    fun calculate(operator: Char, num: Number) {
        if (operators.contains(operator)) {
            if (result is Int) {
                when (operator) {
                    '+' -> result = result.toInt() + num.toInt()
                    '-' -> result = result.toInt() - num.toInt()
                    '*' -> result = result.toInt() * num.toInt()
                    '/' -> result = result.toInt() / num.toDouble()
                }
            } else if (result is Double) {
                when (operator) {
                    '+' -> result = result.toDouble() + num.toDouble()
                    '-' -> result = result.toDouble() - num.toDouble()
                    '*' -> result = result.toDouble() * num.toDouble()
                    '/' -> result = result.toDouble() / num.toDouble()
                }
            }
        }
        else println("잘못된 연산입니다.")
    }
}
//val CALC_2 = Calculator2(0)
//CALC_2.calculate('+', 13)
//println(CALC_2.result)
//CALC_2.calculate('/', 10)
//println(CALC_2.result)
//CALC_2.calculate('*', 10)
//println(CALC_2.result)

// 계산기3
class Calculator3(initNumber: Number = 0) {
    var initNumber: Number
    var result: Number
    val operators: Set<String> = setOf<String>("더하기", "빼기", "곱하기", "나누기")

    init {
        this.initNumber = initNumber
        this.result = initNumber
    }

    fun calculate(vararg str: String) {
        val resultTemp: Number = result
        str.forEach {
            var operator: String = it.substring(0, 3)
            var num: Number = 0
            if (!operators.contains(operator)) {
                operator = it.substring(0, 2)
                try {
                    if (it.substring(2).indexOf('.') == -1) {
                        num = it.substring(2).toInt()
                    } else {
                        num = it.substring(2).toDouble()
                    }
                } catch(e: NumberFormatException) {
                    println("적절하지 못한 숫자 형식입니다.")
                    e.printStackTrace()
                }
            } else {
                try {
                    if (it.substring(3).indexOf('.') == -1) {
                        num = it.substring(3).toInt()
                    } else {
                        num = it.substring(3).toDouble()
                    }
                } catch(e: NumberFormatException) {
                    println("적절하지 못한 숫자 형식입니다.")
                    e.printStackTrace()
                }
            }
            if (!operators.contains(operator)) {
                println("잘못된 연산입니다.")
                result = resultTemp
                return@forEach
            }

            if (result is Int) {
                when (operator) {
                    "더하기" -> result = result.toInt() + num.toInt()
                    "빼기" -> result = result.toInt() - num.toInt()
                    "곱하기" -> result = result.toInt() * num.toInt()
                    "나누기" -> result = result.toInt() / num.toDouble()
                }
            } else if (result is Double) {
                when (operator) {
                    "더하기" -> result = result.toDouble() + num.toDouble()
                    "빼기" -> result = result.toDouble() - num.toDouble()
                    "곱하기" -> result = result.toDouble() * num.toDouble()
                    "나누기" -> result = result.toDouble() / num.toDouble()
                }
            }
        }
    }
}
val CALC_3 = Calculator3()
CALC_3.calculate("더하기3", "곱하기3", "더하기5", "빼기2", "나누기5")
println(CALC_3.result)

/******************************************************************/

class Cal1 {
    var result: Int = 0
        set(value) {
            field = value
            println("중간 계산값: ${field}")
        }

    fun sum(inputNumber: Int) {
        result += inputNumber
    }

    fun minus(inputNumber: Int) {
        result -= inputNumber
    }

    fun multiply(inputNumber: Int) {
        result *= inputNumber
    }

    fun divide(inputNumber: Int) {
        result /= inputNumber
    }
}
val calculator1 = Cal1()
calculator1.sum(10)
calculator1.divide(2)
println(calculator1.result)

class Cal2 constructor(val initialValue: Int = 0) {
    var result: Int

    init {
        this.result = initialValue
    }

    fun calculate(operator: Char, inputNumber: Int) {
        when (operator) {
            '+' -> this.result += inputNumber
            '-' -> this.result -= inputNumber
            '*' -> this.result *= inputNumber
            '/' -> this.result /= inputNumber
            else -> println("잘못된 연산입니다.")
        }
    }
}

class Cal3 {
    var result: Int = 0

    fun calculate(operators: List<Char>, numbers: List<Int>) {
        operators.forEachIndexed { index, operator ->
            this._calculate(operator, numbers[index]) // this. 써도 안써도됨. 클래스 안에서만 쓴다는 것을 강조해주는 느낌으로.
        }
    }

    // 명명 규칙 _클래스 내부에서만 쓰는 함수
    fun _calculate(operator: Char, inputNumber: Int) {
        when (operator) {
            '+' -> this.result += inputNumber
            '-' -> this.result -= inputNumber
            '*' -> this.result *= inputNumber
            '/' -> this.result /= inputNumber
            else -> println("잘못된 연산입니다.")
        }
    }
}
val calculator3 = Cal3()
calculator3.calculate(listOf<Char>('+', '-'), listOf<Int>(10, 20))
println(calculator3.result)
