package Obj;

public class vowel {

	public static boolean searchVowel(String input)
	{
		return input.toLowerCase().matches(".*[aeiou].*");
	}
	public static void main(String[] args) {
		
		System.out.println(vowel.searchVowel("Hello"));
		System.out.println(vowel.searchVowel("apple"));
		System.out.println(vowel.searchVowel("tv"));
	}
}
