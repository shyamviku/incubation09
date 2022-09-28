package stringbuilder;
import createdexception.CustomException;
import java.util.Objects;
public class StringBuilderTask {
	public void nullCheck (Object given)throws CustomException{ 
		if (Objects.isNull(given)){
		throw new CustomException("stringbuilder value should not be null");
		}
	}
		public StringBuilder getSb(StringBuilder input,String... given)throws CustomException{
			nullCheck(input);
			int n = getLengthSa(given);
		    for (int i = 0; i < n; i++) {
		        input.append(given[i]);
		         }
		 
		    return input;
		    }
		    public int getLengthSa(String[] strings)throws CustomException{
		    	nullCheck(strings);
				int length = strings.length;
				
				return length;
		    }
		
	public int getLengthSb(StringBuilder given) throws CustomException{        
			nullCheck(given);
			int length = given.length();
			return length;
  }
	public StringBuilder inputChar (StringBuilder given,String input,String...strings) throws CustomException{
		
		int lengthSa = getLengthSa(strings);
		int lengthSb = getLengthSb(given);
		if(lengthSb!=0) {
			given.append(input);
		}
	    for (int i = 0; i < lengthSa; i++) {
	    	
	        given.append(strings[i]);
	        given.append(input);
	    }
	    lengthSb = getLengthSb(given);
	    given.delete(lengthSb-1,lengthSb);
	        return given;	
	}
	public StringBuilder inputString (StringBuilder given,String delimitter,String replace) throws CustomException{
		nullCheck(given);
		nullCheck(delimitter);
		int index = given.indexOf(delimitter);//swami
		String change = delimitter+replace;
		given.insert(index,change );
	   return given;
		}
	public StringBuilder deleteFirstString (StringBuilder given,String delimitter) throws CustomException{
		nullCheck(given);
		nullCheck(delimitter);
		int firstIndex = 0;
		int lastIndex = given.indexOf(delimitter);//swami
	given.delete(firstIndex, lastIndex);
	return given;
	}
	public StringBuilder replaceEmptySpace (StringBuilder given,String delimitter,String character) throws CustomException{
		nullCheck(delimitter);
		int n = getLengthSb(given);
		for (int i=0;i<n-1;i++) {
		if (i == given.indexOf(delimitter)) {
			given.replace(i, i+1, character);
		}
		}
		return given;
	}
	public StringBuilder reverseSb(StringBuilder given) throws CustomException{
		nullCheck(given);
		given.reverse();//swami
	return given;
	}
	public StringBuilder deleteString(StringBuilder given,int first,int last)throws CustomException{
		int lengthSb = getLengthSb(given);
		if (first<0 ||first>lengthSb-2|| last<first) {
			throw new CustomException("enter proper first and last index ,they are invalid");
		}
		else {
		given.delete(first, last);
		return given;
		}
	}
	public StringBuilder replaceString(StringBuilder given,int first,int last,String replace)throws CustomException{
		int lengthSb = getLengthSb(given);
		int lengthS = replace.length();
		if (first<0 ||first>lengthSb-2|| last<first||lengthS!=last-first) {
			throw new CustomException("enter proper first and last index ,they are invalid");
		}
		else {
		given.replace(first,last,replace);
		return given;
		}
	}
	public int getfirstIndex(StringBuilder given,String replace)throws CustomException{
		nullCheck(given);
		int index=given.indexOf(replace);//swami
		return index;
}
	public int getLastIndex(StringBuilder given,String replace)throws CustomException{
		nullCheck(given);
		int index=given.lastIndexOf(replace);//swami
		return index;
}
	
}

	
