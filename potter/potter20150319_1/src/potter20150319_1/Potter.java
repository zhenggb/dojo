package potter20150319_1;

public class Potter {

	private static final double discout2 = 0.95;
	double singlePrice = 8.0;

	public double total(int... booklist) {

		if (booklist.length == 1) {
			return singlePrice;
		}else if(booklist.length==2 && booklist[0]!=booklist[1]){
			return singlePrice*2*discout2;
		}else{
			int samebookcount=0;
			for(int i=0;i<booklist.length;i++)
			{
				if(booklist[i]==booklist[0])
				{
					samebookcount++;
				}
			}
			if(samebookcount==booklist.length)
			{
				return singlePrice * samebookcount;
			}
		}
		return 0;
	}
}
