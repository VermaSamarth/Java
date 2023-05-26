import java.util.ArrayList;
import java.util.Scanner;

public class StroboGrammaticNumber {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String number;
        int num,count,k,counter;
        System.out.println("Enter the length of the number: ");
        count = scan.nextInt();
        num = (int)Math.pow(10, count-1);
        
        for(int i=num;i<(int)Math.pow(10, count);i++){
            number=Integer.toString(i);
            k=0;
            counter=0;
            while(k<count){
                if("16890".indexOf(number.charAt(k))!=-1){
                    counter++;
                }
                k++;
            }
            if(counter==count){
                list.add(number);
            }
        }
        System.out.println("Strobo Grammatic Numbers are :");
        for(String i:list){
            System.out.print(" "+i);
        }
        System.out.println();
        scan.close();
    }
}
