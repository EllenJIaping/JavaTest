package innerdemo.practice;

public class User {
//
//    import java.util.Scanner;
//
//    class User{
//        String userName;
//        String passWord;
//
//        public User(String userName, String passWord) {
//            super();
//            this.userName = userName;
//            this.passWord = passWord;
//        }
//
//        @Override
//        public String toString() {
//            // TODO Auto-generated method stub
//            return "用户名: "+userName+"  密码: "+passWord;
//        }
//    }
//
//    public class Demo15 {
//
//        public static void main(String[] args) {
//            int index = 2;
//            User[] user = new User[index]; //先定义一个初始化的数组
//            User[] user2 = new User[index]; //定义该数组用于值交换
//            int count= 0; //定义一个变量用于记录数组的长度
//            System.out.println("欢迎来到0217java基础班");
//            Scanner scanner = new Scanner(System.in);
//            while(true) {
//                boolean flag = false; //定义一个变量默认没有注册
//                System.out.println("请选择功能: 注册(A)  查看用户(B)  退出系统(Q)");
//                String str = scanner.next();
//                //判断用户选择的功能，并做出相应的处理
//                if ("A".equalsIgnoreCase(str)) { //注册的
//                    System.out.println("请输入用户名: ");
//                    String name = scanner.next();
//                    System.out.println("请输入密码: ");
//                    String password = scanner.next();
//                    String string  = "用户名: "+name+"  密码: "+password;
//                    //每注册一次，就遍历一次信息，查看是否有相同的元素
//                    for (User user1 : user) {
//                        if (string.equals(user1)) {
//                            System.out.println("该用户已注册，请重新注册...");
//                            flag = true; // 表示已经注册
//                            break;
//                        }
//                    }
//
//                    if (flag == false) { // 判断没有注册，再对相关信息进行存储
//                        count++;
//                        //对数组长度进行判断
//                        if (count>(index-1)) {
//                            index = index*2 + 2;  //当满足条件，改变数组的长度
//                            user = new User[index];
//                            //将user2的元素赋值给user，用于改变长度后进行初始化
//                            for (int i = 0; i < user2.length; i++) {
//                                for (int j = i; j < user.length; j++) {
//                                    user[j] = user2[i];
//                                    break;
//                                }
//                            }
//                            user2 = new User[index];
//                            //将user的元素赋值给user2，用于记录元素
//                            for (int i = 0; i < user.length; i++) {
//                                for (int j = i; j < user2.length; j++) {
//                                    user2[j] = user[i];
//                                    break;
//                                }
//                            }
//                        }
//                        user2[count-1] = new User(name, password);
//                        user[count-1] = new User(name, password);
//                    }
//                }else if ("B".equalsIgnoreCase(str)) { //查看用户的
//                    System.out.println("当前用户为: ");
//                    for (int i = 0; i < count; i++) {
//                        System.out.println(user[i]);
//                    }
//                }else if ("Q".equalsIgnoreCase(str)) { //退出系统
//                    System.exit(0);
//                }
//            }
//
//        }
//    }

}
