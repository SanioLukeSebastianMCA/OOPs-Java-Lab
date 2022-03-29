public class Product{
	
	String pcode, pname;
	double price;
	
	public void details(){
		System.out.println("The product name is : "+pname);
		System.out.println("The product code is : "+pcode);
		System.out.println("The product price is : "+price);
		System.out.println("\n");
	}
	
	public static void main(String[] args){
		
		System.out.println("\nJava Program to find the lowest price of the mentioned products using Class/Objects implementation.\n");
		
		Product prod1= new Product();
		prod1.pcode= "P1001";
		prod1.pname= "Red Bull";
		prod1.price= 45.7;
		prod1.details();
		
		Product prod2= new Product();
		prod2.pcode= "P1002";
		prod2.pname= "Cabbage";
		prod2.price= 62.1;
		prod2.details();
		
		Product prod3= new Product();
		prod3.pcode= "P1003";
		prod3.pname= "Eclairs";
		prod3.price= 5.0;
		prod3.details();
		
		
		System.out.println("\n");
		if(prod1.price < prod2.price){
			if(prod1.price < prod3.price){
				System.out.println("The price of "+prod1.pname+" is the lowest");
			}
			else{
				System.out.println("The price of "+prod3.pname+" is the lowest");
			}
		}
		else{
			if(prod2.price < prod3.price){
				System.out.println("The price of "+prod2.pname+" is the lowest");
			}
			else{
				System.out.println("The price of "+prod3.pname+" is the lowest");
			}
		}
		
	}
}