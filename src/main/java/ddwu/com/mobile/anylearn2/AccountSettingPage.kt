package ddwu.com.mobile.anylearn2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccountSettingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_setting_page)

        val undoButton: Button = findViewById(R.id.AccountSettingPageUndo)
        undoButton.setOnClickListener {
            finish()
        }
    }
}