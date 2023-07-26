package ddwu.com.mobile.anylearn2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ddwu.com.mobile.anylearn2.databinding.ActivityWithaiLevelBinding

class WithaiLevel : AppCompatActivity() {

    lateinit var wlBinding : ActivityWithaiLevelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        wlBinding = ActivityWithaiLevelBinding.inflate(layoutInflater)
        setContentView(wlBinding.root)

        wlBinding.levelFinishBtn.setOnClickListener{
            val intent = Intent(this, ScriptSaveChoice::class.java)
            startActivity(intent)
        }
    }
}