package com.AppsFruit.veluthachan;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class jan16 extends Activity {


	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    super.setContentView(R.layout.event_6);


Typeface typeFace = Typeface.createFromAsset(getAssets(),"AnjaliOldLipi.ttf");





        //date
         TextView date=(TextView)findViewById(R.id.date);


         //date
         TextView day=(TextView)findViewById(R.id.day);


       //day name
         TextView day_name=(TextView)findViewById(R.id.day_name);


      // item1 event
         TextView it1_time=(TextView)findViewById(R.id.item1_time);
         TextView it1_event=(TextView)findViewById(R.id.item1_event);


      // item2 event
         TextView it2_time=(TextView)findViewById(R.id.item2_time);
         TextView it2_event=(TextView)findViewById(R.id.item2_event);

       //item3 event
        /* TextView it3_time=(TextView)findViewById(R.id.item3_time);
         TextView it3_event=(TextView)findViewById(R.id.item3_event);
         TextView it3_content=(TextView)findViewById(R.id.item3_content);
         */

         //item4 event
         TextView it4_time=(TextView)findViewById(R.id.item4_time);
         TextView it4_event=(TextView)findViewById(R.id.item4_event);




         //item6 event
         TextView it6_time=(TextView)findViewById(R.id.item6_time);
         TextView it6_event=(TextView)findViewById(R.id.item6_event);
         TextView it6_content=(TextView)findViewById(R.id.item6_content);

         //item7 event
         TextView it7_time=(TextView)findViewById(R.id.item7_time);
         TextView it7_event=(TextView)findViewById(R.id.item7_event);





         //date
	     	date.setText("JANUARY 16");

	     	//day
	     	day.setText("SATURDAY");

	         //day
	     	day_name.setText(" മാതൃ ദിനം ");
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
	     	/*it3_time.setText("3.00 PM");
	     	it3_event.setText("സാംസ്കാരിക റാലി ");
	     	it3_event.setTypeface(typeFace);
	     	it3_content.setText("");
	     	it3_content.setTypeface(typeFace);

	     	  */


	     	//item5 event
	     	it4_time.setText("5.00 PM");
	     	it4_event.setText("ജപമാല നൊവേന ലിറ്റനി സായാപ്ന്ന പ്രാർത്ഥന ");
	     	it4_event.setTypeface(typeFace);

	     	//item6 event
	     	it6_time.setText("5.45 PM");
	     	it6_event.setText("സമൂഹബലി ");
	     	it6_event.setTypeface(typeFace);
	     	/*it6_content.setText("കാർമ്മികൻ:\nറവ.ഫാ.അഗ്സ്റ്റിൻ പൂപ്പാടി OCD\n\nപ്രസംഗം:\n" +
	     			"വെ.റവ.ഫാ.വിൻസെന്റ്‌ രാജേഷ്‌ പൊള്ളയിൽ ");
	     	it6_content.setTypeface(typeFace);
	     	*/
	     	//item7 event
	     	/*it7_time.setText("6.45 PM");
	     	it7_event.setText("സാംസ്കാരിക നായകന്മാർക്ക് സ്വീകരണം \n\nപൊതുസമ്മേളനം\n");
	     	it7_event.setTypeface(typeFace);

	     	*/





	    // TODO Auto-generated method stub
	}

}