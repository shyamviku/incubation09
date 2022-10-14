package regextask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

import createdexception.CustomException;

public class RegexRunner {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(RegexRunner.class.getName());
		
		RegexLogic regexHelper = new RegexLogic();
		String carryOn="";

		do {
			logger.info("ENTER THE QUESTION NO :: ");
			int question = scan.nextInt();
			try {
				switch(question) {
				case 1:{
					logger.info("enter the mobile no. to validate :" );
					String input = scan.next();
					boolean check = regexHelper.numberValidation(input);
					logger.info("the number validation is : "+check);
					break;
				}	
				case 2:{
					logger.info("enter the string to validate :" );
					String input = scan.next();
					boolean check = regexHelper.acceptAlphaNumeric(input);
					logger.info("the string validation is : "+check);
					break;
				}
				case 3:{
					logger.info("enter the string given:" );
					String given = scan.next();
					logger.info("enter the string to match :" );
					String matching = scan.next();
					boolean checkStart = regexHelper.startsWithString(given, matching);
					boolean checkEnd = regexHelper.endsWithString(given, matching);
					boolean checkContains = regexHelper.containsString(given, matching);
					boolean checkMatch = regexHelper.matchesString(given, matching);
					logger.info("the given string starts with matching string: "+checkStart);
					logger.info("the given string ends with matching string: "+checkEnd);
					logger.info("the given string contains matching string: "+checkContains);
					logger.info("the given string is an exact match of matching string: "+checkContains);
					break;
				}
				case 4:{
					List<String> given = new ArrayList<>();
					logger.info("enter the no. of strings to enter in the list : ");
					int count= scan.nextInt();
					for(int i =0;i<count;i++) {
						logger.info("enter the string no "+i+":");
						String entry = scan.next();
						regexHelper.addElementList(given, entry);
					}
					logger.info("enter the string you want to match");
					String match = scan.next();
					for(int j=0;j<count;j++) {
						String input = given.get(j);
						boolean check = regexHelper.matchCaseInsensitive(input,match);
						logger.info("the match is correct "+check+" at index:"+j);
					}
					break;
				}
				case 5:{
					logger.info("enter the email to validate :" );
					String input = scan.next();
					boolean check = regexHelper.emailValidation(input);
					logger.info("the email validation is : "+check);
					break;
				}	
				case 6:{
					List<String> given = new ArrayList<>();
					logger.info("enter the no. of strings to enter in the list : ");
					int count= scan.nextInt();
					for(int i =0;i<count;i++) {
						logger.info("enter the string no "+i+":");
						String entry = scan.next();
						regexHelper.addElementList(given, entry);
					}
					logger.info("ënter the starting range you want to enter :");
					int start = scan.nextInt();
					logger.info("ënter the starting range you want to enter :");
					int end = scan.nextInt();
					for(int j=0;j<count;j++) {
						String input = given.get(j);
						boolean check = regexHelper.sizeCheck(input,start,end);
						logger.info("the match is "+check+" at index:"+j);
					}
				}
				case 7:{
					Map<String,Integer > inputMap = new HashMap<>(); 
					List<String> given1 = new ArrayList<>();
					logger.info("enter the no. of strings to enter in the list : ");
					int count= scan.nextInt();
					for(int i =0;i<count;i++) {
						logger.info("enter the string no "+i+":");
						String entry = scan.next();
						regexHelper.addElementList(given1, entry);
					}
					List<String> given2 = new ArrayList<>();
					logger.info("enter the no. of strings to enter in the list : ");	
					int count1= scan.nextInt();
					for(int i =0;i<count1;i++) {
						logger.info("enter the string no "+i+":");
						String entry = scan.next();
						regexHelper.addElementList(given2, entry);
					}
					for (int i=0;i<count1;i++) {
						String g2=given2.get(i);
						for (int j =0;j<count;j++) {
							String g1=given1.get(j);
							if(regexHelper.matchesString(g1, g2)) {
								logger.info("all the elements at list 2 is in list 1 ");
								regexHelper.AddStrInputs(inputMap,g2,j );
							}
							logger.info("the required hashmap is:"+ inputMap);
						}
					}
				}
				case 8:{
					logger.info("enter the html to group :" );
					String input = scan.next();
					List<String> group = regexHelper.findGroup(input);
					logger.info("the matching groups are:"+group);
				}
				}
			} catch (CustomException e) {
				logger.info("got an exception"+e);
			}
			System.out.print("Do you want to continuation yes/no ::");
			carryOn = scan.next();

		}
		while (carryOn.equals("yes"));
	}
}
