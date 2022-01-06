/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.lambda.expressions;

/**
 *
 * @author Madhankumar Selvaraj
 */
interface Name {

public String getName(String name);
}

public class LambdaExpressionSingleParam {

public static void main(String[] args) {

    String s = "Madhankumars";

    Name nm = (name) -> {
        return name;
    };
    String nameList = nm.getName(s);
    System.out.println(""+nameList);
}

}
