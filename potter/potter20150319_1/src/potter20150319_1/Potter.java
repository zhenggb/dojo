package potter20150319_1;

public class Potter {

	double singlePrice = 8.0;

	public double total(int... booklist) {

		if (booklist.length == 2 && booklist[0] == booklist[1]) {
			return singlePrice * 2;
		}

		if (booklist.length == 1) {
			return singlePrice;
		}
		return 0;
	}
}
