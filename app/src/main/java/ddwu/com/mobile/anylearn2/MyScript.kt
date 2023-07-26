package ddwu.com.mobile.anylearn2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ddwu.com.mobile.anylearn2.databinding.ActivityMyScriptBinding
import ddwu.com.mobile.anylearn2.databinding.ActivityMyScriptListBinding

class MyScript : AppCompatActivity() {

    lateinit var msBinding : ActivityMyScriptBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        msBinding = ActivityMyScriptBinding.inflate(layoutInflater)
        setContentView(msBinding.root)

        msBinding.scriptHomeBtn.setOnClickListener{
            val intent = Intent(this, MainPage::class.java)
            startActivity(intent)
        }

        msBinding.scriptListBtn.setOnClickListener{
            val intent = Intent(this, MyScriptList::class.java)
            startActivity(intent)
        }
    }
}