package week2.day1;

public class FindTypes {

	public static void main(String[] args) {


		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] chararr=test.toCharArray();
		for(int i=0;i<chararr.length;i++){
			if(Character.isLetter(chararr[i])){
				letter+=1;
			}else if (Character.isDigit(chararr[i])) {
				num+=1;
			}else if (Character.isSpaceChar(chararr[i])) {
				space+=1;
			}else{
				specialChar+=1;
			}
		}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
