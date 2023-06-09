import java.util.Scanner;
public class FlipBitLongestSequence {
    static void LongestSequence(String binary){
        
        String binaryFlippedString="";
        String finalFlippedString="";
        int count=0;
        int maxCount=0;
        int overallMaxCount=0;
        int arr[]=new int[binary.length()];
        int size=0;

        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0'){
                arr[size]=i;
                size++;
            }
        }

        for(int j=0;j<size;j++){
            int position = arr[j];
            binaryFlippedString="";

            for(int i=0;i<binary.length();i++){
                if(i==position)
                    binaryFlippedString=binaryFlippedString+'1';
                else
                    binaryFlippedString=binaryFlippedString+binary.charAt(i);
            }

            for(int i=0;i<binaryFlippedString.length();i++){
                if(binaryFlippedString.charAt(i)=='1'){
                    count++;
                    if(count>maxCount){
                        maxCount=count;
                    }
                }
                else{
                    count=0;
                }
            }

            if(overallMaxCount<maxCount){
                overallMaxCount=maxCount;
                finalFlippedString=binaryFlippedString;
            }

        }
        System.out.println("Flipped String: "+finalFlippedString);
        System.out.println(overallMaxCount);
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number=scan.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println("Original String: "+binary);
        LongestSequence(binary);
        scan.close();
    }
}
