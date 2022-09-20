package basics;

public class Lecture1JVMandMemory {
	/*
	 Java creates a .java file
	 the .java file is complied and error free file is sent to the class loader in the format of .class
	 The class loader consist of 
	 Loader
	 1)Bootstrap class loader
	 2)Extension class loader
	 3)Application class loader
	  
	  Linking 
	  1)Verification
	  It checks whether the bytecode is valid which makes java secure.
	  2)Preparation
	  It allocates values to variables in the heap area.
	  3)Resolution
	  Symbolic names are converted into original references.
	  
	  Initialization
	  1)Default values are replaced from the given values.
	  2)Executes the static function.
	  
	 The file is loaded into the memory areas using the class loader 
	 Memory Area
	 Structure
	 1)Method area 
	 will have the information of variable ,static variables and static blocks are executed.
	 2)Heap Memory
	 An object of the class is created in the heap area.Arrays are also allocated in heap area.Instance variables are also created in heap area.
	 3)Stack Area
	 	Local variables and current running methods are stored.
	 4)PC registers
	 	Next running method information is stored in the PC registers
	 5)Native Method Area
	 	Native Method are stored in this area.
	 Interpretor
	 	Compiles a single line and executes it.
	 Complier
	 	complies the whole program and then executes it.
	JIT Complier
		Creates bytecode for repetitive program and then executes it whenever it is found again in the class.
		
	Garbage Complier
		There is no need to free the memory,Java Handles it.
		
	JDk,JVM ANd JRE
	First we have Java Development Kit
	Inside the JDK we have JRE + DEVELOPMENT tools
	Inside the JRE we have Java Virtual Machine 
	Java Virtual Machine Consist of 
	1)Class loader
	2)Memory Areas
	3)Execution Engine->complier Interpretor
	
	Java Package Classes inside JRE
	Runtime libraries inside JRE
	
	Java is platform independant but jvm is platform dependant because of different OS configurations
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}
