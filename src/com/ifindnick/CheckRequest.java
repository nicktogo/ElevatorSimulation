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
	
	//����һ�������main����main�����ɵ����̣߳�//mainҪ�������߳���������������ס������
	public HandledPair check(Lift[] lift){
		HandledPair pair = null;
		
		Iterator<RequestPair> it = requestList.iterator();
		while(it.hasNext()){
			System.out.println("�����С���������" + requestList.size() + "������");
			RequestPair p = it.next();		
			int requestFloorNum = p.getFloorNum();
			String requestDirection = p.getRequestDirection();
			
			int minDistance = 100;//��¼��̾���
			int best = -1;//��¼��ѵ��ݵ��±�
			
			for (int i = 0; i < lift.length; i++ ){
				synchronized (lift[i]) {
					System.out.println("����ͬ�������");
					String state = lift[i].getState();
					System.out.println("����" + (i+1) + "��״̬��" + state);
					int current = lift[i].getCurrent();
					System.out.println("����" + (i+1) + "��current��" + current);
					
					if(requestDirection.equals(state)){
						if(Math.abs(current-requestFloorNum) < minDistance){
							minDistance = Math.abs(current-requestFloorNum);
							best = i;
						}
					} else if(state.equals("STATIC")){
						System.out.println((i+1) + "����ʱ��ֹ��");
						if(Math.abs(current-requestFloorNum) < minDistance){
							minDistance = Math.abs(current-requestFloorNum);
							best = i;
							System.out.println("��ѵ�����" + best);
							
						}
					}
				}
			}	
			
			//ѡ��һ����ѵ���
			if(best != -1){
				//����~~~
				System.out.println("��ѵ����ǣ�" + best);
				pair = new HandledPair(requestFloorNum, best);
				//�Ƴ�������󣬲�����whileѭ��
				it.remove();
				break;
			}
		}
		
		return pair;
	}

}
