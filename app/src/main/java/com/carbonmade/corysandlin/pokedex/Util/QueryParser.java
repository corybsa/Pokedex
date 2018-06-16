package com.carbonmade.corysandlin.pokedex.Util;

public class QueryParser {
    private String mUrl;

    public QueryParser(String url) {
        mUrl = url;
    }

    public int getNumber(String variable) {
        return Integer.parseInt(getString(variable));
    }

    public String getString(String variable) {
        int qMark = mUrl.indexOf('?') + 1;
        String[] parts = mUrl.substring(qMark).split("&");

        for(int i = 0; i < parts.length; i++) {
            String var = parts[i].split("=")[0];
            String val = parts[i].split("=")[1];

            if(var.equals(variable)) {
                return val;
            }
        }

        return "";
    }
}
