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
public class Error implements IElement<JSONObject> {

	private String id;
	private HashMapJSON<String, Link> links;
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

	
	
	/**
	 * @todo Hande meta object
	 */
	@Override
	public JSONObject toJson() throws JSONException {
		JSONObject json = new JSONObject();
		json.put("id", this.id);
		json.put("links", this.links.toJson());
		json.put("status", this.status);
		json.put("code", this.code);
		json.put("title", this.title);
		json.put("detail", this.detail);
		json.put("source", this.source.toJson());
		//json.put("meta", new JSONObject());
		
		
		return json;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}
}
