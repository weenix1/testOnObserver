import java.util.*;
import java.util.Observable;
import java.util.Observer;
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class ONewsAgency here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ONewsAgency extends Observable
{
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
