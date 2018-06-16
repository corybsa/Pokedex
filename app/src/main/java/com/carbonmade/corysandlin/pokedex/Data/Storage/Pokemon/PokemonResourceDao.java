package com.carbonmade.corysandlin.pokedex.Data.Storage.Pokemon;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

@Dao
public interface PokemonResourceDao {
    @Query("SELECT * FROM pokemon_resources")
    LiveData<PokemonResource> getAllPokemonResources();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertPokemonResources(PokemonResource pokemonResource);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updatePokemonResources(PokemonResource pokemonResource);
}
