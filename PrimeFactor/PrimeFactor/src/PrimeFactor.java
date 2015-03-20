import java.util.ArrayList;

public class PrimeFactor {

	public ArrayList<Integer> generate(int num) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				num = num / i;
				result.add(i);
			}
		}
		if (num > 1) {
			result.add(num);
		}
		return result;

	}

}
