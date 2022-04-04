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
    var n = NUM
    while (n < 100) {
        n++
    }

    return
}

//5. 시험 성적 리스트 [70,71,72,77,78,79,80,82,90,99]
//    와 동일한 크기의 배열을 만들고, 합격이면 true, 불합격이면 false를 담는 함수를 만드시오
//    (80점 이상 부터 합격, 정답 예시 (False,False,...))
fun passOrFail(ARR: IntArray): BooleanArray {
    val RESULT: BooleanArray = BooleanArray(ARR.size, {false})
    for (i in 0 until ARR.size) {
        if (ARR.get(i) >= 80) RESULT.set(i, true)
    }

    return RESULT
}

//6. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오
//    -> [[3,3],[1,5],...]
fun dice6composition(): Array<IntArray> {
    val RESULT: Array<IntArray> = Array(5, {IntArray(2, {0})})
    for (i in 1..5) {
        RESULT[i-1][0] = i
        RESULT[i-1][1] = 6-i
    }

    return RESULT
}

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

    if (curCnt == MAX_CNT) {
        println(ATE)
        println(FULL)
        return
    }

    while (curCnt < MAX_CNT) {
        println(ATE)
        curCnt++
    }
    println(FULL)
    return
}

//8. 병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두개의 병사
//    그룹을 합쳐주는 함수를 만드시오
//    fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 2)
//    -> [["A", "B", "D", "E"], ["A", "B"]]
//
//    (합수 실행이 어려운 조건을 만나면 null을 리턴해야한다)
//    fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 100)
//    -> null
fun removeAndMerge(ARR_1: Array<String>, ARR_2: Array<String>, index: Int): Array<Array<String>>? {
    if (!ARR_1.indices.contains(index) || !ARR_2.indices.contains(index)) return null

    var newArr1: Array<String>
    if (index == 0) {
        newArr1 = ARR_1.sliceArray(1 until ARR_1.size)
    } else if (index == ARR_1.size) {
        newArr1 = ARR_1.sliceArray(0 until ARR_1.size-1)
    } else {
        newArr1 = ARR_1.sliceArray(0 until index).plus(ARR_1.sliceArray(index+1 until ARR_1.size))
    }

    var newArr2: Array<String>
    if (index == 0) {
        newArr2 = ARR_2.sliceArray(1 until ARR_2.size)
    } else if (index == ARR_2.size) {
        newArr2 = ARR_2.sliceArray(0 until ARR_2.size-1)
    } else {
        newArr2 = ARR_2.sliceArray(0 until index).plus(ARR_2.sliceArray(index+1 until ARR_2.size))
    }

    return arrayOf(newArr1, newArr2)
}

//9. 단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수를 만드시오
//    fun abc(3)
//    ->[3,6,9,12,15,18,21,24,27]
fun googoo(N: Int): IntArray = IntArray(9, {i -> N * (i+1)})

//10. 숫자 리스트 두개를 넣어주면 짝수 홀수로 분리된 Map을 만드는 함수를 만드시오
//    (Map의 키는 짝수의 경우 "짝수", 홀수의 경우 "홀수" 한다)
fun sortEvenAndOdd(ARR_1: List<Int>, ARR_2: List<Int>): Map<String, List<Int>> {
    var RESULT = mutableMapOf<String, List<Int>>()

    val EVEN_LIST = mutableListOf<Int>()
    val ODD_LIST = mutableListOf<Int>()
    for (num in ARR_1) {
        if (num % 2 == 0) EVEN_LIST.add(num)
        else ODD_LIST.add(num)
    }
    for (num in ARR_2) {
        if (num % 2 == 0) EVEN_LIST.add(num)
        else ODD_LIST.add(num)
    }

    RESULT.put("짝수", EVEN_LIST)
    RESULT.put("홀수", ODD_LIST)

    return RESULT
}