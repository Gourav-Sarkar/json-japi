package jsonapi;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import exception.JSONApiSpecException;

/**
 * 
 */

/**
 * @author gourav sarkar
 * 
 */
public class ResourceList extends ArrayListJSON implements IData {

	/**
	 * 
	 */
	public ResourceList() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValid() throws JSONApiSpecException {
		// TODO Auto-generated method stub
		return false;
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
		return super.toJsonCollection();
	}

}
