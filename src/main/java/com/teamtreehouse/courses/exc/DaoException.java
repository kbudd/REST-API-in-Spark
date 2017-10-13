package com.teamtreehouse.courses.exc;

/**
 * Created by kylebudd on 10/11/17.
 */
public class DaoException extends Exception {

    private final Exception originalException;

    public DaoException(Exception originalException, String message) {
        super(message);
        this.originalException = originalException;
    }
}
