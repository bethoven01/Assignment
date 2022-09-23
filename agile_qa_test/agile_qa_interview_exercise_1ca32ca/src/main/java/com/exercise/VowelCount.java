package com.exercise;

import java.util.*;

public class VowelCount {
	
	public static Map<String, Integer> vowelCount;
	public static Map<String, Integer> consonantCount;
	public static String errormsg_moreArguments = "";
			
    public static void main(String[] args) {
    	vowelCount = new HashMap<>();
    	consonantCount = new HashMap<>();
        if (args.length >= 4) {
            System.out.println("Extra arguments passed.");
            errormsg_moreArguments = "Extra arguments passed.";
        } 
        
        else {
            
            List<String> argumentList = Arrays.asList(args);
            argumentList.forEach(argument -> vowelCount.put(argument, getVowelCount(argument)));
            argumentList.forEach(argument -> consonantCount.put(argument, getConsonantCount(argument)));
        }
    }

    private static Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();
    }
    
    private static Integer getConsonantCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[a-z&&[^aeiou]]")).count();
    }
}
