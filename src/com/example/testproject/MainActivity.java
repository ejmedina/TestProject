package com.example.testproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Button btn = (Button)findViewById(R.id.alq_btn);
        btn.setBackgroundResource(R.drawable.home_btn_alquilar_selected);
        btn.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				v.setBackgroundResource(R.drawable.home_btn_alquilar_pressed);
				return false;
			}
		});
        btn = (Button)findViewById(R.id.cmp_btn);
        btn.setBackgroundResource(R.drawable.home_btn_comprar);
        btn.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				v.setBackgroundResource(R.drawable.home_btn_comprar_pressed);
				return false;
			}
		});
        
        btn = (Button)findViewById(R.id.alq_tmp_btn);
        btn.setBackgroundResource(R.drawable.home_btn_alquilertemporal);
        btn.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				v.setBackgroundResource(R.drawable.home_btn_alquilertemporal_pressed);
				return false;
			}
		});

	}
	public void onOperationTypeClick(View v){
    	Button button = (Button) v;
    	Button compra = (Button) findViewById(R.id.cmp_btn);
    	Button alquiler = (Button) findViewById(R.id.alq_btn);
    	Button alquilerTemp = (Button) findViewById(R.id.alq_tmp_btn);
    	
    	if("Alquiler".equals(button.getText())){
//    		searchUrlParameters.put("operation_id", 1);
    		alquiler.setBackgroundResource(R.drawable.home_btn_alquilar_selected);
    		compra.setBackgroundResource(R.drawable.home_btn_comprar);
    		alquilerTemp.setBackgroundResource(R.drawable.home_btn_alquilertemporal);
    	}else if("Comprar".equals(button.getText())){
//    		searchUrlParameters.put("operation_id", 2);
    		alquiler.setBackgroundResource(R.drawable.home_btn_alquilar);
    		compra.setBackgroundResource(R.drawable.home_btn_comprar_selected);
    		alquilerTemp.setBackgroundResource(R.drawable.home_btn_alquilertemporal);
    	}else{
//    		searchUrlParameters.put("operation_id", 4);
    		alquiler.setBackgroundResource(R.drawable.home_btn_alquilar);
    		compra.setBackgroundResource(R.drawable.home_btn_comprar);
    		alquilerTemp.setBackgroundResource(R.drawable.home_btn_alquilertemporal_selected);
    	}
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
