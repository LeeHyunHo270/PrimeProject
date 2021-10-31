package com.example.primeproject;

import java.util.HashMap;
import java.util.Map;

public class FirebasePost {
    public String image;
    public String fullName;
    public String country;
    public String senderName;

    public FirebasePost() {
    }

    public FirebasePost(String image, String fullName, String country, String senderName) {
        this.image = image;
        this.fullName = fullName;
        this.country = country;
        this.senderName = senderName;
    }


    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("image",image);
        result.put("fullName",fullName);
        result.put("country",country);
        result.put("senderName",senderName);

        return result;
    }

}
