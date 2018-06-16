package com.carbonmade.corysandlin.pokedex.Data.Storage.Pokemon;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Pokemon;

import java.util.List;

@Dao
public interface PokemonDao {
    @Query("SELECT * FROM pokemon")
    List<Pokemon> getAllPokemon();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPokemon(Pokemon pokemon);
}
