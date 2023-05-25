package com.example.cglib.proxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.InvocationHandler;

public class PersonProxyCGLibHandler implements InvocationHandler {
  private final Object target;

  public PersonProxyCGLibHandler(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    Object result = null;

    System.out.println(method.getName() + " �޼ҵ� ȣ�� ��");

    result = method.invoke(target, args); // �޼��� ȣ��

    System.out.println(method.getName() + " �޼ҵ� ȣ�� ��");


    return result;
  }

}
