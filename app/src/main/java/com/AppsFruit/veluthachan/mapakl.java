package com.AppsFruit.veluthachan;



import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class mapakl extends Activity{
	
	WebView myWebView;
	 
	 String mapPath = "https://goo.gl/maps/t0LXt";
	 
	 @Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.aklmapr);
			
			
			if(isNetworkAvailable()==false)
			{
				Toast.makeText(getApplicationContext(), "Please check your internet connectivity", Toast.LENGTH_LONG).show();
			}
				
			
			
			myWebView = (WebView)findViewById(R.id.mapview);
			  myWebView.getSettings().setJavaScriptEnabled(true);
			  myWebView.setWebViewClient(new WebViewClient());
			  
			  myWebView.loadUrl(mapPath);
		}
	 
	 private boolean isNetworkAvailable()
	 {
		 ConnectivityManager connectivityManager=(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		 NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
		 return activeNetworkInfo != null && activeNetworkInfo.isConnected();
	 }
 }


