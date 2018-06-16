package com.carbonmade.corysandlin.pokedex.Data.Storage;

import android.arch.persistence.room.TypeConverter;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.VersionGameIndex;
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

public class CommonConverters {
    private static Moshi mMoshi = new Moshi.Builder().build();

    @TypeConverter
    public static String fromNamedApiResourceList(NamedApiResourceList namedApiResourceList) {
        JsonAdapter<NamedApiResourceList> json = mMoshi.adapter(NamedApiResourceList.class);
        return json.toJson(namedApiResourceList);
    }

    @TypeConverter
    public static NamedApiResourceList toNamedApiResourceList(String json) {
        try {
            JsonAdapter<NamedApiResourceList> adapter = mMoshi.adapter(NamedApiResourceList.class);
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }

    @TypeConverter
    public static String fromNamedApiResource(NamedApiResource namedApiResource) {
        JsonAdapter<NamedApiResource> json = mMoshi.adapter(NamedApiResource.class);
        return json.toJson(namedApiResource);
    }

    @TypeConverter
    public static NamedApiResource toNamedApiResource(String json) {
        try {
            JsonAdapter<NamedApiResource> adapter = mMoshi.adapter(NamedApiResource.class);
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }

    @TypeConverter
    public static String fromNamedApiResources(List<NamedApiResource> namedApiResources) {
        Type type = Types.newParameterizedType(List.class, NamedApiResource.class);
        return mMoshi.adapter(type).toJson(namedApiResources);
    }

    @TypeConverter
    public static List<NamedApiResource> toNamedApiResources(String json) {
        try {
            JsonAdapter<List<NamedApiResource>> adapter = mMoshi.adapter(Types.newParameterizedType(List.class, NamedApiResource.class));
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }

    @TypeConverter
    public static String fromVersionGameIndices(List<VersionGameIndex> ability) {
        Type type = Types.newParameterizedType(List.class, VersionGameIndex.class);
        return mMoshi.adapter(type).toJson(ability);
    }

    @TypeConverter
    public static List<VersionGameIndex> toVersionGameIndices(String json) {
        try {
            JsonAdapter<List<VersionGameIndex>> adapter = mMoshi.adapter(Types.newParameterizedType(List.class, VersionGameIndex.class));
            return adapter.fromJson(json);
        } catch(Exception e) {
            return null;
        }
    }
}
