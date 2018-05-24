package com.thaihuy.demojsonwithrecyclerview;

public class User {
    private String mName;
    private String mAvatar;

    public User(String mName, String mAvatar) {
        this.mName = mName;
        this.mAvatar = mAvatar;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAvatar() {
        return mAvatar;
    }

    public void setmAvatar(String mAvatar) {
        this.mAvatar = mAvatar;
    }
}
