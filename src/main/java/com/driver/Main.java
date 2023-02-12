package com.driver;

public class Main {

    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public void main(String[] args){
        B one = new B();
        one.meth();
        B two = new B();
        two.meth();
    }
}