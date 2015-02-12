package org.magen.belucky.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * 日期格式化，json使用
 * @date 2015年2月12日
 * @author shenzl
 */
public class CustomDateSerializer extends JsonSerializer<Date>{

	@Override
	public void serialize(Date date, JsonGenerator json, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String formattedDate = formatter.format(date);
	    json.writeString(formattedDate);
	}
}
