package innerdemo;

public class OuterClass {

    public static  String name  = "外部类";

    public static class  InnerClass{


        public  String inname;
        public int inage;
        public  InnerClass(){}
        {System.out.println("构造代码块");}

        static {}

        public void eat(){
            System.out.println("吃饭");
        }

        public void sleep(){
            System.out.println("睡觉");
        }

        public   void printMsg(){

            System.out.println(name);

            doWork();
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "inname='" + inname + '\'' +
                    ", inage=" + inage +
                    '}';
        }
    }

    public void doJob(){
        int a = 10;

        InnerClass innerClass = new InnerClass();
        innerClass.inname = "张安";
        innerClass.inage = 20;
        System.out.println(innerClass);
        innerClass.eat();


    }

    public static  InnerClass create(){

        return new InnerClass();

    }

    public static  void doWork(){

        System.out.println("外部类的成员方法");
    }





}
