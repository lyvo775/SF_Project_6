package com.l2team.sf_project_6;

import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.IOException;

import static android.app.Activity.RESULT_OK;


public class ClosetFragment extends Fragment {

    private static final int PICK_IMAGE = 100;

    // define FAB

    FloatingActionButton fab_add, fab_camera, fab_image;
    Animation FabOpen, FabClose, FabRclockwise, FabRanticlockwise;
    boolean isOpen = false;

    ImageView iview;
    // define CardView

    private CardView topsCard, bottomsCard, shoesCard;

    Uri imageuri;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_closet, container, false);


        iview = (ImageView)v.findViewById(R.id.imageview);
        // call FAB

        fab_add = (FloatingActionButton)v.findViewById(R.id.fab_add);



        // open fab_add

        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeFragment();

            }
        });

        // open camera from fab_camera

        // call CardView



        topsCard = (CardView)v.findViewById(R.id.tops_card);


        return v;

    }


        // change fragment

        private void changeFragment(){
        getFragmentManager().beginTransaction().replace(R.id.fragment_container, new EditViewImage()).addToBackStack(null).commit();
    }

}
