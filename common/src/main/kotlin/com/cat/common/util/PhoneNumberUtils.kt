package com.cat.common.util

import com.cat.common.constant.ErrorCode
import com.cat.common.exception.ParamException
import com.google.i18n.phonenumbers.PhoneNumberUtil
import com.google.i18n.phonenumbers.Phonenumber

/**
 * @author jjj
 * @date 2020/7/23
 * @since JDK1.8
 * 手机号格式验证
 *
 */

object PhoneNumberUtils {

  private val util = PhoneNumberUtil.getInstance()

  /**
   * 全球手机号验证
   * @param phoneNumber 手机号
   * @param countryCode 国家码 default 86-中国
   */
  fun isPhoneNumber(phoneNumber: String, countryCode: String = "86"): Boolean {
    val pn = Phonenumber.PhoneNumber()
    pn.countryCode = countryCode.toIntOrNull()
        ?: throw ParamException(code = ErrorCode.SYS0002.name, message = "国家码格式不正确")
    pn.nationalNumber = phoneNumber.toLongOrNull()
        ?: throw ParamException(code = ErrorCode.SYS0002.name, message = "手机号码格式不正确")

    return util.isValidNumber(pn)
  }
}
