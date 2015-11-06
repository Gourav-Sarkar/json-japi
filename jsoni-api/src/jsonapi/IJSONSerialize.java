package jsonapi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public interface IJSONSerialize {
	public  void toObject(JSONObject json);
	public JSONObject toJson() throws JSONException;
	//public  void toObject(JSONObject json);
	public JSONArray toJsonCollection() throws JSONException;

}
