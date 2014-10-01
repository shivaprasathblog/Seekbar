package com.example.seekbar;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

	SeekBar sb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sb = (SeekBar)findViewById(R.id.seekBar1);
		sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener()
		{
            int currentprogress = 0;
 
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                currentprogress = progress;
            }
 
            public void onStartTrackingTouch(SeekBar seekBar)
            {
                // TODO Auto-generated method stub
            }
 
            public void onStopTrackingTouch(SeekBar seekBar) 
            {																			//Add +"%" to get the progress value in percentage 
            	/**Toast.makeText(MainActivity.this,"Seek bar progress: "+currentprogress+"%",Toast.LENGTH_SHORT).show();**/
                Toast.makeText(MainActivity.this,"Seek bar progress: "+currentprogress,Toast.LENGTH_SHORT).show();
                       
            }
        });
	}
}
