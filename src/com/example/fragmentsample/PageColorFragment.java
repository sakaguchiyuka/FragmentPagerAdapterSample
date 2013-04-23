package com.example.fragmentsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageColorFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// データを取得
		Bundle bundle = getArguments();
		// int page = bundle.getInt("page");
		String color = bundle.getString("color");
		// String name = bundle.getString("name");
		// String description = bundle.getString("description");

		// View をつくる
		View layout = inflater.inflate(R.layout.fragment_layout, container,
				false);
		layout.setBackgroundColor(Color.parseColor(color));

		// 色コード
		TextView colorView = (TextView) layout.findViewById(R.id.color_text);
		colorView.setText(color);

		return layout;
	}
}
