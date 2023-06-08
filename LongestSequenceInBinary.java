import java.util.Scanner;
public class LongestSequenceInBinary {

    static int LongestSequence(String binary){
        int count=0,maxCount=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
                if(count>maxCount){
                    maxCount=count;
                }
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number=scan.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println(binary);
        System.out.println("Length of the maximum sequence of 1's: "+LongestSequence(binary));
        scan.close();
    }
}
//515615