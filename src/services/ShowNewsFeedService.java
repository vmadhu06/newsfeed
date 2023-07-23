package service;

import repository.ShowNewsFeedRepository;

public class ShowNewsFeedService {

    ShowNewsFeedRepository showNewsFeedRepository;

    public ShowNewsFeedService(){
        showNewsFeedRepository = new  ShowNewsFeedRepository();
    }

    public void showNewsFeed(String userId) {
        showNewsFeedRepository.getNewsFeedForUser(userId);
    }
}
