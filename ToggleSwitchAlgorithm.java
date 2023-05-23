import java.util.Scanner;
public class ToggleSwitchAlgorithm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int persons;
        System.out.println("Enter the number of persons: ");
        persons = scan.nextInt();
        int person[]=new int[persons+1];
        boolean toggleSwitch[]=new boolean[persons+1];
        for(int i=1;i<=persons;i++){
            person[i]=i;
            toggleSwitch[i]=true;
        }

        for(int i=1;i<=persons;i++){
            for(int j=i;j<=persons;j++){
                if(j%i==0){
                    if(toggleSwitch[j]==false)
                        toggleSwitch[j]=true;
                    else
                        toggleSwitch[j]=false;
                }
            }
        }

        for(int i=1;i<=persons;i++){
            System.out.print(toggleSwitch[i]+" ");
        }
        scan.close();
    }
}
