package com.example.dynamic.proxy.impl;

import com.example.dynamic.proxy.Person;

public class Man implements Person {

  @Override
  public void doItMorningRoutine() {
    System.out.println("남자는 기상 후 커피를 마십니다.");
  }

  @Override
  public void doItAfterNoonRoutine() {
    System.out.println("남자는 헬스장에 갑니다.");
  }

}
