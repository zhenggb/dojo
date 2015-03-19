package potter20150319_1;

public class Potter {

	private static final double discout2 = 0.95;
	private static final double discout3 = 0.9;
	private static final double discout4 = 0.8;
	private static final double discout5 = 0.75;
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
		if(count[4]==1){
			if(count[3]==0 ){
				return singlePrice;
			}else if(count[2]==0 &&count[3]==1){
				return singlePrice*2*discout2;
			}else if(count[1]==0 &&count[2]==1){
				return singlePrice*3*discout3;
			}else if(count[0]==0 &&count[1]==1){
				return singlePrice*4*discout4;
			}else if(count[0]==1){
				return singlePrice*5*discout5;
			}
		}else if(count[4]==2)
		{
			if(count[2]==1&&count[3]==2)
			{
				return singlePrice*2*discout2+singlePrice*3*discout3;
			}
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
