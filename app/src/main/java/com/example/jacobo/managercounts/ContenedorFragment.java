package com.example.jacobo.managercounts;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Context.MODE_PRIVATE;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContenedorFragment extends Fragment {

    TextView textview;
    ImageView imageview;


    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    int a= 0;

    public ContenedorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_contenedor, container, false);

        prefs = this.getActivity().getSharedPreferences("MisPreferencias",MODE_PRIVATE);
        editor = prefs.edit();

        textview = (TextView) view.findViewById(R.id.TextPrueba);
        imageview = (ImageView) view.findViewById(R.id.ImagenPrueba);

        textview.setText(prefs.getString("Texto","Nada"));
        imageview.setImageResource(prefs.getInt("Imagen",9));

        return view;
    }

}
