/**
 * 示例二在多线程下演示
 *
 * @version 2018/1/18 16:50:13
 * @auther Pyctay
 */
public class MyThread extends Thread{

    @Override
    public void run() {
            Single2 single2 = Single2.getInstance();
            System.out.println(Thread.currentThread().getName()+"获取的对象的hashCode为："+single2.hashCode());
    }
}

