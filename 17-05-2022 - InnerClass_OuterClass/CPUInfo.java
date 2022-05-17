class CPU{
	int price=15400;
	class processor{
		int cores=4;
		String manufacturer="Toshiba";
	}
	static class RAM{
		static int ram_memory=8;
		String ram_manufacturer="Samsung";
	}
}

public class CPUInfo{
	public static void main(String[] args){
		CPU cpu= new CPU();
		CPU.processor processorinfo= cpu.new processor();
		CPU.RAM ramInfo= new CPU.RAM();
		System.out.println("Core value : "+processorinfo.cores);
		System.out.println("Processor value : "+processorinfo.manufacturer);
		
		System.out.println("RAM Memory value : "+CPU.RAM.ram_memory);
		System.out.println("RAM  value : "+ramInfo.ram_manufacturer);
	}
}