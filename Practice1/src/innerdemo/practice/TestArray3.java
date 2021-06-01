package innerdemo.practice;


import java.util.Scanner;

public class TestArray3 {

//    从键盘输入8个整数存放在一个数组中，然后将奇数和偶数分别存入到两个不同的数组中，
//    并按奇数、偶数交替的顺序输出这两个数组中的所有数据（先交替输出，如果奇数个数多，则再输出剩下的奇数，如果偶数个数多，则再输出剩下的偶数）。
//    （提示与要求：（1）定义一个数组存储从键盘输入的8个整数，先判断这8个整数中奇数和偶数的个数，才能定义存储奇数和偶数的数组的长度；
//    （2）把一个大的数组分别存放在奇数和偶数数组中并交替输出的过程定义为方法）


    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        int num[] = new int[8];
        System.out.println("请输入8个整数");

        for (int i = 0; i < 8; i++) {
            num[i] = sc.nextInt();
        }

        array(num);

    }

    public static void array(int num[]) {
        int oddnum[];
        int evennum[];

        int odd = 0;
        int even = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        oddnum = new int[odd];
        evennum = new int[even];

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                evennum[i] = num[i];
            } else {
                oddnum[i] = num[i];
            }
        }

//        奇数个数大于偶数个数
        if (odd > even) {
            for (int i = 0; i < even; i++) {
                System.out.println("奇数  " + oddnum[i] + "偶数  " + evennum[i]);
            }

            for (int i = even; i < odd; i++) {
                System.out.println("奇数  " + oddnum[i]);
            }
        } else {
            for (int i = 0; i < odd; i++) {
                System.out.println("奇数  " + oddnum[i] + "偶数  " + evennum[i]);
            }
            for (int i = odd; i < even; i++) {
                System.out.println("偶数  " + evennum[i]);
            }


        }


    }
}

