package com.tutos;

import java.util.List;
import java.util.Vector;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class FragmentsSliderActivity extends FragmentActivity {

	private PagerAdapter mPagerAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.viewpager);

		// Création de la liste de Fragments que fera défiler le PagerAdapter
		List<Fragment> fragments = new Vector<Fragment>();

		// Ajout des Fragments dans la liste
		fragments.add(Fragment.instantiate(this,PageGaucheFragment.class.getName()));
		fragments.add(Fragment.instantiate(this,PageMilieuFragment.class.getName()));
		fragments.add(Fragment.instantiate(this,PageDroiteFragment.class.getName()));

		// Création de l'adapter qui s'occupera de l'affichage de la liste de
		// Fragments
		this.mPagerAdapter = new MyPagerAdapter(super.getSupportFragmentManager(), fragments);

		ViewPager pager = (ViewPager) super.findViewById(R.id.viewpager);
		// Affectation de l'adapter au ViewPager
		pager.setAdapter(this.mPagerAdapter);
	}
}