package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * symbols .(single character) [] ()  ^ $
 * metacharacters \d \w\W \s
 * quantifiers +(1 or more) ?(0 or 1) * (0 or more) {}
 */
public class Demo {

	int b[];
	public static void main(String[] args) {
		
		// regex package
		Pattern pattern = Pattern.compile("bar");
		Matcher matcher = pattern.matcher("bar1");
//		System.out.println(matcher.matches());
//		// a or b or c
//		pattern = Pattern.compile("[abc].....");
//		matcher = pattern.matcher("sbhjuy");
//		System.out.println(matcher.matches());
//		
//		pattern = Pattern.compile("[...]+");
//		matcher = pattern.matcher(".....");
//		System.out.println(matcher.matches());
//		
//		pattern = Pattern.compile("[.][a]\\W+");
//		matcher = pattern.matcher(".a....");
//		System.out.println(matcher.matches());
		
		pattern = Pattern.compile("^[A-Z][a][^\\W+]");
		matcher = pattern.matcher("Aas");
		System.out.println(matcher.matches());
		
		
		pattern = Pattern.compile("^.*[^<>].*$");
		matcher = pattern.matcher(".a..@<#$%^&*");
		System.out.println(matcher.matches());
		
		/*
		 * validate a phone number 
		 * +91-1234567899
		 */
		
		pattern = Pattern.compile("\\+\\d{2}-\\d{10}");
		matcher = pattern.matcher("+91-1234567899");
		System.out.println(matcher.matches());
		
		pattern = Pattern.compile("^\\+\\d{2}-\\d{10}");
		matcher = pattern.matcher("+91-1234567899");
		System.out.println(matcher.matches());
		
	
		

	}

}
