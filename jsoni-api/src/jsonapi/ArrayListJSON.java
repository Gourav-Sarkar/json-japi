/**
 * 
 */
package jsonapi;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author gourav sarkar
 *
 */
public class ArrayListJSON<V extends IJSONSerialize> extends ArrayList implements IJSONSerialize{

	/**
	 * 
	 */
	public ArrayListJSON() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void toObject(JSONObject json) {
		// TODO Auto-generated method stub
	}
	
	
	
	
	@Override
	public JSONObject toJson() throws JSONException {
		throw new UnsupportedOperationException("Not supported yet");
	}
	
	
	

	@Override
	public JSONArray toJsonCollection() throws JSONException {
		JSONArray json = new JSONArray();
		
		for(V res : (V[]) this.toArray())
		{
			json.put(res.toJson());
		}
		
		return json;
	}

}
