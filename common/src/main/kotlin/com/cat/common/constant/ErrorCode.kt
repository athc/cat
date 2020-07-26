package com.cat.common.constant

/**
 * @author jjj
 * @date 2020/7/26
 * @since JDK1.8
 */
enum class ErrorCode(private val description: String) {

  SYS0001("系统错误"),
  SYS0002("参数错误"),
  SYS0003("状态异常"),
  SYS0004("格式错误")
  ;

  fun description() = description

}