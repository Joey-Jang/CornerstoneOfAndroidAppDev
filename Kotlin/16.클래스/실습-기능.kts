class SoccorPlayer constructor(uniform: String, ball: String) {
    val uniform: String
    val ball: String

    init {
        this.uniform = uniform
        this.ball = ball
    }

    fun kick() {
        if (ball == "축구공") println("공을 찼음")
        else println("공이 없음")
    }

    fun pass() {
        println("패스!")
    }
}

val SOCCOR_PLAYER = SoccorPlayer("빨간색 유니폼", "축구공")
SOCCOR_PLAYER.kick()

val SOCCOR_PLAYER_2 = SoccorPlayer("파란색 유니폼", "축구공")
SOCCOR_PLAYER_2.pass()