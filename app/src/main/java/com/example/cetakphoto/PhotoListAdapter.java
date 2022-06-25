package com.example.cetakphoto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class PhotoListAdapter extends RecyclerView.Adapter<PhotoListAdapter.PhotoViewHolder>{
    public PhotoListAdapter(Context context, LinkedList<String> mPhotoList) {
        mInflater = LayoutInflater.from(context);
        this.mPhotoList = mPhotoList;
    }

    @NonNull
    @Override
    public PhotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.item_foto, parent, false);
        return new PhotoViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(PhotoViewHolder holder, int position) {
        String mCurrent = mPhotoList.get(position);
        //holder.photoItemView.setImageResource(getItemId());
        holder.filenameView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mPhotoList.size();
    }

    class PhotoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final ImageView photoItemView;
        public final TextView filenameView;
        public final Button btnCetak;
        public final Button[] btnUkuran;
        final PhotoListAdapter mAdapter;

        int[] resBtnUkuranArray = {
                R.id.btn_3r,
                R.id.btn_4r,
                R.id.btn_8r,
                R.id.btn_10r,
        };

        public PhotoViewHolder(View itemView, PhotoListAdapter adapter) {
            super(itemView);
            photoItemView = itemView.findViewById(R.id.iv_foto);
            filenameView = itemView.findViewById(R.id.tv_filename);
            btnCetak = itemView.findViewById(R.id.btn_cetak);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);

            btnUkuran = new Button[resBtnUkuranArray.length];
            for (int i = 0; i< resBtnUkuranArray.length; i++){
                btnUkuran[i] = this.itemView.findViewById(resBtnUkuranArray[i]);
            }

        }

        @Override
        public void onClick(View view) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            // Use that to access the affected item in mWordList.
            String element = mPhotoList.get(mPosition);
            // Change the word in the mWordList.
            mPhotoList.set(mPosition, "Clicked! " + element);
            // Notify the adapter that the data has changed so it can
            // update the RecyclerView to display the data.
            mAdapter.notifyDataSetChanged();
        }
    }
    private final LinkedList<String> mPhotoList;

    private LayoutInflater mInflater;


}
