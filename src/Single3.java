/**
 * 单例模式示例三
 * 懒汉式单例模式，线程安全
 * 应用场景：在多线程下使用，getInstance不被频繁调用，对性能要求不高。
 * @version 2018/1/18 16:39:10
 * @auther Pyctay
 */
public class Single3 {
    private static Single3 instance;
    private Single3(){}
    // 在获取实例的方法上加锁synchronized保证在多线程中获取到的是本类的唯一实例
    public static synchronized Single3 getInstance() {
        if (instance == null) {
            instance = new Single3();
        }
        return instance;
    }
    // 本类行为
    public void run(){
        System.out.println("获取到了Single3的唯一实例并调用了方法");
    }
}
