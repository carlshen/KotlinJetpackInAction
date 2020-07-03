package com.boycoder.kotlinjetpackinaction;

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_image_preview.*

class ImagePreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_preview);

        val intent: Intent = getIntent();
        val url: String = intent.getStringExtra(MainActivity.EXTRA_PHOTO);
        if (!url.isNullOrBlank()) {
            Glide.with(this@ImagePreviewActivity).load(url).into(imagePreview);
        }
    }


}