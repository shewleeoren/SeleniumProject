package javaDemo;

public class GardenField {

	public static void main(String[] args) {
		flower();
		//grass();

		GardenField obj = new GardenField();
		obj.grass();
		obj.vegetable();
		obj.leaf();
		
		

	}
    public static void flower(){
   	System.out.println("I like flower");
    } 
	private void grass() {
	System.out.println("gress color is green");	
	}
	void vegetable() {
	System.out.println("its healthy");	
	}
	protected void leaf() {
	System.out.println("its color also green");	
	}
		
}
