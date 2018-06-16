package com.carbonmade.corysandlin.pokedex.Data.Storage.Pokemon;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;

@Entity(tableName = "pokemon_resources")
public class PokemonResource {
    @PrimaryKey
    @ColumnInfo(name = "id")
    private int mId;

    @ColumnInfo(name = "named_api_resource_list")
    private NamedApiResourceList mNamedApiResourceList;

    public PokemonResource() {}

    @Ignore
    public PokemonResource(int id, NamedApiResourceList namedApiResourceList) {
        mId = id;
        mNamedApiResourceList = namedApiResourceList;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public NamedApiResourceList getNamedApiResourceList() {
        return mNamedApiResourceList;
    }

    public void setNamedApiResourceList(NamedApiResourceList namedApiResourceList) {
        mNamedApiResourceList = namedApiResourceList;
    }
}
