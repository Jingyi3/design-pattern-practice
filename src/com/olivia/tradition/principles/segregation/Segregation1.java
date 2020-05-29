package com.olivia.tradition.principles.segregation;

public class Segregation1 {
}


interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();

}

class B implements Interface1 {

    public void operation1() {
        System.out.println("B implement operation 1");

    }

    public void operation2() {
        System.out.println("B implement operation 2");
    }

    public void operation3() {
        System.out.println("B implement operation 3");
    }

    public void operation4() {
        System.out.println("B implement operation 4");
    }

    public void operation5() {
        System.out.println("B implement operation 5");

    }
}

class D implements Interface1 {

    public void operation1() {
        System.out.println("D implement operation 1");

    }

    public void operation2() {
        System.out.println("D implement operation 2");
    }

    public void operation3() {
        System.out.println("D implement operation 3");
    }

    public void operation4() {
        System.out.println("D implement operation 4");
    }

    public void operation5() {
        System.out.println("D implement operation 5");

    }
}

class A {
    // class A use Interface1 depend on Class B, but only use 1, 2, 3 methods
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend2(Interface1 interface1) {
        interface1.operation2();
    }
    public void depend3(Interface1 interface1) {
        interface1.operation3();
    }
}

class C {
    // class A use Interface1 depend on Class D, but only use 1, 4, 5 methods

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend2(Interface1 interface1) {
        interface1.operation4();
    }
    public void depend3(Interface1 interface1) {
        interface1.operation5();
    }
}