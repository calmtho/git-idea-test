package com.it.git;

public class FirstGit {
    public static void main(String[] args) {
        System.out.println("hello git project");
        System.out.println("hello git project");
        System.out.println("hello git project");
        test();
    }

    //把test方法改成静态的，这样main方法才能调用
    public static void test(){
        System.out.println("git!git!git!");
        System.out.println("合并分支");
    }
}
