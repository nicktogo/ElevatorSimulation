package com.ifindnick;

public class HandledPair {
	private int FloorNum;//楼层号
	private int ThreadIndex;//要分配到的线程下标
	
	public HandledPair(int floorNum, int threadIndex) {
		FloorNum = floorNum;
		ThreadIndex = threadIndex;
	}

	public int getFloorNum() {
		return FloorNum;
	}

	public int getThreadIndex() {
		return ThreadIndex;
	}
	
	
}
