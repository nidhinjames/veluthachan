package com.AppsFruit.veluthachan;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TableRow;

public class feast2015 extends Activity implements OnClickListener{
	
	
	  
	  @Override
		public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    super.setContentView(R.layout.schedule);
		    
		    TableRow jan10=(TableRow)findViewById(R.id.notice_jan_10);
	        jan10.setOnClickListener(this);
	       
	        TableRow jan11=(TableRow)findViewById(R.id.notice_jan_11);
	        jan11.setOnClickListener(this);
	        
	        TableRow jan12=(TableRow)findViewById(R.id.notice_jan_12);
	        jan12.setOnClickListener(this);
	        
	        TableRow jan13=(TableRow)findViewById(R.id.notice_jan_13);
	        jan13.setOnClickListener(this);
	       
	        TableRow jan14=(TableRow)findViewById(R.id.notice_jan_14);
	        jan14.setOnClickListener(this);
	        
	        TableRow jan15=(TableRow)findViewById(R.id.notice_jan_15);
	        jan15.setOnClickListener(this);
	        
	        TableRow jan16=(TableRow)findViewById(R.id.notice_jan_16);
	        jan16.setOnClickListener(this);
	        
	        TableRow jan17=(TableRow)findViewById(R.id.notice_jan_17);
	        jan17.setOnClickListener(this);
	        
	        TableRow jan18=(TableRow)findViewById(R.id.notice_jan_18);
	        jan18.setOnClickListener(this);
	        
	        TableRow jan19=(TableRow)findViewById(R.id.notice_jan_19);
	        jan19.setOnClickListener(this);
	        
	        TableRow jan20=(TableRow)findViewById(R.id.notice_jan_20);
	        jan20.setOnClickListener(this);
	        
	        TableRow jan21=(TableRow)findViewById(R.id.notice_jan_21);
	        jan21.setOnClickListener(this);
	       
	        TableRow jan22=(TableRow)findViewById(R.id.notice_jan_22);
	        jan22.setOnClickListener(this);
	        
	        TableRow jan23=(TableRow)findViewById(R.id.notice_jan_23);
	        jan23.setOnClickListener(this);
	        
	        TableRow jan24=(TableRow)findViewById(R.id.notice_jan_24);
	        jan24.setOnClickListener(this);
	        
	        TableRow jan25=(TableRow)findViewById(R.id.notice_jan_25);
	        jan25.setOnClickListener(this);
	        
	        TableRow jan26=(TableRow)findViewById(R.id.notice_jan_26);
	        jan26.setOnClickListener(this);
	        
	        TableRow jan27=(TableRow)findViewById(R.id.notice_jan_27);
	        jan27.setOnClickListener(this);
	       
		}

	    public void onClick(View v)
	    {
	    	Intent myIntent=null;
	        // TODO Auto-generated method stub
	        switch(v.getId())
	        {
	            case R.id.notice_jan_10:
	                myIntent = new Intent(feast2015.this, jan10.class);
	                break;
	                
	            case R.id.notice_jan_11:
	                myIntent = new Intent(feast2015.this, jan1115.class);
	                break;
	                
	            case R.id.notice_jan_12:
	                myIntent = new Intent(feast2015.this, jan12.class);
	                break;    
	                
	                
	            case R.id.notice_jan_13:
	                myIntent = new Intent(feast2015.this, jan13.class);
	                break;
	                
	            case R.id.notice_jan_14:
	                myIntent = new Intent(feast2015.this, jan14.class);
	                break;
	                
	            case R.id.notice_jan_15:
	                myIntent = new Intent(feast2015.this, jan15.class);
	                break;
	                
	            case R.id.notice_jan_16:
	                myIntent = new Intent(feast2015.this, jan16.class);
	                break;
	                
	                
	                
	            case R.id.notice_jan_17:
	                myIntent = new Intent(feast2015.this, jan17.class);
	                break;
	                
	                
	            case R.id.notice_jan_18:
	                myIntent = new Intent(feast2015.this, jan18.class);
	                break;
	                
	                
	            case R.id.notice_jan_19:
	                myIntent = new Intent(feast2015.this, jan19.class);
	                break;
	                
	            case R.id.notice_jan_20:
	                myIntent = new Intent(feast2015.this, jan20.class);
	                break;
	                
	                
	            case R.id.notice_jan_21:
	                myIntent = new Intent(feast2015.this, jan21.class);
	                break;
	                
	                
	            case R.id.notice_jan_22:
	                myIntent = new Intent(feast2015.this, jan22.class);
	                break;
	                
	            case R.id.notice_jan_23:
	                myIntent = new Intent(feast2015.this, jan23.class);
	                break;
	                
	                
	            case R.id.notice_jan_24:
	                myIntent = new Intent(feast2015.this, jan24.class);
	                break;
	                
	            case R.id.notice_jan_25:
	                myIntent = new Intent(feast2015.this, jan25.class);
	                break;
	                
	            case R.id.notice_jan_26:
	                myIntent = new Intent(feast2015.this, jan26.class);
	                break;
	                
	            case R.id.notice_jan_27:
	                myIntent = new Intent(feast2015.this, jan27.class);
	                break;
	        }

	        startActivity(myIntent);
		 

}
	  
}
