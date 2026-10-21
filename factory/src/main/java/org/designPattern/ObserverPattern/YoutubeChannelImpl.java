package org.designPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements YoutubeChannel{

    private List<Subscriber>subscriberList=new ArrayList<>();

    private String video;
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber: subscriberList) {
            subscriber.update(video);
        }
    }

    public void uploadVideo(String video) {
        this.video = video;
        System.out.println("Uploading new video: " + video);
        notifySubscribers();
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }
}
