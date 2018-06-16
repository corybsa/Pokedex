package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.squareup.moshi.Json;

import java.util.ArrayList;
import java.util.List;

public class NamedApiResourceList {
    @Json(name = "count")
    private int mCount;

    @Json(name = "next")
    private String mNext;

    @Json(name = "previous")
    private String mPrevious;

    @Json(name = "results")
    private List<NamedApiResource> mResults;

    public int getCount() {
        return mCount;
    }

    public void setCount(int count) {
        mCount = count;
    }

    public String getNext() {
        return mNext;
    }

    public void setNext(String next) {
        mNext = next;
    }

    public String getPrevious() {
        return mPrevious;
    }

    public void setPrevious(String previous) {
        mPrevious = previous;
    }

    public List<NamedApiResource> getResults() {
        return mResults;
    }

    public void setResults(List<NamedApiResource> results) {
        mResults = results;
    }

    public void addResults(List<NamedApiResource> results) {
        if(mResults == null) {
            mResults = results;
        } else {
            mResults.addAll(results);
        }
    }

    public void update(NamedApiResourceList list) {
        setNext(list.getNext());
        setPrevious(list.getPrevious());
        setCount(list.getCount());
        addResults(list.getResults());
    }
}
