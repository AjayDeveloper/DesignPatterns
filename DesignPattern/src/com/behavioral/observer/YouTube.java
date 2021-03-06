package com.behavioral.observer;

public class YouTube {

	public static void main(String[] args) {

		//Channel created 
		Channel ch = new Channel();
		
		//Subscriber name created 
		Subscriber s1 = new Subscriber("Aasif");
		Subscriber s2 = new Subscriber("UdayKumar");
		Subscriber s3 = new Subscriber("Ajay");
		Subscriber s4 = new Subscriber("Deepak");
		Subscriber s5 = new Subscriber("Anoop");
		
		
		ch.subscribe(s1);
		ch.subscribe(s2);
		ch.subscribe(s3);
		ch.subscribe(s4);
		ch.subscribe(s5);
		
		ch.unSubscribe(s3);
		
		s1.subscriberChannel(ch);
		s2.subscriberChannel(ch);
		s3.subscriberChannel(ch);
		s4.subscriberChannel(ch);
		s5.subscriberChannel(ch);
		
		ch.upload("How to Create Spring boot Application ??");
		
	}

}
