package innerdemo.practice;


//定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，
//        计算并输出学生的平均成绩
public class Arrary {

    public static void main(String args[]){


        int num[]={63,99,52,88,98,85,56,};

        int sum = 0;
        for (int i = 0;i<7;i++){
            sum = sum+num[i];
        }
        int average = sum/7;

        System.out.println("平均成绩=="+average);



    }
}
