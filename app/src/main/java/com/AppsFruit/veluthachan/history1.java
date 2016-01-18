package com.AppsFruit.veluthachan;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class history1  extends Activity{
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    super.setContentView(R.layout.history);
	    
	    
	    TextView tv=(TextView)findViewById(R.id.text);
	    TextView name=(TextView)findViewById(R.id.day_name);
	    name.setText("അർത്തുങ്കൽ ചരിത്രം");
	    
		Typeface typeFace = Typeface.createFromAsset(getAssets(),"AnjaliOldLipi.ttf");
		tv.setText("\n\nപ്ലേഗ് രോഗത്തിൽ നിന്നും രക്ഷിക്കപ്പെട്ടത്തിന്റെ നന്ദി സൂചകമായി പോർച്ചുഗലിൽ നിന്നും " +
				" വി.സെബസ്ത്യാനോസിന്റെ" +
				" തിരുസ്വരൂപവും കൊണ്ട് പയ്ക്കപ്പലിൽ ലോകപര്യടനം നടത്തുന്നതിനായി 1645ൽ പുറപ്പെടുകയും യാത്രാ" +
				" മദ്ധ്യേ  കടൽ ക്ഷോഭത്തിൽ " +
				"കപ്പൽ മുങ്ങി  പോകുമെന്നായപ്പോൾ വി. സെബസ്ത്യാനോസിന്റെ തിരുസ്വാരൂപം എന്തുചെയ്യണമെന്ന് അറിയാതെ വിഷമിച്ച " +
				"നാവികർക്ക് ലഭിച്ച ദര്ശന പ്രകാരവും അന്ന് രാത്രി അർത്തുങ്കൽ പള്ളിവികാരിക്ക് ലഭിച്ച ദര്ശന പ്രകാരവും ആഴകടലിലെ കപ്പലിൽ" +
				"നിന്നും വിശുദ്ധന്റെ തിരുസ്വരൂപം 1647 ൽ ഇവിടെ സ്ഥാപിക്കാൻ ഇടയായത് മുതൽ മനശാന്തിയും രോഗശാന്തിയും തേടി നാനാജാതി" +
				"മതസ്ഥരായ ആയിരങ്ങൾ  എന്നേരവും അണയുന്ന പുണ്യ  സ്ഥാനമാണ് അർത്തുങ്കൽ വി.സെബസ്ത്യാനോസിന്റെ തിരുനട " +
				"ജാതിമതഭേദമില്ലതെ ജനലക്ഷങ്ങളുടെ ആശനിരാശകളും സുഖദുഖങ്ങളും പ്രാർത്ഥനമന്ത്രമായി" +
				"ഈശ്വര സന്നിധാനത്തിലേക്ക് ഉയരുന്ന നാളുകളാണ്  എല്ലാവർഷവും ജനുവരിയിലെ തിരുനാൾ ദിവസങ്ങൾ\n\n." +
				
				
				"അറബികടലിനും വേമ്പനാട്ടുകായലിനും ഇടയിൽ സ്ഥിതി ചെയ്യുന്ന ഇന്നത്തെ അർത്തുങ്കൽ പ്രദേശം " +
				"എ .ഡി . നാലാം നൂറ്റാണ്ടിൽ രൂപംകൊണ്ട കര പ്രദേശം ആണ്.ആറാം നൂറ്റാണ്ടോടുകൂടി ജനവാസ യോഗ്യമാ യതുമുതൽ ക്രൈസ്തവ" +
				"വിശ്വാസികൾ  കരപ്രദേശങ്ങളായ മനക്കൊടം, അർത്തുങ്കൽ, കാട്ടൂർ ,തുമ്പോളി ,പുറക്കാട് എന്നിവിടങ്ങളിൽ " +
				"ഉണ്ടായിരുന്നതായും ,ഇവർ കൊടുങ്ങല്ലൂരിൽ നിന്നും വന്നവരായി കരുതുന്നു .ഗ്രീക്ക് മെത്രന്മാരായ മാർ സപ്പേർ,മാർ പ്രോത്തു" +
				" എന്നിവർ മനക്കൊടത്തു കപ്പൽ വഴി എത്തുകയും "+
				"മനക്കൊടത്തു ഉണ്ടായിരുന്ന ക്രൈസ്തവരുടെ ഒപ്പം താമസിക്കുകയും മറ്റു സ്ഥലങ്ങളിൽ "+
				"ഉണ്ടായിരുന്ന ക്രൈസ്തവരെ സന്ദർശിച്ചിരുന്നതായും കരുതപെടുന്നു.\n\n" +
				"അർത്തുങ്കൽ പ്രദേശം മുത്തേടത്ത് രാജസ്താനമായതിനാൽ ഈ സ്ഥലം  മുത്തേടത്തിങ്കൽ എന്നും പിന്നീട് ഏടത്തിങ്കൽ എന്നും "+
                "പതിനാലാം നൂറ്റാണ്ടിൽ അർത്തുങ്കൽ എന്നും അറിയപ്പെടുവാൻ തുടങ്ങി ."+
                "പോർട്ട്ഗ്ഗിസുകാരുടെ വരവിന് മുന്പുതന്നെ ഉണ്ടായിരുന്ന  ഓലമേഞ്ഞ പള്ളി ഇന്നു കാണുന്ന പഴയ പള്ളിയായി മുത്തേടത്ത് രാജാവിന്റെ "+
                "അനുമതിയോടെ മാറ്റി സ്ഥാപിച്ചു.പള്ളിക്ക് വി.അന്ത്രയോസിന്റെ നാമം നല്കി.വിശുദ്ധന്‍റെ നാമത്തില്‍ മിഷന്‍ പ്രവര്‍ത്തനങ്ങള്‍ " +
                "ആരംഭിക്കുകയും ചെയ്തു." +
                "\n\nവിദേശ മിഷിണറിമാര്‍ ഇവിടെ താമസിക്കുകയും ക്രൈസ്ഥവ ജീവിതം കരുത്തുറ്റവയക്കുകയും  ചെയ്തു." +
                "തുടര്‍ന്ന് അര്‍ത്തുങ്കല്‍ പള്ളി ഇടവകയാക്കുകയും ആദ്യ വികാരിയായി ഗസ്പര്‍ പയസ് എന്ന വിദേശ മിഷിണറി നിയമിതനായി. " +
                "തുടര്‍ന്ന് വൈദീകനായ ജെക്കൊമോ ഫിനിഷ്യോ 1584 ല്‍ വികാരിയാകുകയും ഏതാണ്ട് 32 വര്‍ഷകാലം അര്‍ത്തുങ്കലില്‍ പ്രവര്‍ത്തിക്കുകയും" +
                " ചെയ്തു." +
                "അര്‍ത്തുങ്കലിന്‍റെ അപ്പോസ്തലന്‍ എന്ന് അറിയപ്പെട്ടിരുന്ന ഫിനിഷ്യോ അച്ഛനെ നാട്ടുകാര്‍ സ്നേഹപൂര്‍വ്വം വെളുത്തച്ചനെന്നു വിളിച്ചു തുടങ്ങി." +
                "കൂടാതെ അദ്ദേഹം എല്ലാ ജനവിഭാഗങ്ങളുമായും മൂത്തേടത്ത് രാജകുടുംബങ്ങളുമായും പ്രമാണികളുമായും നല്ല സുഹൃത്തുബന്ധത്തിലായിരുന്നു." +
                "ശ്രി. അയ്യപ്പന്‍ വെളുത്തച്ചന്‍ മുഖേന ചിരപ്പന്‍ചിറയില്‍ കളരിഗുരുക്കളുടെ ശിഷ്യത്വംസ്വീകരിക്കാന്‍ ഇടയായത് അവര്‍ തമ്മിലുള്ള   സുഹൃത്തുബന്ധം" +
                "സ്ഥാപിക്കുവനിടയായി . " +
                "കൂടാതെ പന്തളം രാജകുടുംബാംഗങ്ങളുമായി ബന്ധപ്പെടുവാനും ചിലപ്പോള്‍ ഇരുകൂട്ടരും" +
                " അതിഥികളായ് വസിക്കുവാനും ഇടയായി എന്ന് പറയപ്പെടുന്നു." +
                "പില്‍കാലങ്ങളില്‍ ദൈവനിശ്ചയ പ്രകാരം അയ്യപ്പന്‍ ശബരിമലയില്‍ കാനനവാസവും വെളുത്തച്ചന്‍ മൃത്യു വരിക്കുകയും ചെയ്തുവെങ്കിലും വിശുദ്ധ" +
                " സെബസ്ത്യാനോസിന്‍റെ തിരുസ്വരൂപം 1647 ല്‍ അര്‍ത്തുങ്കലില്‍ സ്ഥാപിച്ചപ്പോള്‍ ഈ രൂപത്തെ ജനങ്ങള്‍ വെളുത്തച്ചന്‍ " +
                "എന്ന് വിളിക്കുവാന്‍ ഇടയായി.ശബരിമല ശാസ്താവിനെ തൊഴുതു ഇറങ്ങുന്ന ഭക്ത്തര്‍ അര്‍ത്തുങ്കല്‍ വെളുത്തച്ചനെ" +
                " കാണുകയും. അയ്യപ്പഭക്ത്തര്‍ വൃതം അവസാനിപ്പിച്ചുകൊണ്ട്" +
                " വെളുത്തച്ചന്റെ തിരുനടയില്‍ മാലയുരുന്ന പതിവ് ഇന്നും തുടരുന്നു. " +
                "ആയപ്പന്‍റെ അസ്ഥാനമായ ശബരിമല ഓരോ വര്‍ഷവും പ്രശസ്തിയിലേക്ക് ഉയരുന്നതും." +
                "അര്‍ത്തുങ്കല്‍ വെളുത്തച്ചന്‍റെ ദേവാലയം  ബസിലിക്ക പദവിയിലേക്ക് ഉയര്‍ത്തിയത്‌ കൊണ്ട്  ആഗോള" +
                " പ്രശസ്തിനേടിയതും ദൈവനിയോഗമെന്നു കരുതപ്പെടുന്നു." +
                "വിശുദ്ധ  സെബസ്ത്യാനോസിനോടുള്ള ഭക്ത്യാദരവുകള്‍ വിശുദ്ധന്‍റെ തിരുസ്വരൂപംപ്രതിഷ്ഠിച്ച 1647 മുതല്‍ വളരെ പ്രശസ്തി " +
                "നേടുകയും ജനുവരിയിലെ തിരുനാള്‍ മകരം പെരുന്നാള്‍ എന്നറിയപ്പെടുകയും ചെയ്തു."+
                "രാജ്യത്തെ നാനാഭാഗങ്ങളില്‍ നിന്നും ജനലക്ഷങ്ങള്‍ ദര്‍ശന പുണ്യം തേടിവരുന്നു." +
                "1829-31 കാലഘട്ടങ്ങളില്‍ മലബാര്‍ വികാരിയത്തിന്‍റെ അധിപനായിരുന്ന മെത്രാന്‍ മൌറെലിയോസ് " +
                " അര്‍ത്തുങ്കലില്‍ താമസിച്ചിരുന്നതുകൊകൊണ്ടും മലബാര്‍ " +
                "വികാരിയത്തിനന്‍റെ ആസ്ഥാനം അര്‍ത്തുങ്കലയതുകൊണ്ടുംചാവറ ഏലിയാസച്ചന്‍ അര്‍ത്തുങ്കല്‍ " +
                "പൗരാണിക  ദേവാലയത്തില്‍ വച്ച് 1929 നവബര്‍ 29 ന് വൈദീക പട്ടം സ്വീകരികുകയും  ഏതാനം" +
                "മാസം  ഇവിടെ താമസിക്കുകയും" +
                " ചെയ്തതിനാല്‍ പുണ്യഭൂമിയായ  അര്‍ത്തുങ്കല്‍ മഹത്വം വിസ്ത്രിതമാതമാകുന്നു ." +
                
                
                "\n\nഇന്ന്‍ ആലപ്പുഴ നഗരവസകള്‍ക്ക്, ഗ്രാമവാസികള്‍ക്ക് ഒരുപോലെ ആശ്വസാവു അനുഗ്രഹവും ചൊരിഞ്ഞു കൊണ്ടിരിക്കുന്ന" +
                " ദൈവദാസന്‍ മോണ. റെനോളഡ്സ് പുരയ്ക്കല്‍ ജ്ഞാനസ്നാപ്പെട്ടത്‌  " +
                "സ്വന്തം ഇടവകയായ അര്‍ത്തുങ്കല്‍ ദൈവാലയത്തില്‍  വച്ചായിരുന്നു." +
                "മുന്‍ വികാരിയും  വിസിറ്റേന്‍ സഭയുടെ  സ്ഥാപകനുമായ ദൈവദാസന്‍ സെബാസ്റ്റിൻ  പ്രസന്റേഷന്‍ അച്ഛന്‍" +
                "ജനിച്ചതും ജ്ഞാനസ്നാനപ്പെട്ടതും" +
                " മരിച്ചു"+
                "അടകം ചെയ്യപ്പെട്ടതും ഇവിടെ തന്നെ ആകയാല്‍ അര്‍ത്തുങ്കല്‍ ദേവാലയം  ഇത്രയേറെ മഹത്മക്കളുമായ്  " +
                " ബന്ധപ്പെട്ടു    നില്ക്കുന്ന ലോകത്തിലെ ആദ്യ ദേവാലയമായിരിക്കും ."+
                "കൂടാതെ ആലപ്പുഴ  രൂപതയുടെ  പ്രഥമ മെത്രാന്‍ മൈക്കിള്‍ ആറാട്ടുകുളത്തിന്‍റെയും മൂന്നാമത്തെ " +
                "മെത്രാന്‍ സ്റ്റീഫന്‍ അത്തിപോഴിയുടെയും " +
                "മാതൃക ഇടവകയാണ്  അര്‍ത്തുങ്കല്‍. " +
                "\n\nകൂടാതെ അനേകം പ്രഗല്‍ഭരായ വൈദീകരുടെയും സന്യസ്തരും അല്മായരും " +
                "ഈ ഇടവകയില്‍ നിന്നും ലോകത്തിന്‍റെ വിവിധയിടങ്ങളില്‍  ക്രിസ്തുരാജ്യം വിസതൃതമാക്കുന്നു." +
                "ഈ ചരിത്ര-വിശുദ്ധ പ്രാധാന്യമാണ് അര്‍ത്തുങ്കല്‍ ബസലിക്കയെ ലോകത്തിലെ മറ്റെല്ലാ ബസലിക്കകളില്‍ നിന്നും വ്യത്യാസ്തമാക്കുന്നത്."

                
 
                
                
				
				);
		tv.setTypeface(typeFace);
		name.setTypeface(typeFace);
	
	    // TODO Auto-generated method stub
	}



}
