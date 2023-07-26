package ddwu.com.mobile.anylearn2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val loginButton : Button = findViewById(R.id.btn_start)

        loginButton.setOnClickListener {
            val intent = Intent(this, FirstSetting::class.java)
            startActivity(intent)
        }
    }
}