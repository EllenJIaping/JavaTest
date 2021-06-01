package innerdemo.practice;

public class TestArray2 {

//    定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，
//    统计各成绩等级（90分以上为‘A’，80~89分为‘B’，70~79分为‘C’，60~69分为‘D’，60分以下为E）学生人数，
//    并将其放入到数组count中，其中：count[0]存E级的人数，count[1]存D级的人数，……，count[4]存A级的人数。
//
//            //90以上 count[4]++
//
////80~89  count[3]++
//
////70~79  count[2]++
//
////60~69  count[1]++
//
////60以下 count[0]++

    public static void main(String args[]){

        int a[]={72,89,65,58,87,91,53,82,71,93,76,68};

        int count[] =  new  int[5];

        for(int i = 0;i<a.length;i++){
            if(a[i]>=90){
                count[4]++;
            }
            else if(a[i]>=80){
                count[3]++;
            }
            else if(a[i]>=70){
                count[2]++;
            }
            else if(a[i]>=60){
                count[1]++;
            }
            else {
                count[0]++;
            }
        }

        System.out.println("等级A  "+"等级B  "+"等级C  "+"等级D  "+"等级E  ");

        for(int j = 0;j<count.length;j++){

            System.out.print(count[j]+"  ");
        }


    }

}
