package com.myappcompany.nira.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Main logic for buttons 
    public void phrases(View view){


        switch (view.getId()) {

            case R.id.button1:
                MediaPlayer hello = MediaPlayer.create(this, R.raw.hello);
                hello.start();
                break;

            case R.id.button2:
                MediaPlayer how_are_you = MediaPlayer.create(this, R.raw.how_are_u);
                how_are_you.start();
                break;
            case R.id.button3:
                MediaPlayer im_tired = MediaPlayer.create(this, R.raw.im_tired);
                im_tired.start();
                break;

            case R.id.button4:
                MediaPlayer very_good = MediaPlayer.create(this, R.raw.very_good);
                very_good.start();
                break;
            case R.id.button5:
                MediaPlayer thanks = MediaPlayer.create(this, R.raw.thanks);
                thanks.start();
                break;

            case R.id.button6:
                MediaPlayer your_welcome = MediaPlayer.create(this, R.raw.your_welcome);
                your_welcome.start();
                break;
            case R.id.button7:
                MediaPlayer congratulations = MediaPlayer.create(this, R.raw.congratulations);
                congratulations.start();
                break;

            case R.id.button8:
                MediaPlayer see_you_tomorrow = MediaPlayer.create(this, R.raw.see_you_tomorrow);
                see_you_tomorrow.start();
                break;

            default:
                break;
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
