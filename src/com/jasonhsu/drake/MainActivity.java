package com.jasonhsu.drake;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager.LayoutParams;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	// Initialize the variables representing the values submitted
	private EditText get_numstars;
	private EditText get_spectral;
	private EditText get_ghz;
	private EditText get_age;
	private EditText get_planets;
	private EditText get_habitable;
	private EditText get_life;
	private EditText get_complex;
	private EditText get_intelligent;
	private EditText get_communication;
	private EditText get_survive;
	
	// CLICK ON "More Details" BUTTON FOR MORE INFO
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // ================
        // The About button
        final Button ButtonAbout = (Button)findViewById(R.id.button_about);
        ButtonAbout.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater AboutInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupAbout = AboutInflater.inflate(R.layout.about, null);
        		final PopupWindow Popup = new PopupWindow(PopupAbout, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupAbout.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
			
        	
        });
        
        // =============================================
        // The button for details on the number of stars
        final Button ButtonNumstars = (Button)findViewById(R.id.button_numstars);
        ButtonNumstars.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater NumStarsInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupNumstars = NumStarsInflater.inflate(R.layout.factor_numstars, null);
        		final PopupWindow Popup = new PopupWindow(PopupNumstars, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupNumstars.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
			
        	
        });

        // ========================================
        // The button for details on spectral types
        final Button ButtonSpectral = (Button)findViewById(R.id.button_spectral);
        ButtonSpectral.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater SpectralInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupSpectral = SpectralInflater.inflate(R.layout.factor_spectral, null);
        		final PopupWindow Popup = new PopupWindow(PopupSpectral, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupSpectral.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
			
        	
        });
        
        // =====================================================
        // The button for details on the Galactic Habitable Zone
        final Button ButtonGhz = (Button)findViewById(R.id.button_ghz);
        ButtonGhz.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater GhzInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupGhz = GhzInflater.inflate(R.layout.factor_ghz, null);
        		final PopupWindow Popup = new PopupWindow(PopupGhz, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupGhz.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
        	
        });
        
        // ===========================================
        // The button for details on the ages of stars
        final Button ButtonAge = (Button)findViewById(R.id.button_age);
        ButtonAge.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater AgeInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupAge = AgeInflater.inflate(R.layout.factor_age, null);
        		final PopupWindow Popup = new PopupWindow(PopupAge, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupAge.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
			
        	
        });
        
        // =================================================
        // The button for details on the presence of planets
        final Button ButtonPlanets = (Button)findViewById(R.id.button_planets);
        ButtonPlanets.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater PlanetsInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupPlanets = PlanetsInflater.inflate(R.layout.factor_planets, null);
        		final PopupWindow Popup = new PopupWindow(PopupPlanets, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupPlanets.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
			
        	
        });

        // ===========================================
        // The button for details on habitable planets
        final Button ButtonHabitable = (Button)findViewById(R.id.button_habitable);
        ButtonHabitable.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater HabitableInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupHabitable = HabitableInflater.inflate(R.layout.factor_habitable, null);
        		final PopupWindow Popup = new PopupWindow(PopupHabitable, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupHabitable.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
			
        	
        });

        // ==============================
        // The button for details on life
        final Button ButtonLife = (Button)findViewById(R.id.button_life);
        ButtonLife.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater LifeInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupLife = LifeInflater.inflate(R.layout.factor_life, null);
        		final PopupWindow Popup = new PopupWindow(PopupLife, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupLife.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
			
        	
        });

        // ======================================
        // The button for details on complex life
        final Button ButtonComplex = (Button)findViewById(R.id.button_complex);
        ButtonComplex.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater ComplexInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupComplex = ComplexInflater.inflate(R.layout.factor_complex, null);
        		final PopupWindow Popup = new PopupWindow(PopupComplex, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupComplex.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
			
        	
        });        
        
        // ==========================================
        // The button for details on intelligent life
        final Button ButtonIntelligent = (Button)findViewById(R.id.button_intelligent);
        ButtonIntelligent.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater IntelligentInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupIntelligent = IntelligentInflater.inflate(R.layout.factor_intelligent, null);
        		final PopupWindow Popup = new PopupWindow(PopupIntelligent, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupIntelligent.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
			
        	
        });
        
        // =======================================
        // The button for details on communication
        final Button ButtonCommunication = (Button)findViewById(R.id.button_communication);
        ButtonCommunication.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater CommunicationInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupCommunication = CommunicationInflater.inflate(R.layout.factor_communication, null);
        		final PopupWindow Popup = new PopupWindow(PopupCommunication, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupCommunication.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
			
        	
        });            

        // ==================================
        // The button for details on survival
        final Button ButtonSurvive = (Button)findViewById(R.id.button_survive);
        ButtonSurvive.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater SurviveInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupSurvive = SurviveInflater.inflate(R.layout.factor_survive, null);
        		final PopupWindow Popup = new PopupWindow(PopupSurvive, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		Button ButtonDismiss = (Button)PopupSurvive.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 90);
			}
			
        	
        });          
        
        // Get the submitted information
        get_numstars = (EditText) findViewById(R.id.EnterNumstars);
        get_spectral = (EditText) findViewById(R.id.EnterSpectral);
        get_ghz = (EditText) findViewById(R.id.EnterGhz);
        get_age = (EditText) findViewById(R.id.EnterAge);
        get_planets = (EditText) findViewById(R.id.EnterPlanets);
        get_habitable = (EditText) findViewById(R.id.EnterHabitable);
        get_life = (EditText) findViewById(R.id.EnterLife);
        get_complex = (EditText) findViewById(R.id.EnterComplex);
        get_intelligent = (EditText) findViewById(R.id.EnterIntelligent);
        get_communication = (EditText) findViewById(R.id.EnterCommunication);
        get_survive = (EditText) findViewById(R.id.EnterSurvive);
        
    	// CLICK ON THE SUBMIT BUTTON FOR RESULTS
        final Button ButtonSubmit = (Button)findViewById(R.id.button_submit);
        ButtonSubmit.setOnClickListener(new Button.OnClickListener() 
        {

			@Override
			public void onClick(View v) {
				float Ns = Float.parseFloat(get_numstars.getText().toString());
		    	float fs = Float.parseFloat(get_spectral.getText().toString());
		    	float fg = Float.parseFloat(get_ghz.getText().toString());
		    	float fa = Float.parseFloat(get_age.getText().toString());
		    	float fp = Float.parseFloat(get_planets.getText().toString());
		    	float ne = Float.parseFloat(get_habitable.getText().toString());
		    	float fl = Float.parseFloat(get_life.getText().toString());
		    	float fx = Float.parseFloat(get_complex.getText().toString());
		    	float fi = Float.parseFloat(get_intelligent.getText().toString());
		    	float fc = Float.parseFloat(get_communication.getText().toString());
		    	float fL = Float.parseFloat(get_survive.getText().toString());
		    	float N = Ns * (1000*1000*1000) * fs * fg * fa * fp * ne * fl * fx * fi * fc * fL;
		    	int N_int = (int)N;
		    	double pi = Math.PI;
		    	// Volume of Galactic Habitable Zone:
		    	// 1000 light years thick
		    	// Outer radius: 50,000 light years
		    	// Inner radius: 20,000 light years
		    	double vol_ghz = (pi*(50*1000)*(50*1000) - pi*(20*1000)*(20*1000))*1000;
		    	double vol_per = vol_ghz / N_int; // Volume of space per civilization
		    	double dist = Math.cbrt (vol_per);
		    	
		    	NumberFormat formatter = new DecimalFormat("###,###,###");
		    	String N_str = formatter.format(N_int);
		    	String d_str = formatter.format(dist);
		    	
		    	String result;
		        result = "Number of civilizations in the galaxy: " + N_str;
		        result = result + "\nExpected average distance between civilizations: ";
		        result = result + d_str + " light years";
		        
		        if (fs > 1) {
		        	result = "The fraction of stars of that are of the correct spectral type";
		        	result = result + " cannot be greater than 1.";
		        }
		        else if (fg > 1) {
		        	result = "The fraction of stars of that are in the Galactic Habitable Zone";
		        	result = result + " cannot be greater than 1.";
		        }
		        else if (fa > 1) {
		        	result = "The fraction of stars of that are old enough";
		        	result = result + " cannot be greater than 1.";
		        }
		        else if (fp > 1) {
		        	result = "The fraction of stars of that have planets";
		        	result = result + " cannot be greater than 1.";
		        }
		        else if (fl >1) {
		        	result = "The fraction of habitable planets with life";
		        	result = result + " cannot be greater than 1.";
		        }
		        else if (fx >1) {
		        	result = "The fraction of planets with life that has become complex";
		        	result = result + " cannot be greater than 1.";
		        }
		        else if (fi >1) {
		        	result = "The fraction of planets with complex life that has become intelligent";
		        	result = result + " cannot be greater than 1.";
		        }
		        else if (fc >1) {
		        	result = "The fraction of planets with intelligent life that has interstellar communication ability";
		        	result = result + " cannot be greater than 1.";
		        }
		        else if (fL >1) {
		        	result = "The fraction of civilizations that are still alive and still capable of interstellar communications";
		        	result = result + " cannot be greater than 1.";
		        }




		        // Open a popup window
				LayoutInflater SurviveInflater  = (LayoutInflater)getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        		View PopupSurvive = SurviveInflater.inflate(R.layout.result_window, null);
        		final PopupWindow Popup = new PopupWindow(PopupSurvive, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        		
        		// Display the results in the popup window
            	((TextView)Popup.getContentView().findViewById(R.id.TextResult)).setText(result);
        		
        		Button ButtonDismiss = (Button)PopupSurvive.findViewById(R.id.button_dismiss);
        		ButtonDismiss.setOnClickListener(new Button.OnClickListener(){

					//@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Popup.dismiss();
					}
        			
        		});
        		Popup.showAsDropDown(ButtonDismiss, 50, 200);
			}
			
        	
        });          
        
	}

    
}