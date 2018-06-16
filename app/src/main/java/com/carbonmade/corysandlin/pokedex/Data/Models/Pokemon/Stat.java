package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.ApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class Stat {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "game_index")
    private int mGameIndex;

    @Json(name = "is_battle_only")
    private boolean mIsBattleOnly;

    @Json(name = "affecting_moves")
    private MoveStatAffectSet mAffectingMoves;

    @Json(name = "affecting_natures")
    private NatureStatAffectSet mAffectingNatures;

    @Json(name = "characteristics")
    private List<ApiResource> mCharacteristics;

    @Json(name = "move_damage_class")
    private NamedApiResource mMoveDamageClass;

    @Json(name = "names")
    private List<Name> mNames;

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

    public int getGameIndex() {
        return mGameIndex;
    }

    public void setGameIndex(int gameIndex) {
        mGameIndex = gameIndex;
    }

    public boolean isBattleOnly() {
        return mIsBattleOnly;
    }

    public void setBattleOnly(boolean battleOnly) {
        mIsBattleOnly = battleOnly;
    }

    public MoveStatAffectSet getAffectingMoves() {
        return mAffectingMoves;
    }

    public void setAffectingMoves(MoveStatAffectSet affectingMoves) {
        mAffectingMoves = affectingMoves;
    }

    public NatureStatAffectSet getAffectingNatures() {
        return mAffectingNatures;
    }

    public void setAffectingNatures(NatureStatAffectSet affectingNatures) {
        mAffectingNatures = affectingNatures;
    }

    public List<ApiResource> getCharacteristics() {
        return mCharacteristics;
    }

    public void setCharacteristics(List<ApiResource> characteristics) {
        mCharacteristics = characteristics;
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
}
