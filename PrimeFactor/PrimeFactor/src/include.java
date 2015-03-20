
public class include {

	/**
	 * @param args
	 */
	/*
	 * 0 表示 ()
	 * 1表示(]
	 * 2表示[)
	 * 3表示[]
	 */
	public boolean judge(int type,int start ,int end,int exp) {
		boolean flag = false;
		
		if(exp > start && exp < end){
			flag = true;
		}
		if(exp == start && 1 < type){
			flag = true;
		}
		if(exp == end && type%2==1){
			flag = true;
		}
		return flag;
	}

}
