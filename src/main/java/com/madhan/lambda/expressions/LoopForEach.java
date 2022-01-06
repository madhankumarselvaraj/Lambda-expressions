/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.lambda.expressions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class LoopForEach {

public static void main(String[] args) {

    List lst = new ArrayList();
    lst.add("madhan");
    lst.add("raja");
    lst.add("jeeva");
    lst.forEach(
            (n) -> System.out.println("" + n)
    );
}

}
