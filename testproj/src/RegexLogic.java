package regextask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import createdexception.CustomException;

public class RegexLogic {
	public void nullCheck (Object given)throws CustomException{ 
		if (Objects.isNull(given)){
			throw new CustomException(" value should not be null ");
		}
	}
	public List<String> addElementList(List<String> given,String input)throws CustomException{
			nullCheck(given);
			nullCheck(input);
			given.add(input);
			return given;
		
	}
	public boolean numberValidation(String number)throws CustomException {
		nullCheck(number);
		Pattern ptr = Pattern.compile("^[7-9][0-9]{9}$");
		Matcher mat = ptr.matcher(number);
		boolean checker = mat.matches();
		return checker;
	}
	public boolean acceptAlphaNumeric(String input)throws CustomException{
		nullCheck(input);
		Pattern ptr = Pattern.compile("\\w*[^_]");
		Matcher mat = ptr.matcher(input);
		boolean checker = mat.matches();
		return checker;
	}
	public boolean startsWithString (String given,String matching)throws CustomException{
		nullCheck(given);
		nullCheck(matching);
		Pattern ptr = Pattern.compile("^"+matching);
		Matcher mat = ptr.matcher(given);
		boolean checker = mat.find();
		return checker;
	}
	public boolean endsWithString (String given,String matching)throws CustomException{
		nullCheck(given);
		nullCheck(matching);
		Pattern ptr = Pattern.compile(matching+"$");
		Matcher mat = ptr.matcher(given);
		boolean checker = mat.find();
		return checker;				
	}
	public boolean containsString (String given,String matching)throws CustomException{
		nullCheck(given);
		nullCheck(matching);
		Pattern ptr = Pattern.compile(matching);
		Matcher mat = ptr.matcher(given);
		boolean checker = mat.find();
		return checker;
	}
	public boolean matchesString (String given,String matching)throws CustomException{
		nullCheck(given);
		nullCheck(matching);
		Pattern ptr = Pattern.compile(matching);
		Matcher mat = ptr.matcher(given);
		boolean checker = mat.matches();
		return checker;
	}
	public boolean matchCaseInsensitive(String given,String matching)throws CustomException {
		nullCheck(matching);
		nullCheck(given);
		Pattern ptr = Pattern.compile(matching, Pattern.CASE_INSENSITIVE);		
		Matcher mat = ptr.matcher(given);
		boolean checker = mat.matches();
		return checker;
	}
	public boolean emailValidation(String email)throws CustomException {
		nullCheck(email);
		Pattern ptr = Pattern.compile("^.*@.*\\..*$");
		Matcher mat = ptr.matcher(email);
		boolean checker = mat.matches();
		return checker;
	}
	public boolean sizeCheck(String element,int start,int end) {
		Pattern ptr = Pattern.compile("^.{"+start+","+end+"}$");
		Matcher mat = ptr.matcher(element);
		boolean checker = mat.matches();
		return checker;
	}
	public Map AddStrInputs(Map<String,Integer> given,String key,int value)throws CustomException{
		nullCheck(given);
		given.put(key, value);
		return given;
		}
	public List<String> findGroup(String html)throws CustomException{
		Pattern ptr = Pattern.compile("</?[^>]+>");
		String grp = "";
		List <String> list1 = new ArrayList<String>();
		Matcher mat = ptr.matcher(html);
		while(mat.find()) {
			grp=mat.group();		
			addElementList(list1,grp);
		
		}
		return list1;
}
	
}
