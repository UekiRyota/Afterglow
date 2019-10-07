package jp.gesource.qrcodereaderforandroid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val RecievedURL = intent.getStringExtra("Roselia")
        val intentB = Intent(Intent.ACTION_VIEW)
        this.intent.data = Uri.parse(RecievedURL)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intentB)
            webView.settings.javaScriptEnabled = true
            webView.loadUrl(RecievedURL)
        }
    }
}