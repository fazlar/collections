package com.noyChoy;

public abstract class Singleton{
private Singleton() {}
    public String str;
    private static Singleton instance = null;
    public static Singleton getSingleInstance() {
        if (instance == null) {
         synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(){};
                }
            }
        }
        return instance;
    }
}