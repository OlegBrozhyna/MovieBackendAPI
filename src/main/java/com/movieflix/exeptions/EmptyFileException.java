package com.movieflix.exeptions;

public class EmptyFileException extends Throwable {
    public EmptyFileException(String message) {
       super(message);
    }
}
