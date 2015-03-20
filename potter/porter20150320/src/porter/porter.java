package porter;

public class porter {

	private static final double discount1 = 1;
	private static final double discount2 = 1 - 0.05;
	private static final double discount3 = 1 - 0.1;
	private static final double discount4 = 1 - 0.2;
	private static final double discount5 = 1 - 0.25;
	private final static int sigelPrice = 8;
	private int[] booklist;
	private int[] statics = { 0, 0, 0, 0, 0 };
	double sum = 0;

	public double total(int ... booklist) {

		this.booklist=booklist;
		统计各集书的数量并从小到大排序();
		计算三本书和五本书同时存在的总结();
		其他情况累计总价();
		return sum;
	}

	private void 计算三本书和五本书同时存在的总结() {
		if(existThreeAndFiveBooks()){
			
			int numOfThreeAndFiveBooks = statics[2]-statics[1] >= statics[0]?statics[0]:statics[2]-statics[1];
			sum += calculate(4,numOfThreeAndFiveBooks*2);
			statics[0]-=numOfThreeAndFiveBooks;
			statics[1]-=numOfThreeAndFiveBooks;
			statics[2]-=numOfThreeAndFiveBooks*2;
			statics[3]-=numOfThreeAndFiveBooks*2;
			statics[4]-=numOfThreeAndFiveBooks*2;
		}
	}

	private void 其他情况累计总价() {
		for(int i=0;i<statics.length;i++){
			
			if (statics[i]>0) {
				int num = statics[i];
				sum += calculate(5-i,num);
				for(int j=i;j<statics.length;j++){
					statics[j]-=num;
				}
			}
		}
	}

	private boolean existThreeAndFiveBooks() {
		return statics[0] > 0 && statics[2] - statics[1] >0;
	}

	private double calculate(int i,int num) {
		
		switch(i){
		case 5:return (double) (5 * sigelPrice * discount5 * num);
		case 4:return (double) (4 * sigelPrice * discount4 * num);
		case 3:return (double) (3 * sigelPrice * discount3 * num);
		case 2:return (double) (2 * sigelPrice * discount2 * num);
		default:return (double) (1 * sigelPrice * discount1 * num);
		}
	}

	private void 统计各集书的数量并从小到大排序() {

		for (int i = 0; i < booklist.length; i++) {
			statics[booklist[i]]++;
		}
		for (int i = 0; i < statics.length; i++) {
			for(int j=i+1;j<statics.length;j++){
				if(statics[i]>statics[j]){
					int tmp = statics[i];
					statics[i] = statics[j];
					statics[j] = tmp;
				}
			}
		}
	}

}
