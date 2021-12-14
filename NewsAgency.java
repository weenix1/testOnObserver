import java.util.*;
//import java.util.Observable;
//import java.util.Observer;
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class NewsAgency here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NewsAgency
{
    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channels) {
            channel.update(this.news);
        }
    }
}
