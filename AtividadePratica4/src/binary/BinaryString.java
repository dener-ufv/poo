/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import binary.exceptions.BinaryIndexOutOfBoundsException;
import binary.exceptions.BinaryDifferentSizeException;
import binary.exceptions.BinaryInvalidSizeException;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author dener
 */
public class BinaryString extends Binary {
    String binario;
    
    public BinaryString(int size) throws BinaryInvalidSizeException {
        super(size);
        binario = new String();
        for(int i=0; i<size; i++) {
            binario += "0";
        }
    }

    @Override
    public Binary setBit(int index, int valor) throws BinaryIndexOutOfBoundsException {
        if(index < 0 || index >= size) throw new BinaryIndexOutOfBoundsException();
        StringBuilder builder = new StringBuilder(this.binario);
        builder.setCharAt(index, (char)(valor + '0'));
        this.binario = builder.toString();
        return this;
    }

    @Override
    public int getBit(int index) throws BinaryIndexOutOfBoundsException {
        if(index < 0 || index >= size) throw new BinaryIndexOutOfBoundsException();
        return (this.binario.charAt(index) - '0');
    }
}
