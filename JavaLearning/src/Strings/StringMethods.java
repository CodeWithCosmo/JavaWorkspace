package Strings;

public class StringMethods {

    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        String string = "     Your are learning Java Language";

        System.out.println(string);
        System.out.println(string.length());
        System.out.println(string.trim());
        System.out.println(string.equals(string.isEmpty()));
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());

        
        String s1 = "java";
        String s2 = "Java";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        
        String s3 = "a";  //~ ASCII Code of 'a' 97
        String s4 = "A";  //~ ASCII Code of 'A' 65
        
        
        System.out.println(s3.compareTo(s4));   //~ 'compareTo()' method subtract s4 ASCII Code from s3 ASCII Code
        System.out.println(s3.compareToIgnoreCase(s4));
        
        //*If First character is same of string then the next character is used for compare */
        
        String s5 = "Ab";  //~ ASCII Code of 'b' 98
        String s6 = "AB";  //~ ASCII Code of 'B' 66
        
        System.out.println(s5.compareTo(s6));  
        
        String s7 = "ab";  //~ ASCII Code of 'b' 98
        String s8 = "AC";  //~ ASCII Code of 'C' 69 (caseIgnored)
        
        System.out.println(s7.compareToIgnoreCase(s8));

        System.out.println(String.valueOf(5.5)+String.valueOf(6.6));
        char charArray [] = string.toCharArray();
        System.out.println(charArray[10]);
        
        //* 1. A substring is a contiguous part of a string, i.e., a string inside another string. */
        //* 2. A Subsequence may be or may not be continuous sequence of characters, But sequence must be in correct order in source string. */

        String string1 = "Software Testing";
        System.out.println(string1.substring(2)); //~ Indexing in java starts from 0
        System.out.println(string1.substring(3,7)); //~ endIndex is excluded, substring of length 4 (7-3) is extracted  

        System.out.println(string1.subSequence(3, 7)); //~ It returns output same as substring() method but in character sequence


        String string2 = "This is Core Java Programming."; 

        System.out.println(string2.replace("is", "was")); //~ This will replace all occurrence of 'is'.
        System.out.println(string2.replaceFirst("is", "was")); //~ This will replace first occurrence of 'is'.
        System.out.println(string2.replaceAll("is(.)", "was")); //~ This will replace all occurrence of 'is + all spaces after that'.
        System.out.println(string2.replaceAll("is(.*)", "was")); //~ This will replace all, starting from 'is' till end of the string.

        System.out.println(string2.indexOf("is")); //~ This will returns the first occurrence index of given character or string.
        System.out.println(string2.lastIndexOf("is")); //~ This will returns the first occurrence index of given character or string from end.
        System.out.println(string2.charAt(3)); //~ This will returns the character at given index
        System.out.println(string2.contains("Cor")); //~ This will return true if given character sequence is exist in the given string.
        System.out.println(string2.startsWith("Th")); //~ This will return true if given string start with given character or substring.
        System.out.println(string2.endsWith("Java")); //~ This will return true if given string ends with given character or substring.
    }
}
