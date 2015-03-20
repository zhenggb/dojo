package potter20150319_1;

public class Potter {

	private static final double discout2 = 0.95;
	private static final double discout3 = 0.9;
	private static final double discout4 = 0.8;
	private static final double discout5 = 0.75;
	double singlePrice = 8.0;
	int[] count = { 0, 0, 0, 0, 0 };

	public double total(int... booklist) {

		for (int i = 0; i < booklist.length; i++) {
			count[booklist[i]]++;
		}
		for (int i = 0; i < count.length; i++) {
			for (int j = i + 1; j < count.length; j++) {
				if (count[i] > count[j]) {
					int swap = count[i];
					count[i] = count[j];
					count[j] = swap;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
		System.out.println("");
		double sum = 0;

		if(count[0]>0 &&count[2]-count[1]>0){
			int numOfThreeAndFiveBookGroup = Math.min(count[0], count[2]-count[1]);
			sum += numOfThreeAndFiveBookGroup * 2 * calculate(4);
			removeLayer(0, numOfThreeAndFiveBookGroup);
			removeLayer(2, numOfThreeAndFiveBookGroup);
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				int numOfLayer = count[i];
				sum += calculate(5 - i) * numOfLayer;
				removeLayer(i, numOfLayer);
			}
		}
		return sum;
	}

	private void removeLayer(int i, int numOfLayer) {
		for (int j = i; j < count.length; j++)
			count[j] -= numOfLayer;
	}

	private double calculate(int num) {
		switch (num) {
		case 1:	return singlePrice;
		case 2:	return singlePrice * 2 * discout2;
		case 3:	return singlePrice * 3 * discout3;
		case 4:	return singlePrice * 4 * discout4;
		default:return singlePrice * 5 * discout5;
		}
	}
}
