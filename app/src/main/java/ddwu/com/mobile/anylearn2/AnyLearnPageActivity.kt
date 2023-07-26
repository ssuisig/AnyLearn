package ddwu.com.mobile.anylearn2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AnyLearnPageActivity : AppCompatActivity() {

    private val delayMillis = 5000L // 딜레이 시간 설정 (5초)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_any_learn_page) // 레이아웃 파일 이름에 맞게 수정해야 합니다.

        // 지정된 딜레이 후 LoginActivity로 전환
        /*android.os.Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // 현재 액티비티 종료
        }, delayMillis)*/
    }
}