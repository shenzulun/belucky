/**
 *
 */
package org.magen.belucky;

import java.util.Date;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;
import org.magen.belucky.util.DateTimeUtil;

/**
 * 单元测试：日期工具类
 *
 * @date Jan 28, 2015
 * @author shenzl
 */
public class DateTimeUtilTest {

	/**
	 * Test method for {@link org.magen.belucky.util.DateTimeUtil#format(java.util.Date, java.lang.String, java.util.Locale)}.
	 */
	@Test
	public void testFormatDateStringLocale() {
		Date date = new Date();
		String str = DateTimeUtil.format(date,"yyyyMMdd",Locale.CHINESE);
		Assert.assertEquals("20150128", str);
	}

	/**
	 * Test method for {@link org.magen.belucky.util.DateTimeUtil#format(java.util.Date, java.lang.String)}.
	 */
	@Test
	public void testFormatDateString() {
		Date date = new Date();
		String str = DateTimeUtil.format(date,"yyyy/MM/dd");
		Assert.assertEquals("2015/01/28", str);
	}

	/**
	 * Test method for {@link org.magen.belucky.util.DateTimeUtil#format(java.util.Date)}.
	 */
	@Test
	public void testFormatDate() {
		Date date = new Date();
		String str = DateTimeUtil.format(date);
		Assert.assertNotNull(str);
		System.out.println(str);
	}

}
