package hashmapexp;

import createdexception.CustomException;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapTask {
	public void nullCheck(Object given) throws CustomException {
		if (Objects.isNull(given)) {
			throw new CustomException("the object is null");
		}

	}

	public Map getHashMap() {
		Map<Object, Object> map = new HashMap<>(); 
		return map;
	}

	public int getLengthHMap(Map<Object,Object> given)throws CustomException{
		nullCheck(given);
		int length = given.size();
		return length;
	}
	public Map AddInputs(Map<Object,Object> given,Object key,Object value)throws CustomException{
	nullCheck(given);
	given.put(key, value);
	return given;
	}
	public boolean checkKey(Map<Object, Object> given, Object key)throws CustomException{
		nullCheck(given);
		boolean check = given.containsKey(key);
	return check;
	}
	public boolean checkValue(Map<Object, Object> given, Object value)throws CustomException{
		nullCheck(given);
		boolean check = given.containsValue(value);
	return check;
	}
	public Map replaceMap(Map<Object, Object> given,Object key, Object value)throws CustomException{
		nullCheck(given);
		given.replace(key, value);
		return given;
	}
	public Object getKeyValue(Map<Object, Object> given, Object key)throws CustomException{
		nullCheck(given);
		Object output = given.get(key);
		return output;
	}
	public Object getValue(Map<Object, Object> given, Object key)throws CustomException{
		nullCheck(given);
		String zoho= "ZOHO";
		Object output = given.getOrDefault(key,zoho);
	 return output;
	}
	public Map removeObject(Map<Object, Object> given, Object key)throws CustomException{
		nullCheck(given);
		if (checkKey(given,key)) {
		given.remove(key);
		return given;}
		else {
			throw new CustomException("the key is not present in the map");
		}
	}
	public Map removeObjIf(Map<Object, Object> given, Object key, Object value)throws CustomException{
		nullCheck(given);
		if (checkKey(given,key)) {
		given.remove(key, value);
		return given;}
		else {
			throw new CustomException("the key is not present in the map");
		}
	}
	public Map replaceIfValue(Map<Object, Object> given, Object key, Object Ovalue,Object value)throws CustomException{
		nullCheck(given);
		given.replace(key, Ovalue, value);
		return given;
	}
	public Map mergeMap(Map<Object, Object> given,Map<Object, Object> input)throws CustomException{
		nullCheck(given);
		nullCheck(input);
		given.putAll(input);
		return given;
		
	}
	public void iterateMap(Map<Object,Object> given)throws CustomException{
		nullCheck(given);
	given.forEach((key,value)-> System.out.println("key: "+key+" value:"+value));
		
	}	
	public Map eraseAll(Map<Object,Object> given)throws CustomException{
		nullCheck(given);
		given.clear();
		return given;
	}
	}
