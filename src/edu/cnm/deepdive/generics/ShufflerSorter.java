/**
 * TODO complete javadoc comments.
 */
package edu.cnm.deepdive.generics;

import java.util.ArrayList;

/**
 * @author davem
 *
 */
public interface ShufflerSorter<T extends Comparable <T> > extends Iterable<T> {
	/**
	 * 
	 */
	void shuffle();
	
	/**
	 * 
	 */
	void sort();
	


}
