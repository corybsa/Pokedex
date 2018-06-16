package com.carbonmade.corysandlin.pokedex.Data.Services;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Locations.Location;
import com.carbonmade.corysandlin.pokedex.Data.Models.Locations.LocationArea;
import com.carbonmade.corysandlin.pokedex.Data.Models.Locations.PalParkArea;
import com.carbonmade.corysandlin.pokedex.Data.Models.Locations.Region;
import com.carbonmade.corysandlin.pokedex.Data.Network.LocationsApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class LocationsService {
    private Retrofit mRetrofit;

    LocationsService(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    public void getLocations(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> locations = mRetrofit.create(LocationsApi.class).getLocations();
        locations.enqueue(callback);
    }

    public void getLocation(int id, Callback<Location> callback) {
        Call<Location> location = mRetrofit.create(LocationsApi.class).getLocation(id);
        location.enqueue(callback);
    }

    public void getLocationAreas(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> areas = mRetrofit.create(LocationsApi.class).getLocationAreas();
        areas.enqueue(callback);
    }

    public void getLocationArea(int id, Callback<LocationArea> callback) {
        Call<LocationArea> area = mRetrofit.create(LocationsApi.class).getLocationArea(id);
        area.enqueue(callback);
    }

    public void getPalParkAreas(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> areas = mRetrofit.create(LocationsApi.class).getPalParkAreas();
        areas.enqueue(callback);
    }

    public void getPalParkArea(int id, Callback<PalParkArea> callback) {
        Call<PalParkArea> area = mRetrofit.create(LocationsApi.class).getPalParkArea(id);
        area.enqueue(callback);
    }

    public void getPalParkArea(String name, Callback<PalParkArea> callback) {
        Call<PalParkArea> area = mRetrofit.create(LocationsApi.class).getPalParkArea(name);
        area.enqueue(callback);
    }

    public void getRegions(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> regions = mRetrofit.create(LocationsApi.class).getRegions();
        regions.enqueue(callback);
    }

    public void getRegion(int id, Callback<Region> callback) {
        Call<Region> region = mRetrofit.create(LocationsApi.class).getRegion(id);
        region.enqueue(callback);
    }

    public void getRegion(String name, Callback<Region> callback) {
        Call<Region> region = mRetrofit.create(LocationsApi.class).getRegion(name);
        region.enqueue(callback);
    }
}
