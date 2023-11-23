package com.neyser.spinnerimagenes2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    Integer[] banderas = {R.drawable.espana, R.drawable.francia, R.drawable.italia};
    String[] paises = {"Logo", "foto"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.spinner1);

        PaisesAdapter adaptador1 = new PaisesAdapter();

        spinner1.setAdapter(adaptador1);

        // La clase baseAdapter tiene unos métodos para vincular los array con los objetos spinner

    }

    class PaisesAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }

}