package week2.day1;

public class CharOccurance {

	public static void main(String[] args) {


		String str = "welcome to chennai";
		int count=0;
		char[] chararr=str.toCharArray();
		int length=chararr.length;
		for(int i=0;i<chararr.length;i++){
			//System.out.println(chararr[i]);
			if(chararr[i]=='e'){
					//System.out.println("hi");
				count+=1;
			}
		}
		
		System.out.println(count);

	}

}
