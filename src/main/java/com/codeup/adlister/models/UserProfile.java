package com.codeup.adlister.models;

public class UserProfile {
    private  long id;
    private String profile_pic;
    private String about;
    private long user_id;

    public UserProfile(){

    }

    public UserProfile(long id, String profile_pic, String about, long user_id) {
        this.id = id;
        this.profile_pic = profile_pic;
        this.about = about;
        this.user_id = user_id;
    }

    public UserProfile(String profile_pic, String about, long user_id) {
        this.profile_pic = profile_pic;
        this.about = about;
        this.user_id = user_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
