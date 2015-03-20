import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;



public class PrimeFactorTest {

	@Test
	public void input_1_return_null(){
		PrimeFactor PF = new PrimeFactor();
		ArrayList<Integer> expect = new ArrayList<Integer>();

	    Assert.assertEquals(expect,PF.generate(1));
	}
	
	@Test
	public void input_2_return_2(){
		PrimeFactor PF = new PrimeFactor();
		ArrayList<Integer> expect = new ArrayList<Integer>();
		expect.add(2);
	    Assert.assertEquals(expect,PF.generate(2));
	}
	
	@Test
	public void input_3_return_3(){
		PrimeFactor PF = new PrimeFactor();
		ArrayList<Integer> expect = new ArrayList<Integer>();
		expect.add(3);
	    Assert.assertEquals(expect,PF.generate(3));
	}
	
	@Test
	public void input_4_return_2_2(){
		PrimeFactor PF = new PrimeFactor();
		ArrayList<Integer> expect = new ArrayList<Integer>();
		expect.add(2);
		expect.add(2);
	    Assert.assertEquals(expect,PF.generate(4));
	}
	
	@Test
	public void input_5_return_5(){
		PrimeFactor PF = new PrimeFactor();
		ArrayList<Integer> expect = new ArrayList<Integer>();
		expect.add(5);
	    Assert.assertEquals(expect,PF.generate(5));
	}
	
	@Test
	public void input_6_return_2_3(){
		PrimeFactor PF = new PrimeFactor();
		ArrayList<Integer> expect = new ArrayList<Integer>();
		expect.add(2);
		expect.add(3);
	    Assert.assertEquals(expect,PF.generate(6));
	}
	
	@Test
	public void input_8_return_2_2_2(){
		PrimeFactor PF = new PrimeFactor();
	    Assert.assertEquals(list(2,2,2),PF.generate(8));
	}
	
	@Test
	public void input_9_return_3_3(){
		PrimeFactor PF = new PrimeFactor();
	    Assert.assertEquals(list(3,3),PF.generate(9));
	}
	
	private ArrayList<Integer> list(final int... expInts){
		ArrayList<Integer> expect = new ArrayList<Integer>();
		for(int i : expInts){
			expect.add(i);
		}
		return expect;
	}
}
