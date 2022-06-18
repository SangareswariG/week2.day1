package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {


		String text1="stops";
		String text2="potss";
		
		boolean boo=false;
		
		int a=text1.length();
		int b=text2.length();
	
		
		if(a==b){
			char[] list1=text1.toCharArray();
			char[] list2=text2.toCharArray();
			
			Arrays.sort(list1);
			Arrays.sort(list2);
			
			for (int i = 0; i < list1.length; i++) {
				for(int j=0;j<list2.length;j++){
					if(list1[i]==list2[j]){
						boo=true;
					}
				}
			}
			
			if(boo==true){
				System.out.println("Anagram");
			}else{
				System.out.println("not an anagram");
			}
		}

	}

}
