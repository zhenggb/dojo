import org.junit.Test;

import junit.framework.Assert;



public class includeTest {

	@Test
	public void first_section_全闭(){
		include inc = new include();
		Assert.assertFalse(inc.judge(0, 3, 6, 1));
	}
	
	@Test
	public void two_section_全闭(){
		include inc = new include();
		Assert.assertFalse(inc.judge(0, 3, 6, 3));
	}
	
	@Test
	public void three_section_全闭(){
		include inc = new include();
		Assert.assertTrue(inc.judge(0, 3, 6, 4));
	}
	
	@Test
	public void four_section_全闭(){
		include inc = new include();
		Assert.assertFalse(inc.judge(0, 3, 6, 6));
	}
	
	@Test
	public void five_section_全闭(){
		include inc = new include();
		Assert.assertFalse(inc.judge(0, 3, 6, 7));
	}
	
	@Test
	public void first_section_左开右闭(){
		include inc = new include();
		Assert.assertFalse(inc.judge(1, 3, 6, 1));
	}
	
	@Test
	public void two_section_左开右闭(){
		include inc = new include();
		Assert.assertFalse(inc.judge(1, 3, 6, 3));
	}
	
	@Test
	public void three_section_左开右闭(){
		include inc = new include();
		Assert.assertTrue(inc.judge(1, 3, 6, 4));
	}
	
	@Test
	public void four_section_左开右闭(){
		include inc = new include();
		Assert.assertTrue(inc.judge(1, 3, 6, 6));
	}
	
	@Test
	public void two_section_左闭右开(){
		include inc = new include();
		Assert.assertTrue(inc.judge(2, 3, 6, 3));
	}
	
	@Test
	public void four_section_左闭右开(){
		include inc = new include();
		Assert.assertFalse(inc.judge(2, 3, 6, 6));
	}
	
	@Test
	public void two_section_左闭右闭(){
		include inc = new include();
		Assert.assertTrue(inc.judge(3, 3, 6, 3));
	}
	
	@Test
	public void four_section_左闭右闭(){
		include inc = new include();
		Assert.assertTrue(inc.judge(3, 3, 6, 6));
	}
}
