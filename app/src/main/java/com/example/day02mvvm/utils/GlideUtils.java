package com.example.day02mvvm.utils;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;

public class GlideUtils {
    @BindingAdapter("android:url")
    public static void setImage(ImageView imageView,String url){
        Glide.with(imageView)
                .load(url)
                .into(imageView);
    }
}
