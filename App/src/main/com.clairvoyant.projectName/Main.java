package com.clairvoyant.projectName;

public class Main implements ISampleInterface{

    public void sampleMethod(String str) {
        System.out.println("Sample Test Executed in " + str);
    }

    //Main Code Goes Here
    public static void main(String[] args) {

        Main m = new Main();
        m.sampleMethod("Main class");
    }
}
