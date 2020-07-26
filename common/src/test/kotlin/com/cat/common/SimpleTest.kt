package com.cat.common

import com.cat.common.constant.ErrorCode
import com.cat.common.exception.ParamException
import com.cat.common.util.PhoneNumberUtils
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * @author jjj
 * @date 2020/7/23
 * @since JDK1.8
 */
class SimpleTest {

  @Test
  fun phoneNumberTest() {
    val pn = "18328558611"
    val cc = "86"
    Assertions.assertThrows(ParamException::class.java) {
      val res = PhoneNumberUtils.isPhoneNumber(pn, cc)
      Assertions.assertTrue(res)
    }.let {
      Assertions.assertEquals(ErrorCode.SYS0002.name, it.code)
    }
  }
}