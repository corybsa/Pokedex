package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Description;
import com.squareup.moshi.Json;

import java.util.List;

public class Characteristic {
    @Json(name = "id")
    private int mId;

    @Json(name = "gene_modulo")
    private int mGeneModulo;

    @Json(name = "possible_values")
    private List<Integer> mPossibleValues;

    @Json(name = "descriptions")
    private List<Description> mDescriptions;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getGeneModulo() {
        return mGeneModulo;
    }

    public void setGeneModulo(int geneModulo) {
        mGeneModulo = geneModulo;
    }

    public List<Integer> getPossibleValues() {
        return mPossibleValues;
    }

    public void setPossibleValues(List<Integer> possibleValues) {
        mPossibleValues = possibleValues;
    }

    public List<Description> getDescriptions() {
        return mDescriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        mDescriptions = descriptions;
    }
}
