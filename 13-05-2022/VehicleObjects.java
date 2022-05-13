class VehicleDetails{

	String vname, vmodel;
	int vserialno, vprice;
	
	VehicleDetails(){  }
	
	VehicleDetails(String vname, String vmodel, int vserialno, int vprice){
		this.vname= vname;
		this.vmodel= vmodel;
		this.vserialno= vserialno;
		this.vprice= vprice;
	}
}

class VehicleObjects{
	public static void main(String[] args){
		VehicleDetails[] vehicleDetails= new VehicleDetails[3];
		
		vehicleDetails[0]= new VehicleDetails("BMW","BMW X5", 10001,9200000);
		System.out.println("The 1st Car's Name is : "+vehicleDetails[0].vname);
		System.out.println("The 1st Car-Model's name is : "+vehicleDetails[0].vmodel);
		System.out.println("The 1st Car's Serial Number is : "+vehicleDetails[0].vserialno);
		System.out.println("The 1st Car's Price is : Rs."+vehicleDetails[0].vprice);
		System.out.println("\n");
		
		vehicleDetails[1]= new VehicleDetails("Mercedes","Mercedes Benz C-Class", 10002,4999000);
		System.out.println("The 2nd Car's Name is : "+vehicleDetails[1].vname);
		System.out.println("The 2nd Car-Model's name is : "+vehicleDetails[1].vmodel);
		System.out.println("The 2nd Car's Serial Number is : "+vehicleDetails[1].vserialno);
		System.out.println("The 2nd Car's Price is : Rs."+vehicleDetails[1].vprice);
		System.out.println("\n");
		
		vehicleDetails[2]= new VehicleDetails("Jaguar","Jaguar XF",10003,5570000);
		System.out.println("The 3rd Car's Name is : "+vehicleDetails[2].vname);
		System.out.println("The 3rd Car-Model's name is : "+vehicleDetails[2].vmodel);
		System.out.println("The 3rd Car's Serial Number is : "+vehicleDetails[2].vserialno);
		System.out.println("The 3rd Car's Price is : Rs."+vehicleDetails[2].vprice);
		System.out.println("\n");
	}
}