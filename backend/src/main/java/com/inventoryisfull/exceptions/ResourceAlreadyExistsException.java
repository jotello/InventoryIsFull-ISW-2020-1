package com.inventoryisfull.exceptions;

public class ResourceAlreadyExistsException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ResourceAlreadyExistsException() {
    }
 
    public ResourceAlreadyExistsException(String msg) {
        super(msg);
    }
}