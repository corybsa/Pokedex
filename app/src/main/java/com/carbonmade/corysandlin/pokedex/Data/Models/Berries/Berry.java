package com.carbonmade.corysandlin.pokedex.Data.Models.Berries;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class Berry {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "growth_time")
    private int mGrowthTime;

    @Json(name = "max_harvest")
    private int mMaxHarvest;

    @Json(name = "natural_gift_type")
    private int mNaturalGiftPower;

    @Json(name = "size")
    private int mSize;

    @Json(name = "smoothness")
    private int mSmoothness;

    @Json(name = "soil_dryness")
    private int mSoilDryness;

    @Json(name = "firmness")
    private NamedApiResource mFirmness;

    @Json(name = "flavors")
    private List<BerryFlavorMap> mFlavors;

    @Json(name = "item")
    private NamedApiResource mItem;

    @Json(name = "natural_gift_type")
    private NamedApiResource mNaturalGiftType;

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

    public int getGrowthTime() {
        return mGrowthTime;
    }

    public void setGrowthTime(int growthTime) {
        mGrowthTime = growthTime;
    }

    public int getMaxHarvest() {
        return mMaxHarvest;
    }

    public void setMaxHarvest(int maxHarvest) {
        mMaxHarvest = maxHarvest;
    }

    public int getNaturalGiftPower() {
        return mNaturalGiftPower;
    }

    public void setNaturalGiftPower(int naturalGiftPower) {
        mNaturalGiftPower = naturalGiftPower;
    }

    public int getSize() {
        return mSize;
    }

    public void setSize(int size) {
        mSize = size;
    }

    public int getSmoothness() {
        return mSmoothness;
    }

    public void setSmoothness(int smoothness) {
        mSmoothness = smoothness;
    }

    public int getSoilDryness() {
        return mSoilDryness;
    }

    public void setSoilDryness(int soilDryness) {
        mSoilDryness = soilDryness;
    }

    public NamedApiResource getFirmness() {
        return mFirmness;
    }

    public void setFirmness(NamedApiResource firmness) {
        mFirmness = firmness;
    }

    public List<BerryFlavorMap> getFlavors() {
        return mFlavors;
    }

    public void setFlavors(List<BerryFlavorMap> flavors) {
        mFlavors = flavors;
    }

    public NamedApiResource getItem() {
        return mItem;
    }

    public void setItem(NamedApiResource item) {
        mItem = item;
    }

    public NamedApiResource getNaturalGiftType() {
        return mNaturalGiftType;
    }

    public void setNaturalGiftType(NamedApiResource naturalGiftType) {
        mNaturalGiftType = naturalGiftType;
    }
}
