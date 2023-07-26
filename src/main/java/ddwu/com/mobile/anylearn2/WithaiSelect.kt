package ddwu.com.mobile.anylearn2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WithaiSelect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_withai_select)

        val testButton : Button = findViewById(R.id.school)

        testButton.setOnClickListener {
            val intent = Intent(this, WithaiLevel::class.java)
            startActivity(intent)
        }
    }
}