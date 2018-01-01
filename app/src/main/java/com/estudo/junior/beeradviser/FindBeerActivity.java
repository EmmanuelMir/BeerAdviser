package com.estudo.junior.beeradviser;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import java.lang.String;


/**
 * Custom app do livro headFirst para mudar o wallpaper para um de cerveja.
 *
 */

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    //WallpaperManager wm = (WallpaperManager) getSystemService(Context.WALLPAPER_SERVICE);

    public void onClickFindBeer (View view){

        TextView brands = (TextView) findViewById(R.id.textView);
        Spinner color = (Spinner) findViewById(R.id.spinner);
        String str = String.valueOf(color.getSelectedItem());

        switch(str){
            case "light":
                brands.setText(R.string.brandlight);
                //System.out.println(wm.getDrawable());
                break;
            case "amber":
                brands.setText(R.string.brandamber);
                break;
            case "dark":
                brands.setText(R.string.branddark);
                break;
            case "brown":
                brands.setText(R.string.brandbrown);
                break;

        }
    }

}


