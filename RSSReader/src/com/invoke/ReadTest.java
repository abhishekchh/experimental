package com.invoke;

import com.rss.feed.Feed;
import com.rss.feed.FeedMessage;
import com.rss.parser.RSSFeedParser;

public class ReadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 RSSFeedParser parser = new RSSFeedParser("http://news.yahoo.com/rss/");
		 RSSFeedParser parser = new RSSFeedParser("http://www.thehindu.com/sci-tech/technology/?service=rss");
		    Feed feed = parser.readFeed();
		    System.out.println(feed);
		    for (FeedMessage message : feed.getMessages()) {
		      System.out.println(message);
		      System.out.println("...............................");
		      System.out.println(message.getTitle());
		      System.out.println(message.getLink());
		      System.out.println("...............................");

		    }


	}

}
