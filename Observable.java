import java.util.*;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Observable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Observable
{
  NewsAgency observable = new NewsAgency();
  NewsChannel observer = new NewsChannel();

  observable.addObserver(observer);
  observable.setNews("news");
  assertEquals(observer.getNews(), "news");
}
