package com.pack.vue;

import com.pack.gen.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @description Charge le frament de la vue AIFCC (XML res/layout/aifcc.xml)
 *  
 * @author dark_d0g
 * @return View
 */
public class EspacePriveeFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		//Charge le framen XML de la vue de AIFCC
		View rootView = inflater.inflate(R.layout.espace_privee, container,
				false);

		return rootView;
	}
}
