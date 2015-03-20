
public class StringCalculator {

	public String[] ss ;
	public int Add(String NumList) {
		
		int result = 0;
		String SplitStr = ",";
		String SplitStr2 = "\n";		
		NumList = NumList.replaceAll(SplitStr2, NumList);
		
		if(NumList.contains(SplitStr)){
			ss = NumList.split(SplitStr);
			for(int i=0;i<ss.length;i++)
			result += Integer.parseInt(ss[i]);
		}else if(NumList != ""){
			return Integer.parseInt(NumList);
		}
		return result;
	}

}
