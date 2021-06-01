package innerdemo.practice;

import java.util.Scanner;
public class Bmi {
    public static  void main(String args[]){

        Scanner sc = new Scanner(System.in);
        double high = sc.nextDouble();
        double weight = sc.nextDouble();

        double bmi = 0;
        bmi = weight/(high*high);

        if(bmi<18.5){
            System.out.println("偏瘦");
        }
        if(18.5<bmi&bmi<25.5){
            System.out.println("正常体重");

        }
        else if (bmi>=25.5){
            System.out.println("体重偏重");
        }
    }
}
