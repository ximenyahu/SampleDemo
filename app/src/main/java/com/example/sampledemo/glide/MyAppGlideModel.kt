package com.example.sampledemo.glide

import android.content.Context
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator
import com.bumptech.glide.module.AppGlideModule

/**
 * 定义Glide在初始化的时候用到的一些依赖项
 * 一个应用最多只能有一个AppGlideModel模块
 * Library模块要使用LibraryGlideModel
 */
@GlideModule
class MyAppGlideModel : AppGlideModule() {
    override fun applyOptions(context: Context, builder: GlideBuilder) {
        super.applyOptions(context, builder)
        MemorySizeCalculator.Builder(context).setMemoryCacheScreens(2f).build()

    }
}