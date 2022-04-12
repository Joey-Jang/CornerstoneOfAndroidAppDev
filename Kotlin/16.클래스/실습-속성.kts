// getter/setter
class Book() {
    var title: String = "제목"
        get() {
            println("getter 호출")
            return field
        }
        set(value) {
            println("setter 호출")
            field = value
        }
}
//val BOOK = Book()
//println(BOOK.title)
//BOOK.title = "제목 변경"
//println(BOOK.title)

// lateinit
class MasterBook() {
    lateinit var title: String

    fun nextPage() {
        if (::title.isInitialized) println("페이지 넘김")
        else println("초기화 필요")
    }
}
val BOOK = MasterBook()
BOOK.title = "책 이름"
println(BOOK.nextPage())
val BOOK_2 = MasterBook()
println(BOOK_2.nextPage())

// lazy
// - 호출 시점에 by lazy 정의에 의해서 초기화 수행
// - val에서만 사용 가능
class Book2 {
    val title: String by lazy {
        // 본문 -> 다른 작업도 할 수 있지만 반드시 프로퍼티를 초기화시켜주는 작업을 해야함
        println("lazy 초기화")
        // ex. 엄청 복잡한 작업이 있다면
//        title = "책 제목" -> 불가
//        return "책 제목" -> 불가
        "책 제목"
    }
}
val BOOK_3 = Book2()
println(BOOK_3.title)
