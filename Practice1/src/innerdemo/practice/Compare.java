package innerdemo.practice;

import java.util.Scanner;
public class Compare {

    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        if (a>b){

            if  (a>c){
                max = a;

            }
            else max = c;

        }
        else if (b>c){
            max = b;
        }
        else if(c>b){
            max = c;
        }

        System.out.println("最大值=="+max);

    }
}
