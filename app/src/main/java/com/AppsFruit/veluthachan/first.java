package com.AppsFruit.veluthachan;








import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class first extends Activity {
	
	 ListView list;
	  String[] web = {
			  " അർത്തു ങ്കൽ  പള്ളി ചരിത്രം",
			  "വി.സെബസ്ത്യാനോസിന്റെ നൊവേന",
             " അർത്തു ങ്കൽ  ബസിലിക്ക ",
             "മകരം  തിരുനാൾ  ജനുവരി 2016",
             " അർത്തു ങ്കൽ ദേശം",
            
             
             
	     
	  } ;
	  Integer[] imageId = {
	      R.drawable.ic_history,
	      R.drawable.ic_novena,
	      R.drawable.ic_bascilica,
	      R.drawable.ic_notice,
	      R.drawable.ic_map,
	     
	  };
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    super.setContentView(R.layout.activity_main);
	    
	    CustomList adapter = new
	            CustomList(first.this, web, imageId);
	        list=(ListView)findViewById(R.id.list);
	            list.setAdapter(adapter);
	                     
	            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

	                @Override
	                public void onItemClick(AdapterView parent, View view,
	                                        int position, long id) {
	                    if (position == 0)
	                    {
	                        Intent myIntent = new Intent(first.this, history1.class);
	                        startActivity(myIntent);
	                    }
	                    

	                    if (position == 1)
	                    {
	                        Intent myIntent1 = new Intent(first.this, novena.class);
	                        startActivity(myIntent1);
	                    }
	                    
	                    if (position == 2)
	                    {
	                        Intent myIntent2 = new Intent(first.this, basilica.class);
	                        startActivity(myIntent2);
	                    }
	                    
	                    if (position == 3)
	                    {
	                        Intent myIntent3 = new Intent(first.this, feast2015.class);
	                        startActivity(myIntent3);
	                    }
	                    
	                    if (position == 4)
	                    {
	                        Intent myIntent4 = new Intent(first.this, mapakl.class);
	                        startActivity(myIntent4);
	                    }
	                }
	            });
	            
	    
	    
	}
	

}


