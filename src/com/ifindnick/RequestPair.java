package com.ifindnick;

public class RequestPair {
	private int FloorNum;//发出请求的楼层号
	private String RequestDirection;//请求方向
	
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
