package aj.aj;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class InternetActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
               
        Button b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				 Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://results.vtu.ac.in/"));
			        startActivity(browserIntent);; 
			System.exit(0);
				
			}
		});
        
    }
}