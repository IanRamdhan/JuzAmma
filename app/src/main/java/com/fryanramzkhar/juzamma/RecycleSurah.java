package com.fryanramzkhar.juzamma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Adapter;

import com.fryanramzkhar.juzamma.Adapter.AdapterSurah;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleSurah extends AppCompatActivity {

    @BindView(R.id.MyRecycle)
    RecyclerView MyRecycle;

    //TODO membuat variable data dengan nama dan isi surah
    String[] nama_surah_pendek,nama_surah_panjang,isi_surah_pendek,isi_surah_panjang;

    //TODO membuat variable global AdapterSurah
    AdapterSurah adapterSurah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_surah);
        ButterKnife.bind(this);

        //TODO Mengisi variable dengan dta yang ada pada String
        nama_surah_pendek = getResources().getStringArray(R.array.nama_surah_pendek);
        nama_surah_panjang = getResources().getStringArray(R.array.nama_surah_panjang);
        isi_surah_pendek = getResources().getStringArray(R.array.isi_surah_pendek);
        isi_surah_panjang = getResources().getStringArray(R.array.isi_surah_panjang);

        //TODO menangkap data dari Intent
        String tanda = getIntent().getStringExtra("tanda");

        //TODO kita cek data dari Intent ataupun dari activity sebelumnya
        if (tanda.equals("pendek")){
            // TODO apabila user mengklik surah pendek maka kita buat adapter dengan data surah pendek
            adapterSurah = new AdapterSurah(RecycleSurah.this,nama_surah_pendek,isi_surah_pendek);
        }else {
            Log.i("Cek if","Masuk Panjang");
            adapterSurah = new AdapterSurah(RecycleSurah.this, nama_surah_panjang,isi_surah_panjang);

        }
        // TODO mensettig RecycleView dan mengeset recycle dengan AdapterSurah
        MyRecycle.setHasFixedSize(true);

        // TODO Mensetting layoutmanager recycleView
        MyRecycle.setLayoutManager(new LinearLayoutManager(RecycleSurah.this));

        //TODO mnset adapter RecycleView
        MyRecycle.setAdapter(adapterSurah);

    }
}
