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
public class JSONapi  implements IElement{
	private String version="1.0";

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

	@Override
	public JSONArray toJsonCollection() throws JSONException {
		throw new UnsupportedOperationException("Not supported yet");
	}

}
