/**
 * 
 */
package org.magen.belucky;

import org.junit.Test;
import org.magen.belucky.base.BaseTest;
import org.magen.belucky.util.FileUtil;

/**
 * @date 2015年2月12日
 * @author shenzl
 */
public class FileUtilTest extends BaseTest{

	/**
	 * Test method for {@link org.magen.belucky.util.FileUtil#readFile(java.lang.String)}.
	 */
	@Test
	public void testReadFile() {
		String fileName = "md/aboutme.md";
		String content = FileUtil.readFile(fileName);
		System.out.println(content);
	}

}
