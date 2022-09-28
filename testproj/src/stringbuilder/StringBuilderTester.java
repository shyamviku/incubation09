package stringbuilder;
import java.util.Scanner;
public class StringBuilderTester {
	
	static Scanner scan = new Scanner(System.in);
	
	public int toCheckInt() {
		boolean condition = true ;
		int option = 0 ;
		while ( condition ){
			if (scan.hasNextInt()){
				option = scan.nextInt();
				scan.nextLine();
				condition= false;
			}
			else {
				System.out.println("enter a valin integer");
				scan.next();
			}
		} return option;
	}

	public static void main(String[] args) {
		
	    StringBuilderTask helper = new StringBuilderTask();
		StringBuilderTester testerobj = new StringBuilderTester();
		String carryon= "";
		do{
			System.out.println("ENTER THE QUESTION NO :: ");
			 int question = testerobj.toCheckInt();
				

		try{
		switch (question){
		case 1:{	
			System.out.println("empty stringbuilder::");
			String input= "";
			StringBuilder given = new StringBuilder();
			given = helper.getSb(given, input);
			System.out.println("the length of the stringbuilder :" + given +" is "+ helper.getLengthSb(given));
			System.out.print("enter the string you want to add:: ");
			String toappend = scan.next();
			given = helper.getSb(given, toappend);
			int length = helper.getLengthSb(given);
			System.out.println("length of the final stringbuilder :: "+ given + " is " + length);
			break;	
		}
			
			
			
		case 2:{
			System.out.println("Enter a stringbuilder ::");
			String input = scan.nextLine();
			StringBuilder given = new StringBuilder();
			given = helper.getSb(given, input);
			System.out.println("the length of the stringbuilder :" + given +" is "+ helper.getLengthSb(given));
			System.out.println("enter the no. of strings you want to add:: ");
			int count = testerobj.toCheckInt();
			System.out.println("enter the character you want to add in between :: ");
			char chr = scan.next().charAt(0);
			String character = String.valueOf(chr);
			String [] startsentence = new String[count];
			for(int i = 0; i<count; i++){
			System.out.println("Enter the word " + i + " : ");
			startsentence[i] = scan.next();
			}
			System.out.println(helper.inputChar(given, character, startsentence));
			break;
			}
		
		case 3: {
			StringBuilder given = new StringBuilder();
			String start = "";
			given = helper.getSb(given, start);
			int count = 2;
			String character = " ";
			String [] startsentence = new String[count];
			for(int i = 0; i<count; i++){
			System.out.println("Enter the word " + i + " : ");
			startsentence[i] = scan.next();
			}
			given = helper.inputChar(given, character, startsentence);
			System.out.println("length of the stringbuilder :: "+given +" is "+helper.getLengthSb(given));
			System.out.println("enter the string you want to insert inbetween :: ");
			String replace = scan.next();
			given = helper.inputString(given,character, replace);
			System.out.println("length of the stringbuilder :: "+given+ " is "+helper.getLengthSb(given));
			break;
			}
		
		case 4:{
			StringBuilder given = new StringBuilder();
			String start = "";
			given = helper.getSb(given, start);
			System.out.println("enter the no. of strings you want to add:: ");
			int count = testerobj.toCheckInt();
			String character = " ";
			String [] startsentence = new String[count];
			for(int i = 0; i<count; i++){
			System.out.println("Enter the word " + i + " : ");
			startsentence[i] = scan.next();
			}
			given = helper.inputChar(given, character, startsentence);
			System.out.println("length of the stringbuilder :: "+given +" is "+helper.getLengthSb(given));
			helper.deleteFirstString(given,character);
			int length = helper.getLengthSb(given);
			System.out.println("the length of the final string :"+ given + " is::"+ length );
		break;
		}
		case 5: {
			StringBuilder given = new StringBuilder();
			String start = "";
			given = helper.getSb(given, start);
			int count = 3;
			String character = " ";
			String [] startsentence = new String[count];
			for(int i = 0; i<count; i++){
			System.out.println("Enter the word " + i + " : ");
			startsentence[i] = scan.next();
			}
			given = helper.inputChar(given, character, startsentence);
			int inputlength = helper.getLengthSb(given);
			System.out.println("the length of the input string :: "+given+" is "+inputlength);
			System.out.println("enter the character you want to replace the empty spaces with:: ");
			String replace = scan.next();
			given = helper.replaceEmptySpace(given, character, replace);
			System.out.println("the final output is :: "+given);
			int outputlength = helper.getLengthSb(given);
			System.out.println("the length of the final output is :: "+outputlength);
		break;
		}
		case 6: {
			System.out.println("Enter a stringbuilder with 3 strings with proper spacing ::");
			String input = scan.nextLine();
			StringBuilder given = new StringBuilder();
			given = helper.getSb(given, input);
			int inputlength = helper.getLengthSb(given);
			System.out.println("the length of the input string is :: "+inputlength);
			given = helper.reverseSb(given);
			int outputlength = helper.getLengthSb(given);
			System.out.println("the length of the output string:: "+given + " is :"+outputlength);
		break;
		}
		case 7: {
			System.out.println("Enter a stringbuilder with single string (more than 10 elements)::");
			String input = scan.next();
			StringBuilder given = new StringBuilder();
			given = helper.getSb(given, input);
			int inputlength = helper.getLengthSb(given);
			System.out.println("the length of the input string is :: "+inputlength);
			System.out.println("enter the first index of the sequence you want to delete:: ");
			int first = testerobj.toCheckInt();
			System.out.println("enter the last index of the sequence you want to delete:: ");
			int last = testerobj.toCheckInt();
			given = helper.deleteString(given, first, last);
			int outputlength = helper.getLengthSb(given);
			System.out.println("the length of the output string:: "+given +" is :"+outputlength );
		break;
		}
		case 8: {
			System.out.println("Enter a stringbuilder with single string (more than 10 elements)::");
			String input = scan.next();
			StringBuilder given = new StringBuilder();
			given = helper.getSb(given, input);
			int inputlength = helper.getLengthSb(given);
			System.out.println("the length of the input string is :: "+inputlength);
			System.out.println("enter the first index of the sequence you want to replace:: ");
			int first = testerobj.toCheckInt();
			System.out.println("enter the last index of the sequence you want to replace:: ");
			int last = testerobj.toCheckInt();
			System.out.println("enter the string you want to replace with :: ");
			String replace = scan.next();
			given = helper.replaceString(given,first,last,replace);
			int outputlength = helper.getLengthSb(given);
			System.out.println("the length of the output string:: "+given +" is :"+outputlength );
		break;
		}
		case 9: {
			StringBuilder given = new StringBuilder();
			String start = "";
			given = helper.getSb(given, start);
			System.out.println("enter the no. of strings you want to add:: ");
			int count = testerobj.toCheckInt();
			System.out.println("enter the character you want to add in between :: ");
			String character = scan.next();
			String [] startsentence = new String[count];
			for(int i = 0; i<count; i++){
			System.out.println("Enter the word " + i + " : ");
			startsentence[i] = scan.next();
			}
			given = helper.inputChar(given, character, startsentence);
			int outputlength = helper.getLengthSb(given);
			System.out.println("the length of the output string:: "+given +" is :"+outputlength );
			int index = helper.getfirstIndex(given, character);
			System.out.println("the first index of the given character is :: "+index);
			break;
		}
		case 10: {
		StringBuilder given = new StringBuilder();
		String start = "";
		given = helper.getSb(given, start);
		System.out.println("enter the no. of strings you want to add:: ");
		int count = testerobj.toCheckInt();
		System.out.println("enter the character you want to add in between :: ");
		String character = scan.next();
		String [] startsentence = new String[count];
		for(int i = 0; i<count; i++){
		System.out.println("Enter the word " + i + " : ");
		startsentence[i] = scan.next();
		}
		given = helper.inputChar(given, character, startsentence);
		int outputlength = helper.getLengthSb(given);
		System.out.println("the length of the output string:: "+given +" is :"+outputlength );
		int index = helper.getLastIndex(given, character);
		System.out.println("the last index of the given character is :: "+index);
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
		

