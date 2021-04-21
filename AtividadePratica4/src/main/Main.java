/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import binary.Binary;
import binary.BinaryArray;
import binary.BinaryString;
import binary.exceptions.BinaryDifferentSizeException;
import binary.exceptions.BinaryIndexOutOfBoundsException;
import binary.exceptions.BinaryInvalidSizeException;

/**
 *
 * @author dener
 */
public class Main {
    
    public static void main(String[] args) {
        try {
            Binary b1 = new BinaryArray(10);
            Binary b2 = new BinaryArray(10);
            Binary b3 = new BinaryString(11);
            
            b1.setBit(0, true).not().and(b2.setBit(1, true));
            b3.not().setBit(9, false).setBit(7, false);
            
            // não gera Excessão, pois um binário já existente é SEMPRE válido 
            Binary b4 = new BinaryString(b3);
            b4.not();
            
            // ative a linha abaixo para obter um BinaryInvalidSizeException
            // Binary b5 = new BinaryString(0);
            
            // ative a linha abaixo para obter um BinaryDifferentSizeException
            // b1.or(b2).not().and(b3);
            
            // ative a linha abaixo para obter um BinaryIndexOutOfBoundsException
            // b2.setBit(0, true).setBit(10, false);
            
            System.out.println(b3);
            System.out.println(b4);
        } catch(BinaryInvalidSizeException e) {
            System.out.println("Excessão 1:");
            System.out.println(e.getMessage());
        } catch(BinaryDifferentSizeException e) {
            System.out.println("Excessão 2:");
            System.out.println(e.getMessage());
        } catch(BinaryIndexOutOfBoundsException e) {
            System.out.println("Excessão 3:");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("FIM!! (executado mesmo em caso de exceptions)");
        }
    }
}
