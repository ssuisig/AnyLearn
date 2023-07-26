package ddwu.com.mobile.anylearn2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ddwu.com.mobile.anylearn2.databinding.ActivityMyScriptBinding

class MyScriptList : AppCompatActivity() {

    lateinit var mslBinding : ActivityMyScriptBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mslBinding = ActivityMyScriptBinding.inflate(layoutInflater)
        setContentView(mslBinding.root)
    }
}