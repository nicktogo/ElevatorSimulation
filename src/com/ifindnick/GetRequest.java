package com.ifindnick;

import java.util.Observable;
import java.util.Vector;

public class GetRequest extends Observable {
	private Vector<RequestPair> requestList;
	
	public GetRequest(){
		requestList = new Vector<RequestPair>();
	}
	
	public void addRequest(RequestPair pair){
		requestList.add(pair);
		this.setChanged();
		this.notifyObservers(requestList);
	}

	public Vector<RequestPair> getRequestList() {
		return requestList;
	}
}
