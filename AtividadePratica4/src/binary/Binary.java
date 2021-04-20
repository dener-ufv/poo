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
    protected int size;
    public abstract Binary setBit(int index, int valor) throws BinaryIndexOutOfBoundsException;
    public abstract int getBit(int index) throws BinaryIndexOutOfBoundsException;
    
    public Binary(int size) throws BinaryInvalidSizeException {
        if(size <= 0) throw new BinaryInvalidSizeException();
        this.size = size;
    }
    
    public Binary and(Binary binario) throws BinaryDifferentSizeException {
        if(binario.size() != size) throw new BinaryDifferentSizeException();
        try {
            for(int i=0; i<size; i++) {
                if(this.getBit(i) == 0 || binario.getBit(i) == 0) {
                    this.setBit(i, 0);
                } else {
                    this.setBit(i, 1);
                }
            }
        } catch(Exception e) {
            
        }
        return this;
    }
    
    public Binary or(Binary binario) throws BinaryDifferentSizeException {
        if(binario.size() != size) throw new BinaryDifferentSizeException();
        try {
            for(int i=0; i<size; i++) {
                if(this.getBit(i) == 1 || binario.getBit(i) == 1) {
                    this.setBit(i, 1);
                } else {
                    this.setBit(i, 0);
                }
            }
        } catch(Exception e) {
            
        }
        return this;
    }
    
    public Binary not() {
        try {
            for(int i=0; i<size; i++) {
                if(this.getBit(i) == 0) {
                    this.setBit(i, 1);
                } else {
                    this.setBit(i, 0);
                }
            }
        } catch(Exception e) {
            
        }
        return this;
    }
    
    public int size() {
        return this.size;
    }
    
    public boolean equals(Binary obj) {
        boolean eq = true;
        if(obj.size() != size) return false;
        // compare method dont care
        try {
            for(int i=0; i<size; i++) eq &= (obj.getBit(i) == this.getBit(i));  
        } catch(Exception e) {
            
        }
        return eq;
    }
    
    @Override
    public String toString() {
        String bin = new String();
        try {
            for(int i=size-1; i>=0; i--) bin += this.getBit(i);
        } catch (Exception e) {
        }
        return bin;
    }
}
