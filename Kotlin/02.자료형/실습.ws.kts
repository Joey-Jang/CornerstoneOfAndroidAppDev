// 02. 자료형

// 변수를 자료형(Type)과 함께 선언하는 방법
// var/val 변수명: 자료형 = 값
val BYTE_INT: Byte = 10
val SHORT_INT: Short = 10
val INTEGER_INT: Int = 10
val LONG_INT: Long = 10

//val WRONG_BYTE: Byte = 10000 // the integer literal does not conform to the expected type Byte
//val WRONG_BYTE: Byte = "안녕하세요" // type mismatch: inferred type is String but Byte was expected

//val FLOAT_NUMBER: Float = 10.0 // the floating-point literal does not conform to the expected type Float
val FLOAT_NUMBER1: Float =
    10.0f // the floating-point literal does not conform to the expected type Float
val DOUBLE_NUMBER: Double = 10.0
//val DOUBLE_NUMBER1: Double = 10 // the integer literal does not conform to the expected type Double

// 타입추론
val NUMBER1 = 10 // Int
val NUMBER2 = 10.0 // Double

// 논리형
val YES: Boolean = true
val NO: Boolean = false

// 문자형
val TEXT1: Char = 'A'
//val TEXT2: Char = 'AA' // too many characters in a character
//val TEXT3: Char = "A" // type mismatch: inferred type is String but Char was expected

// 문자열형
val TEXT4: String = "안녕하세요"
val TEXT5: String = "네"


// 타입을 선택할 때는 가능한 가장 작은 타입을 선택하는 것이 좋음
// 실제로는 대부분 Int, Double을 사용

// 예약어 사용 불가
//var true: Int = 10 // expecting property name or receiver type