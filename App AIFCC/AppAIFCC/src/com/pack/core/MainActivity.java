package com.pack.core;

import java.util.zip.Inflater;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ViewFlipper;

import com.pack.controleur.EcouteurPageAdaptateur;
import com.pack.gen.R;

public class MainActivity extends FragmentActivity implements
		ActionBar.TabListener {
	
	//TODO 
	private ViewPager viewPager;
	private EcouteurPageAdaptateur mAdapter;
	private ActionBar actionBar;
	// Tableau des titres du menu
	private String[] tabs = { "AIFCC", "Formation", "Financements", "Taxe d'apprentisage", "Espace privée", "Contact" };
	private String[] tabsTitre = { "Présentation", "Préparez votre avenir", "Les Financements", "La taxe d’apprentissage", "Accedes à l'Intranet", "Demandes de Renseignements" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// INITIALISATION
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		mAdapter = new EcouteurPageAdaptateur(getSupportFragmentManager());
		
		
		
		viewPager.setAdapter(mAdapter);
		// ne le veux pas pourquoi ?
	    //actionBar.setHomeButtonEnabled(false);
		//actionBar.setDisplayHomeAsUpEnabled(true);
		
		
		/* COMENTAIRE
		 * NAVIGATION_MODE_LIST : pas de menu
		 * NAVIGATION_MODE_TABS : En forme de tab pour les TEST TODO
		 */
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		
		
		// Ajout le tableau des Titres
		for (String tab_name : tabs) {
			
			//PAS BON POUR LES TITRE SUR UN : NAVIGATION_MODE_LIST
			//actionBar.setTitle(actionBar.newTab().setText(tab_name).setTabListener(this).toString());
		
			//REMETRE TODO
			//Sur la action bar on ajoute les onglet est leurs titres avec un listener
			actionBar.addTab(actionBar.newTab().setText(tab_name).setTabListener(this));
			
			
		}
		//A L'initialisation on ajoute le titre du premier TB
		actionBar.setTitle(tabsTitre[0]);
		/**
		 * Ecouteur de selection des differents onglets
		 * */
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			//TABLEAU DES TITRES
			@Override
			public void onPageSelected(int position) {
				// dans le changement de la page on respect la selection de la table
				actionBar.setSelectedNavigationItem(position);
				actionBar.setTitle(tabsTitre[position]);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
		
		
		//**************** CODE DE TXT *********************

		
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		//sur la selection de la table on montre (show) le frament view respecter
		viewPager.setCurrentItem(tab.getPosition());
	
		
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}
	
	/**
	 * A la creation de l'action bar on charge son frament
	 * @author dark_d0g
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.activity_main_actions, menu);
	    return super.onCreateOptionsMenu(menu);
	}
}
