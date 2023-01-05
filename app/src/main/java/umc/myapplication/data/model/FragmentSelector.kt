package umc.myapplication.data.model

import java.time.LocalDateTime
import kotlin.random.Random

class FragmentSelector {
    // 랜덤한 페이지(프래그먼트)를 요청받음
    fun generateRandomPageNumber(): Int {
        return Random(LocalDateTime.now().second).nextInt(0, 3)
    }
}