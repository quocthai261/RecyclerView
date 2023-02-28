package com.example.bt3;

public class NewsView {
    private int imageViewSource;
    private String title;
    private String short_description;
    private String description;


    public NewsView(int imageViewSource, String title, String short_description, String description) {
        this.imageViewSource = imageViewSource;
        this.title = title;
        this.short_description = short_description;
        this.description = description;
    }

    public int getImageViewSource() {
        return imageViewSource;
    }

    public String getTitle() {
        return title;
    }

    public String getShort_description() {
        return short_description;
    }

    public String getDescription() {
        return description;
    }
}
