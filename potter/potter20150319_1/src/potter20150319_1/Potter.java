package potter20150319_1;

public class Potter {

	private static final double discout2 = 0.95;
	private static final double discout3 = 0.9;
	double singlePrice = 8.0;
	int[] count={0,0,0,0,0};

	public double total(int... booklist) {
		
		for(int i=0;i<booklist.length;i++){
			count[booklist[i]]++;
		}
		for(int i=0;i<count.length;i++){
			for(int j=i+1;j<count.length;j++){
				if(count[i]>count[j]){
					int tmp=count[i];
					count[i]=count[j];
					count[j]=tmp;
				}
			}
		}
		if(count[3]==0 &&count[4]==1){
			return singlePrice;
		}else if(count[2]==0 &&count[3]==1&&count[4]==1){
			return singlePrice*2*discout2;
		}else if(count[1]==0 &&count[2]==1&&count[4]==1){
			return singlePrice*3*discout3;
		}
		
		for(int i=0;i<count.length;i++){
			System.out.print(count[i]+" ");
		}
		System.out.println("");
		
		int samebookcount = 0;
		for (int i = 0; i < booklist.length; i++) {
			if (booklist[i] == booklist[0]) {
				samebookcount++;
			}
		}
		if (samebookcount == booklist.length) {
			return singlePrice * samebookcount;
		}
		return 0;
	}
}
