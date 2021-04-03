package com.example.andrintent1;

import android.app.ListActivity;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listRS = new String[]{"Rumah Sakit Awal Bross", "Rumah Sakit Eka Hospital", "RS Tabrani"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRS));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        showpilihan(pilihan);
    }

    private void showpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Awal Bross")) {
                a = new Intent(this, RSAwalBross.class);

                }else if (pilihan.equals("Rumah Sakit Eka Hospital"))
            {

            } else if (pilihan.equals("RS Tabrani")) {

            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
