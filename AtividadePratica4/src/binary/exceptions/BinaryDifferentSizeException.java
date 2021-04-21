/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.exceptions;

/**
 *
 * @author dener
 */
public class BinaryDifferentSizeException extends Exception {

    @Override
    public String toString() {
        return "Tamanhos diferentes";
    }

    @Override
    public String getMessage() {
        return "Para realizar operações entre binários utilize binarios de mesmo tamanho";
    }
    
}
