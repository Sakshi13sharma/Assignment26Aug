package com.example.a1694676.jasleen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {
    ViewGroup myContainer;
    boolean visibility=false;
    ImageView image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        myContainer=(ViewGroup) findViewById(R.id.AnimationCreation);

image1=(ImageView)findViewById(R.id.image);
    }
    public void showImage(View v)
    {
        TransitionManager.beginDelayedTransition(myContainer);
        visibility=!visibility;
        image1.setVisibility(visibility? View.VISIBLE:View.INVISIBLE);
        ((ViewGroup.MarginLayoutParams)image1.getLayoutParams()).topMargin += 10;
        image1.requestLayout();
        TranslateAnimation animation = new TranslateAnimation(0, 0, 0, 1000);
        animation.setDuration(1000);
        animation.setFillAfter(true);
        animation.setAnimationListener(new MyAnimationListener());

        image1.startAnimation(animation);
    }
    private class MyAnimationListener implements Animation.AnimationListener {

        @Override
        public void onAnimationEnd(Animation animation) {
           // image1.clearAnimation();
         //   ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(image1.getWidth(), image1.getHeight());
         //   lp.setMargins(50, 100, 0, 0);
          //  image1.setLayoutParams(lp);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {
        }

        @Override
        public void onAnimationStart(Animation animation) {
        }

    }
}
