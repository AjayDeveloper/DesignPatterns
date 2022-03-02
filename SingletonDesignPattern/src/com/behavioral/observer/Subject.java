package com.behavioral.observer;

public interface Subject {

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifySubsribers();

	void upload(String title);

}