package ddwu.com.mobile.anylearn2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ddwu.com.mobile.anylearn2.databinding.ActivityScriptSaveChoiceBinding

class ScriptSaveChoice : AppCompatActivity() {

    lateinit var sscBinding : ActivityScriptSaveChoiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sscBinding = ActivityScriptSaveChoiceBinding.inflate(layoutInflater)
        setContentView(sscBinding.root)

        sscBinding.saveBtn.setOnClickListener{
            val intent = Intent(this, ScriptNameInput::class.java)
            startActivity(intent)
        }

        sscBinding.noSaveBtn.setOnClickListener{
            val intent = Intent(this, MainPage::class.java)
            startActivity(intent)
        }
    }
}