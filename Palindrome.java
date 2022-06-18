package week2.day1;

public class Palindrome {

	public static void main(String[] args) {


		String val="Madam";
		String rev="";
		
		for(int i=val.length()-1;i>=0;i--){
			//System.out.println(val.charAt(i));
			rev+=val.charAt(i);
		}
		
		//System.out.println(rev);
		
		if(val.equalsIgnoreCase(rev)){
			System.out.println("palindrome");
		}else{
			System.out.println("not a palindrome");
		}

	}

}
