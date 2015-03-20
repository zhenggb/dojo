import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void input_EmptyString_return_0() {
		Assert.assertEquals(0, new StringCalculator().Add(""));
	}

	@Test
	public void input_One_number_return_itself() {
		Assert.assertEquals(1, new StringCalculator().Add("1"));
	}

	@Test
	public void input_Two_Number_retun_sum() {
		Assert.assertEquals(3, new StringCalculator().Add("1,2"));
	}

	@Test
	public void input_Two_big_Number_retun_sum() {
		Assert.assertEquals(1010, new StringCalculator().Add("1001,9"));
	}

	@Test
	public void input_more_Numbers_retun_sum() {
		Assert.assertEquals(1111, new StringCalculator().Add("1001,9,100,1"));
	}
	
	@Test
	public void input_Numbers_ContainEnter_retun_sum() {
		Assert.assertEquals(1111, new StringCalculator().Add("1001,9\n,100,1"));
	}
	
}
