/**
 * 
 */
package jsonapi;

import exception.JSONApiSpecException;

/**
 * @author gourav sarkar
 *
 */
public interface IElement<V> extends IJSONSerialize{
	public boolean isValid() throws JSONApiSpecException;

}
