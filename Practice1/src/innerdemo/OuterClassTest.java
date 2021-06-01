package innerdemo;

public class OuterClassTest {

    public static void main(String args[]){

        OuterClass outerClass1 = new OuterClass();
        outerClass1.doJob();

        OuterClass.InnerClass innerClass= outerClass1.create();
        innerClass.inname = "李四";
        innerClass.inage = 25;

        System.out.println(innerClass);

        OuterClass.InnerClass in2 = OuterClass.create();
        in2.inname = "王五";
        in2.inage = 20;
        System.out.println(in2);
        in2.eat();
        in2.sleep();


        OuterClass.InnerClass in3 = OuterClass.create();
        in3.printMsg();

        OuterClass.create().printMsg();




    }
}
