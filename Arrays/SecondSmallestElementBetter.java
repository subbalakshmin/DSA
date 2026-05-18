import java.util.Scanner;
public class SecondSmallestElementBetter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=Integer.MIN_VALUE;
        int ssmallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smallest){
                smallest=arr[i];
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=smallest && arr[i]>ssmallest){
                ssmallest=arr[i];
            }
        }
        System.out.println(ssmallest);
    }
}
