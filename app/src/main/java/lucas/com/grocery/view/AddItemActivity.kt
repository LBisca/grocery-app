package lucas.com.grocery.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_add_item.*
import lucas.com.grocery.R
import lucas.com.grocery.model.getList

class AddItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)

        rv_add.hasFixedSize()
        rv_add.layoutManager = LinearLayoutManager(this)
        rv_add.adapter = AddItemAdapter(getList(), this)
    }
}
