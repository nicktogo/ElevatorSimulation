package com.ifindnick;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame{
	
	
	
	private JComboBox[] ctrlComboBox;

	private JPanel contentPane;
	
	private static JComboBox<String> lift1_Ctrl;
	private static JComboBox<String> lift2_Ctrl;
	private static JComboBox<String> lift3_Ctrl;
	private static JComboBox<String> lift4_Ctrl;
	private static JComboBox<String> lift5_Ctrl;
	
	private JComboBox<String> comboBox_20;
	private JComboBox<String> comboBox_19;
	private JComboBox<String> comboBox_18;
	private JComboBox<String> comboBox_17;
	private JComboBox<String> comboBox_16;
	private JComboBox<String> comboBox_15;
	private JComboBox<String> comboBox_14;
	private JComboBox<String> comboBox_13;
	private JComboBox<String> comboBox_12;
	private JComboBox<String> comboBox_11;
	private JComboBox<String> comboBox_10;
	private JComboBox<String> comboBox_9;
	private JComboBox<String> comboBox_8;
	private JComboBox<String> comboBox_7;
	private JComboBox<String> comboBox_6;
	private JComboBox<String> comboBox_5;
	private JComboBox<String> comboBox_4;
	private JComboBox<String> comboBox_3;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_1;

	private static JProgressBar lift5_20 = new JProgressBar();
	private static JProgressBar lift4_20 = new JProgressBar();
	private static JProgressBar lift3_20 = new JProgressBar();
	private static JProgressBar lift2_20 = new JProgressBar();
	private static JProgressBar lift1_20 = new JProgressBar();
	private static JProgressBar lift5_19 = new JProgressBar();
	private static JProgressBar lift4_19 = new JProgressBar();
	private static JProgressBar lift3_19 = new JProgressBar();
	private static JProgressBar lift2_19 = new JProgressBar();
	private static JProgressBar lift1_19 = new JProgressBar();
	private static JProgressBar lift5_18 = new JProgressBar();
	private static JProgressBar lift4_18 = new JProgressBar();
	private static JProgressBar lift3_18 = new JProgressBar();
	private static JProgressBar lift2_18 = new JProgressBar();
	private static JProgressBar lift1_18 = new JProgressBar();
	private static JProgressBar lift1_17 = new JProgressBar();
	private static JProgressBar lift2_17 = new JProgressBar();
	private static JProgressBar lift3_17 = new JProgressBar();
	private static JProgressBar lift4_17 = new JProgressBar();
	private static JProgressBar lift5_17 = new JProgressBar();
	private static JProgressBar lift5_16 = new JProgressBar();
	private static JProgressBar lift5_15 = new JProgressBar();
	private static JProgressBar lift4_15 = new JProgressBar();
	private static JProgressBar lift3_15 = new JProgressBar();
	private static JProgressBar lift1_15 = new JProgressBar();
	private static JProgressBar lift2_15 = new JProgressBar();
	private static JProgressBar lift5_14 = new JProgressBar();
	private static JProgressBar lift4_14 = new JProgressBar();
	private static JProgressBar lift3_14 = new JProgressBar();
	private static JProgressBar lift2_14 = new JProgressBar();
	private static JProgressBar lift1_14 = new JProgressBar();
	private static JProgressBar lift1_13 = new JProgressBar();
	private static JProgressBar lift5_12 = new JProgressBar();
	private static JProgressBar lift4_12 = new JProgressBar();
	private static JProgressBar lift3_12 = new JProgressBar();
	private static JProgressBar lift2_12 = new JProgressBar();
	private static JProgressBar lift1_12 = new JProgressBar();
	private static JProgressBar lift5_11 = new JProgressBar();
	private static JProgressBar lift4_11 = new JProgressBar();
	private static JProgressBar lift3_11 = new JProgressBar();
	private static JProgressBar lift2_11 = new JProgressBar();
	private static JProgressBar lift1_11 = new JProgressBar();
	private static JProgressBar lift5_10 = new JProgressBar();
	private static JProgressBar lift4_10 = new JProgressBar();
	private static JProgressBar lift3_10 = new JProgressBar();
	private static JProgressBar lift2_10 = new JProgressBar();
	private static JProgressBar lift1_10 = new JProgressBar();
	private static JProgressBar lift5_9 = new JProgressBar();
	private static JProgressBar lift4_9 = new JProgressBar();
	private static JProgressBar lift3_9 = new JProgressBar();
	private static JProgressBar lift2_9 = new JProgressBar();
	private static JProgressBar lift1_9 = new JProgressBar();
	private static JProgressBar lift5_8 = new JProgressBar();
	private static JProgressBar lift1_8 = new JProgressBar();
	private static JProgressBar lift2_8 = new JProgressBar();
	private static JProgressBar lift3_8 = new JProgressBar();
	private static JProgressBar lift4_8 = new JProgressBar();
	private static JProgressBar lift5_7 = new JProgressBar();
	private static JProgressBar lift5_6 = new JProgressBar();
	private static JProgressBar lift5_5 = new JProgressBar();
	private static JProgressBar lift5_4 = new JProgressBar();
	private static JProgressBar lift5_3 = new JProgressBar();
	private static JProgressBar lift5_2 = new JProgressBar();
	private static JProgressBar lift5_1 = new JProgressBar();
	private static JProgressBar lift4_1 = new JProgressBar();
	private static JProgressBar lift4_2 = new JProgressBar();
	private static JProgressBar lift4_3 = new JProgressBar();
	private static JProgressBar lift4_4 = new JProgressBar();
	private static JProgressBar lift4_5 = new JProgressBar();
	private static JProgressBar lift4_6 = new JProgressBar();
	private static JProgressBar lift4_7 = new JProgressBar();
	private static JProgressBar lift3_7 = new JProgressBar();
	private static JProgressBar lift3_6 = new JProgressBar();
	private static JProgressBar lift3_5 = new JProgressBar();
	private static JProgressBar lift3_4 = new JProgressBar();
	private static JProgressBar lift3_3 = new JProgressBar();
	private static JProgressBar lift3_2 = new JProgressBar();
	private static JProgressBar lift3_1 = new JProgressBar();
	private static JProgressBar lift2_1 = new JProgressBar();
	private static JProgressBar lift2_2 = new JProgressBar();
	private static JProgressBar lift2_3 = new JProgressBar();
	private static JProgressBar lift2_4 = new JProgressBar();
	private static JProgressBar lift2_5 = new JProgressBar();
	private static JProgressBar lift2_6 = new JProgressBar();
	private static JProgressBar lift2_7 = new JProgressBar();
	private static JProgressBar lift1_7 = new JProgressBar();
	private static JProgressBar lift1_6 = new JProgressBar();
	private static JProgressBar lift1_5 = new JProgressBar();
	private static JProgressBar lift1_4 = new JProgressBar();
	private static JProgressBar lift1_3 = new JProgressBar();
	private static JProgressBar lift1_2 = new JProgressBar();
	private static JProgressBar lift1_1 = new JProgressBar();
	private static JProgressBar lift3_13 = new JProgressBar();
	private static JProgressBar lift2_13 = new JProgressBar();
	private static JProgressBar lift1_16 = new JProgressBar();
	private static JProgressBar lift2_16 = new JProgressBar();
	private static JProgressBar lift3_16 = new JProgressBar();
	private static JProgressBar lift4_16 = new JProgressBar();
	private static JProgressBar lift5_13 = new JProgressBar();
	private static JProgressBar lift4_13 = new JProgressBar();
 	
	private static JProgressBar[] lift1 = new JProgressBar[] {lift1_1,lift1_2,lift1_3,lift1_4,lift1_5,lift1_6,lift1_7,lift1_8,lift1_9,lift1_10,
		lift1_11,lift1_12,lift1_13,lift1_14,lift1_15,lift1_16,lift1_17,lift1_18,lift1_19,lift1_20};
	private static JProgressBar[] lift2 = new JProgressBar[] {lift2_1,lift2_2,lift2_3,lift2_4,lift2_5,lift2_6,lift2_7,lift2_8,lift2_9,lift2_10,
		lift2_11,lift2_12,lift2_13,lift2_14,lift2_15,lift2_16,lift2_17,lift2_18,lift2_19,lift2_20};
	private static JProgressBar[] lift3 = new JProgressBar[] {lift3_1,lift3_2,lift3_3,lift3_4,lift3_5,lift3_6,lift3_7,lift3_8,lift3_9,lift3_10,
		lift3_11,lift3_12,lift3_13,lift3_14,lift3_15,lift3_16,lift3_17,lift3_18,lift3_19,lift3_20};
	private static JProgressBar[] lift4 = new JProgressBar[] {lift4_1,lift4_2,lift4_3,lift4_4,lift4_5,lift4_6,lift4_7,lift4_8,lift4_9,lift4_10,
		lift4_11,lift4_12,lift4_13,lift4_14,lift4_15,lift4_16,lift4_17,lift4_18,lift4_19,lift4_20};
	private static JProgressBar[] lift5 = new JProgressBar[] {lift5_1,lift5_2,lift5_3,lift5_4,lift5_5,lift5_6,lift5_7,lift5_8,lift5_9,lift5_10,
		lift5_11,lift5_12,lift5_13,lift5_14,lift5_15,lift5_16,lift5_17,lift5_18,lift5_19,lift5_20};
	
	private static CheckRequest checkRequest = new CheckRequest();
	
	private GetRequest request;

//	static{
//		lift1 = new JProgressBar[] {lift1_1,lift1_2,lift1_3,lift1_4,lift1_5,lift1_6,lift1_7,lift1_8,lift1_9,lift1_10,
//				lift1_11,lift1_12,lift1_13,lift1_14,lift1_15,lift1_16,lift1_17,lift1_18,lift1_19,lift1_20};
//		
//		lift2 = new JProgressBar[] {lift2_1,lift2_2,lift2_3,lift2_4,lift2_5,lift2_6,lift2_7,lift2_8,lift2_9,lift2_10,
//				lift2_11,lift2_12,lift2_13,lift2_14,lift2_15,lift2_16,lift2_17,lift2_18,lift2_19,lift2_20};
//		
//		lift3 = new JProgressBar[] {lift3_1,lift3_2,lift3_3,lift3_4,lift3_5,lift3_6,lift3_7,lift3_8,lift3_9,lift3_10,
//				lift3_11,lift3_12,lift3_13,lift3_14,lift3_15,lift3_16,lift3_17,lift3_18,lift3_19,lift3_20};
//		
//		lift4 = new JProgressBar[] {lift4_1,lift4_2,lift4_3,lift4_4,lift4_5,lift4_6,lift4_7,lift4_8,lift4_9,lift4_10,
//				lift4_11,lift4_12,lift4_13,lift4_14,lift4_15,lift4_16,lift4_17,lift4_18,lift4_19,lift4_20};
//		
//		lift5 = new JProgressBar[] {lift5_1,lift5_2,lift5_3,lift5_4,lift5_5,lift5_6,lift5_7,lift5_8,lift5_9,lift5_10,
//				lift5_11,lift5_12,lift5_13,lift5_14,lift5_15,lift5_16,lift5_17,lift5_18,lift5_19,lift5_20};
//		
//		checkRequest = new CheckRequest();
//	}
//	

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		comboBox_20 = new JComboBox<String>();
		comboBox_20.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_20.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(20, comboBox_20.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_20.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		comboBox_20.setSelectedIndex(0);
		
		comboBox_19 = new JComboBox<String>();
		comboBox_19.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_19.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(19, comboBox_19.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
				
			}
		});
		comboBox_19.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_18 = new JComboBox<String>();
		comboBox_18.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_18.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(18, comboBox_18.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_18.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_17 = new JComboBox<String>();
		comboBox_17.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_17.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(17, comboBox_17.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_17.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_16 = new JComboBox<String>();
		comboBox_16.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_16.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(16, comboBox_16.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_16.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_15 = new JComboBox<String>();
		comboBox_15.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_15.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(15, comboBox_15.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_15.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_14 = new JComboBox<String>();
		comboBox_14.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_4.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(14, comboBox_14.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_14.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_13 = new JComboBox<String>();
		comboBox_13.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_13.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(13, comboBox_13.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_13.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_12 = new JComboBox<String>();
		comboBox_12.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_12.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(12, comboBox_12.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_12.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_11 = new JComboBox<String>();
		comboBox_11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_11.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(11, comboBox_11.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_11.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_10 = new JComboBox<String>();
		comboBox_10.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_10.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(10, comboBox_10.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_10.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_9 = new JComboBox<String>();
		comboBox_9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_9.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(9, comboBox_9.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_9.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_8 = new JComboBox<String>();
		comboBox_8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_8.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(8, comboBox_8.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_8.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_7 = new JComboBox<String>();
		comboBox_7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_7.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(7, comboBox_7.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_7.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_6 = new JComboBox<String>();
		comboBox_6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_6.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(6, comboBox_6.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_6.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_5 = new JComboBox<String>();
		comboBox_5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_5.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(5, comboBox_5.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_5.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_4 = new JComboBox<String>();
		comboBox_4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_4.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(4, comboBox_4.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_4.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_3 = new JComboBox<String>();
		comboBox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_3.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(3, comboBox_3.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_3.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_2 = new JComboBox<String>();
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_2.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(2, comboBox_2.getSelectedItem().toString());
						request.addRequest(pair);
					}
				}
				
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		
		comboBox_1 = new JComboBox<String>();
		
		//监听选择事件，把请求加入请求列表(requestList)中
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!"NULL".equals(comboBox_1.getSelectedItem().toString())){
						RequestPair pair = new RequestPair(1, comboBox_1.getSelectedItem().toString());
						request.addRequest(pair);
					}
						
				}
				
				
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"NULL", "UP", "DOWM"}));
		contentPane.setLayout(new GridLayout(0, 7, 1, 1));
		
		JLabel label_20 = new JLabel("");
		contentPane.add(label_20);
		
		lift1_Ctrl = new JComboBox<String>();
		lift1_Ctrl.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!(lift1_Ctrl.getSelectedItem().toString().equals("OPEN") 
							|| lift1_Ctrl.getSelectedItem().toString().equals("CLOSE"))){
						HandledPair pair = new HandledPair(Integer.parseInt(lift1_Ctrl.getSelectedItem().toString()),
								0);
						
						
					}
				}
			}
		});
		lift1_Ctrl.setModel(new DefaultComboBoxModel<String>(new String[] {"OPEN","CLOSE","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(lift1_Ctrl);
		
		lift2_Ctrl = new JComboBox<String>();
		lift2_Ctrl.setModel(new DefaultComboBoxModel<String>(new String[] {"OPEN","CLOSE","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(lift2_Ctrl);
		
		lift3_Ctrl = new JComboBox<String>();
		lift3_Ctrl.setModel(new DefaultComboBoxModel<String>(new String[] {"OPEN","CLOSE","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(lift3_Ctrl);
		
		lift4_Ctrl = new JComboBox<String>();
		lift4_Ctrl.setModel(new DefaultComboBoxModel<String>(new String[] {"OPEN","CLOSE","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(lift4_Ctrl);
		
		lift5_Ctrl = new JComboBox<String>();
		lift5_Ctrl.setModel(new DefaultComboBoxModel<String>(new String[] {"OPEN","CLOSE","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(lift5_Ctrl);
		
		JLabel label_21 = new JLabel("");
		contentPane.add(label_21);
		
		JLabel label = new JLabel("20");
		label.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label);
		
//		lift1_20 = new JProgressBar();
		lift1_20.setMaximum(1);
		contentPane.add(lift1_20);
		
//		lift2_20 = new JProgressBar();
		lift2_20.setMaximum(1);
		contentPane.add(lift2_20);
		
//		lift3_20 = new JProgressBar();
		lift3_20.setMaximum(1);
		contentPane.add(lift3_20);
		
//		lift4_20 = new JProgressBar();
		lift4_20.setMaximum(1);
		contentPane.add(lift4_20);
		
//		lift5_20 = new JProgressBar();
		lift5_20.setMaximum(1);
		contentPane.add(lift5_20);
		contentPane.add(comboBox_20);
		
		JLabel label_1 = new JLabel("19");
		label_1.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_1);
		
//		lift1_19 = new JProgressBar();
		lift1_19.setMaximum(1);
		contentPane.add(lift1_19);
		
//		lift2_19 = new JProgressBar();
		lift2_19.setMaximum(1);
		contentPane.add(lift2_19);
		
//		lift3_19 = new JProgressBar();
		lift3_19.setMaximum(1);
		contentPane.add(lift3_19);
		
//		lift4_19 = new JProgressBar();
		lift4_19.setMaximum(1);
		contentPane.add(lift4_19);
		
//		lift5_19 = new JProgressBar();
		lift5_19.setMaximum(1);
		contentPane.add(lift5_19);
		contentPane.add(comboBox_19);
		
		JLabel label_2 = new JLabel("18");
		label_2.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_2);
		
//		lift1_18 = new JProgressBar();
		lift1_18.setMaximum(1);
		contentPane.add(lift1_18);
		
//		lift2_18 = new JProgressBar();
		lift2_18.setMaximum(1);
		contentPane.add(lift2_18);
		
//		lift3_18 = new JProgressBar();
		lift3_18.setMaximum(1);
		contentPane.add(lift3_18);
		
//		lift4_18 = new JProgressBar();
		lift4_18.setMaximum(1);
		contentPane.add(lift4_18);
		
//		lift5_18 = new JProgressBar();
		lift5_18.setMaximum(1);
		contentPane.add(lift5_18);
		contentPane.add(comboBox_18);
		
		JLabel label_3 = new JLabel("17");
		label_3.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_3);
		
//		lift1_17 = new JProgressBar();
		lift1_17.setMaximum(1);
		contentPane.add(lift1_17);
		
//		lift2_17 = new JProgressBar();
		lift2_17.setMaximum(1);
		contentPane.add(lift2_17);
		
//		lift3_17 = new JProgressBar();
		lift3_17.setMaximum(1);
		contentPane.add(lift3_17);
		
//		lift4_17 = new JProgressBar();
		lift4_17.setMaximum(1);
		contentPane.add(lift4_17);
		
//		lift5_17 = new JProgressBar();
		lift5_17.setMaximum(1);
		contentPane.add(lift5_17);
		contentPane.add(comboBox_17);
		
		JLabel label_4 = new JLabel("16");
		label_4.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_4);
		
//		lift1_16 = new JProgressBar();
		lift1_16.setMaximum(1);
		contentPane.add(lift1_16);
		
//		lift2_16 = new JProgressBar();
		lift2_16.setMaximum(1);
		contentPane.add(lift2_16);
		
//		lift3_16 = new JProgressBar();
		lift3_16.setMaximum(1);
		contentPane.add(lift3_16);
		
//		lift4_16 = new JProgressBar();
		lift4_16.setMaximum(1);
		contentPane.add(lift4_16);
		
//		lift5_16 = new JProgressBar();
		lift5_16.setMaximum(1);
		contentPane.add(lift5_16);
		contentPane.add(comboBox_16);
		
		JLabel label_5 = new JLabel("15");
		label_5.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_5);
		
//		lift1_15 = new JProgressBar();
		lift1_15.setMaximum(1);
		contentPane.add(lift1_15);
		
//		lift2_15 = new JProgressBar();
		lift2_15.setMaximum(1);
		contentPane.add(lift2_15);
		
//		lift3_15 = new JProgressBar();
		lift3_15.setMaximum(1);
		contentPane.add(lift3_15);
		
//		lift4_15 = new JProgressBar();
		lift4_15.setMaximum(1);
		contentPane.add(lift4_15);
		
//		lift5_15 = new JProgressBar();
		lift5_15.setMaximum(1);
		contentPane.add(lift5_15);
		contentPane.add(comboBox_15);
		
		JLabel label_6 = new JLabel("14");
		label_6.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_6);
		
//		lift1_14 = new JProgressBar();
		lift1_14.setMaximum(1);
		contentPane.add(lift1_14);
		
//		lift2_14 = new JProgressBar();
		lift2_14.setMaximum(1);
		contentPane.add(lift2_14);
		
//		lift3_14 = new JProgressBar();
		lift3_14.setMaximum(1);
		contentPane.add(lift3_14);
		
//		lift4_14 = new JProgressBar();
		lift4_14.setMaximum(1);
		contentPane.add(lift4_14);
		
//		lift5_14 = new JProgressBar();
		lift5_14.setMaximum(1);
		contentPane.add(lift5_14);
		contentPane.add(comboBox_14);
		
		JLabel label_7 = new JLabel("13");
		label_7.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_7);
		
//		lift1_13 = new JProgressBar();
		lift1_13.setMaximum(1);
		contentPane.add(lift1_13);
		
//		lift2_13 = new JProgressBar();
		lift2_13.setMaximum(1);
		contentPane.add(lift2_13);
		
//		lift3_13 = new JProgressBar();
		lift3_13.setMaximum(1);
		contentPane.add(lift3_13);
		
//		lift4_13 = new JProgressBar();
		lift4_13.setMaximum(1);
		contentPane.add(lift4_13);
		
//		lift5_13 = new JProgressBar();
		lift5_13.setMaximum(1);
		contentPane.add(lift5_13);
		contentPane.add(comboBox_13);
		
		JLabel label_8 = new JLabel("12");
		label_8.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_8);
		
//		lift1_12 = new JProgressBar();
		lift1_12.setMaximum(1);
		contentPane.add(lift1_12);
		
//		lift2_12 = new JProgressBar();
		lift2_12.setMaximum(1);
		contentPane.add(lift2_12);
		
//		lift3_12 = new JProgressBar();
		lift3_12.setMaximum(1);
		contentPane.add(lift3_12);
		
//		lift4_12 = new JProgressBar();
		lift4_12.setMaximum(1);
		contentPane.add(lift4_12);
		
//		lift5_12 = new JProgressBar();
		lift5_12.setMaximum(1);
		contentPane.add(lift5_12);
		contentPane.add(comboBox_12);
		
		JLabel label_9 = new JLabel("11");
		label_9.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_9);
		
//		lift1_11 = new JProgressBar();
		lift1_11.setMaximum(1);
		contentPane.add(lift1_11);
		
//		lift2_11 = new JProgressBar();
		lift2_11.setMaximum(1);
		contentPane.add(lift2_11);
		
//		lift3_11 = new JProgressBar();
		lift3_11.setMaximum(1);
		contentPane.add(lift3_11);
		
//		lift4_11 = new JProgressBar();
		lift4_11.setMaximum(1);
		contentPane.add(lift4_11);
		
//		lift5_11 = new JProgressBar();
		lift5_11.setMaximum(1);
		contentPane.add(lift5_11);
		contentPane.add(comboBox_11);
		
		JLabel label_10 = new JLabel("10");
		label_10.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_10);
		
//		lift1_10 = new JProgressBar();
		lift1_10.setMaximum(1);
		contentPane.add(lift1_10);
		
//		lift2_10 = new JProgressBar();
		lift2_10.setMaximum(1);
		contentPane.add(lift2_10);
		
//		lift3_10 = new JProgressBar();
		lift3_10.setMaximum(1);
		contentPane.add(lift3_10);
		
//		lift4_10 = new JProgressBar();
		lift4_10.setMaximum(1);
		contentPane.add(lift4_10);
		
//		lift5_10 = new JProgressBar();
		lift5_10.setMaximum(1);
		contentPane.add(lift5_10);
		contentPane.add(comboBox_10);
		
		JLabel label_11 = new JLabel("9");
		label_11.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_11);
		
//		lift1_9 = new JProgressBar();
		lift1_9.setMaximum(1);
		contentPane.add(lift1_9);
		
//		lift2_9 = new JProgressBar();
		lift2_9.setMaximum(1);
		contentPane.add(lift2_9);
		
//		lift3_9 = new JProgressBar();
		lift3_9.setMaximum(1);
		contentPane.add(lift3_9);
		
//		lift4_9 = new JProgressBar();
		lift4_9.setMaximum(1);
		contentPane.add(lift4_9);
		
//		lift5_9 = new JProgressBar();
		lift5_9.setMaximum(1);
		contentPane.add(lift5_9);
		contentPane.add(comboBox_9);
		
		JLabel label_12 = new JLabel("8");
		label_12.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_12);
		
//		lift1_8 = new JProgressBar();
		lift1_8.setMaximum(1);
		contentPane.add(lift1_8);
		
//		lift2_8 = new JProgressBar();
		lift2_8.setMaximum(1);
		contentPane.add(lift2_8);
		
//		lift3_8 = new JProgressBar();
		lift3_8.setMaximum(1);
		contentPane.add(lift3_8);
		
//		lift4_8 = new JProgressBar();
		lift4_8.setMaximum(1);
		contentPane.add(lift4_8);
		
//		lift5_8 = new JProgressBar();
		lift5_8.setMaximum(1);
		contentPane.add(lift5_8);
		contentPane.add(comboBox_8);
		
		JLabel label_13 = new JLabel("7");
		label_13.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_13);
		
//		lift1_7 = new JProgressBar();
		lift1_7.setMaximum(1);
		contentPane.add(lift1_7);
		
//		lift2_7 = new JProgressBar();
		lift2_7.setMaximum(1);
		contentPane.add(lift2_7);
		
//		lift3_7 = new JProgressBar();
		lift3_7.setMaximum(1);
		contentPane.add(lift3_7);
		
//		lift4_7 = new JProgressBar();
		lift4_7.setMaximum(1);
		contentPane.add(lift4_7);
		
//		lift5_7 = new JProgressBar();
		lift5_7.setMaximum(1);
		contentPane.add(lift5_7);
		contentPane.add(comboBox_7);
		
		JLabel label_14 = new JLabel("6");
		label_14.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_14);
		
//		lift1_6 = new JProgressBar();
		lift1_6.setMaximum(1);
		contentPane.add(lift1_6);
		
//		lift2_6 = new JProgressBar();
		lift2_6.setMaximum(1);
		contentPane.add(lift2_6);
		
//		lift3_6 = new JProgressBar();
		lift3_6.setMaximum(1);
		contentPane.add(lift3_6);
		
//		lift4_6 = new JProgressBar();
		lift4_6.setMaximum(1);
		contentPane.add(lift4_6);
		
//		lift5_6 = new JProgressBar();
		lift5_6.setMaximum(1);
		contentPane.add(lift5_6);
		contentPane.add(comboBox_6);
		
		JLabel label_15 = new JLabel("5");
		label_15.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_15);
		
//		lift1_5 = new JProgressBar();
		lift1_5.setMaximum(1);
		contentPane.add(lift1_5);
		
//		lift2_5 = new JProgressBar();
		lift2_5.setMaximum(1);
		contentPane.add(lift2_5);
		
//		lift3_5 = new JProgressBar();
		lift3_5.setMaximum(1);
		contentPane.add(lift3_5);
		
//		lift4_5 = new JProgressBar();
		lift4_5.setMaximum(1);
		contentPane.add(lift4_5);
		
//		lift5_5 = new JProgressBar();
		lift5_5.setMaximum(1);
		contentPane.add(lift5_5);
		contentPane.add(comboBox_5);
		
		JLabel label_16 = new JLabel("4");
		label_16.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_16);
		
//		lift1_4 = new JProgressBar();
		lift1_4.setMaximum(1);
		contentPane.add(lift1_4);
		
//		lift2_4 = new JProgressBar();
		lift2_4.setMaximum(1);
		contentPane.add(lift2_4);
		
//		lift3_4 = new JProgressBar();
		lift3_4.setMaximum(1);
		contentPane.add(lift3_4);
		
//		lift4_4 = new JProgressBar();
		lift4_4.setMaximum(1);
		contentPane.add(lift4_4);
		
//		lift5_4 = new JProgressBar();
		lift5_4.setMaximum(1);
		contentPane.add(lift5_4);
		contentPane.add(comboBox_4);
		
		JLabel label_17 = new JLabel("3");
		label_17.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_17);
		
//		lift1_3 = new JProgressBar();
		lift1_3.setMaximum(1);
		contentPane.add(lift1_3);
		
//		lift2_3 = new JProgressBar();
		lift2_3.setMaximum(1);
		contentPane.add(lift2_3);
		
//		lift3_3 = new JProgressBar();
		lift3_3.setMaximum(1);
		contentPane.add(lift3_3);
		
//		lift4_3 = new JProgressBar();
		lift4_3.setMaximum(1);
		contentPane.add(lift4_3);
		
//		lift5_3 = new JProgressBar();
		lift5_3.setMaximum(1);
		contentPane.add(lift5_3);
		contentPane.add(comboBox_3);
		
		JLabel label_18 = new JLabel("2");
		label_18.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_18);
		
