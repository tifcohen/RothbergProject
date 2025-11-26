package com.example.layoutexample.model;

import com.google.gson.annotations.SerializedName;

/*
* {
    "error": false,
    "category": "Programming",
    "type": "twopart",
    "setup": "So what's a set of predefined steps the government might take to preserve the environment?",
    "delivery": "An Al-Gore-ithm.",
    "flags": {
        "nsfw": false,
        "religious": false,
        "political": false,
        "racist": false,
        "sexist": false,
        "explicit": false
    },
    "id": 51,
    "safe": true,
    "lang": "en"
}
* */

public class JokeResponseData {

    @SerializedName("error")
    private Boolean error;

    @SerializedName("category")
    private String category;

    @SerializedName("type")
    private Type type;

    @SerializedName("joke")
    private String joke;

    @SerializedName("setup")
    private String setup;

    @SerializedName("delivery")
    private String delivery;

    public JokeResponseData(Boolean error, String category, Type type, String joke, String setup, String delivery) {
        this.error = error;
        this.category = category;
        this.type = type;
        this.joke = joke;
        this.setup = setup;
        this.delivery = delivery;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String body) {
        this.category = category;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setUserId(String delivery) {
        this.delivery = delivery;
    }

    public enum Type {
        @SerializedName("single") SINGLE,
        @SerializedName("twopart") TWO_PART;
    }
}
