package ddwu.com.mobile.anylearn2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ddwu.com.mobile.anylearn2.databinding.ActivityScriptNameInputBinding

class ScriptNameInput : AppCompatActivity() {

    lateinit var sniBinding : ActivityScriptNameInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sniBinding = ActivityScriptNameInputBinding.inflate(layoutInflater)
        setContentView(sniBinding.root)

        sniBinding.nameInputListBtn.setOnClickListener{
            val intent = Intent(this, MyScriptList::class.java)
            startActivity(intent)
        }
    }
}