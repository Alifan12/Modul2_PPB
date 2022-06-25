package com.example.cetakphoto;

public class CatalogPhoto {
    private int resId;
    private String filename;

    public CatalogPhoto(int _resId, String _filename){
        resId = _resId;
        filename = _filename;
    }

    public int getRestId() {
        return resId;
    }

    public void setRestId(int restId) {
        this.resId = restId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
