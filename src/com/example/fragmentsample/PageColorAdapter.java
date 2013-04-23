package com.example.fragmentsample;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.util.SparseArrayCompat;

public class PageColorAdapter extends FragmentPagerAdapter {

	/** 色情報リスト. */
	private ArrayList<SparseArrayCompat<String>> mList;

	public PageColorAdapter(FragmentManager fm) {
		super(fm);
		mList = new ArrayList<SparseArrayCompat<String>>();
	}

	@Override
	public Fragment getItem(int position) {

		// 対象ページの色情報を取得
		SparseArrayCompat<String> item = mList.get(position);

		// 色情報を Bundle にする
		Bundle bundle = new Bundle();
		bundle.putInt("page", position);
		bundle.putString("color", item.get(0));
//		bundle.putString("name", item.get(1));
//		bundle.putString("description", item.get(2));

		// Fragment をつくり Bundle をセットする
		PageColorFragment frag = new PageColorFragment();
		frag.setArguments(bundle);

		return frag;
	}

	@Override
	public int getCount() {
		return mList.size();
	}

	public void add(SparseArrayCompat<String> item) {
		mList.add(item);
	}

	public void addAll(ArrayList<SparseArrayCompat<String>> list) {
		mList.addAll(list);
	}

}
