package proxy.dynamic_jdk;

import java.lang.reflect.Proxy;

/**
 * @program: TestBlog
 * @description:
 * @author: vcjmhg
 * @create: 2019-10-07 17:04
 **/
public class Client {
    public static void main(String[] args) {
        //第一个参数:反射时使用的类加载器
        //第二个参数:Proxy需要实现什么接口
        //第三个参数:通过接口对象调用方法时,需要调用哪个类的invoke方法
        GongNeng gongneng = (GongNeng) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{GongNeng.class}, new MiShu());
        gongneng.eat();
    }
}

