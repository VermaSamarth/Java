//Time Complexity = O(m logn)
public class ChineseRemainderTheorem {
    public static void main(String[] args) {
        int num[]={3,4,5};
        int rem[]={2,3,1};
        int start=2,count;
        while(true){
            count=0;
            for(int i=0;i<num.length;i++){
                if(start%num[i]==rem[i]){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count==num.length){
                System.out.println("Number: "+start);
                break;
            }
            start++;
        }
    }
}
