package String;

public class IsPalindrome {

    public static void main(String[] args) {

        String word = "noon";
        // * checking whether given word is palindrome or not
        if(isPalindrome(word)) {
            System.out.println("word " + word + " is a palindrome");// word noon is a palindrome
        }else{
            System.out.println(word + " is not a palindrome");
        }
    }

    private static boolean isPalindrome(String word) {

        /*
        * set 2 pointers to track string from starting and its ending
        * start a while loop
        * inside loop check word.charAt(start) != word.charAt(end);
        * move start and end accordingly
        * if successfully check completed and comes out of loop then return true
        * else sudden return false inside the loop condition*/

        int start = 0, end = word.length() - 1;

        while(start < end) {

            if(word.charAt(start) != word.charAt(end)) return false;

            start++;
            end--;
        }

        return true;
    }
}
