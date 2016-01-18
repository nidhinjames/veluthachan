package com.AppsFruit.veluthachan;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class jan20 extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.events_10);


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
		date.setText("JANUARY 20");

		//day
		day.setText("WEDNESDAY");

		//day
		day_name.setText("തിരുനാൾ ദിനം ");
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
		it3_event.setText("ദിവ്യബലി\n\nകാർമ്മികൻ:\n   റവ.ഫാ.സോളമൻ അരേശ്ശേരിയിൽ \n ");
		it3_event.setTypeface(typeFace);
		it3_content.setText("പ്രസംഗം:\n റവ.ഫാ.ബബുപോൾ OCD  ");
		it3_content.setTypeface(typeFace);


		//item4 event
		it4_time.setText("11.00 AM");
		it4_event.setText(" സമൂഹബലി \n\nകാർമ്മികൻ:\nറവ.ഫാ.സ്റ്റീഫൻ പഴമ്പാശ്ശേരിൽ \n\nപ്രസംഗം:\n" +
				" റവ.ഫാ.സ്റ്റാൻലി പുത്തൻപുരക്കൽ \n ");
		it4_event.setTypeface(typeFace);




		//item5 event
		it5_time.setText("12.30 PM");
		it5_event.setText("ദിവ്യബലി");
		it5_event.setTypeface(typeFace);
		it5_content.setText("\n\n കാർമ്മികൻ:\n  റവ.ഫാ ജോയ് പഴമ്പാശ്ശേരിൽ  \n\nപ്രസംഗം:\n" +
				"റവ.ഫാ.വിജയ്\u200C  ഐസക്  ");
		it5_content.setTypeface(typeFace);


		//item6 event
		it6_time.setText("2.30 AM");
		it6_event.setText("ആഘോഷമായ തിരുനാൾ സമൂഹബലി ");
		it6_event.setTypeface(typeFace);
		it6_content.setText("\n\nമുഖ്യകാർമ്മികൻ:\nവെ.റവ .മോണ്‍.പയസ് ആറാട്ടുകുളം \n\nപ്രസംഗം:\nവെ.റവ .ഫാ .സേവ്യർ കുടിയാംശ്ശെരിയിൽ" +
				"\n\nസഹകാർമ്മികൻ" + "\nറവ.ഫാ .സെബാസ്റ്റ്യൻ കടപ്പുറത്തുവീട്ടിൽ\n" +
				"റവ.ഫാ.സെബാസ്റ്റ്യൻ കരുമാന്ജ്ജേരി");
		it6_content.setTypeface(typeFace);

		//item7 event
		it7_time.setText("4.00 PM");
		it7_event.setText("പ്രദക്ഷിണം ");
		it7_event.setTypeface(typeFace);

		//item8 event
		it8_time.setText("7.00 PM");
		it8_event.setText("ദിവ്യബലി തമിഴ്");
		it8_event.setTypeface(typeFace);
		it8_content.setText("\n\nകാർമ്മികൻ:\nറവ.ഫാ .സുബാഷ് \n");
		it8_content.setTypeface(typeFace);

		//item9 event
		it9_time.setText("9.00 PM");
		it9_event.setText("ദിവ്യബലി");
		it9_event.setTypeface(typeFace);
		it9_content.setText("റവ.ഫാ.സെബാസ്റ്റ്യൻ മിൾട്ടണ്\u200D \n" +
				"\n" +
				"പ്രസംഗം :\nറവ.ഫാ.ജിബി നെറൊന \n");
		it9_content.setTypeface(typeFace);

		//item10 event
		it10_time.setText("10.30 PM");
		it10_event.setText("ദിവ്യബലി");
		it10_event.setTypeface(typeFace);
		it10_content.setText("റവ.ഫാ.സെബാസ്റ്റ്യൻ ചുള്ളിക്കൽ \n\n പ്രസംഗം :\n" +
				"റവ.ഫാ.സ്റ്റാൻലി പയസ് കട്ടുങ്കത്തയ്യിൽ \n");
		it10_content.setTypeface(typeFace);












		// TODO Auto-generated method stub
	}
}