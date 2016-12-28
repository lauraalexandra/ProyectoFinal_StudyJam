package campos.tres.minimo.ProyectoFinal_StudyJam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread timerTread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }finally
                {
                    Intent intent = new Intent(SplashScreenActivity.this,MapsActivity.class);
                startActivity(intent);}
            }
        };
timerTread.start();

    }
}