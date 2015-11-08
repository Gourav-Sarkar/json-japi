/**
 * 
 */
package jsonapi;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author gourav sarkar
 *
 */
public class Document implements IElement<JSONObject>{
	
	
	private IData data=null;
	private ArrayListJSON<Error>  error;
	private Object meta = null;
	
	private JSONapi jsonapi = null;
	private HashMapJSON<String,Link,JSONObject> links =null;
	private Link self = null;
	private ArrayListJSON<Resource> included = null;
	private HashMapJSON<String,IData,JSONObject> related =null;
	
	
	/**
	 * 
	 * @param page
	 * @param location
	 */
	public void addPagination(EnumPaginationlink page, URI location)
	{
		this.links.put(page.toString(), new Link(location));
	}
	
	
	
	/**
	 * @todo 'name' type Change to Enum 
	 * @param name
	 * @param link
	 */
	public void addLink(String name,Link link)
	{
		this.links.put(name, link);
	}
	
	

	/**
	 * 
	 * @param name
	 * @param link
	 */
	public void addRelated(String name,Link link)
	{
		this.related.put(name, link);
	}
	
	
	
	public void addInclude()
	{
		
	}
	
	
	/**
	 *  This method checks the intigrity of Document
	 * @return boolean if document is valid otherwise false
	 */
	public boolean isValid()
	{
		return true;
	}


	@Override
	public void toObject(JSONObject json) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public JSONObject toJson() {

		JSONObject jsonobj = new JSONObject();
		
		/*
		private String data;
		private Error[] error;
		private String meta;
		
		private JSONapi jsonapi;
		private HashMap<String,Link> links;
		private Link self;
		private HashMap<String,Resource> included;
		private HashMap<String,Link> related;
		*/
		
		/*
		 * If there is error unset data
		 */
		if(this.error.size() > 0)
		{
			this.data=null;
		}
		
		try {
			jsonobj.put("JSONapi", this.jsonapi.toJson());
			jsonobj.put("self", this.self.toJson());
			jsonobj.put("meta", this.meta);
			
			jsonobj.put("related", this.related.toJson());
			jsonobj.put("links", this.related.toJson());
			
			jsonobj.put("error", this.error.toJson());
			jsonobj.put("included", this.included.toJson());
			
			
			
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonobj;
	}

}
