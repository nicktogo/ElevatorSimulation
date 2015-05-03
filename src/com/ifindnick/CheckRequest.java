package com.ifindnick;

import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import com.ifindnick.Main.Lift;

public class CheckRequest implements Observer {
	
	private Vector<RequestPair> requestList;

	public CheckRequest(){
		requestList = new Vector<RequestPair>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		requestList = (Vector<RequestPair>) arg;
		System.out.println("get notify~");
		System.out.println(requestList);
	}
	
	//返回一个请求给main，让main来分派到子线程，//main要传电梯线程数组给这里！！！记住！！！
	public HandledPair check(Lift[] lift){
		HandledPair pair = null;
		
		Iterator<RequestPair> it = requestList.iterator();
		while(it.hasNext()){
			System.out.println("分派中。。。共有" + requestList.size() + "个请求");
			RequestPair p = it.next();		
			int requestFloorNum = p.getFloorNum();
			String requestDirection = p.getRequestDirection();
			
			int minDistance = 100;//记录最短距离
			int best = -1;//记录最佳电梯的下标
			
			for (int i = 0; i < lift.length; i++ ){
				synchronized (lift[i]) {
					System.out.println("进入同步代码块");
					String state = lift[i].getState();
					System.out.println("电梯" + (i+1) + "的状态是" + state);
					int current = lift[i].getCurrent();
					System.out.println("电梯" + (i+1) + "的current是" + current);
					
					if(requestDirection.equals(state)){
						if(Math.abs(current-requestFloorNum) < minDistance){
							minDistance = Math.abs(current-requestFloorNum);
							best = i;
						}
					} else if(state.equals("STATIC")){
						System.out.println((i+1) + "电梯时静止的");
						if(Math.abs(current-requestFloorNum) < minDistance){
							minDistance = Math.abs(current-requestFloorNum);
							best = i;
							System.out.println("最佳电梯是" + best);
							
						}
					}
				}
			}	
			
			//选出一个最佳电梯
			if(best != -1){
				//分派~~~
				System.out.println("最佳电梯是：" + best);
				pair = new HandledPair(requestFloorNum, best);
				//移除这个请求，并跳出while循环
				it.remove();
				break;
			}
		}
		
		return pair;
	}

}
