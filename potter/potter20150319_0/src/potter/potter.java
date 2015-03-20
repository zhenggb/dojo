package potter;

public class potter {

	int[] booklist;
	double twoBookDiscount = 0.95;
	double threeBookDiscount = 0.9;
	double fourBookDiscount = 0.8;
	double fiveBookDiscount = 0.75;
	int singlePrice = 8;
	int[] statics={0,0,0,0,0};
	double sum=0;

	double total(int... booklist) {
		staticsAndSort(booklist);
		calculateFiveAndThreeBooksPrice();
		calculateOther();
		return sum;
	}

	private void calculateOther() {
		for (int i = 0; i < statics.length; i++) {
			if (statics[i] > 0) {
				int numOfGroup = statics[i];
				 sum += (double)(calculate(5 - i) * numOfGroup);
				 for(int j=i;j<statics.length;j++)
					 statics[j]-=numOfGroup;
			}
		}
	}

	private void calculateFiveAndThreeBooksPrice() {
		int numOfFiveAndThreeBooks = Math.min(statics[0], statics[2]-statics[1]);
		if(numOfFiveAndThreeBooks>0){
			sum+=calculate(4)*numOfFiveAndThreeBooks*2;
			statics[0]-=numOfFiveAndThreeBooks;
			statics[1]-=numOfFiveAndThreeBooks;
			statics[2]-=numOfFiveAndThreeBooks*2;
			statics[3]-=numOfFiveAndThreeBooks*2;
			statics[4]-=numOfFiveAndThreeBooks*2;
		}
	}

	private void staticsAndSort(int... booklist) {
		for(int i=0;i<booklist.length;i++){
			statics[booklist[i]]++;
		}
		for(int i=0;i<statics.length;i++){
			for(int j=i+1;j<statics.length;j++){
				int tmp = statics[i];
				if(tmp > statics[j]){
					statics[i]=statics[j];
					statics[j]=tmp;
				}
			}
		}
	}

	private double calculate(int num) {
		switch(num){
			default:return (1*singlePrice);
			case 2:return (2*singlePrice*twoBookDiscount);
			case 3:return (3*singlePrice*threeBookDiscount);
			case 4:return (4*singlePrice*fourBookDiscount);
			case 5:return (5*singlePrice*fiveBookDiscount);
		}
	}
}
