package com.tastyelectrons.autopilog

import java.util.logging.Logger

class JvmLogger(private val logger: Logger) {
    fun info(message: String?) = logger.info(message)
    fun severe(message: String?) = logger.severe(message)

    companion object {
        fun getLogger(name: String?) = JvmLogger(Logger.getLogger(name))
    }
}