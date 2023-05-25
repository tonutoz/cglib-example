package com.example.cglib.proxy.test;

import org.junit.Test;
import com.example.cglib.proxy.PersonProxyCGLibHandler;
import com.example.cglib.proxy.PrintLogInterceptor;
import com.example.dynamic.proxy.impl.Man;
import com.example.dynamic.proxy.impl.Woman;
import net.sf.cglib.proxy.Enhancer;

public class CGLibProxyTest {

  @Test
  public void testCGLibProxy() {
    Enhancer enhancer = new Enhancer();

    enhancer.setSuperclass(Man.class);
    enhancer.setCallback(new PersonProxyCGLibHandler(new Man()));

    Man man = (Man) enhancer.create();

    man.doItMorningRoutine();

    man.doItAfterNoonRoutine();

  }

  @Test
  public void testCGLibInterceptor() {

    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(Woman.class);

    enhancer.setCallback(new PrintLogInterceptor());

    Woman woman = (Woman) enhancer.create();

    woman.doItMorningRoutine();
    woman.doItAfterNoonRoutine();

  }

}
