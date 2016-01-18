package com.AppsFruit.veluthachan;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


public class jan10 extends Activity{
	

	  @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.jan10);
	        
	        Typeface typeFace = Typeface.createFromAsset(getAssets(),"AnjaliOldLipi.ttf");
		      
	    	TextView day=(TextView)findViewById(R.id.day_name);
	    	
	    	// item1 event
	        TextView it1_time=(TextView)findViewById(R.id.item1_time);
	        TextView it1_event=(TextView)findViewById(R.id.item1_event);
	        TextView it1_content=(TextView) findViewById(R.id.item1_content); 
	        
	     // item1 event
	        TextView it2_time=(TextView)findViewById(R.id.item2_time);
	        TextView it2_event=(TextView)findViewById(R.id.item2_event);
	    
	      //item event3
	        TextView it3_time=(TextView)findViewById(R.id.item3_time);
	        TextView it3_event=(TextView)findViewById(R.id.item3_event);
	        TextView it3_content=(TextView) findViewById(R.id.item3_content);

		  //item event4
		  TextView it4_time=(TextView)findViewById(R.id.item4_time);
		  TextView it4_event=(TextView)findViewById(R.id.item4_event);
		  TextView it4_content=(TextView) findViewById(R.id.item4_content);




		  //day
	    	day.setText("കൊടിയേറ്റ് ദിനം ");
	    	day.setTypeface(typeFace);
	    	 
	    	//4pm event
	    	it1_time.setText("4.00 PM");
	    	it1_event.setText("പതാക പ്രയാണം");
	    	it1_event.setTypeface(typeFace);
	    	it1_content.setText("മൗണ്ട് കാർമ്മൽ കത്തിഡ്രൽ\nദേവാലയ അങ്കണത്തിൽ നിന്ന്");
	    	it1_content.setTypeface(typeFace);	
	    	
	    	//6.30pm event
	    	it2_time.setText("6.00 PM");
	    	it2_event.setText("ജപമാല \n");
	    	it2_event.setTypeface(typeFace);
	    	
	    	//7.00pm event
	    	//4pm event
	    	it3_time.setText("7.00 PM");
	    	it3_event.setText("കൊടിയേറ്റ് തിരുകർമ്മം" +

					"\n\nആഘോഷമായ പൊന്തിഫിക്കൽ സമൂഹബലി");
	    	 it3_event.setTypeface(typeFace);
	    	it3_content.setText("\n\nകാർമ്മികൻ:" +
					"\nറൈറ്റ്.റവ .ഡോ സ്റ്റീഫൻ അത്തിപോഴിയിൽ " +
					"\n\nപ്രസംഗം:" +
					"\nവേരി. റവ. ഡോ ജോയ് അരയ്ക്കൽ" +
					"\n\nനേതൃത്വം:" +
					"\nമദ്യവർജ്ജന സമിതി");
	    	 it3_content.setTypeface(typeFace);



		  //10pm event
		  it4_time.setText("10.00 PM");
		  it4_event.setText("ക്രിസ്തീയ സംഗീത വിരുന്ന് ");
		  it4_event.setTypeface(typeFace);
		  it4_content.setText("\n\nഅല്പസ്നേഹം ബാംഗ്ലൂർ \n"+
						  "\nവി .സെബസ്ത്യാനോസിന്റെ തമിഴ്  ആൽബം പ്രകാശനം       "+
						  "\n\nപ്രകാശനം:"+
						  "\nശ്രി. വയലാർ ശരത്ചന്ദ്രവർമ്മ "+
						  "\n\nസംഗീത സംവിധാനം :"+
						  "\nശ്രി. യു. എസ്. മണികണ്ടാസ് \n\n   ");
		  it4_content.setTypeface(typeFace);
	    
	    			
	    	
	        
	  }

	

	  

	
}
