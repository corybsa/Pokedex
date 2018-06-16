package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class PokemonForm {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "order")
    private int mOrder;

    @Json(name = "form_order")
    private int mFormOrder;

    @Json(name = "is_default")
    private boolean mIsDefault;

    @Json(name = "is_battle_only")
    private boolean mIsBattleOnly;

    @Json(name = "is_mega")
    private boolean mIsMega;

    @Json(name = "form_name")
    private String mFormName;

    @Json(name = "pokemon")
    private NamedApiResource mPokemon;

    @Json(name = "sprites")
    private PokemonFormSprite mSprites;

    @Json(name = "version_group")
    private NamedApiResource mVersionGroup;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "form_names")
    private List<Name> mFormNames;

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

    public int getOrder() {
        return mOrder;
    }

    public void setOrder(int order) {
        mOrder = order;
    }

    public int getFormOrder() {
        return mFormOrder;
    }

    public void setFormOrder(int formOrder) {
        mFormOrder = formOrder;
    }

    public boolean isDefault() {
        return mIsDefault;
    }

    public void setDefault(boolean aDefault) {
        mIsDefault = aDefault;
    }

    public boolean isBattleOnly() {
        return mIsBattleOnly;
    }

    public void setBattleOnly(boolean battleOnly) {
        mIsBattleOnly = battleOnly;
    }

    public boolean isMega() {
        return mIsMega;
    }

    public void setMega(boolean mega) {
        mIsMega = mega;
    }

    public String getFormName() {
        return mFormName;
    }

    public void setFormName(String formName) {
        mFormName = formName;
    }

    public NamedApiResource getPokemon() {
        return mPokemon;
    }

    public void setPokemon(NamedApiResource pokemon) {
        mPokemon = pokemon;
    }

    public PokemonFormSprite getSprites() {
        return mSprites;
    }

    public void setSprites(PokemonFormSprite sprites) {
        mSprites = sprites;
    }

    public NamedApiResource getVersionGroup() {
        return mVersionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        mVersionGroup = versionGroup;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public List<Name> getFormNames() {
        return mFormNames;
    }

    public void setFormNames(List<Name> formNames) {
        mFormNames = formNames;
    }
}
