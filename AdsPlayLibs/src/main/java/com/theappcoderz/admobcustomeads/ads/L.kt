package com.theappcoderz.admobcustomeads.ads

import android.util.Log
import com.theappcoderz.admobcustomeads.BuildConfig

object L {

    private var className: String = ""
    private var methodName: String = ""
    private var lineNumber: Int = 0

    private val isDebuggable: Boolean
        get() = BuildConfig.DEBUG

    private fun createLog(log: String): String {

        val buffer = StringBuffer()
        buffer.append("[")
        buffer.append(methodName)
        buffer.append(":")
        buffer.append(lineNumber)
        buffer.append("] ")
        buffer.append(log)

        return buffer.toString()
    }

    private fun getMethodNames(sElements: Array<StackTraceElement>) {
        className = sElements[1].fileName
        methodName = sElements[1].methodName
        lineNumber = sElements[1].lineNumber
    }

    @JvmStatic
    fun e(message: String) {
        if (!isDebuggable)
            return

        // Throwable instance must be created before any methods
        getMethodNames(Throwable().stackTrace)
        Log.e(className, createLog(message))
    }

    fun i(message: String) {
        if (!isDebuggable)
            return

        getMethodNames(Throwable().stackTrace)
        Log.i(className, createLog(message))
    }

    fun d(message: String) {
        if (!isDebuggable)
            return

        getMethodNames(Throwable().stackTrace)
        Log.d(className, createLog(message))
    }

    fun v(message: String) {
        if (!isDebuggable)
            return

        getMethodNames(Throwable().stackTrace)
        Log.v(className, createLog(message))
    }

    fun w(message: String) {
        if (!isDebuggable)
            return

        getMethodNames(Throwable().stackTrace)
        Log.w(className, createLog(message))
    }

    fun wtf(message: String) {
        if (!isDebuggable)
            return

        getMethodNames(Throwable().stackTrace)
        Log.wtf(className, createLog(message))
    }

}/* Protect from instantiations */