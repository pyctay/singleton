/**
 * 单例模式主方法
 * @version 2018/1/18 16:00:07
 * @auther Pyctay
 */
public class Main {

    public static void main(String[] args) {
        Single1 single1 = Single1.getInstance();
        single1.run();
        Single2 single2 = Single2.getInstance();
        single2.run();
        Single3 single3 = Single3.getInstance();
        single3.run();
        Single4 single4 = Single4.getInstance();
        single4.run();
        Single5 single5 = Single5.getInstance();
        single5.run();
        Single6 single6 = Single6.INSTANCE;
        single6.run();
    }
}
