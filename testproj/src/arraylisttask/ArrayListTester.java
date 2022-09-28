package arraylisttask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTester {
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
		ArrayListTask helperobj = new ArrayListTask();
		ArrayListTester testerobj = new ArrayListTester();
		String carryon = "";
		do {
			System.out.println("ENTER THE QUESTION NO :: ");
			int question = testerobj.toCheckInt();

			try {
				switch (question) {
				case 1: {
					List given = helperobj.getAList();
					int length = helperobj.getLengthList(given);
					System.out.println("the length of the arraylist " + given + " is ::" + length);
					break;
				}
				case 2: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int count = testerobj.toCheckInt();
					String[] input = new String[count];
					for (int i = 0; i < count; i++) {
						System.out.println("enter the String " + i + " ::");
						input[i] = scan.next();
						helperobj.addElement(given, input[i]);
					}
					int length = helperobj.getLengthList(given);
					System.out.println("the length of the arraylist " + given + " is ::" + length);
					break;
				}
				case 3: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of integer you want to add in the list::");
					int count = testerobj.toCheckInt();
					int[] input = new int[count];
					for (int i = 0; i < count; i++) {
						System.out.println("enter the integer " + i + " ::");
						input[i] = testerobj.toCheckInt();
						helperobj.addElement(given, input[i]);
					}
					int length = helperobj.getLengthList(given);
					System.out.println("the length of the arraylist " + given + " is ::" + length);
					break;
				}
				case 4: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of objects you want to add in the list::");
					int count = testerobj.toCheckInt();
					ArrayListTask input = new ArrayListTask();
					for (int i = 0; i < count; i++) {

						helperobj.addElement(given, input);
					}
					int length = helperobj.getLengthList(given);
					System.out.println("the length of the arraylist " + given + " is ::" + length);
					break;
				}
				case 5: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of integer you want to add in the list::");
					int count = testerobj.toCheckInt();
					int[] input = new int[count];
					for (int i = 0; i < count; i++) {
						System.out.println("enter the integer " + i + " ::");
						input[i] = testerobj.toCheckInt();
						helperobj.addElement(given, input[i]);
					}
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerobj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperobj.addElement(given, inputS[i]);
					}
					System.out.println("enter the no. of objects you want to add in the list::");
					int countO = testerobj.toCheckInt();
					ArrayListTask inputO = new ArrayListTask();
					for (int i = 0; i < countO; i++) {

						helperobj.addElement(given, inputO);
					}
					int length = helperobj.getLengthList(given);
					System.out.println("the length of the arraylist " + given + " is ::" + length);
					break;
				}
				case 6: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerobj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperobj.addElement(given, inputS[i]);
					}
					System.out.println("enter the string u want to find the index of:: ");
					String find = scan.next();
					int index = helperobj.getIndexOf(given, find);
					System.out.println("the output arraylist is ::" + given);
					System.out.println("the index of the entered string is ::" + index);
					break;
				}
				case 7: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerobj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperobj.addElement(given, inputS[i]);
					}
					System.out.println("the output arraylist is ::" + given);
					helperobj.getIterator(given);
					break;
				}
				case 8: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerobj.toCheckInt();
					System.out.println("enter the index no. of the string you want:;");
					int findS = testerobj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperobj.addElement(given, inputS[i]);
					}
					System.out.println("the output arraylist is ::" + given);
					int length = helperobj.getLengthList(given);
					System.out.println("the length of the arraylist is ::" + length);
					Object element = helperobj.getElement(given, findS);
					System.out.println("the element at index " + findS + " is " + element);
					break;
				}
				case 9: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerobj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperobj.addElement(given, inputS[i]);
					}
					System.out.println("enter the string u want to find the first and last index of:: ");
					String find = scan.next();
					int index = helperobj.getIndexOf(given, find);
					int lastIndex = helperobj.getLastIndex(given, find);
					System.out.println("the output arraylist is ::" + given);
					System.out.println("the first index of the entered string is ::" + index);
					System.out.println("the last index of the entered string is ::" + lastIndex);
					break;
				}
				case 10: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerobj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperobj.addElement(given, inputS[i]);
					}
					System.out.println("enter the string u want to add inbetween: ");
					String insert = scan.next();
					System.out.println("enter the index at which you want to enter the string:: ");
					int index = testerobj.toCheckInt();
					helperobj.addInBet(given, index, insert);
					System.out.println("the output arraylist is ::" + given);
					int length = helperobj.getLengthList(given);
					System.out.println("the length of the arraylist is ::" + length);
					break;
				}
				case 11: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list::");
					int countS = testerobj.toCheckInt();
					String[] inputS = new String[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.next();
						helperobj.addElement(given, inputS[i]);
					}
					System.out.println("enter the first index of the sublist::");
					int firstIndex = testerobj.toCheckInt();
					System.out.println("enter the last index of the sublist::");
					int lastIndex = testerobj.toCheckInt();
					helperobj.getSubList(given, firstIndex, lastIndex);
					System.out.println("the needed sublist is::" + given);
					break;
				}
				case 12: {
					List givenA = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list A::");
					int countSA = testerobj.toCheckInt();
					String[] inputSA = new String[countSA];
					for (int i = 0; i < countSA; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSA[i] = scan.next();
						helperobj.addElement(givenA, inputSA[i]);
					}
					List givenB = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerobj.toCheckInt();
					String[] inputSB = new String[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.next();
						helperobj.addElement(givenB, inputSB[i]);
					}
					System.out.println("the first list is ::" + givenA);
					System.out.println("the second list is ::" + givenB);
					List output = helperobj.mergeList(givenA, givenB);
					System.out.println("the merged list is ::" + output);
					System.out.println("the length of output is ::" + helperobj.getLengthList(output));
					break;
				}
				case 13: {
					List givenA = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list A::");
					int countSA = testerobj.toCheckInt();
					String[] inputSA = new String[countSA];
					for (int i = 0; i < countSA; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSA[i] = scan.next();
						helperobj.addElement(givenA, inputSA[i]);
					}
					List givenB = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerobj.toCheckInt();
					String[] inputSB = new String[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.next();
						helperobj.addElement(givenB, inputSB[i]);
					}
					System.out.println("the first list is ::" + givenA);
					System.out.println("the second list is ::" + givenB);
					List output = helperobj.mergeList(givenB, givenA);
					System.out.println("the merged list is ::" + output);
					System.out.println("the length of output is ::" + helperobj.getLengthList(output));
					break;
				}
				case 14: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of double you want to add in the list ::");
					int countD = testerobj.toCheckInt();
					double[] inputD = new double[countD];
					for (int i = 0; i < countD; i++) {
						System.out.println("enter the String " + i + " ::");
						inputD[i] = scan.nextDouble();
						helperobj.addElement(given, inputD[i]);
					}
					System.out.println("enter the decimal value you want to remove:: ");
					double input = scan.nextDouble();
					helperobj.removeElement(given, input);
					int length = helperobj.getLengthList(given);
					System.out.println("the output list is ::" + given);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 15: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of double you want to add in the list ::");
					int countD = testerobj.toCheckInt();
					double[] inputD = new double[countD];
					for (int i = 0; i < countD; i++) {
						System.out.println("enter the String " + i + " ::");
						inputD[i] = scan.nextDouble();
						helperobj.addElement(given, inputD[i]);
					}
					System.out.println("enter the index value you want to remove:: ");
					int input = testerobj.toCheckInt();
					helperobj.removeElementAtIndex(given, input);
					int length = helperobj.getLengthList(given);
					System.out.println("the output list is ::" + given);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 16: {
					List given = helperobj.getAList();
					System.out.println("enter the no. of long values you want to add in the list::");
					int countS = testerobj.toCheckInt();
					long[] inputS = new long[countS];
					for (int i = 0; i < countS; i++) {
						System.out.println("enter the String " + i + " ::");
						inputS[i] = scan.nextLong();
						helperobj.addElement(given, inputS[i]);
					}
					System.out.println("enter the first index for removal::");
					int firstIndex = testerobj.toCheckInt();
					System.out.println("enter the last index for removal::");
					int lastIndex = testerobj.toCheckInt();
					helperobj.removeFromTo(given, firstIndex, lastIndex);
					int length = helperobj.getLengthList(given);
					System.out.println("the output list is ::" + given);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 17: {
					List givenA = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list A::");
					int countSA = testerobj.toCheckInt();
					String[] inputSA = new String[countSA];
					for (int i = 0; i < countSA; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSA[i] = scan.next();
						helperobj.addElement(givenA, inputSA[i]);
					}
					List givenB = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerobj.toCheckInt();
					String[] inputSB = new String[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.next();
						helperobj.addElement(givenB, inputSB[i]);
					}
					helperobj.removeCommon(givenA, givenB);
					int length = helperobj.getLengthList(givenA);
					System.out.println("the output list is ::" + givenA);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 18: {
					List givenA = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list A::");
					int countSA = testerobj.toCheckInt();
					String[] inputSA = new String[countSA];
					for (int i = 0; i < countSA; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSA[i] = scan.next();
						helperobj.addElement(givenA, inputSA[i]);
					}
					List givenB = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerobj.toCheckInt();
					String[] inputSB = new String[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.next();
						helperobj.addElement(givenB, inputSB[i]);
					}
					List replace = helperobj.removeNonCommon(givenA, givenB);
					int length = helperobj.getLengthList(replace);
					System.out.println("the output list is ::" + replace);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 19: {
					List givenB = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerobj.toCheckInt();
					long[] inputSB = new long[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.nextLong();
						helperobj.addElement(givenB, inputSB[i]);
					}
					helperobj.removeAll(givenB);
					int length = helperobj.getLengthList(givenB);
					System.out.println("the output list is ::" + givenB);
					System.out.println("the length of the output list is :" + length);
					break;
				}
				case 20: {
					List givenB = helperobj.getAList();
					System.out.println("enter the no. of Strings you want to add in the list B::");
					int countSB = testerobj.toCheckInt();
					String[] inputSB = new String[countSB];
					for (int i = 0; i < countSB; i++) {
						System.out.println("enter the String " + i + " ::");
						inputSB[i] = scan.next();
						helperobj.addElement(givenB, inputSB[i]);
					}
					System.out.println("enter the String you want to check ::");
					String check = scan.next();
					System.out.println("the element is present in the list:: " + helperobj.checkObject(givenB, check));
					int length = helperobj.getLengthList(givenB);
					System.out.println("the output list is ::" + givenB);
					System.out.println("the length of the output list is :" + length);
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

		while (carryon.equals("yes"));
	}
}
