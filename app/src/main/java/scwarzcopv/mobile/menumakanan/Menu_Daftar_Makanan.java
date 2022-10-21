package scwarzcopv.mobile.menumakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Menu_Daftar_Makanan extends AppCompatActivity {

    ListView lvItem;
    ListViewAdapterCall adapter;
    ArrayList<ListViewAdapterMenu> arraylist = new ArrayList<ListViewAdapterMenu>();

    int[] Gambar;
    String[] NamaItem;
    String[] HargaItem;
    String[] Deskripsi;
    String[] NomorHP;
    String[] Lat;
    String[] Long;

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_daftar_makanan);

        lvItem		= (ListView)findViewById(R.id.listView1);


        Gambar		= new int[]{
                R.drawable.ayam,
                R.drawable.bebek,
                R.drawable.lele,
                R.drawable.kerang,
                R.drawable.uduk,};

        NamaItem 	= new String[]{
                "Ayam Goreng",
                "Bebek Goreng",
                "Pecel Lele",
                "Kerang",
                "Nasi Uduk"};

        HargaItem 	= new String[]{
                "Rp 15.000,-",
                "Rp 20.000,-",
                "Rp 12.000,-",
                "Rp 24.000,-",
                "Rp 8.000,-"};

        Deskripsi 	= new String[]{
                "Menu Ayam goreng, tersedia bagian bagian ayam seperti dada, paha, sayap dengan ditemani lalapan, sambal dan nasi yang membuat makan anda lebih enak dan nikmat.",

                "Menu Bebek gorenng, dengan menu bebek dengan lalapan, sambal dan nasi yang bisa anda nikmati sendirian maupun bersama sama.",

                "Menu Pecel lele, Tersedia lele yang fresh dengan disertai lalapan dan sambal yang bisa anda nikmati.",

                "Menu Kerang, disini juga tersedia menu seafood yaitu kerang, tersedia kerang fresh yang akan terasa segar dengan aneka macam saus yang bisa anda nikmati.",

                "Menu Nasi Uduk, selain menu menu diatas, disini juga tersedia nasi uduk yang sangat lezat dan nikmat."};
				
				
		//Nomor HP harus dimulai dengan kode negara yaitu : +62
        NomorHP  = new String[]{
                "+6281226446076",
                "+6281226446076",
                "+6281226446076",
                "+6281226446076",
                "+6281226446076"
        };

        Lat  = new String[]{
                "-10.1760821",
                "-10.1768035",
                "-10.171799",
                "-10.1748536",
                "-10.1747994"
        };

        Long  = new String[]{
                "123.6235399",
                "123.6229451",
                "123.6285576",
                "123.6262513",
                "123.6261514"
        };


        for (int i = 0; i < NamaItem.length; i++)
        {
            ListViewAdapterMenu wp = new ListViewAdapterMenu(NamaItem[i], HargaItem[i], Deskripsi[i], Gambar[i], NomorHP[i], Lat[i], Long[i]);
            arraylist.add(wp);
        }

        adapter = new ListViewAdapterCall(this, arraylist);
        lvItem.setAdapter(adapter);

    }

    void showToastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
