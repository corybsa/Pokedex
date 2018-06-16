package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class TypeRelations {
    @Json(name = "no_damage_to")
    private List<NamedApiResource> mNoDamageTo;

    @Json(name = "half_damage_to")
    private List<NamedApiResource> mHalfDamageTo;

    @Json(name = "double_damage_to")
    private List<NamedApiResource> mDoubleDamageTo;

    @Json(name = "no_damage_from")
    private List<NamedApiResource> mNoDamageFrom;

    @Json(name = "half_damage_from")
    private List<NamedApiResource> mHalfDamageFrom;

    @Json(name = "double_damage_from")
    private List<NamedApiResource> mDoubleDamageFrom;

    public List<NamedApiResource> getNoDamageTo() {
        return mNoDamageTo;
    }

    public void setNoDamageTo(List<NamedApiResource> noDamageTo) {
        mNoDamageTo = noDamageTo;
    }

    public List<NamedApiResource> getHalfDamageTo() {
        return mHalfDamageTo;
    }

    public void setHalfDamageTo(List<NamedApiResource> halfDamageTo) {
        mHalfDamageTo = halfDamageTo;
    }

    public List<NamedApiResource> getDoubleDamageTo() {
        return mDoubleDamageTo;
    }

    public void setDoubleDamageTo(List<NamedApiResource> doubleDamageTo) {
        mDoubleDamageTo = doubleDamageTo;
    }

    public List<NamedApiResource> getNoDamageFrom() {
        return mNoDamageFrom;
    }

    public void setNoDamageFrom(List<NamedApiResource> noDamageFrom) {
        mNoDamageFrom = noDamageFrom;
    }

    public List<NamedApiResource> getHalfDamageFrom() {
        return mHalfDamageFrom;
    }

    public void setHalfDamageFrom(List<NamedApiResource> halfDamageFrom) {
        mHalfDamageFrom = halfDamageFrom;
    }

    public List<NamedApiResource> getDoubleDamageFrom() {
        return mDoubleDamageFrom;
    }

    public void setDoubleDamageFrom(List<NamedApiResource> doubleDamageFrom) {
        mDoubleDamageFrom = doubleDamageFrom;
    }
}
