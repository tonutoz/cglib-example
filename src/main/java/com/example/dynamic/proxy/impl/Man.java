package com.example.dynamic.proxy.impl;

import com.example.dynamic.proxy.Person;

public class Man implements Person {

  @Override
  public void doItMorningRoutine() {
    System.out.println("���ڴ� ��� �� Ŀ�Ǹ� ���ʴϴ�.");
  }

  @Override
  public void doItAfterNoonRoutine() {
    System.out.println("���ڴ� �ｺ�忡 ���ϴ�.");
  }

}
