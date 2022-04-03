val NUMBERS = intArrayOf(5, 10, 15)

// 값만
for (NUMBER in NUMBERS) {
    println(NUMBER)
}
println("------------------------")
// 인덱스 + 값
for ((index, value) in NUMBERS.withIndex()) {
    println(index)
    println(value)
}
println("------------------------")
// 인덱스만
for (index in NUMBERS.indices) {
    println(index)
}
println("------------------------")
NUMBERS.forEachIndexed { index, i ->
    println("[" + index + "] " + i);
}
NUMBERS.forEachIndexed { index, value ->
    println("[" + index + "] " + value);
}
