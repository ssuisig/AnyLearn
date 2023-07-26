package ddwu.com.mobile.anylearn2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Anylearn : AppCompatActivity() {

    private val delayMillis = 5000L // 딜레이 시간 설정 (5초)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anylearn)

        // 지정된 딜레이 후 LoginActivity로 전환
        android.os.Handler().postDelayed({
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
            finish() // 현재 액티비티 종료
        }, delayMillis)
    }
}