// break
println("---- break ----")
for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) break;
        else println("\tj : " + j)
    }
}
println("---- continue ----")
// continue
for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) continue;
        else println("\tj : " + j)
    }
}
println("---- return ----")
// return
fun returnFunction(): Unit {
    for (i in 1..3) {
        println("i : " + i)
        for (j in 1..3) {
            if (j == 2) return
            else println("\tj : " + j)
        }
    }
}
returnFunction()
println("---- label + break ----")
// label + break
loop@for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) break@loop;
        else println("\tj : " + j)
    }
}
println("---- label + continue ----")
// label + continue
loop@for (i in 1..3) {
    println("i : " + i)
    for (j in 1..3) {
        if (j == 2) continue@loop;
        else println("\tj : " + j)
    }
}
println("---- forEach ----")
// forEach
listOf(1, 2, 3).forEach {
    if (it == 2) return@forEach
    else println(it)
}
listOf(1, 2, 3).forEach loop@{
    if (it == 2) return@loop
    else println(it)
}
