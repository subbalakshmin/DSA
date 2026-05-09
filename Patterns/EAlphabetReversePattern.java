/*
E
DE
CDE
BCDE
ABCDE */

import java.util.Scanner;
public class EAlphabetReversePattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(char ch='E';ch>=(char)'E'-i;ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
