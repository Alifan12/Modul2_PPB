package com.example.cetakphoto;

import java.util.ArrayList;
import java.util.List;

public class CatalogPhotoHelper {

    private static int[] ridArray = {
            R.drawable.dor1,
            R.drawable.dor3,
            R.drawable.dor4,
    };

    private static String[] filenameArray = {
            "Doraemon 1",
            "Doraemon 2",
            "Doraemon 3",
    };

    private static List<CatalogPhoto> CatalogPhotoList;

    public static void init() {
        CatalogPhotoList = new ArrayList<>();

        int nArray = ridArray.length;
        for (int i=0;i<nArray;i++){
            CatalogPhotoList.add(new CatalogPhoto(ridArray[i], filenameArray[i]));
        }
    }

    public static List<CatalogPhoto> getCatalogPhotoList() {
        return CatalogPhotoList;
    }

    public static CatalogPhoto getCatalogPhotoAt(int i){
        return CatalogPhotoList.get(i);
    }
}
