/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import binary.exceptions.BinaryInvalidSizeException;
/**
 *
 * @author dener
 */
public class BinaryString extends Binary {
    String binario;
    
    public BinaryString(int size) throws BinaryInvalidSizeException {
        super(size);
        binario = new String();
        for(int i=0; i<size; i++) binario += "0";
    }

    public BinaryString(Binary binario) {
        super(binario);
        this.binario = new String();
        for(int i=0; i<size; i++) this.binario += "0";
        for(int i=0; i<size; i++) this.internalSetBit(i, binario.internalGetBit(i));
    }

    @Override
    protected Binary internalSetBit(int index, boolean valor) {
        StringBuilder builder = new StringBuilder(this.binario);
        builder.setCharAt(index, valor ? '1' : '0');
        this.binario = builder.toString();
        return this;
    }

    @Override
    protected boolean internalGetBit(int index) {
        return this.binario.charAt(index) == '1';
    }
}
