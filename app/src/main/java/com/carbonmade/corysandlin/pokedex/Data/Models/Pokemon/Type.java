package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.GenerationGameIndex;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class Type {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "damage_relations")
    private TypeRelations mDamageRelations;

    @Json(name = "game_indices")
    private List<GenerationGameIndex> mGameIndices;

    @Json(name = "generation")
    private NamedApiResource mGeneration;

    @Json(name = "move_damage_class")
    private NamedApiResource mMoveDamageClass;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "pokemon")
    private List<TypePokemon> mPokemon;

    @Json(name = "moves")
    private List<NamedApiResource> mMoves;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public TypeRelations getDamageRelations() {
        return mDamageRelations;
    }

    public void setDamageRelations(TypeRelations damageRelations) {
        mDamageRelations = damageRelations;
    }

    public List<GenerationGameIndex> getGameIndices() {
        return mGameIndices;
    }

    public void setGameIndices(List<GenerationGameIndex> gameIndices) {
        mGameIndices = gameIndices;
    }

    public NamedApiResource getGeneration() {
        return mGeneration;
    }

    public void setGeneration(NamedApiResource generation) {
        mGeneration = generation;
    }

    public NamedApiResource getMoveDamageClass() {
        return mMoveDamageClass;
    }

    public void setMoveDamageClass(NamedApiResource moveDamageClass) {
        mMoveDamageClass = moveDamageClass;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public List<TypePokemon> getPokemon() {
        return mPokemon;
    }

    public void setPokemon(List<TypePokemon> pokemon) {
        mPokemon = pokemon;
    }

    public List<NamedApiResource> getMoves() {
        return mMoves;
    }

    public void setMoves(List<NamedApiResource> moves) {
        mMoves = moves;
    }
}
