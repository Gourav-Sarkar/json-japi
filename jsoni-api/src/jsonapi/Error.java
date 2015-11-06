/**
 * 
 */
package jsonapi;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author gourav sarkar
 *
 */
public class Error  implements IElement {

	private String id;
	private HashMapJSON<String,Link> links;
	private String status;
	private String code;
	private String title;
	private String detail;
	private Source source;
	private Object meta;
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
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public JSONArray toJsonCollection() throws JSONException {
		// TODO Auto-generated method stub
		return null;
	}
}
