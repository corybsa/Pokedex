package com.carbonmade.corysandlin.pokedex.Data.Storage.Pokemon;

import android.arch.persistence.room.TypeConverter;

import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonAbility;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonHeldItem;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonHeldItemVersion;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonMove;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonMoveVersion;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonSprite;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonStat;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonType;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

import java.lang.reflect.Type;
import java.util.List;

public class PokemonConverters {
    private static Moshi mMoshi = new Moshi.Builder().build();

    @TypeConverter
    public static String fromPokemonAbilities(List<PokemonAbility> abilities) {
        Type type = Types.newParameterizedType(List.class, PokemonAbility.class);
        return mMoshi.adapter(type).toJson(abilities);
    }

    @TypeConverter
    public static List<PokemonAbility> toPokemonAbilities(String json) {
        try {
            JsonAdapter<List<PokemonAbility>> adapter = mMoshi.adapter(Types.newParameterizedType(List.class, PokemonAbility.class));
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }

    @TypeConverter
    public static String fromPokemonHeldItemVersions(List<PokemonHeldItemVersion> pokemonHeldItemVersions) {
        Type type = Types.newParameterizedType(List.class, PokemonHeldItemVersion.class);
        return mMoshi.adapter(type).toJson(pokemonHeldItemVersions);
    }

    @TypeConverter
    public static List<PokemonHeldItemVersion> toPokemonHeldItemVersions(String json) {
        try {
            JsonAdapter<List<PokemonHeldItemVersion>> adapter = mMoshi.adapter(Types.newParameterizedType(List.class, PokemonHeldItemVersion.class));
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }

    @TypeConverter
    public static String fromPokemonHeldItems(List<PokemonHeldItem> pokemonHeldItems) {
        Type type = Types.newParameterizedType(List.class, PokemonHeldItem.class);
        return mMoshi.adapter(type).toJson(pokemonHeldItems);
    }

    @TypeConverter
    public static List<PokemonHeldItem> toPokemonHeldItems(String json) {
        try {
            JsonAdapter<List<PokemonHeldItem>> adapter = mMoshi.adapter(Types.newParameterizedType(List.class, PokemonHeldItem.class));
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }

    @TypeConverter
    public static String fromPokemonMoveVersions(List<PokemonMoveVersion> pokemonMoveVersions) {
        Type type = Types.newParameterizedType(List.class, PokemonMoveVersion.class);
        return mMoshi.adapter(type).toJson(pokemonMoveVersions);
    }

    @TypeConverter
    public static List<PokemonMoveVersion> toPokemonMoveVersions(String json) {
        try {
            JsonAdapter<List<PokemonMoveVersion>> adapter = mMoshi.adapter(Types.newParameterizedType(List.class, PokemonMoveVersion.class));
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }

    @TypeConverter
    public static String fromPokemonMoves(List<PokemonMove> pokemonMoves) {
        Type type = Types.newParameterizedType(List.class, PokemonMove.class);
        return mMoshi.adapter(type).toJson(pokemonMoves);
    }

    @TypeConverter
    public static List<PokemonMove> toPokemonMoves(String json) {
        try {
            JsonAdapter<List<PokemonMove>> adapter = mMoshi.adapter(Types.newParameterizedType(List.class, PokemonMove.class));
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }

    @TypeConverter
    public static String fromPokemonSprite(PokemonSprite pokemonSprite) {
        JsonAdapter<PokemonSprite> json = mMoshi.adapter(PokemonSprite.class);
        return json.toJson(pokemonSprite);
    }

    @TypeConverter
    public static PokemonSprite toPokemonSprite(String json) {
        try {
            JsonAdapter<PokemonSprite> adapter = mMoshi.adapter(PokemonSprite.class);
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }

    @TypeConverter
    public static String fromPokemonStats(List<PokemonStat> pokemonStats) {
        Type type = Types.newParameterizedType(List.class, PokemonStat.class);
        return mMoshi.adapter(type).toJson(pokemonStats);
    }

    @TypeConverter
    public static List<PokemonStat> toPokemonStats(String json) {
        try {
            JsonAdapter<List<PokemonStat>> adapter = mMoshi.adapter(Types.newParameterizedType(List.class, PokemonStat.class));
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }

    @TypeConverter
    public static String fromPokemonTypes(List<PokemonType> pokemonTypes) {
        Type type = Types.newParameterizedType(List.class, PokemonType.class);
        return mMoshi.adapter(type).toJson(pokemonTypes);
    }

    @TypeConverter
    public static List<PokemonType> toPokemonTypes(String json) {
        try {
            JsonAdapter<List<PokemonType>> adapter = mMoshi.adapter(Types.newParameterizedType(List.class, PokemonType.class));
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }
}
