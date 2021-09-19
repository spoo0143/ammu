package com.classpractice;

public class DemoPassByReference {
	    // instance member
	    int age;

	    // parameterized constructor
	    DemoPassByReference(int age){
	        this.age = age;
	    }

	    // method to display age
	    void display(DemoPassByReference objectParam){
	        System.out.println("this - age : "+this.age);       // this > pointing > CURRENT OBJECT
	        System.out.println("object param - age : "+objectParam.age);
	    }

	    public static void main(String[] args) {
	        DemoPassByReference obj2 = new DemoPassByReference(20);     // object 2 created, age = 20

	        // obj1.display(obj1);
	        // obj1.display(obj2);

	        // obj2.display(obj1);
	        obj2.display(obj2);
	    }
	}

