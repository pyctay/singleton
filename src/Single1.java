/**
 * 单例模式示例一
 * 饿汉式单例模式
 * 在类装载的时候就进行实例化，避免了多线程的同步问题，性能较高，但可能会通过其他方式导致类被装载而产生垃圾对象。
 * @version 2018/1/18 16:09:07
 * @auther Pyctay
 */
public class Single1 {
    // 创建本类的一个对象。
    private static Single1 instance = new Single1();
    // 使构造函数私有化，这样外部就不能通过直接new来创建本类实例。
    private Single1() { }
    // 提供一个方法来供外部获取本类实例。
    public static Single1 getInstance(){
        return instance;
    }
    // 本类行为
    public void run(){
        System.out.println("获取到了Single1的唯一实例并调用了方法");
    }
}
