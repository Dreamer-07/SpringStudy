package pers.dreamer07.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理 - 负责实现增加代码的逻辑
 * @author shkstart
 * @create 2020-08-26 11:41
 */
public class UserDAOHandler implements InvocationHandler {
    //通过有参构造函数获取被代理类的对象，以便后续执行其中的原方法
    private Object obj;
    public UserDAOHandler(Object obj) {
        this.obj = obj;
    }

    /**
     * 该方法会在帮助真实代理类对象实现方法增强，在调用代理类对象的方法前都会调用该方法
     * @param proxy 真实的代理类对象
     * @param method 要执行的方法
     * @param args 执行方法需要的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //根据不同的方法增加不同的逻辑
        Object res = null;
        if("update".equals(method.getName())){
            System.out.println("修改修改修改！！");
        }else if("queryNameById".equals(method.getName())){
            System.out.println("找找找");
        }
        //在完成增加逻辑的同时，还需要执行原方法
        res = method.invoke(obj, args);
        //返回执行的返回值
        return res;
    }
}
