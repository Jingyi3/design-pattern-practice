package com.olivia.tradition.principles.segregation.improve;

public class Segregation1 {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());// A类通过接口去依赖B类
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();// C类通过接口去依赖D类
        c.depend1(new D());
        c.depend2(new D());
        c.depend3(new D());
    }
}


interface Interface1 {
    void operation1();


}

interface Interface2 {
    void operation2();
    void operation3();
}

interface Interface3 {
    void operation4();
    void operation5();
}

class B implements Interface1, Interface2 {

    public void operation1() {
        System.out.println("B implement operation 1");

    }

    public void operation2() {
        System.out.println("B implement operation 2");
    }

    public void operation3() {
        System.out.println("B implement operation 3");
    }

}

class D implements Interface1, Interface3 {

    public void operation1() {
        System.out.println("D implement operation 1");

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
    public void depend2(Interface2 interface1) {
        interface1.operation2();
    }
    public void depend3(Interface2 interface1) {
        interface1.operation3();
    }
}

class C {
    // class A use Interface1 depend on Class D, but only use 1, 4, 5 methods

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend2(Interface3 interface1) {
        interface1.operation4();
    }
    public void depend3(Interface3 interface1) {
        interface1.operation5();
    }
}