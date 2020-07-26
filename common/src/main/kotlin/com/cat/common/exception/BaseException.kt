package com.cat.common.exception

/**
 * @author jjj
 * @date 2020/7/26
 * @since JDK1.8
 */
open class BaseException(
    val code: String? = null,
    message: String? = null,
    cause: Throwable? = null
) : RuntimeException(message, cause) {
}