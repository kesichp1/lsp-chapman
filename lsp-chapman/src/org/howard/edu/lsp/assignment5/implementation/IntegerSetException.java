package org.howard.edu.lsp.assignment5.implementation;

/**
 * 
 * @author Kesi Chapman
 *
 * This class throws an exception for functions 'largest'
 * and 'smallest' when the set is empty.
 * 
 * This exception allows for a String input.
 * 
 */

public class IntegerSetException extends Exception {
	IntegerSetException(String message) {
		super(message);
	}
}