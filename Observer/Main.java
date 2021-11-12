import interfaces.Observer;
import model.EmailTopic;
import model.EmailTopicSub;

public class Main {
    public static void main(String[] args) {

        EmailTopic topic = new EmailTopic();

        //create observers
        Observer firstObserver = new EmailTopicSub("FirstObserver");
        Observer secondObserver = new EmailTopicSub("SecondObserver");
        Observer thirdObserver = new EmailTopicSub("ThirdObserver");

        //Register them...
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        //Attaching observer to subject
        firstObserver.setSuject(topic);
        secondObserver.setSuject(topic);
        thirdObserver.setSuject(topic);

        //check for updates
        firstObserver.update();
        thirdObserver.update();

        //Provider/ Subject ( broadcaster)
        topic.postMessage("Hola Subscribers!");

        topic.unregister(firstObserver);

        topic.postMessage("Hello Subscribers");
    }
}
