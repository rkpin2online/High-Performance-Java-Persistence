package com.urunov.rest.exceptions;


public class ResourceNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String str){

      super(str);
    }

}