package com.example.dynamic.proxy.impl;

import com.example.dynamic.proxy.Person;

public class Woman implements Person {
  @Override
  public void doItMorningRoutine() {
    System.out.println("여자는 기상 후 요가를 합니다.");
  }

  @Override
  public void doItAfterNoonRoutine() {
    System.out.println("여자는 커피숍에 갑니다.");
  }
}
