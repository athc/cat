package com.cat.common.extention

import javax.servlet.http.HttpServletRequest

fun HttpServletRequest.getRealIp(): String {
  return getHeaderValue(this, "X-Forwarded-For")
      ?: getHeaderValue(this, "X-Real-IP")
      ?: getHeaderValue(this, "WL-Proxy-Client-IP")
      ?: this.remoteAddr
}

private fun getHeaderValue(request: HttpServletRequest, name: String): String? {
  val headValue = request.getHeader(name)
  return if (!headValue.isNullOrBlank() && !"unKnown".equals(headValue, ignoreCase = true)) {
    headValue.getFirstValue()
  } else null
}

private fun String.getFirstValue(): String {
  val index = this.indexOf(",")
  return if (index != -1) {
    this.substring(0, index)
  } else {
    this
  }
}
