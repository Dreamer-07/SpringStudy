package pers.dreamer07.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理工厂 - 负责管理代理对象的创建
 * @author shkstart
 * @create 2020-08-26 11:40
 */
public class ProxyFactory {

    /**
     * 传入需要增强方法的对象
     * @param obj
     * @return
     */
    public static Object getProxyInstance(Object obj){
        InvocationHandler invocationHandler = new UserDAOHandler(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),invocationHandler);
    };
}
