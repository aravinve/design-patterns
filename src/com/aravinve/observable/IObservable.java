package com.aravinve.observable;

import com.aravinve.observers.IObserver;

public interface IObservable {

	void add(IObserver observer);
	
	void remove(IObserver observer);
	
	void notifyUpdate();
}
