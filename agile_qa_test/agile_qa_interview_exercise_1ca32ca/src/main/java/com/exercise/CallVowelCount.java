package com.exercise;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CallVowelCount  extends VowelCount{
	private static CallVowelCount instance;

	public static CallVowelCount getInstance() 
	{
		if(instance==null)
			try 
			{
				instance = new CallVowelCount();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		return instance;
	}

	public void vowels(String[] args) {
      main(args);
	}
	
	public void verify_count_vowels(String count)
	{
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		String[] pairs = count.split(", ");
		
		for (int i=0;i<pairs.length;i++) {
		    String pair = pairs[i];
		    String[] keyValue = pair.split("=");
		    myMap.put(keyValue[0], Integer.valueOf(keyValue[1]));
		}
		assertTrue(myMap.equals(VowelCount.vowelCount));
	}
	
	public void verify_count_consonants(String count) 
	{		
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		String[] pairs = count.split(", ");
		
		for (int i=0;i<pairs.length;i++) {
		    String pair = pairs[i];
		    String[] keyValue = pair.split("=");
		    myMap.put(keyValue[0], Integer.valueOf(keyValue[1]));
		}
	
		assertTrue(myMap.equals(VowelCount.consonantCount));
	}
	
	
	public void verify_message(String message) 
	{
		Assert.assertEquals(message, VowelCount.errormsg_moreArguments);
	}
	
	
}
