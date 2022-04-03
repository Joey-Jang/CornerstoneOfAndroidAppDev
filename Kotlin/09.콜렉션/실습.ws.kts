// List
val NUMBERS = listOf<Int>(1, 2, 3)
//NUMBERS[0] = 3 // error: no set method providing array access
println(NUMBERS)
println(NUMBERS[0])
println(NUMBERS.get(1))
println(NUMBERS.last())
println(NUMBERS.first())

val NUMBERS_2 = mutableListOf<Int>(1, 1, 1, 2, 3)
NUMBERS_2[4] = 5
println(NUMBERS_2)
println(NUMBERS_2.indexOf(1))
NUMBERS_2.add(50)
println(NUMBERS_2)
NUMBERS_2.removeAt(0)
println(NUMBERS_2)
NUMBERS_2.addAll(2, listOf<Int>(100, 100))
println(NUMBERS_2)

// Set
val NUMBERS_3 = setOf<Int>(1, 1, 1, 3, 3, 4)
println(NUMBERS_3.contains(5))
println(NUMBERS_3.containsAll(setOf<Int>(1, 3)))

val NUMBERS_4 = mutableSetOf<Int>(1, 1, 1, 3, 3, 4)
NUMBERS_4.remove(1)
NUMBERS_4.remove(10)
println(NUMBERS_4)

// Map
val NUMBERS_5 = mapOf<Int, String>(1 to "one", 2 to "two")
println(NUMBERS_5.keys)
println(NUMBERS_5.values)
println(NUMBERS_5.entries)
println(NUMBERS_5.size)
println(NUMBERS_5.get(1))
println(NUMBERS_5[2])
println(NUMBERS_5.getOrDefault(1, "default"))
println(NUMBERS_5.getOrDefault(3, "default"))
println(NUMBERS_5.get(3))

val NUMBERS_6 = mutableMapOf<Int, String>(Pair(1, "one"), Pair(2, "two"))