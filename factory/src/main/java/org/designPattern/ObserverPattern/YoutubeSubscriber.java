package org.designPattern.ObserverPattern;

public class YoutubeSubscriber implements Subscriber{
    private String name;
    public YoutubeSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String video) {
        System.out.println("New video uploaded: " + video);

    }
}
