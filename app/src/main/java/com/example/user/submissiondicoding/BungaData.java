package com.example.user.submissiondicoding;

import java.util.ArrayList;
import java.util.Collection;

public class BungaData {
    public static String[][] data = new String[][] {
            {"Mawar", "Bunga dari Genus Rosa", "https://upload.wikimedia.org/wikipedia/commons/b/bc/Rosa_alba2.jpg"},
            {"Melati", "Bunga dari Genus Semak", "https://upload.wikimedia.org/wikipedia/commons/a/ac/JasminumSambac2.jpg"},
            {"Anggrek", "Bunga Hias dari Daerah Tropika", "https://upload.wikimedia.org/wikipedia/commons/d/dd/Orchis_sancta_Orchi_05.jpg"},
            {"Asoka", "Bunga Suci Agama Hindu", "https://upload.wikimedia.org/wikipedia/commons/2/2f/Sita-Ashok_%28Saraca_asoca%29_flowers_in_Kolkata_W_IMG_4146.jpg"},
            {"Teratai", "Bunga dari Suku Nymphaeaceae", "https://upload.wikimedia.org/wikipedia/commons/d/d3/Nelumno_nucifera_open_flower_-_botanic_garden_adelaide2.jpg"}
    };

    public static Collection<? extends Bunga> getListData(){
        Bunga bunga = null;
        ArrayList<Bunga> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            bunga = new Bunga();
            bunga.setName(data[i][0]);
            bunga.setRemarks(data[i][1]);
            bunga.setPhoto(data[i][2]);

            list.add(bunga);
        }

        return list;
    }
}
