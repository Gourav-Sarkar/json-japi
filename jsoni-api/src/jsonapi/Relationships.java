/**
 * 
 */
package jsonapi;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import exception.JSONApiSpecException;

/**
 * @author gourav sarkar
 *
 */
public class Relationships  implements IElement{
	

	private HashMapJSON<String,Link> links=  null;
	private IData data = null;
	private Object meta = null;
	
	public boolean isValid() throws JSONApiSpecException
	{
		if(this.meta == null && this.data == null && this.links == null)
		{
			throw new JSONApiSpecException("Link must have one property");
		}
		return false;
	}
	@Override
	public void toObject(JSONObject json) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public JSONObject toJson() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public JSONArray toJsonCollection() throws JSONException {
		throw new UnsupportedOperationException("Not supported yet");
	}
}
