// 클래스를 선언하는 방법
class Person {}

// 생성자
// 주생성자
//  - 클래스 이름 옆에 괄호로 둘러싸인 코드
//  - 클래스를 통해서 객체를 만드는 데에 필요한 재료들을 적어줌
//      - 재료이름(변수명): 재료타입(변수타입)
//  - 반드시 한개만 존재할 수 있음
//  - constructor 키워드를 생략할 수 있음

// 주 생성자 -> 풀버전 (생략이 없는 버전)
class User1 constructor(name: String) { // 클래스 이름은 대문자로 시작
    val userName: String // 클래스 속성 (프로퍼티, property)

    init { // 클래스를 통해서 객체를 만들 때 호출됨
        println(name)
        userName = name
    }
}

// 클래스를 호출하는 방법 -> 클래스를 통해서 객체를 만드는 방법
// 클래스를 호출 -> 인스턴스화 (Instance)
// 객체 -> Object, Instance
val USER_1 = User1("홍길동1")

// 주 생성자 -> init을 생략하는 방법
class User2 constructor(name: String) {
    val userName: String = name
}
val USER_2 = User2("홍길동2")
println(USER_2.userName)

// 주 생성자 -> constructor를 생략하는 방법
class User3(name: String) {
    val userName: String = name
}
val USER_3 = User3("홍길동3")
println(USER_3.userName)

// 주 생성자 -> 생략할 수 있는 모든걸 생략하는 방법
class UserSimple(val userName: String) {
}

// 주 생성자 -> 기본값
class User4(name: String = "김아무개") {
    val userName = name
}
val USER_4 = User4()
println(USER_4.userName)

// 생성자에서 받는 속성이 여러개인 경우
class User5 constructor(age: Int, name: String) {
    val age: Int
    val name: String

    init {
        this.age = age
        this.name = name
    }
}
val USER_5 = User5(20, "홍길동5")
println(USER_5.age)

// .의 의미 -> ~의
// USER_5.age -> USER_5의 age
// USER_5.name -> USER_5의 name
// .은 객체의 속성이나 기능을 사용할 때 사용

// 부 생성자 (Secondary Constructor)
// constructor 키워드를 생략할 수 없음
// 주 생성자에는 객체를 만들기 위한 필수 조건이 있다면,
// 부 생성자에는 객체를 만들기 위한 부가적인 조건들도 추가적으로 있음
// 부 생성자는 주 생성자에게 생성을 위임
class User6 constructor(name: String) {
    val name: String
    var nickname: String = ""
    var age: Int = 0

    init {
        println("init")
        this.name = name
    }

    // 부 생성자는 클래스명 우측에 올 수 없음 -> 클래스의 본문에 위치
    constructor(name: String, age: Int): this(name) {
        println("second")
        this.age = age
    }

    // 부 생성자는 여러개 존재할 수 있음
    constructor(name: String, nickname: String, age: Int): this(name) {
        this.age = age
        this.nickname = nickname
    }
}
//val USER_6 = User6(name = "가나다")
//println(USER_6.name)
val USER_6_2 = User6("가나다", "닉네임", 50)
println(USER_6_2.age)
// 실행 순서
// 부 생성자 호출 = 부 생성자 안에 있는 주 생성자 호출 -> init블록 호출 -> 부 생성자 본문 호출
//  - 초기화블록에서 초기화를 보장해주기 때문 -> 클래스가 생성될 때 초기화블록은 무조건 실행됨
//  - 초기화블록에 없는 속성은 선언할 때 초기화해줘야 함

class User7 {
    val age: Int
    val name: String

    // 주 생성자가 없는 것처럼 보이고 부 생성자만 있을 때 부 생성자가 주 생성자처럼 보이지만
    // 부 생성자임
    constructor(age: Int, name: String) {
        this.age = age
        this.name = name
    }
}

val USER_7 = User7(10, "가가가")
println(USER_7.age)
// 주 생성자는 코틀린이 자동으로 만들어줌
// 주 생성자가 없기 때문에 this()생성자를 이용해 생성을 위임할 필요가 없음
