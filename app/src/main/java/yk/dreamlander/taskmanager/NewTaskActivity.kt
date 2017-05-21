package yk.dreamlander.taskmanager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class NewTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.id.new_task_title)
        setContentView(R.layout.activity_new_task)
    }
}
