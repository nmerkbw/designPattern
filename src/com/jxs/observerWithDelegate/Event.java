package com.jxs.observerWithDelegate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jiangxs on 2018/5/8.
 * <p>
 * 事件类
 */
public class Event {

    // 要执行方法的对象
    private Object object;

    // 要执行方法的名称
    private String methodName;

    // 要执行方法的参数
    private Object[] params;

    // 要执行方法的参数类型
    private Class[] paramTypes;

    // 无参构造器
    public Event() {}

    // 带参构造器
    public Event(Object object, String methodName, Object... args) {

        this.object = object;
        this.methodName = methodName;
        this.params = args;
        contractParamTypes(this.params);
    }

    // 根据参数数组生成参数类型数组
    private void contractParamTypes(Object[] params) {

        int length = params.length;
        this.paramTypes = new Class[length];
        for (int i = 0;i<length;i++) {
            paramTypes[i] = params[i].getClass();
        }
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = paramTypes;
    }

    /**
     * 根据对象的方法和参数类型利用反射来执行相关方法
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method method = object.getClass().getMethod(this.getMethodName(), this.getParamTypes());
        if (null == method) {
            return;
        }
        method.invoke(this.getObject(), this.getParams());
    }
}
