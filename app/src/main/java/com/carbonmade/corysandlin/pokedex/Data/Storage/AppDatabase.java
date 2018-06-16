package com.carbonmade.corysandlin.pokedex.Data.Storage;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Pokemon;
import com.carbonmade.corysandlin.pokedex.Data.Storage.Pokemon.PokemonConverters;
import com.carbonmade.corysandlin.pokedex.Data.Storage.Pokemon.PokemonDao;
import com.carbonmade.corysandlin.pokedex.Data.Storage.Pokemon.PokemonResource;
import com.carbonmade.corysandlin.pokedex.Data.Storage.Pokemon.PokemonResourceDao;

@Database(
        entities = {
                Pokemon.class,
                PokemonResource.class
        },
        version = 2,
        exportSchema = false
)
@TypeConverters({
        CommonConverters.class,
        PokemonConverters.class
})
public abstract class AppDatabase extends RoomDatabase {
    public abstract PokemonDao pokemonDao();
    public abstract PokemonResourceDao pokemonResourceDao();
}
