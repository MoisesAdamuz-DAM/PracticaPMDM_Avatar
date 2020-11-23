package com.example.myavatar;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class NombreAvatar extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState){

        //Construir el diálogo
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            //Insertaremos el título del diálogo
            builder.setTitle(R.string.tituloDialogo1)
                    //Insertamos y editamos el botón de Aceptar
                    .setPositiveButton(R.string.btnAceptar, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText( getActivity(),"Guardar", Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        }
                    })
                    //Insertamos y editamos el botón de Cancelar
                    .setNegativeButton(R.string.btnCancelar, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            // Creamos el objeto deiálogo
            return builder.create();

    }
}
