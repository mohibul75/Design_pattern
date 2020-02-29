package observerPattern;

import java.util.ArrayList;

public class YoutubeChannel {
	
	ArrayList<ISubscriber> list =new ArrayList<ISubscriber>();
	
	public void videoUpload() {
		notifySubscriber();
	}
	
	public void notifySubscriber() {
		for(ISubscriber s: list) {
			s.getNotify();
		}
	}
	
	public void subscribe(ISubscriber a) {
		list.add(a);
	}
	
   public void unSubscribe(ISubscriber a) {
		list.remove(a);
	}
}
