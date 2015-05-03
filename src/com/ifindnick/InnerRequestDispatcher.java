package com.ifindnick;

import java.util.Iterator;
import java.util.Vector;

import com.ifindnick.Main.Lift;

public class InnerRequestDispatcher extends Thread {
	
	private Lift[] lift;
	private Vector<HandledPair> innerRequest;
	
	public InnerRequestDispatcher(Lift[] lift){
		this.lift = lift;
	}
	
	public void addInnerRequest(HandledPair p){
		innerRequest.add(p);
	}
	
	@Override
	public void run() {
		
		while(true){
			Iterator<HandledPair> it = innerRequest.iterator();
			while(it.hasNext()){
				HandledPair pair = it.next();
				int FloorNum = pair.getFloorNum();
				int ThreadIndex = pair.getThreadIndex();
				
				if(FloorNum > lift[ThreadIndex].getCurrent() && lift[ThreadIndex].getState().equals("UP")){
					lift[ThreadIndex].getUpTask().add(new Integer(FloorNum));
				} else if (FloorNum < lift[ThreadIndex].getCurrent() && lift[ThreadIndex].getState().equals("DOWN")){
					lift[ThreadIndex].getDownTask().add(new Integer(FloorNum));
				}
				
			}
			
		}
		
		
	}
}
