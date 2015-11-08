/**
 * 
 */
package jsonapi;

import java.net.URI;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author gourav sarkar
 * 
 */
public class Link implements IElement<JSONObject>{

	/**
	 * @todo Change to specific object
	 * 
	 */
	private URI href = null;
	private Object meta = null;

	

	public Link(URI href) {
		this.href = href;
	}
	
	public Link(URI href, Object meta) {
		this.href = href;
		this.meta = meta;
	}

	@Override
	public void toObject(JSONObject json) {
		// TODO Auto-generated method stub

	}

	@Override
	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		
		
		try {
			if (this.meta == null) {
				return new JSONObject(this.href.toString());

			} else {
				json.put("href", this.href.toString());
				json.put("meta", this.meta);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return json;
	}


	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

}
