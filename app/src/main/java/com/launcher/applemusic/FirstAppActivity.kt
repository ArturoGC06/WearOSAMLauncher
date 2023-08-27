package com.launcher.applemusic

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class FirstAppActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent()
        intent.component = ComponentName(
            "com.apple.android.music",
            "com.apple.android.music.search.google.VoiceSearchHandlerActivity"
        )

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            // La app no está instalada
            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.alert_title)
            builder.setMessage(R.string.alert_message)
            builder.apply {
                setPositiveButton(R.string.btn_ok,
                    DialogInterface.OnClickListener { dialog, id ->
                        val intent = Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://github.com/ArturoGC06/WearOSAMLauncher/tree/main")
                        )
                        startActivity(intent)
                    })
                setNegativeButton(R.string.btn_cancel,
                    DialogInterface.OnClickListener { dialog, id ->
                        // User cancelled the dialog
                    })
            }
            builder.show()
        }
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)

        btnStart.setOnClickListener {
            val intent = Intent()
            intent.component = ComponentName(
                "com.apple.android.music",
                "com.apple.android.music.search.google.VoiceSearchHandlerActivity"
            )

            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                // La app no está instalada
                val builder = AlertDialog.Builder(this)
                builder.setTitle(R.string.alert_title)
                builder.setMessage(R.string.alert_message)
                builder.apply {
                    setPositiveButton(R.string.btn_ok,
                        DialogInterface.OnClickListener { dialog, id ->
                            val intent = Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://github.com/ArturoGC06/WearOSAMLauncher/tree/main")
                            )
                            startActivity(intent)
                        })
                    setNegativeButton(R.string.btn_cancel,
                        DialogInterface.OnClickListener { dialog, id ->
                            // User cancelled the dialog
                        })
                }
                builder.show()
            }
        }
    }
}