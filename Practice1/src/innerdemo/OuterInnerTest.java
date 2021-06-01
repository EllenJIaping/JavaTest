package innerdemo;

public class OuterInnerTest {
    public static  void main(String args[]){

        OuterInner oi = new OuterInner();
        Im_Language im = new Im_Language();

        oi.doJob(im);

        oi.doJob(new O_I_language() {
            @Override
            public void speakEnglish() {
                System.out.println("匿名内部类实现的功能");
                System.out.println("英语口语特别厉害！");
            }
        });
    }
}
