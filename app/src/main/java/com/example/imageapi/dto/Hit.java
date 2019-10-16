package com.example.imageapi.dto;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "largeImageURL",
        "webformatHeight",
        "webformatWidth",
        "likes",
        "imageWidth",
        "id",
        "user_id",
        "views",
        "comments",
        "pageURL",
        "imageHeight",
        "webformatURL",
        "type",
        "previewHeight",
        "tags",
        "downloads",
        "user",
        "favorites",
        "imageSize",
        "previewWidth",
        "userImageURL",
        "previewURL"
})
public class Hit {

    @JsonProperty("largeImageURL")
    private String largeImageURL;
    @JsonProperty("webformatHeight")
    private Integer webformatHeight;
    @JsonProperty("webformatWidth")
    private Integer webformatWidth;
    @JsonProperty("likes")
    private Integer likes;
    @JsonProperty("imageWidth")
    private Integer imageWidth;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("comments")
    private Integer comments;
    @JsonProperty("pageURL")
    private String pageURL;
    @JsonProperty("imageHeight")
    private Integer imageHeight;
    @JsonProperty("webformatURL")
    private String webformatURL;
    @JsonProperty("type")
    private String type;
    @JsonProperty("previewHeight")
    private Integer previewHeight;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("downloads")
    private Integer downloads;
    @JsonProperty("user")
    private String user;
    @JsonProperty("favorites")
    private Integer favorites;
    @JsonProperty("imageSize")
    private Integer imageSize;
    @JsonProperty("previewWidth")
    private Integer previewWidth;
    @JsonProperty("userImageURL")
    private String userImageURL;
    @JsonProperty("previewURL")
    private String previewURL;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("largeImageURL")
    public String getLargeImageURL() {
        return largeImageURL;
    }

    @JsonProperty("largeImageURL")
    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    @JsonProperty("webformatHeight")
    public Integer getWebformatHeight() {
        return webformatHeight;
    }

    @JsonProperty("webformatHeight")
    public void setWebformatHeight(Integer webformatHeight) {
        this.webformatHeight = webformatHeight;
    }

    @JsonProperty("webformatWidth")
    public Integer getWebformatWidth() {
        return webformatWidth;
    }

    @JsonProperty("webformatWidth")
    public void setWebformatWidth(Integer webformatWidth) {
        this.webformatWidth = webformatWidth;
    }

    @JsonProperty("likes")
    public Integer getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @JsonProperty("imageWidth")
    public Integer getImageWidth() {
        return imageWidth;
    }

    @JsonProperty("imageWidth")
    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    @JsonProperty("comments")
    public Integer getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @JsonProperty("pageURL")
    public String getPageURL() {
        return pageURL;
    }

    @JsonProperty("pageURL")
    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    @JsonProperty("imageHeight")
    public Integer getImageHeight() {
        return imageHeight;
    }

    @JsonProperty("imageHeight")
    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    @JsonProperty("webformatURL")
    public String getWebformatURL() {
        return webformatURL;
    }

    @JsonProperty("webformatURL")
    public void setWebformatURL(String webformatURL) {
        this.webformatURL = webformatURL;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("previewHeight")
    public Integer getPreviewHeight() {
        return previewHeight;
    }

    @JsonProperty("previewHeight")
    public void setPreviewHeight(Integer previewHeight) {
        this.previewHeight = previewHeight;
    }

    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    @JsonProperty("downloads")
    public Integer getDownloads() {
        return downloads;
    }

    @JsonProperty("downloads")
    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("favorites")
    public Integer getFavorites() {
        return favorites;
    }

    @JsonProperty("favorites")
    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }

    @JsonProperty("imageSize")
    public Integer getImageSize() {
        return imageSize;
    }

    @JsonProperty("imageSize")
    public void setImageSize(Integer imageSize) {
        this.imageSize = imageSize;
    }

    @JsonProperty("previewWidth")
    public Integer getPreviewWidth() {
        return previewWidth;
    }

    @JsonProperty("previewWidth")
    public void setPreviewWidth(Integer previewWidth) {
        this.previewWidth = previewWidth;
    }

    @JsonProperty("userImageURL")
    public String getUserImageURL() {
        return userImageURL;
    }

    @JsonProperty("userImageURL")
    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }

    @JsonProperty("previewURL")
    public String getPreviewURL() {
        return previewURL;
    }

    @JsonProperty("previewURL")
    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
