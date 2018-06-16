package com.carbonmade.corysandlin.pokedex.Components;

import com.carbonmade.corysandlin.pokedex.Modules.AppModule;
import com.carbonmade.corysandlin.pokedex.Modules.NetworkModule;
import com.carbonmade.corysandlin.pokedex.Modules.PokedexModule;
import com.carbonmade.corysandlin.pokedex.PokemonList.PokemonListActivity;
import com.carbonmade.corysandlin.pokedex.PokemonList.PokemonListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class,
                NetworkModule.class,
                PokedexModule.class
        }
)
public interface AppComponent {
    void inject(PokemonListActivity activity);
    void inject(PokemonListFragment fragment);
}
