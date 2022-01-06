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

interface Addition{

 public int getAddvalue(int a,int b);

}

public class MultiParam {

public static void main(String[] args) {
    
    Addition ad=(a,b)->{
        return a+b;
    };
    int addValue=ad.getAddvalue(4, 5);
    System.out.println(""+addValue);
    
}
    
}
