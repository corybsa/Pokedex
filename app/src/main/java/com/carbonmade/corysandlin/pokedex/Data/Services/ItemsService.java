package com.carbonmade.corysandlin.pokedex.Data.Services;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Items.Item;
import com.carbonmade.corysandlin.pokedex.Data.Models.Items.ItemAttribute;
import com.carbonmade.corysandlin.pokedex.Data.Models.Items.ItemCategory;
import com.carbonmade.corysandlin.pokedex.Data.Models.Items.ItemFlingEffect;
import com.carbonmade.corysandlin.pokedex.Data.Models.Items.ItemPocket;
import com.carbonmade.corysandlin.pokedex.Data.Network.ItemsApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class ItemsService {
    private Retrofit mRetrofit;

    ItemsService(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    public void getItems(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> items = mRetrofit.create(ItemsApi.class).getItems();
        items.enqueue(callback);
    }

    public void getItem(int id, Callback<Item> callback) {
        Call<Item> item = mRetrofit.create(ItemsApi.class).getItem(id);
        item.enqueue(callback);
    }

    public void getItem(String name, Callback<Item> callback) {
        Call<Item> item = mRetrofit.create(ItemsApi.class).getItem(name);
        item.enqueue(callback);
    }

    public void getItemAttributes(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> attributes = mRetrofit.create(ItemsApi.class).getItemAttributes();
        attributes.enqueue(callback);
    }

    public void getItemAttribute(int id, Callback<ItemAttribute> callback) {
        Call<ItemAttribute> attribute = mRetrofit.create(ItemsApi.class).getItemAttribute(id);
        attribute.enqueue(callback);
    }

    public void getItemAttribute(String name, Callback<ItemAttribute> callback) {
        Call<ItemAttribute> attribute = mRetrofit.create(ItemsApi.class).getItemAttribute(name);
        attribute.enqueue(callback);
    }

    public void getItemCategories(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> categories = mRetrofit.create(ItemsApi.class).getItemCategories();
        categories.enqueue(callback);
    }

    public void getItemCategory(int id, Callback<ItemCategory> callback) {
        Call<ItemCategory> category = mRetrofit.create(ItemsApi.class).getItemCategory(id);
        category.enqueue(callback);
    }

    public void getItemCategory(String name, Callback<ItemCategory> callback) {
        Call<ItemCategory> category = mRetrofit.create(ItemsApi.class).getItemCategory(name);
        category.enqueue(callback);
    }

    public void getItemFlingEffects(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> effects = mRetrofit.create(ItemsApi.class).getItemFlingEffects();
        effects.enqueue(callback);
    }

    public void getItemFlingEffect(int id, Callback<ItemFlingEffect> callback) {
        Call<ItemFlingEffect> effect = mRetrofit.create(ItemsApi.class).getItemFlingEffect(id);
        effect.enqueue(callback);
    }

    public void getItemFlingEffect(String name, Callback<ItemFlingEffect> callback) {
        Call<ItemFlingEffect> effect = mRetrofit.create(ItemsApi.class).getItemFlingEffect(name);
        effect.enqueue(callback);
    }

    public void getItemPockets(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> pockets = mRetrofit.create(ItemsApi.class).getItemPockets();
        pockets.enqueue(callback);
    }

    public void getItemPocket(int id, Callback<ItemPocket> callback) {
        Call<ItemPocket> pocket = mRetrofit.create(ItemsApi.class).getItemPocket(id);
        pocket.enqueue(callback);
    }

    public void getItemPocket(String name, Callback<ItemPocket> callback) {
        Call<ItemPocket> pocket = mRetrofit.create(ItemsApi.class).getItemPocket(name);
        pocket.enqueue(callback);
    }
}
