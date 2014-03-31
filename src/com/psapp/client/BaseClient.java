package com.psapp.client;

import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

public class BaseClient {
	public static final String REST_URL = "http://ec2-54-186-175-228.us-west-2.compute.amazonaws.com:3000";

	
	public void getLiveScore(){
		AsyncHttpClient client = new AsyncHttpClient();
		String url = REST_URL + "/scores?u=test&p=xxxxxx";
		Log.d("DEBUG", "url: " + url);
		client.get(url, new AsyncHttpResponseHandler() {
		    @Override
		    public void onSuccess(String response) {
		        Log.d("DEBUG", "Response:" + response);
		    }
		});
	}
}
