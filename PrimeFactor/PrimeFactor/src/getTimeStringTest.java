import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;


public class getTimeStringTest {

	@Test
	public void 获得当前时间() throws Exception{
		
		//TestgetTimeString a = new TestgetTimeString();
		getTimeString gts = new getTimeString();
		try {
			Assert.assertSame("2013-06-26 14:00:00", gts.getNow());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Assert.fail();
	}
	
	private class TestgetTimeString extends getTimeString{
		
		public String getNow() throws Exception{
			
			Date d = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2013-06-26 14:00:00");
			return "现在是："+d.toString();
		}
	}
}
