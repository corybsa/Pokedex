package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Locations.Location;
import com.carbonmade.corysandlin.pokedex.Data.Models.Locations.LocationArea;
import com.carbonmade.corysandlin.pokedex.Data.Models.Locations.PalParkArea;
import com.carbonmade.corysandlin.pokedex.Data.Models.Locations.Region;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LocationsApi {
    @GET("location")
    Call<NamedApiResourceList> getLocations();

    @GET("location/{id}")
    Call<Location> getLocation(@Path("id") int id);

    @GET("location-area")
    Call<NamedApiResourceList> getLocationAreas();

    @GET("location-area/{id}")
    Call<LocationArea> getLocationArea(@Path("id") int id);

    @GET("pal-park-area")
    Call<NamedApiResourceList> getPalParkAreas();

    @GET("pal-park-area/{id}")
    Call<PalParkArea> getPalParkArea(@Path("id") int id);

    @GET("pal-park-area/{name}")
    Call<PalParkArea> getPalParkArea(@Path("name") String name);

    @GET("region")
    Call<NamedApiResourceList> getRegions();

    @GET("region/{id}")
    Call<Region> getRegion(@Path("id") int id);

    @GET("region/{name}")
    Call<Region> getRegion(@Path("name") String name);
}
