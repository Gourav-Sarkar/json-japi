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
public class Source  implements IElement{

	private String pointer;
	private String parameter;
	@Override
	public void toObject(JSONObject json) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isValid()
	{
		return true;
	}
	
	@Override
	public JSONObject toJson() throws JSONException {
		JSONObject json = new JSONObject();
		json.put("pointer", this.pointer);
		json.put("parameter", this.parameter);
		
		return json;
	}

	@Override
	public JSONArray toJsonCollection() throws JSONException {
		throw new UnsupportedOperationException("Not supported yet");
	}
}
