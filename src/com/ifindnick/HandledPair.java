package com.ifindnick;

public class HandledPair {
	private int FloorNum;//¥���
	private int ThreadIndex;//Ҫ���䵽���߳��±�
	
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
