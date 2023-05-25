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
    System.out.println(method.getName() + " �޼ҵ� ȣ�� ��");

    result = method.invoke(target, args); // �޼��� ȣ��

    System.out.println(method.getName() + " �޼ҵ� ȣ�� ��");
    System.out.println("before Method");

    return result;
  }

}
