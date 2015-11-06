/**
 * 
 */
package jsonapi;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import exception.JSONApiSpecException;

/**
 * @author gourav sarkar
 * 
 */
public class Resource implements IData {

	private class ResourceID implements IElement {
		private String id = "";
		private String type = "";

		public ResourceID(String id, String type) {

			this.id = id;
			this.type = type;
		}

		/**
		 * @todo Client Exception where id can be empty
		 * @todo 'type' validation as per Member rules
		 * @return
		 * @throws JSONApiSpecException
		 */
		public boolean isValid() throws JSONApiSpecException {
			if (this.id.isEmpty() && this.type.isEmpty()) {
				throw new JSONApiSpecException(
						"ID and TYPE is mandatory for Resource Object");
			}

			return true;
		}

		@Override
		public void toObject(JSONObject json) {
			// TODO Auto-generated method stub

		}

		@Override
		public JSONObject toJson() throws JSONException {
			
			//this.isValid();
			JSONObject json = new JSONObject();
			json.put("id", this.id);
			json.put("type", this.type);

			return json;
		}

		@Override
		public JSONArray toJsonCollection() throws JSONException {
			throw new UnsupportedOperationException("Not supported yet");
		}

	}

	
	
	
	
	private ResourceID resourceID;
	private HashMapJSON<String, String> attributes = null;
	private HashMapJSON<String, Relationships> relationship = null;
	private HashMapJSON<String, Link> links = null;
	private Object meta;

	
	
	public Resource(String id, String type) {

		this.resourceID = new ResourceID(id, type);
	}

	
	
	
	public Resource(ResourceID resid) {
		this.resourceID = resid;
	}

	
	
	
	
	public ResourceID getResourceID()
	{
		return this.resourceID;
	}
	
	
	
	
	
	/**
	 * @todo check for reserved identifier (type, id) for Fields
	 * @todo there cant be "relationship" and "Link"
	 * 
	 * @param propertyName
	 * @param propertyValue
	 *            any valid JSON value
	 * @throws JSONApiSpecException
	 */
	public void addAttribute(String propertyName, String propertyValue)
			throws JSONApiSpecException {
		if (!this.relationship.containsKey(propertyName)) {

			this.attributes.put(propertyName, propertyValue);
		} else {
			throw new JSONApiSpecException("Fields identifier conflict");
		}
	}

	
	
	
	
	@Override
	public void toObject(JSONObject json) {

	}
	
	
	
	

	@Override
	public JSONObject toJson() throws JSONException {
		JSONObject json = this.resourceID.toJson();
		json.put("meta", this.meta);
		
		return json;
	}




	@Override
	public JSONArray toJsonCollection() throws JSONException {
		throw new UnsupportedOperationException("Not supported yet");
	}




	@Override
	public boolean isValid() throws JSONApiSpecException {
		// TODO Auto-generated method stub
		return false;
	}

}
