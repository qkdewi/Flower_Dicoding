package com.example.user.submissiondicoding;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder> {
    private ArrayList<Bunga>listBunga;
    private Context context;

    public CardViewAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Bunga>getListBunga(){
        return listBunga;
    }

    public void setListBunga(ArrayList<Bunga> listBunga) {
        this.listBunga = listBunga;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position){
        Bunga b =getListBunga().get(position);
        Glide.with(context)
                .load(b.getPhoto())
                .override(350,550)
                .into(holder.imgPhoto);

        holder.tvName.setText(b.getName());
        holder.tvRemarks.setText(b.getRemarks());

        holder.btnShare.setOnClickListener(new CustomOnClickListener(position, new CustomOnClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Detail" + getListBunga().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount(){
        return getListBunga().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button btnShare, btnDetail;
        public CardViewViewHolder(View itemView){
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnShare = (Button)itemView.findViewById(R.id.btn_set_share);
            btnDetail = (Button)itemView.findViewById(R.id.btn_set_detail);
        }
    }
}
