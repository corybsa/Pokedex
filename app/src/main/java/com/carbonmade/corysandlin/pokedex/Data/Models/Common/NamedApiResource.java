package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import android.arch.persistence.room.ColumnInfo;

import com.squareup.moshi.Json;

public class NamedApiResource {
    @ColumnInfo(name = "resource_name")
    @Json(name = "name")
    private String mName;

    @ColumnInfo(name = "resource_url")
    @Json(name = "url")
    private String mUrl;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getFormattedName() {
        StringBuilder sb = new StringBuilder();
        String[] parts = mName.split("-");

        for(String part : parts) {
            sb.append(part.substring(0, 1).toUpperCase());
            sb.append(part.substring(1, part.length()));
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    public int getId() {
        String url = mUrl;
        String[] parts = url.split("/");
        return Integer.parseInt(parts[6]);
    }
}
