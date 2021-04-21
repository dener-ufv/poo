/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import binary.exceptions.BinaryIndexOutOfBoundsException;
import binary.exceptions.BinaryDifferentSizeException;
import binary.exceptions.BinaryInvalidSizeException;

/**
 *
 * @author dener
 */
public abstract class Binary {
    int size;
    protected abstract Binary internalSetBit(int index, boolean value);
    protected abstract boolean internalGetBit(int index);
    
    protected Binary(int size) throws BinaryInvalidSizeException {
        if(size <= 0) throw new BinaryInvalidSizeException();
        this.size = size;
    }
    
    protected Binary(Binary binario){
        this.size = binario.size();
    };
    
    public Binary setBit(int index, boolean value) throws BinaryIndexOutOfBoundsException {
        if(index < 0 || index >= size) throw new BinaryIndexOutOfBoundsException();
        this.internalSetBit(index, value);
        return this;
    }
    
    public boolean getBit(int index) throws BinaryIndexOutOfBoundsException {
        if(index < 0 || index >= size) throw new BinaryIndexOutOfBoundsException();
        return this.internalGetBit(index);
    }
    
    public Binary and(Binary binario) throws BinaryDifferentSizeException {
        if(binario.size() != size) throw new BinaryDifferentSizeException();
        for(int i=0; i<size; i++) {
            this.internalSetBit(i, this.internalGetBit(i) && binario.internalGetBit(i));
        }
        return this;
    }
    
    public Binary or(Binary binario) throws BinaryDifferentSizeException {
        if(binario.size() != size) throw new BinaryDifferentSizeException();
        for(int i=0; i<size; i++) {
            this.internalSetBit(i, this.internalGetBit(i) || binario.internalGetBit(i));
        }
        return this;
    }
    
    public Binary not() {
        for(int i=0; i<size; i++) {
            this.internalSetBit(i, !this.internalGetBit(i));
        }
        return this;
    }
    
    public int size() {
        return this.size;
    }
    
    public boolean equals(Binary obj) {
        boolean eq = true;
        if(obj.size() != size) return false;
        for(int i=0; i<size; i++) eq &= (obj.internalGetBit(i) == this.internalGetBit(i));  
        return eq;
    }
    
    @Override
    public String toString() {
        String bin = new String();
        for(int i=size-1; i>=0; i--) bin += this.internalGetBit(i) ? "1" : "0";
        return bin;
    }
}
