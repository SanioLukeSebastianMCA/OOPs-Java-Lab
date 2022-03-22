public class CommandLineProgram{
	
	public static void main(String[] args){
		//System.out.println("Hello World !!");
		
		for(int i=0;i<args.length;i++){
			int j=i+1;
			System.out.println("Command Line Argument "+j+" is : "+args[i]);
		}
	}
}