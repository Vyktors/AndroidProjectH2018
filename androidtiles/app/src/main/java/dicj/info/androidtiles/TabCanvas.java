package dicj.info.androidtiles;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by GueMa1630770 on 2018-03-27.
 */

public class TabCanvas extends View {

    public TabCanvas(Context context) {
        super(context);
    }

    public TabCanvas(Context context, AttributeSet attrs){
        super (context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        /*
        int x = getWidth();
        int y = getHeight();
        int Radius;
        Radius =50;
        Paint Couleur = new Paint();
        Couleur.setColor(Color.parseColor("#FF0000"));

        canvas.drawCircle(x/2,y/2,Radius,Couleur);
        */
        Bitmap b = Bitmap.createBitmap(120,120, Bitmap.Config.RGB_565);
        Paint p = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        p.setStyle(Paint.Style.STROKE);
        p.setColor(Color.parseColor("#B56BC2"));

// Dessiner l'intérieur d'une figure
    //    p.setStyle(Paint.Style.FILL);

// Dessiner ses contours
      //  p.setStyle(Paint.Style.STROKE);

// Dessiner les deux
       // p.setStyle(Paint.Style.FILL_AND_STROKE);



    }

}
