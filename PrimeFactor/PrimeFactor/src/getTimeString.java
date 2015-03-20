import java.text.SimpleDateFormat;
import java.util.Date;

public class getTimeString {

	Date d;

	public getTimeString() {
		this.d=new Date();
	}
	
	public getTimeString(Date d) {
		this.d = d;
	}

	public String getNow() throws Exception {

		
		return "现在是："+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2013-06-30 14:00:00").toString();
		//return d.toString();
	}
}
