package com.example.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonProxyHandler implements InvocationHandler {
  private final Object target;

  public PersonProxyHandler(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    Object result = null;
    System.out.println("before Method");
    System.out.println(method.getName() + " 메소드 호출 전");

    result = method.invoke(target, args); // 메서드 호출

    System.out.println(method.getName() + " 메소드 호출 후");
    System.out.println("before Method");

    return result;
  }

}
