package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Items.Item;
import com.carbonmade.corysandlin.pokedex.Data.Models.Items.ItemAttribute;
import com.carbonmade.corysandlin.pokedex.Data.Models.Items.ItemCategory;
import com.carbonmade.corysandlin.pokedex.Data.Models.Items.ItemFlingEffect;
import com.carbonmade.corysandlin.pokedex.Data.Models.Items.ItemPocket;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ItemsApi {
    @GET("item")
    Call<NamedApiResourceList> getItems();

    @GET("item/{id}")
    Call<Item> getItem(@Path("id") int id);

    @GET("item/{name}")
    Call<Item> getItem(@Path("name") String name);

    @GET("item-attribute")
    Call<NamedApiResourceList> getItemAttributes();

    @GET("item-attribute/{id}")
    Call<ItemAttribute> getItemAttribute(@Path("id") int id);

    @GET("item-attribute/{name}")
    Call<ItemAttribute> getItemAttribute(@Path("name") String name);

    @GET("item-category")
    Call<NamedApiResourceList> getItemCategories();

    @GET("item-category/{id}")
    Call<ItemCategory> getItemCategory(@Path("id") int id);

    @GET("item-category/{name}")
    Call<ItemCategory> getItemCategory(@Path("name") String name);

    @GET("item-fling-effect")
    Call<NamedApiResourceList> getItemFlingEffects();

    @GET("item-fling-effect/{id}")
    Call<ItemFlingEffect> getItemFlingEffect(@Path("id") int id);

    @GET("item-fling-effect/{name}")
    Call<ItemFlingEffect> getItemFlingEffect(@Path("name") String name);

    @GET("item-pocket")
    Call<NamedApiResourceList> getItemPockets();

    @GET("item-pocket/{id}")
    Call<ItemPocket> getItemPocket(@Path("id") int id);

    @GET("item-pocket/{name}")
    Call<ItemPocket> getItemPocket(@Path("name") String name);
}
