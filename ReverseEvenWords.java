package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {


		String test = "I am a software tester"; 
		String[] list1=test.split(" ");
		String a="";
		String[] list2;
		String rev="";
		
		
		for(int i=0;i<list1.length;i++){
			if(i%2!=0){
				a+=list1[i]+" ";
				}
			}
		
		System.out.println(a);
		list2=a.split(" ");
		
		
		
		
	 
		
		
 
	}

}
