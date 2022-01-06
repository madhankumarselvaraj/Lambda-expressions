/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.lambda.expressions;

import javax.xml.transform.Source;

/**
 *
 * @author Madhankumar Selvaraj
 *
 * Lambda expression provides implementation of functional interface. 
 * Enable to treat functionality as a method argument, or code as data. 
 *
 */
interface Age {

public void age(); // Function interface. only one method call functional interface.
}

public class LambdaExpression {

public static void main(String[] args) {
    int age = 30;
    Age ag = () -> {
        System.out.println("" + age);
    };
    
    // () empty parameter list
    // () Arrow token
    // { } body
    ag.age();
}

}
