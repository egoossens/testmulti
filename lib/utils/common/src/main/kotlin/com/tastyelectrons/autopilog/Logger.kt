package com.tastyelectrons.autopilog

expect class Logger {
    fun info(message: String?)
    fun severe(message: String?)

    companion object {
        fun getLogger(name: String?): Logger
    }
}