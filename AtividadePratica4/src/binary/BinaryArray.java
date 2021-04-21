/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import binary.exceptions.BinaryInvalidSizeException;
import java.util.ArrayList;

/**
 *
 * @author dener
 */
public class BinaryArray extends Binary {
    private ArrayList<Integer> binario;

    public BinaryArray(int size) throws BinaryInvalidSizeException {
        super(size);
        this.binario = new ArrayList<>();
        for(int i=0; i<size; i++) this.binario.add(0); 
    }
    
    public BinaryArray(Binary binario) {
        super(binario);
        this.binario = new ArrayList<>();
        for(int i=0; i<size; i++) this.binario.add(0);
        for(int i=0; i<size; i++) this.internalSetBit(i, binario.internalGetBit(i));
    }
    
    @Override
    protected Binary internalSetBit(int index, boolean valor){
        binario.set(index, valor ? 1 : 0);
        return this;
    }

    @Override
    protected boolean internalGetBit(int index) {
        return binario.get(index) == 1;
    }
}
