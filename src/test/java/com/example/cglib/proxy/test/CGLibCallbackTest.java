package com.example.cglib.proxy.test;

import org.junit.Test;
import com.example.cglib.proxy.PersonMethodCallbackFilter;
import com.example.dynamic.proxy.impl.Man;
import net.sf.cglib.proxy.Enhancer;

public class CGLibCallbackTest {

  @Test
  public void callbackFilterTest() {

    Enhancer enhancer = new Enhancer();

    enhancer.setSuperclass(Man.class);
    enhancer.setCallbackFilter(new PersonMethodCallbackFilter());



  }

}
