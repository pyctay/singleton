/**
 * 单利模式示例四
 * 懒汉式单例模式
 * 通过双重校验锁来确保线程安全
 * 在多线程下能正常使用并且保持高性能，适用于多线程环境并且对getInstance方法性能要求较高的场所
 * @version 2018/1/18 16:47:04
 * @auther Pyctay
 */
public class Single4 {
    private volatile static Single4 instance;
    private Single4 (){}
    public static Single4 getInstance() {
        if (instance == null) {
            synchronized (Single4.class) {
                if (instance == null) {
                    instance = new Single4();
                }
            }
        }
        return instance;
    }
    // 本类行为
    public void run(){
        System.out.println("获取到了Single4的唯一实例并调用了方法");
    }
}
