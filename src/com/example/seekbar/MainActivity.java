package com.example.seekbar;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

	//Defining the seekbar
	SeekBar sb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Refer the seekbar from xml with their id
		sb = (SeekBar)findViewById(R.id.seekBar1);
		
		//using on seekbarchange listener
		sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener()
		{
			
		    //setting intial progress as 0
	            int currentprogress = 0;
	 
	            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
	             //public abstract void onProgressChanged (SeekBar seekBar, int progress, boolean fromUser) 
	            {
		        /**
	                Parameters
	                seekBar  The SeekBar whose progress has changed 
	                progress  The current progress level. This will be in the range 0..max where max was set by setMax(int). (The default value for max is 100.) 
	                fromUser  True if the progress change was initiated by the user.  
	                **/
	                currentprogress = progress;
	            }
	 
	            public void onStartTrackingTouch(SeekBar seekBar)
	            {
	                // TODO Auto-generated method stub
	            }
	 
	            public void onStopTrackingTouch(SeekBar seekBar) 
	            {										//Add +"%" to get the progress value in percentage 									//Add +"%" to get the progress value in percentage 
	            	/**Toast.makeText(MainActivity.this,"Seek bar progress: "+currentprogress+"%",Toast.LENGTH_SHORT).show();**/
	                Toast.makeText(MainActivity.this,"Seek bar progress: "+currentprogress,Toast.LENGTH_SHORT).show();
	                       
	            }
        });
	}
}
