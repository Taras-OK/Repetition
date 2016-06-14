package com.company.prog.m2.test;

public class Main {
    public static void main(String[] args) {
        String[] list={"d:\\tmp"};
        String s = "xdf";
        MonitorDir m = new MonitorDir(list, new DirEvent());
        m.start();
    }
}
