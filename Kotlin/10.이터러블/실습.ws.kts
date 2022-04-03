// Range
val RANGE_1 = 1..10
println(RANGE_1)
val RANGE_2 = 1 until 10
println(RANGE_2)
val RANGE_3 = 'A'..'Z'
println(RANGE_3)
val RANGE_4 = 'ㄱ'..'ㅎ'
println(RANGE_4)

// Progression
val RANGE_5 = 1..10 step 2 // (1, 3, 5, 7, 9)
println(RANGE_5)
val RANGE_6 = 10 downTo 1 step 2
println(RANGE_6)
// step
// - 특징: step의 값과 상관없이 첫번째는 무조건 index 0부터 시작

// Collection
val COLLECTION_1 = listOf<Int>(1, 2, 3, 4, 5) // ctrl + click으로 타고올라가서 Interable인지 확인
