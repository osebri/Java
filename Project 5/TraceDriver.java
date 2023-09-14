public class TraceDriver{
    public static void main(String[] args) {
        System.out.println(isPalindrome("radar"));
    }
    public static boolean isPalindrome(String word){
       boolean r=false;
        if (word.length()<=1)
        r = true; 
        else if(word.charAt(0)!=word.charAt(word.length()-1))
        r= false;
        else
         r= isPalindrome(word.substring(1,word.length()-1));
         return r; 
    }
} 