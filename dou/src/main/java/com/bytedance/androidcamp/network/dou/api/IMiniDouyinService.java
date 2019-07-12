package com.bytedance.androidcamp.network.dou.api;

import com.bytedance.androidcamp.network.dou.model.Video;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IMiniDouyinService {
    String HOST = "http://test.androidcamp.bytedance.com/mini_douyin/invoke/";
    String PATH = "video";

    @GET(PATH)
    Call<List<Video>> randomCat(@Query("limit") int limit);
}
