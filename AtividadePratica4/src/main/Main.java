/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import binary.Binary;
import binary.BinaryArray;
import binary.BinaryString;

/**
 *
 * @author dener
 */
public class Main {
    
    public static void main(String[] args) {
        try {
            Binary b1 = new BinaryArray(10);
            Binary b2 = new BinaryArray(10);
            Binary b3 = new BinaryString(10);
            
            b1.setBit(0, 1);
            b2.setBit(1, 1);
            b3.not().setBit(9, 0).setBit(7, 0);
            
            b1.or(b2).not().and(b3);
            
            System.out.println(b1);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
