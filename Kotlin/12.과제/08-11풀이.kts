//1. 주어진 문자를 N번 반복해서 출력하는 함수를 만들어 보자
fun printNtimes(STR: String, N: Int): Unit {
    for (i in 1..N) {
        println(STR)
    }
}

//2. 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어 보자
fun sum1toN(N: Int): Int = (1 + N) * N / 2

//3. 1부터 100까지의 수중에서 7의 배수의 합을 구하는 함수를 만드시오
fun sum7Between1and100(): Int {
    var sum: Int = 0
    for (i in 1..100) {
        if (i % 7 == 0) sum += i
    }

    return sum
}

//4. 100 보다 작은 숫자를 넣어주면, 1씩 증가를 시키고 100 이 되면 종료되는 함수를 만드시오
fun plus1until100(NUM: Int): Unit {
    var n: Int = NUM
    while (n < 100) n++

    return
}

//5. 시험 성적 리스트 [70,71,72,77,78,79,80,82,90,99]
//    와 동일한 크기의 배열을 만들고, 합격이면 true, 불합격이면 false를 담는 함수를 만드시오
//    (80점 이상 부터 합격, 정답 예시 (False,False,...))
fun passOrFail(ARR: List<Int>): BooleanArray {
    val RESULT = BooleanArray(ARR.size, {false})
    ARR.forEachIndexed { index, score ->
        if (score >= 80) RESULT.set(index, true)
    }

    return RESULT
}
val RESULT = passOrFail(listOf<Int>(70,71,72,77,78,79,80,82,90,99))
RESULT.forEach {
    println(it)
}

//6. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오
//    -> [[3,3],[1,5],...]
fun dice6composition(): List<List<Int>> {
    val RESULT = mutableListOf<List<Int>>()
    for (i in 1..6) {
        if (6-i > 0) {
            val COMPSITION = listOf<Int>(i, 6-i)
            RESULT.add(COMPSITION)
        }
    }

    return RESULT
}
println(dice6composition())

//7. 배부르기 위해서 먹어야하는 총 밥먹기 횟수, 현재 밥먹은 횟수, 두개를 받는 함수를 만드시오
//    함수는 "밥을 먹었다" 한번 출력을 할때 마다 밥을 1회 먹은 것으로 간주를 하고,
//    배가 부를 때까지 밥을 먹여야 한다
//    배가 부를 경우에는 "배가 부르다" 를 출력한다
//    배가 아무리 불러도 최소 한번은 무조건먹는다
//    fun eat(3,2):{}
//    ->"밥을 먹었다"
//    ->"배가 부르다"
fun eat(MAX_CNT: Int, CUR_CNT: Int): Unit {
    var curCnt = CUR_CNT
    val ATE: String = "밥을 먹었다"
    val FULL: String = "배가 부르다"

    do {
        println(ATE)
        curCnt++
    } while (curCnt < MAX_CNT)
    println(FULL)

    return
}
eat(10, 10)

//8. 병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두개의 병사
//    그룹을 합쳐주는 함수를 만드시오
//    fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 2)
//    -> [["A", "B", "D", "E"], ["A", "B"]]
//
//    (합수 실행이 어려운 조건을 만나면 null을 리턴해야한다)
//    fun abc( ["A", "B", "C", "D", "E"] ,  ["A", "B", "C"], 100)
//    -> null
fun removeAndMerge(
    LIST_1: List<String>,
    LIST_2: List<String>,
    removeIndex: Int
): List<List<String>>? {
    if (!LIST_1.indices.contains(removeIndex) || !LIST_2.indices.contains(removeIndex)) return null

    var newList1 = mutableListOf<String>()
    LIST_1.forEachIndexed {index, item ->
        if (index != removeIndex) newList1.add(item)
    }

    var newList2 = mutableListOf<String>()
    LIST_2.forEachIndexed {index, item ->
        if (index != removeIndex) newList2.add(item)
    }

    return listOf(newList1, newList2)
}
println(
    removeAndMerge(
        LIST_1 = listOf<String>("A", "B", "C", "D", "E"),
        LIST_2 = listOf<String>("A", "B", "C"),
        removeIndex = 1
    )
)

//9. 단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수를 만드시오
//    fun abc(3)
//    ->[3,6,9,12,15,18,21,24,27]
fun googoo(N: Int): Unit {
    val RESULT = mutableListOf<Int>()
    for (i in 1..9) RESULT.add(N * i)

    println(RESULT)
}
googoo(3)

//10. 숫자 리스트 두개를 넣어주면 짝수 홀수로 분리된 Map을 만드는 함수를 만드시오
//    (Map의 키는 짝수의 경우 "짝수", 홀수의 경우 "홀수" 한다)
fun sortEvenAndOdd(LIST_1: List<Int>, LIST_2: List<Int>): Map<String, List<Int>> {
    val TOTAL_LIST = mutableListOf<Int>()
    TOTAL_LIST.addAll(LIST_1)
    TOTAL_LIST.addAll(LIST_2)
    TOTAL_LIST.sort()
    val RESULT = mutableMapOf<String, List<Int>>()

    val EVEN_LIST = mutableListOf<Int>()
    val ODD_LIST = mutableListOf<Int>()
//    for (num in LIST_1) {
//        if (num % 2 == 0) EVEN_LIST.add(num)
//        else ODD_LIST.add(num)
//    }
//    for (num in LIST_2) {
//        if (num % 2 == 0) EVEN_LIST.add(num)
//        else ODD_LIST.add(num)
//    }
    TOTAL_LIST.forEach { number ->
        if (number % 2 == 0) EVEN_LIST.add(number)
        else ODD_LIST.add(number)
    }

    RESULT.put("짝수", EVEN_LIST)
    RESULT.put("홀수", ODD_LIST)

    return RESULT
}
println(
    sortEvenAndOdd(listOf<Int>(1,2,3,4,5), listOf<Int>(3,4,5,6,7,8))
)