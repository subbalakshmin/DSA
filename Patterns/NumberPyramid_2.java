/*
1
23
456
789
101112131415
 */


import java.util.Scanner;
public class NumberPyramid_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num=num+1;
            }
            System.out.println();
        }
    }    
}
