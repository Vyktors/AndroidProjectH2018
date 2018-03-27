package dicj.info.androidtiles;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables
    MediaPlayer mediaPlayer;
    TextView tv;
    private static final String TAG =  "MonActivite";
    int length ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //MediaPlayer
        mediaPlayer = MediaPlayer.create(this, R.raw.songs);
        mediaPlayer.setLooping(true);


        //Se produit quand on click sur le btn Jouer
        //Redirige l'application vers l'activité de jeu
        final Button btnJouer = (Button) findViewById(R.id.btn_jouer);
        btnJouer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.i(TAG, "click btnJouer");
                //Codes

                Intent intent = new Intent(MainActivity.this, gameMain.class);
                startActivity(intent);
            }
        });

        //Se produit quand on click sur le btn Paramètre
        //Redirige l'application vers l'autre activité paramètre
        final Button btnParam = (Button) findViewById(R.id.btn_parametres);
        btnParam.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.i(TAG, "click btnParametres");
                //Codes
            }
        });

        //Se produit quand on click sur le btn Quitter
        //Ferme l'application
        final Button btnQuitter = (Button) findViewById(R.id.btn_quitter);
        btnQuitter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.i(TAG, "click btnQuitter");
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
        mediaPlayer.seekTo(length);
        mediaPlayer.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
        if(mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            length = mediaPlayer.getCurrentPosition();
        }


    }



    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
        if(mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }
}
