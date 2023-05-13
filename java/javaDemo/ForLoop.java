package javaDemo;

public class ForLoop {

	public static void main(String[] args) {
	
		/*While Loop:syntax
		 inatialization;
		 while(condition){
		 statement(s);
		 incerement;}*/
		
		//int i = 1;
		//while(i<=10){
		//System.out.println(i);
		//i++;
		
		//System.out.println("//////////");   
		/*int j=0;
		while(j<=3) {
			System.out.println(obj[j]);
			j++;
		}*/
		//Print all the values from below Arrays (obj) by using while loop
		String[]obj = new String[4];
		obj[0] = "Rumman";
		obj[1] = "shihab";
		obj[2] = "Mamun";
		obj[3] = "xyz";
		int j = 0;
		while(j<=3){
	    System.out.println(obj[j]);
	    j++ ;
	   
		}
	
	}		
		
}

