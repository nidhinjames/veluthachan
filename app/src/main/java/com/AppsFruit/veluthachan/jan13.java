package com.AppsFruit.veluthachan;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class jan13 extends Activity{


	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    super.setContentView(R.layout.jan1to15);


        Typeface typeFace = Typeface.createFromAsset(getAssets(),"AnjaliOldLipi.ttf");


        //date
         TextView date=(TextView)findViewById(R.id.date);


         //date
         TextView day=(TextView)findViewById(R.id.day);



      //day
        TextView day_name=(TextView)findViewById(R.id.day_name);


     // item1 event
        TextView it1_time=(TextView)findViewById(R.id.item1_time);
        TextView it1_event=(TextView)findViewById(R.id.item1_event);


     // item2 event
        TextView it2_time=(TextView)findViewById(R.id.item2_time);
        TextView it2_event=(TextView)findViewById(R.id.item2_event);

      //item3 event
        TextView it3_time=(TextView)findViewById(R.id.item3_time);
        TextView it3_event=(TextView)findViewById(R.id.item3_event);


        //item4 event
        TextView it4_time=(TextView)findViewById(R.id.item4_time);
        TextView it4_event=(TextView)findViewById(R.id.item4_event);

      //item5 event
        TextView it5_time=(TextView)findViewById(R.id.item5_time);
        TextView it5_event=(TextView)findViewById(R.id.item5_event);

        //date
     	date.setText("JANUARY 13");


     	//day
     	day.setText("WEDNESDAY");




        //day
    	day_name.setText("തൊഴിലാളി ദിനം   ");
    	day.setTypeface(typeFace);

    	//item1 event
    	it1_time.setText("5.30 AM");
    	it1_event.setText("ദിവ്യബലി ");
    	it1_event.setTypeface(typeFace);

    	//item2 event
    	it2_time.setText("7.00 AM");
    	it2_event.setText("പ്രഭാത പ്രാർത്ഥന \nദിവ്യബലി ");
    	it2_event.setTypeface(typeFace);

    	//item3 event
    	it3_time.setText("5.00 PM");
    	it3_event.setText("ജപമാല\nനൊവേന\nലിറ്റനി\nസായാപ്ന്ന പ്രാർത്ഥന");
    	it3_event.setTypeface(typeFace);

    	//item4 event
    	it4_time.setText("5.45 PM");
    	it4_event.setText("സമൂഹബലി");
    	it4_event.setTypeface(typeFace);

    	//item4 event
    /*	it5_time.setText("6.30 PM");
    	it5_event.setText("ബൈബിൾ  കണ്‍വൻഷൻ ");
    	it5_event.setTypeface(typeFace);
       */



	}


}