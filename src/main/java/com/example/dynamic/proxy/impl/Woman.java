package com.example.dynamic.proxy.impl;

import com.example.dynamic.proxy.Person;

public class Woman implements Person {
  @Override
  public void doItMorningRoutine() {
    System.out.println("���ڴ� ��� �� �䰡�� �մϴ�.");
  }

  @Override
  public void doItAfterNoonRoutine() {
    System.out.println("���ڴ� Ŀ�Ǽ� ���ϴ�.");
  }
}
