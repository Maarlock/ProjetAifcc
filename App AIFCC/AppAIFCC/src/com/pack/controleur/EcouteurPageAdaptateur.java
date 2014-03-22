package com.pack.controleur;

import com.pack.vue.AifccFragment;
import com.pack.vue.ContactFragment;
import com.pack.vue.EspacePriveeFragment;
import com.pack.vue.FormationFragment;
import com.pack.vue.FinancementsFragment;
import com.pack.vue.TaxeApprentissageFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class EcouteurPageAdaptateur extends FragmentPagerAdapter {

	public EcouteurPageAdaptateur(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {
		//"AIFCC", "Formation", "Financements", "Taxe d'apprentisage", "Espace privée", "Contact"
		switch (index) {
		case 0:
			// AIFCC activity
			return new AifccFragment();
		case 1:
			// Formation activity
			return new FormationFragment();
		case 2:
			// Financement activity
			return new FinancementsFragment();
		case 3:
			// TaxeApprentissage activity
			return new TaxeApprentissageFragment();
		case 4:
			// Espace privée activity
			return new EspacePriveeFragment();
		case 5:
			// Contact activity
			return new ContactFragment();
		}
		

		return null;
	}

	@Override
	public int getCount() {
		//Obtenir le nombre item - egal au nombre du tableau dans la mainActivity
		return 6;
	}

}
