package com.AppsFruit.veluthachan;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/*
import com.AppsFruit.veluthachan.R;
*/

public class jan22 extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.events_7);

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
		TextView it3_time=(TextView)findViewById(R.id.item3_time);
		TextView it3_event=(TextView)findViewById(R.id.item3_event);
		TextView it3_content=(TextView)findViewById(R.id.item3_content);


		//item4 event
		TextView it4_time=(TextView)findViewById(R.id.item4_time);
		TextView it4_event=(TextView)findViewById(R.id.item4_event);



		//item5 event
		TextView it5_time=(TextView)findViewById(R.id.item5_time);
		TextView it5_event=(TextView)findViewById(R.id.item5_event);
		TextView it5_content=(TextView)findViewById(R.id.item5_content);

		//item6 event
		TextView it6_time=(TextView)findViewById(R.id.item6_time);
		TextView it6_event=(TextView)findViewById(R.id.item6_event);
		TextView it6_content=(TextView)findViewById(R.id.item6_content);

		//item7 event
		TextView it7_time=(TextView)findViewById(R.id.item7_time);
		TextView it7_event=(TextView)findViewById(R.id.item7_event);



		//date
		date.setText("JANUARY 22");

		//day
		day.setText("FRIDAY");

		//day
		day_name.setText("മതബോധന ദിനം");
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
		it3_time.setText("10.00 AM");
		it3_event.setText("ദിവ്യബലി,പ്രസംഗം \n\nകാർമ്മികൻ:\nറവ.ഫാ.ആന്റണി തട്ടകം ");
		it3_event.setTypeface(typeFace);



		//item4 event
		it4_time.setText("4.00 PM");
		it4_event.setText("ദിവ്യബലി,പ്രസംഗം\n\nകാർമ്മികൻ:\nറവ.ഫാ.ആന്റണി വാലയിൽ  ");
		it4_event.setTypeface(typeFace);



		//item5 event
		it5_time.setText("5.30 PM");
		it5_event.setText("ജപമാല നൊവേന ലിറ്റനി ദിവ്യബലി\n" +
				"\n" +
				"മുഖ്യകാർമ്മികൻ:\n" +
				"റവ.ഫാ.ബെർളി വെലിയകം \n" +
				"\nപ്രസംഗം :\nറവ.ഫാ.പോൾ ജെ. അറക്കൽ \n");
		it5_event.setTypeface(typeFace);
		it5_content.setText("");
		it5_content.setTypeface(typeFace);

		//item6 event
		it6_time.setText("8.00 PM");
		it6_event.setText("ദിവ്യബലി,പ്രസംഗം");
		it6_event.setTypeface(typeFace);
		it6_content.setText("\nകാർമ്മികൻ:\nറവ.ഫാ.ബെർണാഡ്  പണിക്കവീട്ടിൽ  " );
		it6_content.setTypeface(typeFace);

		//item7 event
		it7_time.setText("9.00 PM");
		it7_event.setText("ദിവ്യബലി,പ്രസംഗം\n\nകാർമ്മികൻ:\nറവ.ഫാ.ഫ്രാൻസിസ് സേവ്യർ കൈതവളപ്പിൽ  \n");
		it7_event.setTypeface(typeFace);






		// TODO Auto-generated method stub
	}
}