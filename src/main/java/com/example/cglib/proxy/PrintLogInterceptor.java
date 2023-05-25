package com.example.cglib.proxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class PrintLogInterceptor implements MethodInterceptor {

  @Override
  public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
      throws Throwable {

    Object result = null;

    System.out.println("before log");

    result = proxy.invokeSuper(obj, args);

    System.out.println("after log");

    return result;
  }

}
