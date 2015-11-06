/**
 * 
 */
package jsonapi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author gourav sarkar
 *
 */
public class HashMapJSON<K,V> extends HashMap implements IJSONSerialize{

	/**
	 * 
	 */
	public HashMapJSON() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toObject(JSONObject json) {
		// TODO Auto-generated method stub
		
	}

	
	/**
	 * @todo Verify generics syntax
	 */
	@Override
	public JSONObject toJson() throws JSONException {
		JSONObject json= new JSONObject();
		
		Iterator<Map.Entry<K,V>> it=this.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry<K,V> entry= it.next();
			json.put((String)entry.getKey(), entry.getValue());
		}
	
		return json;
	}

	@Override
	public JSONArray toJsonCollection() throws JSONException {
		throw new UnsupportedOperationException("Not supported yet");
	}
	
}
