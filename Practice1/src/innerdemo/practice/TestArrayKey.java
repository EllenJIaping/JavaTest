package innerdemo.practice;

public class TestArrayKey {
//    编写顺序查找的方法public static int[] ordinalSearch(int data[],int key)，
//    要求该方法返回一个数组
//    （如果key存在，数组中各元素的值分别为关键字key在原数组data中的各下标；如果key不存在，则返回一个长度为1的数组，数组元素为-1）。
//    【基本过程：（1）先扫描数组data，统计数组中key的个数n；
//    （2）如果n为0，直接返回一个数组元素为－1的数组；
//    否则的话定义一个数组int index[]=new int[n]，再扫描数组data，
//    把数组中值为key的各个元素的下标保存到数组index中，最后返回数组index】


    public static void main(String args[]){

        int a[] = {3,5,3,5,8,73,3};
        int index[] = ordinalSearch(a,3);
        for(int i = 0;i<index.length;i++){
            System.out.print(index[i] +"  ");
        }
    }

    public static int[] ordinalSearch(int data[],int key){

        int n = 0;
        for(int i = 0;i<data.length;i++){
            if(data[i]==key){
                n++;
            }
        }

        if(n==0){
            int index[] = {-1};
            return index;
        }

        else {
             int j = 0;
             int index[] = new int[n];
             for(int i = 0;i<data.length;i++){
                 if(data[i] == key){
                    index[j] = i;
                    j++;
                 }
             }

             return index;
        }



    }



}