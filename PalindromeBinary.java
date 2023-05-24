public class PalindromeBinary { 

    static boolean isPalindrome(String binary){
        int start=0,end=binary.length()-1,flag=0;
        while(start<=end){
            if(binary.charAt(start)==binary.charAt(end)){
                start++;
                end--;
                flag=1;
            }
            else{
                flag=0;
                break;
            }
        }
        if(flag==0)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        int number=16;
        String binary="",reverseBinary="";
        while(number!=0){
            if(number%2==0)
                binary="0"+binary;
            else
                binary="1"+binary;
            number/=2;
        }
        System.out.println("Binary: "+binary);
        
        boolean result = isPalindrome(binary);
        if(result)
            System.out.println("It is the Palindrome.");
        else
            System.out.println("Not a Palindrome");   
    }
}
