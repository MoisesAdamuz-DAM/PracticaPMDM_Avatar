package com.example.myavatar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer reproductor;
    ImageButton imBCast;
    ImageButton imNombre;
    TextView txtPrin;
    FragmentManager fm = getSupportFragmentManager();
    //Utilizamos el Fragment Transaction para obtener una instancia de mis fragmentos
    FragmentTransaction ft;
    //Instanciamos el fragment de Creación de Avatar
    Creacionavatar creacion = new Creacionavatar();
    //Instanciamos el fragment del Resultado
    Resultado resultado = new Resultado();
    //Diálogo NombreAvatar
    NombreAvatar nombre;

    Fragment name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Reproducto Música
        reproductor = MediaPlayer.create(this, R.raw.preview);
        //Me repite la música constantemente
        //reproductor.setLooping(true);
        reproductor.start();

        //Botones texto del activity_main
        imBCast = findViewById(R.id.imageButton);
        imBCast.setOnClickListener(this);
        txtPrin = findViewById(R.id.txtPrincipal);




    }


    @Override
    public void onClick(View v) {
        //Si pulsamos el botón principal, este nos llevará al fragment de crear el avatar
        if (v.getId() == (R.id.imageButton)) {

            //Volvemos invisibles el BottonView y el textPrincipal
            imBCast.setVisibility(View.GONE);
            txtPrin.setVisibility(View.GONE);
            ft = fm.beginTransaction();
            //Reemplazamos nuestro activity por el fragmento CreacionAvatar
            //Utilizamos el FragmentTransaction para realizar la instancia del fragmento
            //Con replace, sustituimos el activity por el fragment
            ft.replace(R.id.principal, creacion).commit();

        }
        }


        //Controlador de sonido en caso de que ponga el Looping
    /*protected void onDestroy(){
        super.onDestroy();
        reproductor.release();
    }
    protected void onResume(){
        super.onResume();
        reproductor.start();
    }
    protected void onPause(){
        super.onPause();
        reproductor.pause();
    }*/
    }
