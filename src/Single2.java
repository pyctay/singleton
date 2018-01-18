/**
 * 单例模式示例二
 * 懒汉式单例模式
 * 第一次调用getInstance时被实例化，不会产生垃圾对象，但不支持多线程。
 * @version 2018/1/18 16:33:05
 * @auther Pyctay
 */
public class Single2 {
    private static Single2 instance;
    // 使构造函数私有化，这样外部就不能通过直接new来创建本类实例。
    private Single2 (){}

    public static Single2 getInstance() {
        // 如果本类不存在实例，则创建实例。
        if (instance == null) {
           try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Single2();
        }
        return instance;
    }
    // 本类行为
    public void run(){
        System.out.println("获取到了Single2的唯一实例并调用了方法");
    }
}
