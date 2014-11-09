package com.equipo7.warships;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity
{
    private View.OnClickListener menuListener;
    private Button botonJugar, botonCreditos, botonSalir;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        botonJugar = (Button)findViewById(R.id.botonJugar);
        botonSalir = (Button)findViewById(R.id.botonSalir);
        botonCreditos = (Button)findViewById(R.id.botonCreditos);

        menuListener = new View.OnClickListener()
        {
            public void onClick(View v) {

                if (v == botonJugar)
                    setContentView(R.layout.jugar_seleccion);
                else if (v == botonCreditos)
                    setContentView(R.layout.creditos);
                else if (v == botonSalir)
                    finish();
            }
        };

        botonJugar.setOnClickListener(menuListener);
        botonCreditos.setOnClickListener(menuListener);
        botonSalir.setOnClickListener(menuListener);

    }

}
