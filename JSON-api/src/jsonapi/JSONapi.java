/**
 * 
 */
package jsonapi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author gourav sarkar
 *
 */
public class JSONapi  implements IElement<JSONObject>{
	private String version="1.0";

	
	public JSONapi()
	{
	
	}
	
	
	
	public JSONapi(String version)
	{
		this.version=version;
	}
	
	
	
	
	public boolean isValid()
	{
		return true;
	}
	
	@Override
	public void toObject(JSONObject json) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JSONObject toJson() throws JSONException {
		JSONObject json = new JSONObject();
		json.put("version", this.version);
		
		return json;
	}

}
