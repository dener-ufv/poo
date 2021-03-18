/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufv.helloworld;

import java.util.Scanner;

/**
 *
 * @author dener
 */
public class Main {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        System.out.println(n&1);
    }
}
