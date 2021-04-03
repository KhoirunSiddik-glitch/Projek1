package com.example.andrintent1;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSAwalBross extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "SMS Center","Driving Direction", "Website",
                "Info Google","Back"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAct));
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
            if (pilihan.equals("Call Center")) {
                String nomortel="telp:08717927";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            } else if (pilihan.equals("SMS Center"))
            {
                String smsText="M. Khoirun Siddik /L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms : 087238471"));
                a.putExtra("sms_body",smsText);

            } else if (pilihan.equals("Driving Direction"))
            {
                String locationRS ="google.navigation:q=0.463823.9311817";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(locationRS));

            }else if(pilihan.equals("Website"))
            {
                String webrs ="http://awalbros.com";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(webrs));

            }else if(pilihan.equals("Info Google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"RS AWAL BROSS");

            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
