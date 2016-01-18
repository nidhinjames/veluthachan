package com.AppsFruit.veluthachan;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class jan17 extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.events_8);

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

		//item8 event
		TextView it9_time=(TextView)findViewById(R.id.item9_time);
		TextView it9_event=(TextView)findViewById(R.id.item9_event);
		TextView it9_content=(TextView)findViewById(R.id.item9_content);


		//date
		date.setText("JANUARY 17");

		//day
		day.setText("SUNDAY");

		//day
		day_name.setText(" വി. ചാവറ കൂര്യാക്കോസ് ഏലിയാസ്, \nദൈവദാസൻ മോണ്‍ റൈനോൾഡ് അനുസ്മരണം ");
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
		it3_event.setText(" കൂട്ടികളുടെ ദിവ്യബലി,പ്രസംഗം\n\nകാർമ്മികൻ:");
		it3_event.setTypeface(typeFace);
		it3_content.setText("റവ.ഫാ .സൈമണ് കുരിശുങ്കൽ  ");
		it3_content.setTypeface(typeFace);


		//item4 event
		it4_time.setText("11.00 AM");
		it4_event.setText("വി. ചാവറ കൂര്യാക്കോസ് ഏലിയാസ് അനുസ്മരണ സമൂഹബലി\n\nകാർമ്മികൻ:\nറവ.ഫാ.സെബാസ്റ്റ്യൻ ചാമത്തറ CMI\n\nപ്രസംഗം\nറവ.ഫാ  തോമസ് മണ്ണുപറമ്പിൽ CMI \n"
		);
		it4_event.setTypeface(typeFace);



		//item5 event
		it5_time.setText("5.30 PM");
		it5_event.setText("ജപമാല നൊവേന ലിറ്റനി സായാപ്ന്ന പ്രാർത്ഥന ");
		it5_event.setTypeface(typeFace);
		it5_content.setText("");
		it5_content.setTypeface(typeFace);

		//item6 event
		it6_time.setText("5.45 PM");
		it6_event.setText("ദൈവദാസൻ മോണ്\u200D റൈനോൾഡ്  അനുസ്മരണ സമൂഹബലി ");
		it6_event.setTypeface(typeFace);
		it6_content.setText("\nകാർമ്മികൻ:\nറവ.ഫാ.ഇഗ്നേഷ്യസ്  ചുള്ളിക്കൽ \n \n\nപ്രസംഗം:\n" +
				" റവ.ഫാ.രാജൻ മേനങ്കാട്ട് \n");
		it6_content.setTypeface(typeFace);

		//item7 event
		it7_time.setText("8.00 PM");
		it7_event.setText("ദിവ്യബലി,പ്രസംഗം \n\nകാർമ്മികൻ:\nറവ.ഫാ.ബ്രിട്ടാസ് കടവുങ്കൽ \n ");
		it7_event.setTypeface(typeFace);

		//item8 event
		it8_time.setText("9.30 PM");
		it8_event.setText("ദിവ്യബലി,പ്രസംഗം \n\nകാർമ്മികൻ:\nറവ.ഫാ.ഫ്രാൻസിസ് രാജു കാക്കരിയിൽ ");
		it8_event.setTypeface(typeFace);

		//item9 event
		it9_time.setText("10 - 12 PM");
		it9_event.setText("ദിവ്യകാരുണ്യ ആരാധന  ");
		it9_event.setTypeface(typeFace);
		it9_content.setText("\n\nകാർമ്മികൻ:\nറവ.ഫാ.എഡ്\u200Cവേർഡ് പുത്തൻപുരയ്ക്കൽ   \n");
		it9_content.setTypeface(typeFace);





		// TODO Auto-generated method stub



		// TODO Auto-generated method stub
	}
}