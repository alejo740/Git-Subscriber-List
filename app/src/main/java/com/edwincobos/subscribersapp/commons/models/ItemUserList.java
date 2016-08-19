package com.edwincobos.subscribersapp.commons.models;

import java.util.ArrayList;

/**
 * Created by edwin.cobos on 19/08/2016.
 */
public class ItemUserList {

    private int id;

    //@SerializedName("login")
    private String userName;

    private String name;
    private String company;
    private String location;
    private String avatarUrl;
    private int followersCounter;
    private int followingCounter;
    private int reposCounter;
    private ArrayList<String> repoNames;

    public ItemUserList(int id, String userName){
        this.id = id;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFollowersCounter() {
        return followersCounter;
    }

    public void setFollowersCounter(int followersCounter) {
        this.followersCounter = followersCounter;
    }

    public int getFollowingCounter() {
        return followingCounter;
    }

    public void setFollowingCounter(int followingCounter) {
        this.followingCounter = followingCounter;
    }

    public int getReposCounter() {
        return reposCounter;
    }

    public void setReposCounter(int reposCounter) {
        this.reposCounter = reposCounter;
    }

    public ArrayList<String> getRepoNames() {
        return repoNames;
    }

    public void setRepoNames(ArrayList<String> repoNames) {
        this.repoNames = repoNames;
    }
}
