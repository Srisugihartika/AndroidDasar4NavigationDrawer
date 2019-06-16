package com.sshartika.punya_atik.androiddasar4navigationdrawer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private View view;

    public HomeFragment(){

    }

    ImageView ivlogo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ivlogo = view.findViewById(R.id.iv_logo);

        ivlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Tes Toast", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    // 1.membuat variabel view (ctrl+alt+v)
    // 2. context di fragment menggunakan getActivity()


}
