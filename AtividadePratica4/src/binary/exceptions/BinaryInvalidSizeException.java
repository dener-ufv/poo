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
public class BinaryInvalidSizeException extends Exception {

    @Override
    public String toString() {
        return "Tamanho inválido";
    }

    @Override
    public String getMessage() {
        return "Um binário deve ter pelo menos um bit";
    }
    
    
}
