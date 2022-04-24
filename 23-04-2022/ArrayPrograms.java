import java.util.*;

class ArrayPrograms{
	
	private void display(int[] arr,String statement){
		System.out.print("The given "+statement+" array is : [");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+", ");
		}
		System.out.print("]\n");
	}
	
	private void ques01(int[] arr){
		System.out.println("The elements in the array are :");
		for(int i=0;i<arr.length;i++){
			System.out.println("Element "+(i+1)+" : "+arr[i]);
		}
	}
	
	private void ques02(int[] arr){
		int largenum=0;
		new ArrayPrograms().display(arr,"");
		for(int i=0;i<arr.length;i++){
			if(arr[i] > largenum){
				largenum= arr[i];
			}
		}
		System.out.println("The largest number among the elements in the array is : "+largenum);
	}
	
	private void ques03(int[] arr){
		int sumnum=0;
		new ArrayPrograms().display(arr,"");
		for(int i=0;i<arr.length;i++){
			sumnum+= arr[i];
		}
		System.out.println("The sum of all the elements in the array is : "+sumnum);
	}
	
	private void ques04(int[] arr){
		int temp;
		new ArrayPrograms().display(arr,"");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					arr[i]= arr[i] + arr[j];
					arr[j]= arr[i] - arr[j];
					arr[i]= arr[i] - arr[j];
				}
			}
		}
		new ArrayPrograms().display(arr,"sorted");
	}
	
	private void ques05(int[] arr){
		new ArrayPrograms().display(arr,"");
		System.out.print("The given array in reverse order is : [");
		for(int i=arr.length-1;i>=0;i--){
			if(i==0)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+", ");
		}
		System.out.print("]\n");
	}
	
	private void ques06(int[] arr){
		int temp;
		new ArrayPrograms().display(arr,"");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					arr[i]= arr[i] + arr[j];
					arr[j]= arr[i] - arr[j];
					arr[i]= arr[i] - arr[j];
				}
			}
		}
		System.out.println("The 2nd largest number in the given array is : "+arr[arr.length-2]);
	}
	
	private void ques07(int[] arr){
		
		String odd= "Odd numbers from the array are : ";
		String even= "Even numbers from the array are : ";
		
		new ArrayPrograms().display(arr,"");
		for(int i=0;i<arr.length;i++){
			if(arr[i] % 2 == 0){
				even+=arr[i]+", ";
			}
			else{
				odd+=arr[i]+", ";
			}
		}
		
		System.out.println(odd);
		System.out.println(even);
	}
	
	private void ques08(int[] arr){
		int temp;
		new ArrayPrograms().display(arr,"");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] < arr[j]){
					arr[i]= arr[i] + arr[j];
					arr[j]= arr[i] - arr[j];
					arr[i]= arr[i] - arr[j];
				}
			}
		}
		new ArrayPrograms().display(arr,"sorted in descending order");
	}
	
	private void ques09(int[] arr){
		int [] newarr= new int[arr.length];
		new ArrayPrograms().display(arr,"");
		for(int i=0;i<arr.length;i++){
			newarr[i]= arr[i];
		}
		new ArrayPrograms().display(arr,"another new");
	}
	
	private void ques10(int[] arr){
		new ArrayPrograms().display(arr,"");
		ArrayList<Integer> dup_arr= new ArrayList<>();
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(!dup_arr.contains(arr[j]) && (arr[i]==arr[j])){
					dup_arr.add(arr[j]);
				}
			}
		}
		
		System.out.print("The duplicate elements in the array are : [");
		for(int i=0;i<dup_arr.size();i++){
			if(i==dup_arr.size()-1)
				System.out.print(dup_arr.get(i));
			else
				System.out.print(dup_arr.get(i)+", ");
		}
		System.out.print("]");
	}
	
	public static void main(String[] args){
		int[] intarr= {10,3,7,15,91,7,5,9,15};
		ArrayPrograms prgm= new ArrayPrograms();
		prgm.ques01(intarr);
		System.out.println("\n");
		
		prgm.ques02(intarr);
		System.out.println("\n");
		
		prgm.ques03(intarr);
		System.out.println("\n");
		
		prgm.ques04(intarr);
		System.out.println("\n");
		
		prgm.ques05(intarr);
		System.out.println("\n");
		
		prgm.ques06(intarr);
		System.out.println("\n");
		
		prgm.ques07(intarr);
		System.out.println("\n");
		
		prgm.ques08(intarr);
		System.out.println("\n");
		
		prgm.ques09(intarr);
		System.out.println("\n");
		
		prgm.ques10(intarr);
		System.out.println("\n");
	}
}