//		lift1_2 = new JProgressBar();
		lift1_2.setMaximum(1);
		contentPane.add(lift1_2);
		
//		lift2_2 = new JProgressBar();
		lift2_2.setMaximum(1);
		contentPane.add(lift2_2);
		
//		lift3_2 = new JProgressBar();
		lift3_2.setMaximum(1);
		contentPane.add(lift3_2);
		
//		lift4_2 = new JProgressBar();
		lift4_2.setMaximum(1);
		contentPane.add(lift4_2);
		
//		lift5_2 = new JProgressBar();
		lift5_2.setMaximum(1);
		contentPane.add(lift5_2);
		contentPane.add(comboBox_2);
		
		JLabel label_19 = new JLabel("1");
		label_19.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_19);
		
//		lift1_1 = new JProgressBar();
		lift1_1.setMaximum(1);
		contentPane.add(lift1_1);
		
//		lift2_1 = new JProgressBar();
		lift2_1.setMaximum(1);
		contentPane.add(lift2_1);
		
//		lift3_1 = new JProgressBar();
		lift3_1.setMaximum(1);
		contentPane.add(lift3_1);
		
//		lift4_1 = new JProgressBar();
		lift4_1.setMaximum(1);
		contentPane.add(lift4_1);
		
//		lift5_1 = new JProgressBar();
		lift5_1.setMaximum(1);
		contentPane.add(lift5_1);
		contentPane.add(comboBox_1);
		
		
		
		ctrlComboBox = new JComboBox[] {comboBox_1,comboBox_2,comboBox_3,comboBox_4,comboBox_5,comboBox_6,comboBox_7,comboBox_8,comboBox_9,comboBox_10,
				comboBox_11,comboBox_12,comboBox_13,comboBox_14,comboBox_15,comboBox_16,comboBox_17,comboBox_18,comboBox_19,comboBox_20};
		
		request = new GetRequest();
		
		request.addObserver(checkRequest);
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Main mainThread = new Main();
		Main.Lift[] lift = new Main.Lift[] {mainThread.new Lift(lift1,lift1_Ctrl),
				mainThread.new Lift(lift2,lift2_Ctrl),
				mainThread.new Lift(lift3,lift3_Ctrl),
				mainThread.new Lift(lift4,lift4_Ctrl),
				mainThread.new Lift(lift5,lift5_Ctrl)};
		
		for (Lift lift2 : lift) {
			Thread thread = new Thread(lift2);
			thread.start();
		}
		
		
		while(true){
			//向checkRequest要一个请求
			HandledPair pair = checkRequest.check(lift);
			
			if(pair != null){
				//这里是分派逻辑
				PriorityBlockingQueue<Integer> task;
				
				synchronized (lift[pair.getThreadIndex()]) {
					if(lift[pair.getThreadIndex()].getState().equals("UP")){
						task = lift[pair.getThreadIndex()].getUpTask();
						task.add(pair.getFloorNum());
					} else if(lift[pair.getThreadIndex()].getState().equals("DOWN")){
						task = lift[pair.getThreadIndex()].getDownTask();
						task.add(pair.getFloorNum());
					} else if(lift[pair.getThreadIndex()].getState().equals("STATIC")){
						String state = "STATIC";
						
						if(pair.getFloorNum() > lift[pair.getThreadIndex()].getCurrent()){
							state = "UP";
							task = lift[pair.getThreadIndex()].getUpTask();
							task.add(pair.getFloorNum());
						} else if(pair.getFloorNum() < lift[pair.getThreadIndex()].getCurrent()){
							state = "DOWN";
							task = lift[pair.getThreadIndex()].getDownTask();
							task.add(pair.getFloorNum());
						}
						
						lift[pair.getThreadIndex()].setState(state);
						
						
					}
				}
			}
		}
	}
	
	class Lift implements Runnable{
		
		private String state;//电梯状态，UP，DOWN，或STATIC
		private int current;//目前层数
		private PriorityBlockingQueue<Integer> UpTask;//电梯的上升任务，为层数
		private PriorityBlockingQueue<Integer> DownTask;//电梯的下降任务，为层数
		private PriorityBlockingQueue<Integer> currentTask;//电梯当前任务，为UpTask或DownTask中一个，由state决定
		private JProgressBar[] lift;//楼层指示
		private Timer timer;//电梯的定时器
		private JComboBox lift_Ctrl;
		
		public Lift(JProgressBar[] lift,JComboBox lift_Ctrl){
			state = "STATIC";
			
			current = 1;
			
			UpTask = new PriorityBlockingQueue<Integer>(20);//升序
			
			DownTask = new PriorityBlockingQueue<Integer>(20,Collections.reverseOrder());//降序
			
			currentTask = null;
			
			this.lift = lift;
			
			this.lift_Ctrl = lift_Ctrl;
			
			timer = new Timer(1*1000, new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					System.out.println("state is " + state);
					
					boolean isRunning = false;
					
					if(state.equals("UP")){
						currentTask = UpTask;
						isRunning = true;
						System.out.println("Uping");
					}
						
					else if(state.equals("DOWN")){
						currentTask = DownTask;
						isRunning = true;
						System.out.println("Downing");
					}
					
					if(isRunning){
						
						System.out.println("Running~");
						if(currentTask.peek() != null && current == currentTask.peek()){//检查是否到了任务中的第一个
							
							//ctrlComboBox[current-1].setSelectedIndex(-1);//如果是，则将那层的灯灭去，这里下拉栏显示为NULL，表示灯灭
							ctrlComboBox[current-1].setSelectedItem("NULL");
							
							currentTask.remove();//从任务中去除这一层
						}
						
						if(!currentTask.isEmpty()){
							lift[current-1].setValue(0);//离开当前层，取消颜色
						}
						
						//到达上/下一层
						if(state == "UP"){
							if(current != 20){
								lift[current++].setValue(1);
							}
						}
							
							
						else if(state == "DOWN"){
							lift[current-2].setValue(1);
							current--;
						}
					}
					
					
				}
				
			});
		}
		

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			lift[current-1].setValue(1);
			
			timer.start();
			timer.setRepeats(true);
			
		}
		
		public void setState(String state) {
			this.state = state;
		}


		public PriorityBlockingQueue<Integer> getUpTask() {
			return UpTask;
		}


		public PriorityBlockingQueue<Integer> getDownTask() {
			return DownTask;
		}


		public String getState() {
			return state;
		}


		public int getCurrent() {
			return current;
		}
		
	}
}


