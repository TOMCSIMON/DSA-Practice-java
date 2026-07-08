package String;

public class ReverseString {

    public static void main(String[] args) {

        String word = "sumo";
        // * Reverse given string
        System.out.println(word + " Reversed: " + reverseString(word));// sumo Reversed: omus
    }

    private static String reverseString(String word) {

        /*
        * create a newString to save the reversed word
        * loop through string backwards
        * add chars accordingly to the newString
        * return newString
        * */

        StringBuilder newString = new StringBuilder();
        for(int i = word.length() - 1; i >= 0; i--) {
            newString.append(word.charAt(i));
        }
        return newString.toString();
    }
}
