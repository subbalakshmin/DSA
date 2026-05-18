import java.util.Scanner;
public class SecondSmallestElementOptimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=Integer.MAX_VALUE;
        int ssmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        System.out.println(ssmallest);
    }
}
