package jsonapi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public interface IJSONSerialize<S> {
	public  void toObject(JSONObject json);
	public S toJson() throws JSONException;
	//public  void toObject(JSONObject json);
	//public JSONArray toJsonCollection() throws JSONException;

}
