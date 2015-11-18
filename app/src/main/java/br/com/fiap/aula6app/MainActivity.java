package br.com.fiap.aula6app;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageViewID);

        desenharNormal();

    }

    public void acao(View v) {
        Button botao = (Button) v;

        if(botao.getText().toString().equals("Piscar")) {
            desenharPiscar();
            botao.setText("Normal");
        } else {
            desenharNormal();
            botao.setText("Piscar");
        }
    }

    public void desenharNormal(){

        Bitmap bmp = Bitmap.createBitmap(100,100,Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(bmp);
        Paint p = new Paint();
        p.setColor(Color.YELLOW);
        Paint p2 = new Paint();
        p2.setColor(Color.BLACK);
        c.drawCircle(50, 50, 30, p);
        c.drawLine(40, 70, 60, 70, p2);
        c.drawCircle(40, 40, 5, p2);
        c.drawCircle(60, 40, 5, p2);
        imageView.setImageBitmap(bmp);
    }

    public void desenharPiscar() {
        Bitmap bmp = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(bmp);
        Paint p = new Paint();
        p.setColor(Color.YELLOW);
        Paint p2 = new Paint();
        p2.setColor(Color.BLACK);
        c.drawCircle(50, 50, 30, p);
        c.drawLine(40, 70, 60, 70, p2);
        c.drawCircle(40, 40, 5, p2);
        c.drawLine(60, 40, 70, 40, p2);
        imageView.setImageBitmap(bmp);
    }
}
