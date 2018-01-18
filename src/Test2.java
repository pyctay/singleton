/**
 * 开启多线程演示示例二
 *
 * @version 2018/1/18 16:56:57
 * @auther pyctay
 */
public class Test2 {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");
        t1.start();
        t2.start();
        t3.start();
    }
}
