package innerdemo.practice;

import java.util.Arrays;

public class Sort {

    public static void main(String args[]){

        int a[] = {6,5,9,2,4,1};

        insert(a);

        Arrays.sort(a);

        System.out.println("排序后：  "+Arrays.toString(a));

        bubble(a);

//        数组倒序
//        for(int i = a.length;i>=0;i--){
//            System.out.print(a[i]+"  ");
//        }



    }

     //    插入排序

    public static  void insert(int array[]){
        for (int i=1; i<array.length; i++) {
            int insertValue = array[i];//暂存需要插入元素
            int j = i-1;

            //从右向左比较元素
            for (; j>=0 && insertValue<array[j]; j--) {
                array[j+1] = array[j];
            }

            array[j+1] = insertValue;
        }

        for(int i = 0;i<array.length;i++)
        System.out.print(array[i]+"  ");
    }



    //        冒泡排序

    public static void bubble(int arr[]){

        for(int i = 0;i<arr.length-1;i++){

            for(int j = 0;j < arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        System.out.println("冒泡排序之后的数组： "+Arrays.toString(arr));
    }








}
