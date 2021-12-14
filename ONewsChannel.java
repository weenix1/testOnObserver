import java.util.*;
import java.util.Observable;
import java.util.Observer;
import java.util.List;
/**
 * Write a description of class ONewsChannel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ONewsChannel implements Observer
{
    private String news;

    @Override
    public void update(Observable o, Object news) {
        this.setNews((String) news);
     }
     
    
}
