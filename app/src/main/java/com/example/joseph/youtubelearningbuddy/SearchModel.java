package com.example.joseph.youtubelearningbuddy;

import ir.mirrajabi.searchdialog.core.Searchable;

public class SearchModel implements Searchable {

    private String title;

    public SearchModel(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
