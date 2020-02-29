/*
 *Simple  Observer pattern example  using youtube scenario
 * here , 3 types of subscriber .there are
 * 	1.sms subscriber(which is not abvailble in youtube)
 * 	2.account subscriber
 * 	3.email subscriber
 *
 * */
package observerPattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YoutubeChannel emailSubs= new YoutubeChannel();
		YoutubeChannel smsSubs= new YoutubeChannel();
		YoutubeChannel accountSubs= new YoutubeChannel();
		
		emailSubs.subscribe(new EmailSubscriber());
		smsSubs.subscribe(new SmsSubscriber());
		accountSubs.subscribe(new AccountSubscriber());
		
		emailSubs.videoUpload();
		smsSubs.videoUpload();
		accountSubs.videoUpload();
		
	}

}
