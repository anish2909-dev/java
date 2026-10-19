package stringManipulation;

import java.util.stream.IntStream;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String string = "madam";

        /* ******************************************  String Builder approach **************************************************************************************************************** */
        /* This returns false because it creates a new instance and doest points to String pool  */
        System.out.println("StringBuilder comparing instance to String Pool : " + (new StringBuilder(string).reverse()
                .equals(string) ? "Palindrome" : "No Palindrome"));
        System.out.println("StringBuilder comparing to String Pool : " + ((string.equals(new StringBuilder(string).reverse()
                                                                                                 .toString())) ? "Palindrome" : "No Palindrome"));
        /* ****************************************** Java streams **************************************************************************************************************** */
        {
            boolean palinromeOrNot = IntStream.range(0,
                                    string.length() / 2)
                .allMatch(i -> string.charAt(i) == string.charAt(string.length() - 1 - i)) ;
            System.out.println("java stream :"+ ((palinromeOrNot)?"Palindrome" : "No Palindrome"));
        }

        /* ****************************************** Two pointer **************************************************************************************************************** */
        {
            boolean palinromeOrNot=true;
            for(int i =0,j=string.length()-1;i<string.length()/2;i++,j--){
                if(string.charAt(i)!=string.charAt(j)){
                    palinromeOrNot=false;
                    break;
                }
            }
            System.out.println("Two pointer :"+((palinromeOrNot)?"Palindrome" : "No Palindrome"));
        }
    }
}
