package com.wc.findyy.util;

import java.util.Random;

/**
 * 字符串工具类
 * @author cby
 *
 */
public class StringUtil {

	/**
	 * 判断字符串是否符合指定的格式
	 * @param content
	 * @param pattern
	 * @return
	 */
	public static boolean isMatches(String content,
			String pattern) {
		if(content.matches(pattern)){
			return true;
		}
		return false;
	}
	
	/**
	 * @Title: strIsNotNull
	 * @Description: 判断字符串是否为空
	 * @param str 字符串
	 * @return boolean 是否为空
	 */
	public static boolean strIsNotNull(String str) {
		boolean flag = false;
		if (str == null || "".equals(str)) {
			flag = false;
		} else {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * 
	* @Title: getSCode
	* @Description: TODO(生成随机验证码)
	* @param @return    设定文件
	* @return String    返回类型
	* @throws
	 */
	public static String getSCode() {
		StringBuilder code = new StringBuilder();
		Random random = new Random();
		for(int i=0; i<6; i++){
			code.append(random.nextInt(10));
		}
		return code.toString();
	}

}
