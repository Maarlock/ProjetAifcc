package com.pack.vue;

import com.pack.gen.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

/**
 * @description Charge le frament de la vue AIFCC (XML res/layout/aifcc.xml)
 *  
 * @author dark_d0g
 * @return View
 */
public class AifccFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		//Charge le framen XML de la vue de AIFCC
		
		View rootView = (View) inflater.inflate(R.layout.aifcc, container,false);
		rootView.setId(10000);
		
//CLASS AVEC CONSTANTE
//CREER UN ID ET EST UN CLASS QUI POINTE ON FAIT APPELLE ET APRES METHODE
		
		//View rootView = inflater.inflate(R.layout.aifcc, container,false);
		
		return rootView;
	}
		
	
}
