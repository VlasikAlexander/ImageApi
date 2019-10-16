package com.example.imageapi.ui.fr.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.imageapi.R;
import com.example.imageapi.dto.Hit;

import java.util.List;

class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private final List<Hit> data;
    private final Context context;

    ImageAdapter(Context context, List<Hit> data) {
        this.context = context;
        this.data = data;

    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, null);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.bindItems(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private final RequestOptions options;

        ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_holder);
            options = new RequestOptions()
                    .fitCenter()
                    .placeholder(R.mipmap.ic_launcher_round)
                    .error(R.mipmap.ic_launcher);
        }

        void bindItems(Hit hit) {
            System.out.println(hit.getLargeImageURL());
            Glide.with(context).load(hit.getPreviewURL()).apply(options).into(imageView);
        }
    }
}
