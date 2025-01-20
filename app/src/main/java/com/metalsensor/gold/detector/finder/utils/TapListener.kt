package com.metalsensor.gold.detector.finder.utils

import android.os.SystemClock
import android.view.View

abstract class TapListener : View.OnClickListener {
    companion object {
        private const val DEBOUNCE = 500L
    }

    private var lastClickMillis: Long = 0
    private var now = 0L

    override fun onClick(v: View?) {
        now = SystemClock.elapsedRealtime()
        if (now - lastClickMillis > DEBOUNCE)
            onTap(v)
        lastClickMillis = now
    }

    abstract fun onTap(v: View?)
}