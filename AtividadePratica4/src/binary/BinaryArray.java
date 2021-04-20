/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import binary.exceptions.BinaryIndexOutOfBoundsException;
import binary.exceptions.BinaryDifferentSizeException;
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
        for(int i=0; i<size(); i++) this.binario.add(0); 
        try {
            for(int i=0; i<size; i++) this.setBit(i, 0);
        } catch(Exception e) {
            
        }
    }
    
    @Override
    public Binary setBit(int index, int valor) throws BinaryIndexOutOfBoundsException {
        if(index < 0 || index >= size) throw new BinaryIndexOutOfBoundsException();
        binario.set(index, valor);
        return this;
    }

    @Override
    public int getBit(int index) throws BinaryIndexOutOfBoundsException {
        if(index < 0 || index >= size) throw new BinaryIndexOutOfBoundsException();
        return binario.get(index);
    }
}
