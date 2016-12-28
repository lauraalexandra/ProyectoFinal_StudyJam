package campos.tres.minimo.recetasdenavidadenelmundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MisRecetas extends AppCompatActivity {
    ImageView img;
    TextView txt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_recetas);

        img = (ImageView)findViewById(R.id.recetaImg);
        txt = (TextView)findViewById(R.id.recetaTxt);

        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        int dato = extra.getInt("DATO");

        if (dato == 1)
        {
            img.setImageResource(R.drawable.caribe);
            txt.setText(R.string.SydneyReceta);
        }

        if (dato == 2)
        {
            img.setImageResource(R.drawable.alemania);
            txt.setText(R.string.BerlinReceta);
        }
        if (dato == 3)
        {
            img.setImageResource(R.drawable.bolivia);
            txt.setText(R.string.BoliviaReceta);
        }
        if (dato == 4)
        {
            img.setImageResource(R.drawable.italia);
            txt.setText(R.string.ItaliaReceta);
        }
        if (dato == 5)
        {
            img.setImageResource(R.drawable.caribe);
            txt.setText(R.string.HaitiReceta);
        }

    }
}
