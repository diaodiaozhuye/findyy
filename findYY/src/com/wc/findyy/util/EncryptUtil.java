package com.wc.findyy.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 处理数据加解密、编码
 * @author cby
 *
 */
public class EncryptUtil {

	/**
	 * MD5加密
	 * @param str
	 * @return
	 */
	public static String md5(String str) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		try {
			md.update(str.getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		byte b[] = md.digest();
		int i;
		StringBuffer buf = new StringBuffer("");
		for (int offset = 0; offset < b.length; offset++) {
			i = b[offset];
			if (i < 0)
				i += 256;
			if (i < 16)
				buf.append("0");
			buf.append(Integer.toHexString(i));
		}
		String signStr = buf.toString();
		return signStr;
	}

	/**
	 * 验证密文验证
	 * @param jkid
	 * @param params
	 * @return
	 */
	public static boolean valMw(String jkid, HashMap<String, String> params) {
		String mwyz = params.get("mwyz");
		StringBuilder decryStr = new StringBuilder();
		Set<Map.Entry<String, String>> set = params.entrySet();
		for(Iterator<Map.Entry<String, String>> it = set.iterator();it.hasNext();){
			Map.Entry<String, String> map = it.next();
			if(map.getKey().equals("mwyz")){
				continue;
			}
			decryStr.append(map.getValue());
		}
		if(md5(decryStr.toString()).equals(mwyz)){
			return true;
		}
		return false;
	}

}
