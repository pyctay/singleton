/**
 * 单例模式示例五
 * 通过静态内部类保证在类装载的时候不被实例化（内部类并没有被使用，从而不会实例化），只有显式调用getInstance方法时才会装载内部类从而实例化
 * @version 2018/1/18 17:21:47
 * @auther Pyctay
 */
public class Single5 {
    private static class SingletonHolder {
        private static final Single5 INSTANCE = new Single5();
    }
    private Single5 (){}
    public static final Single5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
    // 本类行为
    public void run(){
        System.out.println("获取到了Single5的唯一实例并调用了方法");
    }
}

