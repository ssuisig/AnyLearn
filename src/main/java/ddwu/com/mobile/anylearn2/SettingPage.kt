package ddwu.com.mobile.anylearn2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SettingPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_page)

        val menuRecyclerView: RecyclerView = findViewById(R.id.settingMenuRecyclerView)
        val layoutManager = LinearLayoutManager(this)
        menuRecyclerView.layoutManager = layoutManager

        // 데이터 리스트 생성 (예시)
        val menuItems = listOf("계정 설정", "알림 설정", "소리 설정", "화면 설정", "모드 설정")

        // 어댑터 설정
        val adapter = SettingPageAdapter(menuItems, this)
        menuRecyclerView.adapter = adapter

        val undoButton: Button = findViewById(R.id.SettingPageUndo)
        undoButton.setOnClickListener {
            finish()
        }
    }
}