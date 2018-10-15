package com.fryanramzkhar.juzamma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnSurahPendek)
    Button btnSurahPendek;
    @BindView(R.id.btnSurahPanjang)
    Button btnSurahPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnSurahPendek, R.id.btnSurahPanjang})
    public void onViewClicked(View view) {
        //TODO Membuat variable global dengan tipe data Intent
        Intent pindah;
        switch (view.getId()) {
            case R.id.btnSurahPendek:
                // TODO Membuat object Intent
                pindah = new Intent(MainActivity.this,RecycleSurah.class);
                pindah.putExtra("tanda","pendek");
                startActivity(pindah);
                break;
            case R.id.btnSurahPanjang:
                // TODO Membuat object Intent
                pindah = new Intent(MainActivity.this,RecycleSurah.class);
                pindah.putExtra("tanda","panjang");
                startActivity(pindah);
                break;
        }
    }
}
