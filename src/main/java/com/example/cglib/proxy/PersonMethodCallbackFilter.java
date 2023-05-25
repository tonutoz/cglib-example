package com.example.cglib.proxy;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.CallbackFilter;

public class PersonMethodCallbackFilter implements CallbackFilter {

  @Override
  public int accept(Method method) {

    if (method.getName().equals("doItMorningRoutine"))
      return 1;
    else
      return 0;

  }


}
