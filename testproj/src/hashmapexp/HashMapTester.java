package hashmapexp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import stringbuilder.StringBuilderTask;
import stringbuilder.StringBuilderTester;

public class HashMapTester {
	static Scanner scan = new Scanner(System.in);

	public int toCheckInt() {
		boolean condition = true;
		int option = 0;
		while (condition) {
			if (scan.hasNextInt()) {
				option = scan.nextInt();
				scan.nextLine();
				condition = false;
			} else {
				System.out.println("enter a valin integer");
				scan.next();
			}
		}
		return option;
	}

	public static void main(String[] args) {
		HashMapTask helper = new HashMapTask();
		HashMapTester testerobj = new HashMapTester();
		String carryon = "";
		Map given = helper.getHashMap();
		do {
			System.out.println("ENTER THE QUESTION NO :: ");
			int question = testerobj.toCheckInt();

			try {
				switch (question) {
				case 1: {

					System.out.println("the haspmap is ::" + given);
					System.out.println("the size of the haspmap is ::" + helper.getLengthHMap(given));
					break;
				}
				case 2:{
					System.out.println("enter the no. of pair strings ::");
					int countkey = testerobj.toCheckInt();
					
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key=scan.next();
						System.out.println("enter the value string "+i+"::");
						String value=scan.next();	
							helper.AddInputs(given, key, value);
					}
							System.out.println("the output map is ::"+given);
							System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
				break;
				}			
				case 3:{
					System.out.println("enter the no. of pair integers ::");
					int countkey = testerobj.toCheckInt();
					
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key integer "+i+"::");
						int key= testerobj.toCheckInt();
						System.out.println("enter the value integer "+i+"::");
						int value =testerobj.toCheckInt();	
							helper.AddInputs(given, key, value);
					}
							System.out.println("the output map is ::"+given);
							System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
				break;
				}			
				case 4:{
					System.out.println("enter the no. of pair in the map ::");
					int countkey = testerobj.toCheckInt();
					
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key= scan.next();
						System.out.println("enter the value integer "+i+"::");
						int value =testerobj.toCheckInt();	
							helper.AddInputs(given, key, value);
					}
							System.out.println("the output map is ::"+given);
							System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
				break;
				}
				case 5:{
					System.out.println("enter the no. of pair in the map ::");
					int countkey = testerobj.toCheckInt();
					
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key= scan.next();
						Object value = helper;	
							helper.AddInputs(given, key, value);
					}
							System.out.println("the output map is ::"+given);
							System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
				break;
				}
				case 6:{
					System.out.println("enter the key string 1::");
					String key=scan.next();
					System.out.println("enter the value string 1::");
					String value=scan.next();	
						helper.AddInputs(given, key, value);
					System.out.println("enter the key string 2::");
					String key1=scan.next();
					String value1=null;	
							helper.AddInputs(given, key1, value1);
					System.out.println("enter the key string 3::");
					String key2=scan.next();
					System.out.println("enter the value string 3::");
					String value2=scan.next();	
							helper.AddInputs(given, key2, value2);
							System.out.println("the output map is ::"+given);
							System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
				break;
				
				}
				case 7:{
					System.out.println("enter the key string 1::");
					String key=scan.next();
					System.out.println("enter the value string 1::");
					String value=scan.next();	
						helper.AddInputs(given, key, value);
					String key1=null;
					System.out.println("enter the value string 2::");
					String value1=scan.next();	
							helper.AddInputs(given, key1, value1);
					System.out.println("enter the key string 3::");
					String key2=scan.next();
					System.out.println("enter the value string 3::");
					String value2=scan.next();	
							helper.AddInputs(given, key2, value2);
							System.out.println("the output map is ::"+given);
							System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
				break;
				}
				case 8:{
					System.out.println("enter the no. of pair in the map ::");
					int countkey = testerobj.toCheckInt();
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key= scan.next();
						System.out.println("enter the value integer "+i+"::");
						int value =testerobj.toCheckInt();	
							helper.AddInputs(given, key, value);
					}
					System.out.println("enter the key you want to check ::");
					String checkKey = scan.next();
					boolean output = helper.checkKey(given, checkKey);
					System.out.println("the key is present in the hashmap ::"+output);
				break;
				}
				case 9:{
					System.out.println("enter the no. of pair in the map ::");
					int countkey = testerobj.toCheckInt();
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key= scan.next();
						System.out.println("enter the value integer "+i+"::");
						int value =testerobj.toCheckInt();	
							helper.AddInputs(given, key, value);
					}
					System.out.println("enter the value you want to check ::");
					int checkValue = testerobj.toCheckInt();
					boolean output = helper.checkValue(given, checkValue);
					System.out.println("the key is present in the hashmap ::"+output);
				break;
				}
				case 10:{
					System.out.println("enter the no. of pair strings ::");
					int countkey = testerobj.toCheckInt();
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key=scan.next();
						System.out.println("enter the value string "+i+"::");
						String value=scan.next();	
							helper.AddInputs(given, key, value);
					}
							System.out.println("the output map is ::"+given);
							for(int j=0;j<countkey;j++) {
								System.out.println("enter the key string "+j+"::");
								String key=scan.next();
								System.out.println("enter the replce value string "+j+"::");
								String replaceValue=scan.next();	
									helper.replaceMap(given,key, replaceValue);
							}
							System.out.println("the output map is ::"+given);
							System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
				break;
				}
				case 11:{
					System.out.println("enter the no. of pair in the map ::");
					int countkey = testerobj.toCheckInt();
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key= scan.next();
						System.out.println("enter the value integer "+i+"::");
						String value =scan.next();	
							helper.AddInputs(given, key, value);
					}
					System.out.println("the output map is ::"+given);
					System.out.println("enter the key you want the the value of ::");
					String checkKey = scan.next();
					Object output = helper.getKeyValue(given, checkKey);
					System.out.println("the key value of key "+checkKey+" is ::"+output);
				break;
				}
				case 12:{
					System.out.println("enter the no. of pair in the map ::");
					int countkey = testerobj.toCheckInt();
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key= scan.next();
						System.out.println("enter the value integer "+i+"::");
						String value =scan.next();	
							helper.AddInputs(given, key, value);
					}
					System.out.println("the output map is ::"+given);
					System.out.println("enter the key you want the the value of ::");
					String checkKey = scan.next();
					Object output = helper.getKeyValue(given, checkKey);
					System.out.println("the key value of key "+checkKey+" is ::"+output);
				break;
				}
				case 13:{
					System.out.println("enter the no. of pair in the map ::");
					int countkey = testerobj.toCheckInt();
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key= scan.next();
						System.out.println("enter the value integer "+i+"::");
						String value =scan.next();	
							helper.AddInputs(given, key, value);
					}
					System.out.println("the output map is ::"+given);
					System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
					System.out.println("enter the key you want the the value of ::");
					String checkKey = scan.next();
					Object output = helper.getValue(given, checkKey);
					System.out.println("the key value of key "+checkKey+" is ::"+output);
					System.out.println("the size of the map after change is ::"+helper.getLengthHMap(given));

					break;
				}
				case 14:{
					System.out.println("enter the no. of pair in the map ::");
					int countkey = testerobj.toCheckInt();
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key= scan.next();
						System.out.println("enter the value integer "+i+"::");
						String value =scan.next();	
							helper.AddInputs(given, key, value);
					}
					System.out.println("the output map is ::"+given);
					System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
					System.out.println("enter the key you want to remove ::");
					String checkKey = scan.next();
					Object output = helper.removeObject(given, checkKey);
					System.out.println("the output map is  ::"+output);
					System.out.println("the size of the map after change is ::"+helper.getLengthHMap(given));
					break;
				}
				case 15:{
					System.out.println("enter the no. of pair in the map ::");
					int countkey = testerobj.toCheckInt();
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key= scan.next();
						System.out.println("enter the value integer "+i+"::");
						String value =scan.next();	
							helper.AddInputs(given, key, value);
					}
					System.out.println("the output map is ::"+given);
					System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
					System.out.println("enter the key you want to remove ::");
					String checkKey = scan.next();
					System.out.println("enter the value of the entered key  ::");
					String checkValue = scan.next();
					Object output = helper.removeObjIf(given, checkKey, checkValue);
					System.out.println("the output map after change is  ::"+output);
					System.out.println("the size of the map after change is ::"+helper.getLengthHMap(given));

					break;
				}
				case 16:{
					System.out.println("enter the no. of pair strings ::");
					int countKey = testerobj.toCheckInt();
					for(int i=0;i<countKey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key=scan.next();
						System.out.println("enter the value string "+i+"::");
						String value=scan.next();	
							helper.AddInputs(given, key, value);
					}System.out.println("the output map is ::"+given);
					System.out.println("enter the no. of values u want to replace ::");
					int countKeyReplace = testerobj.toCheckInt(); 
							for(int j=0;j<countKeyReplace;j++) {
								System.out.println("enter the key string "+j+"::");
								String key=scan.next();
								System.out.println("enter the replce value string "+j+"::");
								String replaceValue=scan.next();	
									helper.replaceMap(given,key, replaceValue);
							}
							System.out.println("the output map is ::"+given);
							System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
				break;
				}
				case 17:{
					System.out.println("enter the no. of pair strings ::");
					int countKey = testerobj.toCheckInt();
					for(int i=0;i<countKey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key=scan.next();
						System.out.println("enter the value string "+i+"::");
						String value=scan.next();	
							helper.AddInputs(given, key, value);
					}
					System.out.println("the output map is ::"+given);
					System.out.println("enter the no. of values u want to replace ::");
					int countKeyReplace = testerobj.toCheckInt(); 
							for(int j=0;j<countKeyReplace;j++) {
								System.out.println("enter the key string "+j+"::");
								String key=scan.next();
								System.out.println("enter the original value string of key "+j+"::");
								String replaceValue=scan.next();	
								System.out.println("enter the replce value string "+j+"::");
								String replaceValue1=scan.next();	
									helper.replaceIfValue(given, key, replaceValue, replaceValue1);
							}
							System.out.println("the output map is ::"+given);
							System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
				break;
				}
				case 18:{
					System.out.println("enter the no. of pair of inputs ::");
					int countKey = testerobj.toCheckInt();
					for(int i=0;i<countKey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key=scan.next();
						System.out.println("enter the value string "+i+"::");
						String value=scan.next();	
							helper.AddInputs(given, key, value);
					}
							System.out.println("the output map is ::"+given);
							System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
							System.out.println("enter the no. of pair of input for the map2 ::");
							Map input = helper.getHashMap();
							int countKey1 = testerobj.toCheckInt();
							for(int j=0;j<countKey1;j++) {
								System.out.println("enter the key string "+j+"::");
								String key1=scan.next();
								System.out.println("enter the value string "+j+"::");
								String value1=scan.next();	
								helper.AddInputs(input, key1, value1);
							}
									System.out.println("the output map is ::"+input);
									System.out.println("the size of the map is ::"+helper.getLengthHMap(input));
									Map output = helper.mergeMap(given, input);
									System.out.println("the output map is ::"+output);
									System.out.println("the size of the map is ::"+helper.getLengthHMap(output));
							break;
							}
				case 19:{
					System.out.println("enter the no. of pair strings ::");
					int countkey = testerobj.toCheckInt();
					
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key=scan.next();
						System.out.println("enter the value string "+i+"::");
						String value=scan.next();	
							helper.AddInputs(given, key, value);
					}
					System.out.println("the output map is ::"+given);
					helper.iterateMap(given);
							
				break;
				}	
				case 20:{
					System.out.println("enter the no. of pair strings ::");
					int countkey = testerobj.toCheckInt();
					
					for(int i=0;i<countkey;i++) {
						System.out.println("enter the key string "+i+"::");
						String key=scan.next();
						System.out.println("enter the value string "+i+"::");
						String value=scan.next();	
							helper.AddInputs(given, key, value);
					}
					System.out.println("the output map is ::"+given);
					helper.eraseAll(given);
							System.out.println("the output map is ::"+given);
							System.out.println("the size of the map is ::"+helper.getLengthHMap(given));
				break;
				}			
							}
					}
				
				
			

			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			System.out.print("Do you want to continuation yes/no ::");
			carryon = scan.next();
		}

	while(carryon.equals("yes"));
}}
