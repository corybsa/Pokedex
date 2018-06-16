package com.carbonmade.corysandlin.pokedex;

import android.app.Application;

import com.carbonmade.corysandlin.pokedex.Components.AppComponent;
import com.carbonmade.corysandlin.pokedex.Components.DaggerAppComponent;
import com.carbonmade.corysandlin.pokedex.Modules.AppModule;
import com.carbonmade.corysandlin.pokedex.Modules.NetworkModule;
import com.carbonmade.corysandlin.pokedex.Modules.PokedexModule;


public class App extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
            .appModule(new AppModule(this))
            .networkModule(new NetworkModule("https://pokeapi.co/api/v2/"))
            .pokedexModule(new PokedexModule())
            .build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
