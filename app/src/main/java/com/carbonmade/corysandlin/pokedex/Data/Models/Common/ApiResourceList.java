package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import com.squareup.moshi.Json;

import java.util.List;

public class ApiResourceList {
    @Json(name = "count")
    private int mCount;

    @Json(name = "next")
    private String mNext;

    @Json(name = "previous")
    private String mPrevious;

    @Json(name = "results")
    private List<ApiResource> mResults;

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

    public List<ApiResource> getResults() {
        return mResults;
    }

    public void setResults(List<ApiResource> results) {
        mResults = results;
    }
}
