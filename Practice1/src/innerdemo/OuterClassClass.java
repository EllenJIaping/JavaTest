package innerdemo;

public class OuterClassClass {

    public String outMsg = "这是外部类的成员变量";



    public void doJob(){

        System.out.println("外部类的成员方法");
        String  msg = "局部变量";

        class InnerClass2{

            public String inname;
            public int inage;
            public InnerClass2(){

            }

            {System.out.println("这是局部内部类的构造代码块");}

            public void eat(){

                System.out.println("局部内部类的成员方法");
            }

            public void doInner(){
                System.out.println(outMsg);


                doWork();
            }

            @Override
            public String toString() {
                return "InnerClass2{" +
                        "inname='" + inname + '\'' +
                        ", inage=" + inage +
                        '}';
            }
        }
        InnerClass2 in2 = new InnerClass2();
        in2.inname = "内部类";
        in2.inage = 10;

        System.out.println(in2);
        in2.eat();
    }

    public void doWork(){

        System.out.println("外部类的成员方法");
    }



}
