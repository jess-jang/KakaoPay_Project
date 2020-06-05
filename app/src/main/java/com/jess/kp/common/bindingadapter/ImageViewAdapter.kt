package com.jess.kp.common.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.jess.kp.common.extension.loadImage

/**
 * @author jess
 * @since 2020.06.12
 */

/**
 * 이미지 로드
 */
@BindingAdapter("loadImage")
fun ImageView.loadImage(url: String?) {
    this.loadImage(url)
}