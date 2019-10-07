package proxy.dynamic_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: TestBlog
 * @description:
 * @author: vcjmhg
 * @create: 2019-10-07 16:56
 **/
public class MiShu implements InvocationHandler {
    private LaoZong laozong=new LaoZong() ;
    //代理类针对被代理对象类似的功能不需要重复实现多次
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("预约时间");
        Object result = method.invoke(laozong, args);
        System.out.println("记录访客信息");
        return result;
    }
}

