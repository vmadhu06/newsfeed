package repository;

import models.NewsFeedItem;

import java.util.HashMap;

public class ShowNewsFeedRepository {

    HashMap<Long, NewsFeedItem> inMemoryData = new HashMap<>();
    public void getNewsFeedForUser(String userId) {
    }


    public void fillInMemoryData(){
        inMemoryData.put("ade")
    }
}
