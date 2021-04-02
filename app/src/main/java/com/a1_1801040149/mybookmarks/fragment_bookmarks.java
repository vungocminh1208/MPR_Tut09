package com.a1_1801040149.mybookmarks;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class fragment_bookmarks extends Fragment implements View.OnClickListener {
    private View zingmp3, baomoi, medium, vnExpress, blueZone;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bookmarks, container, false);

        zingmp3 = v.findViewById(R.id.zingmp3);
        baomoi = v.findViewById(R.id.baomoi);
        medium = v.findViewById(R.id.medium);
        vnExpress = v.findViewById(R.id.vnExpress);
        blueZone = v.findViewById(R.id.blueZone);

        zingmp3.setOnClickListener(this);
        baomoi.setOnClickListener(this);
        medium.setOnClickListener(this);
        vnExpress.setOnClickListener(this);
        blueZone.setOnClickListener(this);


        return v;
    }

    @Override
    public void onClick(View v) {
        FragmentManager manager = getFragmentManager();
        Fragment fragment = new fragment_webView();
        Bundle bundle = new Bundle();
        switch(v.getId()) {
            case R.id.zingmp3:
                bundle.putString("URL","https://zingmp3.vn/");
                fragment.setArguments(bundle);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer, fragment)
                        .addToBackStack("Zing MP3")
                        .commit();
                break;
            case R.id.baomoi:
                bundle.putString("URL","https://baomoi.com/");
                fragment.setArguments(bundle);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer,fragment)
                        .addToBackStack("Bao Moi")
                        .commit();
                break;
            case R.id.medium:
                bundle.putString("URL","https://medium.com/");
                fragment.setArguments(bundle);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer,fragment)
                        .addToBackStack("Medium")
                        .commit();
                break;
            case R.id.vnExpress:
                bundle.putString("URL","https://vnexpress.net/");
                fragment.setArguments(bundle);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer,fragment)
                        .addToBackStack("VnExpress")
                        .commit();
                break;
            case R.id.blueZone:
                bundle.putString("URL","https://bluezone.gov.vn/");
                fragment.setArguments(bundle);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer,fragment)
                        .addToBackStack("BlueZone")
                        .commit();
                break;
        }
    }
}