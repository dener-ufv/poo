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
public class BinaryIndexOutOfBoundsException extends Exception {

    @Override
    public String toString() {
        return "Index fora dos limites";
    }

    @Override
    public String getMessage() {
        return "Voce deve acessar uma posição entre 0 e TAMANHO-1";
    }
    
    
}
