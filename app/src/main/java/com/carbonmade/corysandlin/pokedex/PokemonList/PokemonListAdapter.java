package com.carbonmade.corysandlin.pokedex.PokemonList;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.R;
import com.carbonmade.corysandlin.pokedex.Util.LoadingViewHolder;
import com.squareup.picasso.Picasso;

import java.util.Locale;

public class PokemonListAdapter extends RecyclerView.Adapter {
    private final int VIEW_ITEM = 0;
    private final int VIEW_LOADING = 1;

    private OnPokemonSelectedListener mListener;
    private NamedApiResourceList mNamedApiResourceList;
    private Picasso mPicasso;

    PokemonListAdapter(
        NamedApiResourceList namedApiResourceList,
        Picasso picasso,
        OnPokemonSelectedListener listener)
    {
        mNamedApiResourceList = namedApiResourceList;
        mPicasso = picasso;
        mListener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == VIEW_ITEM) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemonlist_listitemlayout, parent, false);
            return new PokemonViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_loadingmore, parent, false);
            return new LoadingViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof PokemonViewHolder) {
            ((PokemonViewHolder)holder).bindView(position);
        } else if(holder instanceof LoadingViewHolder) {
            LoadingViewHolder loadingViewHolder = (LoadingViewHolder)holder;
            loadingViewHolder.progressBar.setIndeterminate(true);
        }
    }

    @Override
    public int getItemCount() {
        return mNamedApiResourceList.getResults().size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if(position >= mNamedApiResourceList.getResults().size()) {
            return VIEW_LOADING;
        }

        return VIEW_ITEM;
    }

    public void setData(NamedApiResourceList namedApiResourceList) {
        mNamedApiResourceList = namedApiResourceList;
    }

    public class PokemonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mTextView;
        private ImageView mImageView;
        private int mIndex;
        private NamedApiResource mResource;

        PokemonViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.pokemonListName);
            mImageView = itemView.findViewById(R.id.pokemonListImage);
            itemView.setOnClickListener(this);
        }

        void bindView(int position) {
            mIndex = position;
            mResource = mNamedApiResourceList.getResults().get(position);

            mTextView.setText(mResource.getFormattedName());
            String imageUrl = String.format(Locale.US, "http://pokeapi.co/media/sprites/pokemon/%d.png", mResource.getId());
            mPicasso.load(imageUrl).placeholder(R.drawable.placeholder).into(mImageView);
        }

        @Override
        public void onClick(View view) {
            mListener.onPokemonSelected(mIndex, mResource);
        }
    }
}
