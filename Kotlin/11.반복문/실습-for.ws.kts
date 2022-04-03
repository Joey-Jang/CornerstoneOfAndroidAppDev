// ragne
for (value in 1..3) {
    println("반복")
}

// progression + step
for (value in 0..5 step (2)) {
    println("반복 1")
}

// progression + downTo
for (value in 5 downTo 0) {
    println("반복 2")
}

// collection
val NUMBERS = listOf<Int>(0, 1, 2, 3)
for (NUMBER in NUMBERS) {
    println(NUMBER)
}

println(NUMBERS.size)
for (i in 0..NUMBERS.size) {
    println("반복 3");
}

for (i in 0 until NUMBERS.size) {
    println("반복 4")
}

for ((index, NUMBER) in NUMBERS.withIndex()) {
    println("[" + index + "] " + NUMBER)
}

// forEach
NUMBERS.forEach{ NUMBER ->
    println(NUMBER)
}
