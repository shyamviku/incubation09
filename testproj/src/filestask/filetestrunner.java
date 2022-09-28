package filestask;

import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;

public class filetestrunner {
static Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
	FileWriterOne helper = new FileWriterOne();
	filetestrunner runnerObj = new filetestrunner();
	Experiment5 exp5Helper = new Experiment5(" u");
	Experiment6 exp6Helper = new Experiment6("shyam",22);
	String carryon = "";
	do{
		System.out.println("ENTER THE QUESTION NO :: ");
		 int question = scan.nextInt();
			

	try{
	switch (question){
	case 1:{	
	System.out.println("no. of line you want to enter ::");
		int input = scan.nextInt();
		scan.nextLine();
		String output ="";
		String[] given= new String[input];
	for(int i = 0;i<input;i++) {
		System.out.println("write the line no:"+i+"-");
		given[i]= scan.nextLine();
		output += given[i]+"\n";
	}
	helper.writeIntoFile(output);
	break; 
	}
	case 2:{
		Properties newProp=new Properties(); 
		System.out.println("no. of properties you want to enter ::");
		int input = scan.nextInt();
		scan.nextLine();
		String[] key= new String[input];
		String[] value= new String[input];
		String valueInput ="";
		String keyInput="";
	for(int i = 0;i<input;i++) {
		System.out.println("write the key no:"+i+"-");
		key[i]= scan.nextLine();
		keyInput = key[i];
		System.out.println("write the valyue no:"+i+"-");
		value[i]=scan.nextLine();
		valueInput = value[i];
		helper.getProperty(newProp,keyInput, valueInput);
}
	helper.writePropIntoFile(newProp);
	break;
	}
	case 3:{
		FileReader file = new FileReader("/home/inc9/myDir/prop.txt");
		Properties newProp=new Properties();
		newProp.load(file);
		System.out.println(newProp);
	break;
	}
	case 5:{
		System.out.println(exp5Helper);
		break;
	}
	case 6:{
		System.out.println(exp6Helper);
break;
	}
	case 7:{
		Experiment6 objNew = new Experiment6();
		String input = "Shyam";
		int entry = 22;
		objNew.setNumber(entry);
		objNew.setGiven(input);
		objNew.getNumber();		
		objNew.getGiven();
		System.out.println(objNew.toString());
		break;
	}
	}
	}
	catch (Exception ex){
	System.out.println(ex.getMessage());
	}
	System.out.print("Do you want to continuation yes/no ::" );
	carryon = scan.next(); 
	} 

	while (carryon.equals("yes"));
}
}
