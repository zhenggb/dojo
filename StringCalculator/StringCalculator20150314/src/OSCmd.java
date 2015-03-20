import java.io.*;
import java.lang.*;
public class OSCmd extends Object {
	
	
   	public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        int rc = -2;
        System.out.println("hello world");
        try {
            Process p = rt.exec("cmd.exe dir");
            int bufSize = 4096;
            BufferedInputStream bis = new BufferedInputStream(p.getInputStream(), bufSize);
        int len;
        byte buffer[] = new byte[bufSize];
        while ((len = bis.read(buffer, 0, bufSize)) != -1)
                System.out.write(buffer, 0, len);
            rc = p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
            rc = -1;
        } finally {
//            return rc;
        }
    }
}