package com.example.dynamic.proxy.test;

import java.lang.reflect.Proxy;
import org.junit.Test;
import com.example.dynamic.proxy.Person;
import com.example.dynamic.proxy.PersonProxyHandler;
import com.example.dynamic.proxy.impl.Man;
import com.example.dynamic.proxy.impl.Woman;

public class DynamicProxyTest {

  @Test
  public void testDynamicProxy() {

    Person man = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
        new Class[] {Person.class}, new PersonProxyHandler(new Man()));

    Person woMan = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
        new Class[] {Person.class}, new PersonProxyHandler(new Woman()));
    System.out.println("--------------------------");

    man.doItMorningRoutine();
    man.doItAfterNoonRoutine();

    System.out.println("--------------------------");

    woMan.doItMorningRoutine();
    woMan.doItAfterNoonRoutine();

  }
}
