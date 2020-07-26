package com.cat.common.exception

import com.cat.common.constant.ErrorCode

/**
 * @author jjj
 * @date 2020/7/26
 * @since JDK1.8
 */
class ParamException(
    code: String? = ErrorCode.SYS0002.name,
    message: String? = ErrorCode.SYS0002.description(),
    cause: Throwable? = null
) : BaseException(code, message, cause) {
}