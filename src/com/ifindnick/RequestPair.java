package com.ifindnick;

public class RequestPair {
	private int FloorNum;//���������¥���
	private String RequestDirection;//������
	
	public RequestPair(int FloorNum,String RequestDirection){
		this.FloorNum = FloorNum;
		this.RequestDirection = RequestDirection;
	}

	public int getFloorNum() {
		return FloorNum;
	}

	public String getRequestDirection() {
		return RequestDirection;
	}
	
}
