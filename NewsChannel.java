import java.util.*;
import java.util.Observable;
import java.util.Observer;
/**
 * Write a description of class NewsChannel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NewsChannel implements Channel
{
    private String news;

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    } 
}
