package com.fryanramzkhar.juzamma.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import com.fryanramzkhar.juzamma.R;

public class AdapterSurah extends RecyclerView.Adapter<AdapterSurah.ViewHolder>{
    //TODO Membuat variable untuk di oroses adapter
    //TODO Context untuk menyimpan Acticvity
    Context contex;
    //TODO Membuat variable String array untuk menampung nam dan isi surah
    String[] nama_surah,isi_surah;

    //TODO Membuat constructor untuk dapat menerima data pada saat Adapter dibuat menjadi object
    public AdapterSurah(Context contex, String[] nama_surah, String[] isi_surah) {
        this.contex = contex;
        this.nama_surah = nama_surah;
        this.isi_surah = isi_surah;
    }

    @NonNull
    @Override
    public AdapterSurah.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //TODO Membuat itenm_surah Menjadi objek
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_surah,viewGroup,false);
        //TODO Lalu Object item_surah kita kirim ke class ViewHolder
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSurah.ViewHolder viewHolder, int i) {
        //TODO untuk kita menampilkan dat ke tampilan widget  yang kita ingnikan
        viewHolder.txtNamaSurah.setText(nama_surah[i]);
        viewHolder.txtIsiSurah.setText(isi_surah[i]);
    }

    @Override
    public int getItemCount() {
        //TODO Menampilkan jumlah data yang ingin ditampilkan
        return nama_surah.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //TODOMembuat variable Global untuk menampung Widget
        TextView txtNamaSurah, txtIsiSurah;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //TODO Mebgubah Objek menjadi Widget nama_surah
            txtNamaSurah = itemView.findViewById(R.id.txtNamaSurah);
            //TODO mengubah Objek menjadi Widget isi_surah
            txtIsiSurah = itemView.findViewById(R.id.txtIsiSurah);
        }
    }
}
