package model;

import interfaces.Observer;
import interfaces.Subject;

public class EmailTopicSub implements Observer {
    private String name;

    //Reference to our subject
    private Subject topic;

    public EmailTopicSub(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)topic.getUpdate(this);
        if(msg == null)
            System.out.println(name +" No new message on this topic!");
        else
            System.out.println(name +" Retrieving message: "+ msg);
    }

    @Override
    public void setSuject(Subject subject) {
        this.topic=subject;
    }
}
