package porter;

import static org.junit.Assert.*;
import org.junit.Test;

public class testPorter {

	private porter PORTER = new porter();
	@Test
	public void testһ��������() {
		assertTotalPrice(0.0, PORTER.total());
	}

	@Test
	public void testֻ��һ���������ص�1��() {
		assertTotalPrice( 8.0,PORTER.total(0));
	}
	@Test
	public void testֻ��һ���������ص�4��() {
		assertTotalPrice( 8,PORTER.total(3));
	}
	@Test
	public void test�������������ص�3��() {
		assertTotalPrice( (double)(2*8),PORTER.total(2,2));
	}
	@Test
	public void test�������������ص�3��() {
		assertTotalPrice( (double)(3*8),PORTER.total(2,2,2));
	}
	@Test
	public void test�������������ص�3���͵�4��() {
		assertTotalPrice( (double)(2*8*(1-0.05)),PORTER.total(2,3));
	}
	@Test
	public void test��3���������ص�2����3�͵�4��() {
		assertTotalPrice( (double)(3*8*(1-0.1)),PORTER.total(1,2,3));
	}
	@Test
	public void test��4���������ص�2����3��4�͵�5��() {
		assertTotalPrice( (double)(4*8*(1-0.2)),PORTER.total(1,2,3,4));
	}
	@Test
	public void test��5����ͬ�Ĺ�������() {
		assertTotalPrice( (double)(5*8*(1-0.25)),PORTER.total(0,1,2,3,4));
	}
	
	@Test
	public void test��2����ͬ��1����������() {
		assertTotalPrice( (double)(2*8*(1-0.05)+8),PORTER.total(0,0,1));
	}
	@Test
	public void test������2����ͬ��������() {
		assertTotalPrice( (double)(2*8*(1-0.05)*2),PORTER.total(0,0,1,1));
	}
	@Test
	public void test��2����һ����2����������1���ڶ����͵��ı����ļ�() {
		assertTotalPrice( (double)((8 * 4 * 0.8) + (8 * 2 * 0.95)),PORTER.total(0,0,1,2,2,3));
	}
	@Test
	public void test��һ��������1���ڶ���() {
		assertTotalPrice( (double)(8 + (8 * 5 * 0.75)),PORTER.total(0,1,1,2,3,4));
	}
	@Test
	public void test��һ��������1����һ����1���ڶ�����1��������() {
		assertTotalPrice( (double)(2 * (8 * 4 * 0.8)),PORTER.total(0,0,1,1,2,2,3,4));
	}
	@Test
	public void test��4��������1����һ����1���ڶ�����1�����ļ�() {
		assertTotalPrice((double)(3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8)),PORTER.total(
				0,0,0,0,0,
				1,1,1,1,1,
				2,2,2,2,
				3,3,3,3,3,
				4,4,4,4));
	}
	private void assertTotalPrice(double expect, double actual) {
		System.out.println(expect+" "+actual);
		assertEquals( expect,actual,0.001);
	}
}
