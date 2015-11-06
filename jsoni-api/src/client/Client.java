/**
 * 
 */
package client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;

import jsonapi.Document;

import org.json.JSONException;
import org.json.JSONObject;

import android.net.Uri;

/**
 * @author gourav sarkar
 *
 */
public class Client{
	


	public final String HTTP_METHOD_POST="POST";
	public final String HTTP_METHOD_PUT="PUT";
	public final String HTTP_METHOD_PATCH="PATCH";
	public final String HTTP_METHOD_OPTIONS="OPTIONS";
	public final String HTTP_METHOD_HEAD="HEAD";
	public final String HTTP_METHOD_TRACE="TRACE";
	
	
	/**
	 * 
	 * @param method
	 * @param body Document
	 */
	public Document request(URL url,String method, Document body)
	{
		Document response=new Document();
		HttpURLConnection httpCon=null;
		JSONObject jsonobj = null;
		
		String content= body.toJson().toString();
		
		try {
			httpCon= (HttpURLConnection) url.openConnection();
			httpCon.setRequestMethod(method);
			httpCon.setDoOutput(true);
			httpCon.setChunkedStreamingMode(0);
			
			BufferedWriter bfw= new BufferedWriter(new OutputStreamWriter(httpCon.getOutputStream()));
			bfw.write(content);
			
			BufferedReader bfi = new BufferedReader(new InputStreamReader(httpCon.getInputStream()));
			jsonobj=new JSONObject(bfi.readLine());
			
			
			response.toObject(jsonobj);
			
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}
	

	public void request()
	{
		
	}
	
	

}
