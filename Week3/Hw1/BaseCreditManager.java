package com.company;

public abstract class BaseCreditManager{
    public abstract void Calculate();
    public void Save(){
        System.out.println("Credit saved.");
    }
}
