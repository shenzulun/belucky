package org.magen.belucky.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 文件工具类
 * @date 2015年2月12日
 * @author shenzl
 */
public class FileUtil {
	private static Map<String,String> fileCache = new ConcurrentHashMap<String,String>();
	
	/**
	 * 读取文本内容
	 * @param filePath
	 * @return
	 */
	public static String readFile(String filePath){
		if(filePath == null){
			return null;
		}
		String content = null;
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(filePath);
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
			StringBuilder builder = new StringBuilder();  
			String line="";  
			while(reader.ready()){  
				line = reader.readLine();
				builder.append(line).append("\n");  
			}  
			content = builder.toString();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		return content;
	}
	
	/**
	 * 从缓存中读取文件
	 * @param filePath
	 * @return
	 */
	public static String readFileFromCache(String filePath){
		if(filePath == null){
			return null;
		}
		String content = null;
		if((content=fileCache.get(filePath)) == null){
			content = readFile(filePath);
			fileCache.put(filePath, content);
		}
		return content;
	}
}
