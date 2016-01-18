package com.AppsFruit.veluthachan;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class jan19 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.events_9);

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



		//item8 event
		TextView it8_time=(TextView)findViewById(R.id.item8_time);
		TextView it8_event=(TextView)findViewById(R.id.item8_event);
		TextView it8_content=(TextView)findViewById(R.id.item8_content);

		//item9 event
		TextView it9_time=(TextView)findViewById(R.id.item9_time);
		TextView it9_event=(TextView)findViewById(R.id.item9_event);
		TextView it9_content=(TextView)findViewById(R.id.item9_content);


		//item10 event
		TextView it10_time=(TextView)findViewById(R.id.item10_time);
		TextView it10_event=(TextView)findViewById(R.id.item10_event);
		TextView it10_content=(TextView)findViewById(R.id.item10_content);


		//date
		date.setText("JANUARY 19");

		//day
		day.setText("TUESDAY");

		//day
		day_name.setText("പിതൃ ദിനം");
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
		it3_time.setText("9.00 AM");
		it3_event.setText("ദിവ്യബലി,പ്രസംഗം\n\nകാർമ്മികൻ:");
		it3_event.setTypeface(typeFace);
		it3_content.setText("റവ ഫാ.ഡിക്സി ഫേബർ ");
		it3_content.setTypeface(typeFace);


		//item4 event
		it4_time.setText("11.00 AM");
		it4_event.setText("ദിവ്യബലി,പ്രസംഗം\n\nകാർമ്മികൻ:\nറവ.ഫാ.ജോസഫ്\u200C \n വലിയവീട്ടിൽ  ");
		it4_event.setTypeface(typeFace);



		//item5 event
		it5_time.setText("4.00 PM");
		it5_event.setText("ദിവ്യബലി,പ്രസംഗം ");
		it5_event.setTypeface(typeFace);
		it5_content.setText("\nകാർമ്മികൻ:\nറവ.ഫാ.ജോസഫ്\u200C \nഡെറി വലയിൽ  ");
		it5_content.setTypeface(typeFace);

		//item6 event
		it6_time.setText("5.30 PM");
		it6_event.setText("ജപമാല നൊവേന ലിറ്റനി സായാപ്ന്ന പ്രാർത്ഥന ");
		it6_event.setTypeface(typeFace);
		it6_content.setText("");
		it6_content.setTypeface(typeFace);

		//item7 event
		it7_time.setText("6.00 PM");
		it7_event.setText("സമൂഹബലി \n\nമുഖ്യകാർമ്മികൻ:\n  റൈറ്റ് റവ.ഡോ.ഫ്രാൻസിസ് കല്ലറയ്ക്കൽ \n(വരാപ്പുഴ അതിരൂപതാ ആർച്ച് ബിഷപ്പ് )\n\nപ്രസംഗം :" +
				"\nറവ.ഫാ .അലക്സ്\u200C കൊച്ചിക്കാരൻവീട്ടിൽ");
		it7_event.setTypeface(typeFace);

		//item8 event
		it8_time.setText("8.00 PM");
		it8_event.setText("ദിവ്യബലി,പ്രസംഗം ");
		it8_event.setTypeface(typeFace);
		it8_content.setText("\n\nകാർമ്മികൻ:\nറവ.ഫാ മൈക്കിൾ കുന്നേൽ  ");
		it8_content.setTypeface(typeFace);

		//item9 event
		it9_time.setText("9.30 PM");
		it9_event.setText("ദിവ്യബലി,പ്രസംഗം ");
		it9_event.setTypeface(typeFace);
		it9_content.setText("\n\nകാർമ്മികൻ:\nറവ.ഫാ ജസ്റ്റിൻ \n \n");
		it9_content.setTypeface(typeFace);

		//item10 event
		it10_time.setText("11.00 PM");
		it10_event.setText("ദിവ്യബലി,പ്രസംഗം ");
		it10_event.setTypeface(typeFace);
		it10_content.setText("\n\nകാർമ്മികൻ:\nറവ.ഫാ സെബാസ്റ്റ്യൻ സന്തോഷ്\u200C പുളിക്കൽ \n \n ");
		it10_content.setTypeface(typeFace);


		// TODO Auto-generated method stub



		// TODO Auto-generated method stub
	}
}