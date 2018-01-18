/**
 * 单例模式示例六
 * 枚举
 * 还没有被广泛使用，是实现单例模式的最佳方式，更简洁，避免多线程问题，自动支持序列化机制，绝对防止多次实例化。
 *  Effective Java 作者 Josh Bloch 提倡的方式，
 * @version 2018/1/18 17:28:00
 * @auther Pyctay
 */
public enum Single6 {
    INSTANCE;
    public void whateverMethod() {
    }
    public void run(){
        System.out.println("获取到了Single6的唯一实例并调用了方法");
    }
}
