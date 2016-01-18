package com.AppsFruit.veluthachan;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class basilica extends Activity {
	

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    super.setContentView(R.layout.basilica);
	    
	    
	    TextView head1=(TextView)findViewById(R.id.bas_head1);
	    TextView head2=(TextView)findViewById(R.id.bas_head2);
	    TextView head3=(TextView)findViewById(R.id.bas_head3);
	    TextView head4=(TextView)findViewById(R.id.bas_head4);
	    TextView text1=(TextView)findViewById(R.id.bas_text1);
	    TextView text2=(TextView)findViewById(R.id.bas_text2);
	    TextView text3=(TextView)findViewById(R.id.bas_text3);
/*
	    TextView text4=(TextView)findViewById(R.id.bas_text4);
*/

	    
	    
	    TextView name=(TextView)findViewById(R.id.day_name);
	    name.setText("അർത്തുങ്കൽ   ബസിലിക്ക");
	    
		Typeface typeFace = Typeface.createFromAsset(getAssets(),"AnjaliOldLipi.ttf");
		
		head1.setText("ഞായർ");
		text1.setText(		
				"\n5:30 AM ദിവ്യബലി"+ 
				"\n7:00 AM ദിവ്യബലി"+
				"\n9 :00 AM ദിവ്യബലി"+
				"\n11:00 AM ദിവ്യബലി "+
				"\n5:00  PM ദിവ്യബലി");

		head2.setText("വ്യഴം");
		text2.setText(	
				"\n5:30 AM ദിവ്യബലി "+
				"\n7:00 AM ദിവ്യബലി"+
				"\n10:30 AM നൊവേന ദിവ്യബലി"+
				"\n4:30 PM   നൊവേന ദിവ്യബലി");
		
		head3.setText("ഇട ദിവസങ്ങളിൽ");
		text3.setText("\n5:30 AM ദിവ്യബലി "+
				"\n7:00 AM ദിവ്യബലി"+
				"\n5:30  PM ദിവ്യബലി\n");
		
		head4.setText("The Rector, St.Andrew's Basilica," +
				"\nArthunkal P.O , Cherthala - 688530" +
				"\nAlappuzha,Kerala,India." +
				"\nPhone: 0478-2573560" +
				"\nWeb:www.arthunkalbasilica.com" );
		/*text4.setText("\n\nA SecuAr Project\n\n" +
				"\nSociety for Socio-economic and Cultural Uplift of " +
				"Arthunkal\n Arthunkal p.o Cherthala 688530");
		*/
		head1.setTypeface(typeFace);
		head2.setTypeface(typeFace);
		head3.setTypeface(typeFace);
		text1.setTypeface(typeFace);
		text2.setTypeface(typeFace);
		text3.setTypeface(typeFace);
		
		name.setTypeface(typeFace);
	
}
}