package com.ifindnick;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.concurrent.PriorityBlockingQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private static JComboBox<String> lift1_Ctrl;
	private static JComboBox<String> lift2_Ctrl;
	private static JComboBox<String> lift3_Ctrl;
	private static JComboBox<String> lift4_Ctrl;
	private static JComboBox<String> lift5_Ctrl;

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

	private static JButton down_20 = new JButton("DWON");
	private static JButton down_19 = new JButton("DWON");
	private static JButton down_18 = new JButton("DWON");
	private static JButton down_17 = new JButton("DWON");
	private static JButton down_16 = new JButton("DWON");
	private static JButton down_15 = new JButton("DWON");
	private static JButton down_14 = new JButton("DWON");
	private static JButton down_13 = new JButton("DWON");
	private static JButton down_12 = new JButton("DWON");
	private static JButton down_11 = new JButton("DWON");
	private static JButton down_10 = new JButton("DWON");
	private static JButton down_9 = new JButton("DWON");
	private static JButton down_8 = new JButton("DWON");
	private static JButton down_7 = new JButton("DWON");
	private static JButton down_6 = new JButton("DWON");
	private static JButton down_5 = new JButton("DWON");
	private static JButton down_4 = new JButton("DWON");
	private static JButton down_3 = new JButton("DWON");
	private static JButton down_2 = new JButton("DWON");
	private static JButton up_1 = new JButton("UP");
	private static JButton up_2 = new JButton("UP");
	private static JButton up_3 = new JButton("UP");
	private static JButton up_4 = new JButton("UP");
	private static JButton up_5 = new JButton("UP");
	private static JButton up_6 = new JButton("UP");
	private static JButton up_7 = new JButton("UP");
	private static JButton up_8 = new JButton("UP");
	private static JButton up_9 = new JButton("UP");
	private static JButton up_10 = new JButton("UP");
	private static JButton up_11 = new JButton("UP");
	private static JButton up_12 = new JButton("UP");
	private static JButton up_13 = new JButton("UP");
	private static JButton up_14 = new JButton("UP");
	private static JButton up_15 = new JButton("UP");
	private static JButton up_16 = new JButton("UP");
	private static JButton up_17 = new JButton("UP");
	private static JButton up_18 = new JButton("UP");
	private static JButton up_19 = new JButton("UP");
	
	
 	
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
	
	private static JButton[] downButton = new JButton[] {down_2,down_3,down_4,down_5,down_6,down_7,down_8,down_9,down_10,down_11,down_12,down_13,down_14,down_15,down_16,down_17,down_18,down_19,down_20};
	private static JButton[] upButton = new JButton[] {up_1,up_2,up_3,up_4,up_5,up_6,up_7,up_8,up_9,up_10,up_11,up_12,up_13,up_14,up_15,up_16,up_17,up_18,up_19};;
	
	private static Main mainThread = new Main();
	
	private static Main.Lift[] lift = new Main.Lift[] {mainThread.new Lift(lift1,lift1_Ctrl),
			mainThread.new Lift(lift2,lift2_Ctrl),
			mainThread.new Lift(lift3,lift3_Ctrl),
			mainThread.new Lift(lift4,lift4_Ctrl),
			mainThread.new Lift(lift5,lift5_Ctrl)};
	

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 706);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_20 = new JLabel("");
		label_20.setBounds(5, 8, 98, 31);
		contentPane.add(label_20);
		
		lift1_Ctrl = new JComboBox<String>();
		lift1_Ctrl.setBounds(203, 8, 98, 31);
		lift1_Ctrl.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!(lift1_Ctrl.getSelectedItem().toString().equals("OPEN") 
							|| lift1_Ctrl.getSelectedItem().toString().equals("CLOSE"))){
							int object = Integer.parseInt(lift1_Ctrl.getSelectedItem().toString());//目标层
							String state = lift[0].getState();//电梯状态
							if(state.equals("UP") || state.equals("DOWN")){
								if(object > lift[0].getCurrent()){
									if(lift[0].getUpTask().add(object)){
										System.out.println(object + "添加成功。");
										System.out.println("UpTask里有：" + lift[0].getUpTask().size());
									}
								}else if(object < lift[0].getCurrent()){
									if(lift[0].getDownTask().add(object)){
										System.out.println(object + "添加成功。");
									}
								}
							} else if(state.equals("STATIC")){
								if(object > lift[0].getCurrent()){
									lift[0].getUpTask().add(object);
									lift[0].setState("UP");
								}else if(object < lift[0].getCurrent()){
									lift[0].getDownTask().add(object);
									lift[0].setState("DOWN");
								}
							}
						}
				}
			}
		});
		lift1_Ctrl.setModel(new DefaultComboBoxModel<String>(new String[] {"OPEN","CLOSE","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(lift1_Ctrl);
		
		lift2_Ctrl = new JComboBox<String>();
		lift2_Ctrl.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!(lift2_Ctrl.getSelectedItem().toString().equals("OPEN") 
							|| lift2_Ctrl.getSelectedItem().toString().equals("CLOSE"))){
							int object = Integer.parseInt(lift2_Ctrl.getSelectedItem().toString());//目标层
							String state = lift[1].getState();//电梯状态
							if(state.equals("UP") || state.equals("DOWN")){
								if(object > lift[1].getCurrent()){
									if(lift[1].getUpTask().add(object)){
										System.out.println(object + "添加成功。");
										System.out.println("UpTask里有：" + lift[1].getUpTask().size());
									}
								}else if(object < lift[1].getCurrent()){
									if(lift[1].getDownTask().add(object)){
										System.out.println(object + "添加成功。");
									}
								}
							} else if(state.equals("STATIC")){
								if(object > lift[1].getCurrent()){
									lift[1].getUpTask().add(object);
									lift[1].setState("UP");
								}else if(object < lift[1].getCurrent()){
									lift[1].getDownTask().add(object);
									lift[1].setState("DOWN");
								}
							}
						}
				}
			}
		});
		lift2_Ctrl.setBounds(302, 8, 98, 31);
		lift2_Ctrl.setModel(new DefaultComboBoxModel<String>(new String[] {"OPEN","CLOSE","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(lift2_Ctrl);
		
		lift3_Ctrl = new JComboBox<String>();
		lift3_Ctrl.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!(lift3_Ctrl.getSelectedItem().toString().equals("OPEN") 
							|| lift3_Ctrl.getSelectedItem().toString().equals("CLOSE"))){
							int object = Integer.parseInt(lift3_Ctrl.getSelectedItem().toString());//目标层
							String state = lift[2].getState();//电梯状态
							if(state.equals("UP") || state.equals("DOWN")){
								if(object > lift[2].getCurrent()){
									if(lift[2].getUpTask().add(object)){
										System.out.println(object + "添加成功。");
										System.out.println("UpTask里有：" + lift[2].getUpTask().size());
									}
								}else if(object < lift[2].getCurrent()){
									if(lift[2].getDownTask().add(object)){
										System.out.println(object + "添加成功。");
									}
								}
							} else if(state.equals("STATIC")){
								if(object > lift[2].getCurrent()){
									lift[2].getUpTask().add(object);
									lift[2].setState("UP");
								}else if(object < lift[2].getCurrent()){
									lift[2].getDownTask().add(object);
									lift[2].setState("DOWN");
								}
							}
						}
				}
			}
		});
		lift3_Ctrl.setBounds(401, 8, 98, 31);
		lift3_Ctrl.setModel(new DefaultComboBoxModel<String>(new String[] {"OPEN","CLOSE","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(lift3_Ctrl);
		
		lift4_Ctrl = new JComboBox<String>();
		lift4_Ctrl.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!(lift4_Ctrl.getSelectedItem().toString().equals("OPEN") 
							|| lift4_Ctrl.getSelectedItem().toString().equals("CLOSE"))){
							int object = Integer.parseInt(lift4_Ctrl.getSelectedItem().toString());//目标层
							String state = lift[3].getState();//电梯状态
							if(state.equals("UP") || state.equals("DOWN")){
								if(object > lift[3].getCurrent()){
									if(lift[3].getUpTask().add(object)){
										System.out.println(object + "添加成功。");
										System.out.println("UpTask里有：" + lift[3].getUpTask().size());
									}
								}else if(object < lift[3].getCurrent()){
									if(lift[3].getDownTask().add(object)){
										System.out.println(object + "添加成功。");
									}
								}
							} else if(state.equals("STATIC")){
								if(object > lift[3].getCurrent()){
									lift[3].getUpTask().add(object);
									lift[3].setState("UP");
								}else if(object < lift[3].getCurrent()){
									lift[3].getDownTask().add(object);
									lift[3].setState("DOWN");
								}
							}
						}
				}
			}
		});
		lift4_Ctrl.setBounds(500, 8, 98, 31);
		lift4_Ctrl.setModel(new DefaultComboBoxModel<String>(new String[] {"OPEN","CLOSE","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(lift4_Ctrl);
		
		lift5_Ctrl = new JComboBox<String>();
		lift5_Ctrl.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					if(!(lift5_Ctrl.getSelectedItem().toString().equals("OPEN") 
							|| lift5_Ctrl.getSelectedItem().toString().equals("CLOSE"))){
							int object = Integer.parseInt(lift5_Ctrl.getSelectedItem().toString());//目标层
							String state = lift[4].getState();//电梯状态
							if(state.equals("UP") || state.equals("DOWN")){
								if(object > lift[4].getCurrent()){
									if(lift[4].getUpTask().add(object)){
										System.out.println(object + "添加成功。");
										System.out.println("UpTask里有：" + lift[4].getUpTask().size());
									}
								}else if(object < lift[4].getCurrent()){
									if(lift[4].getDownTask().add(object)){
										System.out.println(object + "添加成功。");
									}
								}
							} else if(state.equals("STATIC")){
								if(object > lift[4].getCurrent()){
									lift[4].getUpTask().add(object);
									lift[4].setState("UP");
								}else if(object < lift[4].getCurrent()){
									lift[4].getDownTask().add(object);
									lift[4].setState("DOWN");
								}
							}
						}
				}
			}
		});
		lift5_Ctrl.setBounds(599, 8, 98, 31);
		lift5_Ctrl.setModel(new DefaultComboBoxModel<String>(new String[] {"OPEN","CLOSE","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(lift5_Ctrl);
		
		JLabel label_21 = new JLabel("");
		label_21.setBounds(599, 8, 98, 31);
		contentPane.add(label_21);
		
		JLabel label = new JLabel("20");
		label.setBounds(5, 40, 24, 31);
		label.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label);
		lift1_20.setBounds(203, 40, 98, 31);
		
//		lift1_20 = new JProgressBar();
		lift1_20.setMaximum(1);
		contentPane.add(lift1_20);
		lift2_20.setBounds(302, 40, 98, 31);
		
//		lift2_20 = new JProgressBar();
		lift2_20.setMaximum(1);
		contentPane.add(lift2_20);
		lift3_20.setBounds(401, 40, 98, 31);
		
//		lift3_20 = new JProgressBar();
		lift3_20.setMaximum(1);
		contentPane.add(lift3_20);
		lift4_20.setBounds(500, 40, 98, 31);
		
//		lift4_20 = new JProgressBar();
		lift4_20.setMaximum(1);
		contentPane.add(lift4_20);
		lift5_20.setBounds(599, 40, 98, 31);
		
//		lift5_20 = new JProgressBar();
		lift5_20.setMaximum(1);
		contentPane.add(lift5_20);
		
		JLabel label_1 = new JLabel("19");
		label_1.setBounds(5, 72, 24, 31);
		label_1.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_1);
		lift1_19.setBounds(203, 72, 98, 31);
		
//		lift1_19 = new JProgressBar();
		lift1_19.setMaximum(1);
		contentPane.add(lift1_19);
		lift2_19.setBounds(302, 72, 98, 31);
		
//		lift2_19 = new JProgressBar();
		lift2_19.setMaximum(1);
		contentPane.add(lift2_19);
		lift3_19.setBounds(401, 72, 98, 31);
		
//		lift3_19 = new JProgressBar();
		lift3_19.setMaximum(1);
		contentPane.add(lift3_19);
		lift4_19.setBounds(500, 72, 98, 31);
		
//		lift4_19 = new JProgressBar();
		lift4_19.setMaximum(1);
		contentPane.add(lift4_19);
		lift5_19.setBounds(599, 72, 98, 31);
		
//		lift5_19 = new JProgressBar();
		lift5_19.setMaximum(1);
		contentPane.add(lift5_19);
		
		JLabel label_2 = new JLabel("18");
		label_2.setBounds(5, 104, 24, 31);
		label_2.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_2);
		lift1_18.setBounds(203, 104, 98, 31);
		
//		lift1_18 = new JProgressBar();
		lift1_18.setMaximum(1);
		contentPane.add(lift1_18);
		lift2_18.setBounds(302, 104, 98, 31);
		
//		lift2_18 = new JProgressBar();
		lift2_18.setMaximum(1);
		contentPane.add(lift2_18);
		lift3_18.setBounds(401, 104, 98, 31);
		
//		lift3_18 = new JProgressBar();
		lift3_18.setMaximum(1);
		contentPane.add(lift3_18);
		lift4_18.setBounds(500, 104, 98, 31);
		
//		lift4_18 = new JProgressBar();
		lift4_18.setMaximum(1);
		contentPane.add(lift4_18);
		lift5_18.setBounds(599, 104, 98, 31);
		
//		lift5_18 = new JProgressBar();
		lift5_18.setMaximum(1);
		contentPane.add(lift5_18);
		
		JLabel label_3 = new JLabel("17");
		label_3.setBounds(5, 136, 24, 31);
		label_3.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_3);
		lift1_17.setBounds(203, 136, 98, 31);
		
//		lift1_17 = new JProgressBar();
		lift1_17.setMaximum(1);
		contentPane.add(lift1_17);
		lift2_17.setBounds(302, 136, 98, 31);
		
//		lift2_17 = new JProgressBar();
		lift2_17.setMaximum(1);
		contentPane.add(lift2_17);
		lift3_17.setBounds(401, 136, 98, 31);
		
//		lift3_17 = new JProgressBar();
		lift3_17.setMaximum(1);
		contentPane.add(lift3_17);
		lift4_17.setBounds(500, 136, 98, 31);
		
//		lift4_17 = new JProgressBar();
		lift4_17.setMaximum(1);
		contentPane.add(lift4_17);
		lift5_17.setBounds(599, 136, 98, 31);
		
//		lift5_17 = new JProgressBar();
		lift5_17.setMaximum(1);
		contentPane.add(lift5_17);
		
		JLabel label_4 = new JLabel("16");
		label_4.setBounds(5, 168, 24, 31);
		label_4.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_4);
		lift1_16.setBounds(203, 168, 98, 31);
		
//		lift1_16 = new JProgressBar();
		lift1_16.setMaximum(1);
		contentPane.add(lift1_16);
		lift2_16.setBounds(302, 168, 98, 31);
		
//		lift2_16 = new JProgressBar();
		lift2_16.setMaximum(1);
		contentPane.add(lift2_16);
		lift3_16.setBounds(401, 168, 98, 31);
		
//		lift3_16 = new JProgressBar();
		lift3_16.setMaximum(1);
		contentPane.add(lift3_16);
		lift4_16.setBounds(500, 168, 98, 31);
		
//		lift4_16 = new JProgressBar();
		lift4_16.setMaximum(1);
		contentPane.add(lift4_16);
		lift5_16.setBounds(599, 168, 98, 31);
		
//		lift5_16 = new JProgressBar();
		lift5_16.setMaximum(1);
		contentPane.add(lift5_16);
		
		JLabel label_5 = new JLabel("15");
		label_5.setBounds(5, 200, 24, 31);
		label_5.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_5);
		lift1_15.setBounds(203, 200, 98, 31);
		
//		lift1_15 = new JProgressBar();
		lift1_15.setMaximum(1);
		contentPane.add(lift1_15);
		lift2_15.setBounds(302, 200, 98, 31);
		
//		lift2_15 = new JProgressBar();
		lift2_15.setMaximum(1);
		contentPane.add(lift2_15);
		lift3_15.setBounds(401, 200, 98, 31);
		
//		lift3_15 = new JProgressBar();
		lift3_15.setMaximum(1);
		contentPane.add(lift3_15);
		lift4_15.setBounds(500, 200, 98, 31);
		
//		lift4_15 = new JProgressBar();
		lift4_15.setMaximum(1);
		contentPane.add(lift4_15);
		lift5_15.setBounds(599, 200, 98, 31);
		
//		lift5_15 = new JProgressBar();
		lift5_15.setMaximum(1);
		contentPane.add(lift5_15);
		
		JLabel label_6 = new JLabel("14");
		label_6.setBounds(5, 232, 24, 31);
		label_6.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_6);
		lift1_14.setBounds(203, 232, 98, 31);
		
//		lift1_14 = new JProgressBar();
		lift1_14.setMaximum(1);
		contentPane.add(lift1_14);
		lift2_14.setBounds(302, 232, 98, 31);
		
//		lift2_14 = new JProgressBar();
		lift2_14.setMaximum(1);
		contentPane.add(lift2_14);
		lift3_14.setBounds(401, 232, 98, 31);
		
//		lift3_14 = new JProgressBar();
		lift3_14.setMaximum(1);
		contentPane.add(lift3_14);
		lift4_14.setBounds(500, 232, 98, 31);
		
//		lift4_14 = new JProgressBar();
		lift4_14.setMaximum(1);
		contentPane.add(lift4_14);
		lift5_14.setBounds(599, 232, 98, 31);
		
//		lift5_14 = new JProgressBar();
		lift5_14.setMaximum(1);
		contentPane.add(lift5_14);
		
		JLabel label_7 = new JLabel("13");
		label_7.setBounds(5, 264, 24, 31);
		label_7.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_7);
		lift1_13.setBounds(203, 264, 98, 31);
		
//		lift1_13 = new JProgressBar();
		lift1_13.setMaximum(1);
		contentPane.add(lift1_13);
		lift2_13.setBounds(302, 264, 98, 31);
		
//		lift2_13 = new JProgressBar();
		lift2_13.setMaximum(1);
		contentPane.add(lift2_13);
		lift3_13.setBounds(401, 264, 98, 31);
		
//		lift3_13 = new JProgressBar();
		lift3_13.setMaximum(1);
		contentPane.add(lift3_13);
		lift4_13.setBounds(500, 264, 98, 31);
		
//		lift4_13 = new JProgressBar();
		lift4_13.setMaximum(1);
		contentPane.add(lift4_13);
		lift5_13.setBounds(599, 264, 98, 31);
		
//		lift5_13 = new JProgressBar();
		lift5_13.setMaximum(1);
		contentPane.add(lift5_13);
		
		JLabel label_8 = new JLabel("12");
		label_8.setBounds(5, 296, 24, 31);
		label_8.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_8);
		lift1_12.setBounds(203, 296, 98, 31);
		
//		lift1_12 = new JProgressBar();
		lift1_12.setMaximum(1);
		contentPane.add(lift1_12);
		lift2_12.setBounds(302, 296, 98, 31);
		
//		lift2_12 = new JProgressBar();
		lift2_12.setMaximum(1);
		contentPane.add(lift2_12);
		lift3_12.setBounds(401, 296, 98, 31);
		
//		lift3_12 = new JProgressBar();
		lift3_12.setMaximum(1);
		contentPane.add(lift3_12);
		lift4_12.setBounds(500, 296, 98, 31);
		
//		lift4_12 = new JProgressBar();
		lift4_12.setMaximum(1);
		contentPane.add(lift4_12);
		lift5_12.setBounds(599, 296, 98, 31);
		
//		lift5_12 = new JProgressBar();
		lift5_12.setMaximum(1);
		contentPane.add(lift5_12);
		
		JLabel label_9 = new JLabel("11");
		label_9.setBounds(5, 328, 24, 31);
		label_9.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_9);
		lift1_11.setBounds(203, 328, 98, 31);
		
//		lift1_11 = new JProgressBar();
		lift1_11.setMaximum(1);
		contentPane.add(lift1_11);
		lift2_11.setBounds(302, 328, 98, 31);
		
//		lift2_11 = new JProgressBar();
		lift2_11.setMaximum(1);
		contentPane.add(lift2_11);
		lift3_11.setBounds(401, 328, 98, 31);
		
//		lift3_11 = new JProgressBar();
		lift3_11.setMaximum(1);
		contentPane.add(lift3_11);
		lift4_11.setBounds(500, 328, 98, 31);
		
//		lift4_11 = new JProgressBar();
		lift4_11.setMaximum(1);
		contentPane.add(lift4_11);
		lift5_11.setBounds(599, 328, 98, 31);
		
//		lift5_11 = new JProgressBar();
		lift5_11.setMaximum(1);
		contentPane.add(lift5_11);
		
		JLabel label_10 = new JLabel("10");
		label_10.setBounds(5, 360, 24, 31);
		label_10.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_10);
		lift1_10.setBounds(203, 360, 98, 31);
		
//		lift1_10 = new JProgressBar();
		lift1_10.setMaximum(1);
		contentPane.add(lift1_10);
		lift2_10.setBounds(302, 360, 98, 31);
		
//		lift2_10 = new JProgressBar();
		lift2_10.setMaximum(1);
		contentPane.add(lift2_10);
		lift3_10.setBounds(401, 360, 98, 31);
		
//		lift3_10 = new JProgressBar();
		lift3_10.setMaximum(1);
		contentPane.add(lift3_10);
		lift4_10.setBounds(500, 360, 98, 31);
		
//		lift4_10 = new JProgressBar();
		lift4_10.setMaximum(1);
		contentPane.add(lift4_10);
		lift5_10.setBounds(599, 360, 98, 31);
		
//		lift5_10 = new JProgressBar();
		lift5_10.setMaximum(1);
		contentPane.add(lift5_10);
		
		JLabel label_11 = new JLabel("9");
		label_11.setBounds(5, 392, 24, 31);
		label_11.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_11);
		lift1_9.setBounds(203, 392, 98, 31);
		
//		lift1_9 = new JProgressBar();
		lift1_9.setMaximum(1);
		contentPane.add(lift1_9);
		lift2_9.setBounds(302, 392, 98, 31);
		
//		lift2_9 = new JProgressBar();
		lift2_9.setMaximum(1);
		contentPane.add(lift2_9);
		lift3_9.setBounds(401, 392, 98, 31);
		
//		lift3_9 = new JProgressBar();
		lift3_9.setMaximum(1);
		contentPane.add(lift3_9);
		lift4_9.setBounds(500, 392, 98, 31);
		
//		lift4_9 = new JProgressBar();
		lift4_9.setMaximum(1);
		contentPane.add(lift4_9);
		lift5_9.setBounds(599, 392, 98, 31);
		
//		lift5_9 = new JProgressBar();
		lift5_9.setMaximum(1);
		contentPane.add(lift5_9);
		
		JLabel label_12 = new JLabel("8");
		label_12.setBounds(5, 424, 24, 31);
		label_12.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_12);
		lift1_8.setBounds(203, 424, 98, 31);
		
//		lift1_8 = new JProgressBar();
		lift1_8.setMaximum(1);
		contentPane.add(lift1_8);
		lift2_8.setBounds(302, 424, 98, 31);
		
//		lift2_8 = new JProgressBar();
		lift2_8.setMaximum(1);
		contentPane.add(lift2_8);
		lift3_8.setBounds(401, 424, 98, 31);
		
//		lift3_8 = new JProgressBar();
		lift3_8.setMaximum(1);
		contentPane.add(lift3_8);
		lift4_8.setBounds(500, 424, 98, 31);
		
//		lift4_8 = new JProgressBar();
		lift4_8.setMaximum(1);
		contentPane.add(lift4_8);
		lift5_8.setBounds(599, 424, 98, 31);
		
//		lift5_8 = new JProgressBar();
		lift5_8.setMaximum(1);
		contentPane.add(lift5_8);
		
		JLabel label_13 = new JLabel("7");
		label_13.setBounds(5, 456, 24, 31);
		label_13.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_13);
		lift1_7.setBounds(203, 456, 98, 31);
		
//		lift1_7 = new JProgressBar();
		lift1_7.setMaximum(1);
		contentPane.add(lift1_7);
		lift2_7.setBounds(302, 456, 98, 31);
		
//		lift2_7 = new JProgressBar();
		lift2_7.setMaximum(1);
		contentPane.add(lift2_7);
		lift3_7.setBounds(401, 456, 98, 31);
		
//		lift3_7 = new JProgressBar();
		lift3_7.setMaximum(1);
		contentPane.add(lift3_7);
		lift4_7.setBounds(500, 456, 98, 31);
		
//		lift4_7 = new JProgressBar();
		lift4_7.setMaximum(1);
		contentPane.add(lift4_7);
		lift5_7.setBounds(599, 456, 98, 31);
		
//		lift5_7 = new JProgressBar();
		lift5_7.setMaximum(1);
		contentPane.add(lift5_7);
		
		JLabel label_14 = new JLabel("6");
		label_14.setBounds(5, 488, 24, 31);
		label_14.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_14);
		lift1_6.setBounds(203, 488, 98, 31);
		
//		lift1_6 = new JProgressBar();
		lift1_6.setMaximum(1);
		contentPane.add(lift1_6);
		lift2_6.setBounds(302, 488, 98, 31);
		
//		lift2_6 = new JProgressBar();
		lift2_6.setMaximum(1);
		contentPane.add(lift2_6);
		lift3_6.setBounds(401, 488, 98, 31);
		
//		lift3_6 = new JProgressBar();
		lift3_6.setMaximum(1);
		contentPane.add(lift3_6);
		lift4_6.setBounds(500, 488, 98, 31);
		
//		lift4_6 = new JProgressBar();
		lift4_6.setMaximum(1);
		contentPane.add(lift4_6);
		lift5_6.setBounds(599, 488, 98, 31);
		
//		lift5_6 = new JProgressBar();
		lift5_6.setMaximum(1);
		contentPane.add(lift5_6);
		
		JLabel label_15 = new JLabel("5");
		label_15.setBounds(5, 520, 24, 31);
		label_15.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_15);
		lift1_5.setBounds(203, 520, 98, 31);
		
//		lift1_5 = new JProgressBar();
		lift1_5.setMaximum(1);
		contentPane.add(lift1_5);
		lift2_5.setBounds(302, 520, 98, 31);
		
//		lift2_5 = new JProgressBar();
		lift2_5.setMaximum(1);
		contentPane.add(lift2_5);
		lift3_5.setBounds(401, 520, 98, 31);
		
//		lift3_5 = new JProgressBar();
		lift3_5.setMaximum(1);
		contentPane.add(lift3_5);
		lift4_5.setBounds(500, 520, 98, 31);
		
//		lift4_5 = new JProgressBar();
		lift4_5.setMaximum(1);
		contentPane.add(lift4_5);
		lift5_5.setBounds(599, 520, 98, 31);
		
//		lift5_5 = new JProgressBar();
		lift5_5.setMaximum(1);
		contentPane.add(lift5_5);
		
		JLabel label_16 = new JLabel("4");
		label_16.setBounds(5, 552, 24, 31);
		label_16.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_16);
		lift1_4.setBounds(203, 552, 98, 31);
		
//		lift1_4 = new JProgressBar();
		lift1_4.setMaximum(1);
		contentPane.add(lift1_4);
		lift2_4.setBounds(302, 552, 98, 31);
		
//		lift2_4 = new JProgressBar();
		lift2_4.setMaximum(1);
		contentPane.add(lift2_4);
		lift3_4.setBounds(401, 552, 98, 31);
		
//		lift3_4 = new JProgressBar();
		lift3_4.setMaximum(1);
		contentPane.add(lift3_4);
		lift4_4.setBounds(500, 552, 98, 31);
		
//		lift4_4 = new JProgressBar();
		lift4_4.setMaximum(1);
		contentPane.add(lift4_4);
		lift5_4.setBounds(599, 552, 98, 31);
		
//		lift5_4 = new JProgressBar();
		lift5_4.setMaximum(1);
		contentPane.add(lift5_4);
		
		JLabel label_17 = new JLabel("3");
		label_17.setBounds(5, 584, 24, 31);
		label_17.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_17);
		lift1_3.setBounds(203, 584, 98, 31);
		
//		lift1_3 = new JProgressBar();
		lift1_3.setMaximum(1);
		contentPane.add(lift1_3);
		lift2_3.setBounds(302, 584, 98, 31);
		
//		lift2_3 = new JProgressBar();
		lift2_3.setMaximum(1);
		contentPane.add(lift2_3);
		lift3_3.setBounds(401, 584, 98, 31);
		
//		lift3_3 = new JProgressBar();
		lift3_3.setMaximum(1);
		contentPane.add(lift3_3);
		lift4_3.setBounds(500, 584, 98, 31);
		
//		lift4_3 = new JProgressBar();
		lift4_3.setMaximum(1);
		contentPane.add(lift4_3);
		lift5_3.setBounds(599, 584, 98, 31);
		
//		lift5_3 = new JProgressBar();
		lift5_3.setMaximum(1);
		contentPane.add(lift5_3);
		
		JLabel label_18 = new JLabel("2");
		label_18.setBounds(5, 616, 24, 31);
		label_18.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_18);
		lift1_2.setBounds(203, 616, 98, 31);
		
//		lift1_2 = new JProgressBar();
		lift1_2.setMaximum(1);
		contentPane.add(lift1_2);
		lift2_2.setBounds(302, 616, 98, 31);
		
//		lift2_2 = new JProgressBar();
		lift2_2.setMaximum(1);
		contentPane.add(lift2_2);
		lift3_2.setBounds(401, 616, 98, 31);
		
//		lift3_2 = new JProgressBar();
		lift3_2.setMaximum(1);
		contentPane.add(lift3_2);
		lift4_2.setBounds(500, 616, 98, 31);
		
//		lift4_2 = new JProgressBar();
		lift4_2.setMaximum(1);
		contentPane.add(lift4_2);
		lift5_2.setBounds(599, 616, 98, 31);
		
//		lift5_2 = new JProgressBar();
		lift5_2.setMaximum(1);
		contentPane.add(lift5_2);
		
		JLabel label_19 = new JLabel("1");
		label_19.setBounds(5, 648, 24, 31);
		label_19.setFont(new Font("宋体", Font.PLAIN, 17));
		contentPane.add(label_19);
		lift1_1.setBounds(203, 648, 98, 31);
		
//		lift1_1 = new JProgressBar();
		lift1_1.setMaximum(1);
		contentPane.add(lift1_1);
		lift2_1.setBounds(302, 648, 98, 31);
		
//		lift2_1 = new JProgressBar();
		lift2_1.setMaximum(1);
		contentPane.add(lift2_1);
		lift3_1.setBounds(401, 648, 98, 31);
		
//		lift3_1 = new JProgressBar();
		lift3_1.setMaximum(1);
		contentPane.add(lift3_1);
		lift4_1.setBounds(500, 648, 98, 31);
		
//		lift4_1 = new JProgressBar();
		lift4_1.setMaximum(1);
		contentPane.add(lift4_1);
		lift5_1.setBounds(599, 648, 98, 31);
		
//		lift5_1 = new JProgressBar();
		lift5_1.setMaximum(1);
		contentPane.add(lift5_1);
		
//		down_20 = new JButton("DOWN");
		down_20.setBackground(Color.WHITE);
		down_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//传递请求
				RequestPair pair = new RequestPair(20,"DOWN");
				request.addRequest(pair);
				
				//设置颜色
				down_20.setBackground(Color.RED);
			}
		});
		down_20.setBounds(107, 45, 73, 23);
		contentPane.add(down_20);
		
//		down_19 = new JButton("DWON");
		down_19.setBackground(Color.WHITE);
		down_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(19,"DOWN");
				request.addRequest(pair);
				down_19.setBackground(Color.RED);
			}
		});
		down_19.setBounds(107, 77, 73, 23);
		contentPane.add(down_19);
		
//		down_18 = new JButton("DWON");
		down_18.setBackground(Color.WHITE);
		down_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(18,"DOWN");
				request.addRequest(pair);
				down_18.setBackground(Color.RED);
			}
		});
		down_18.setBounds(107, 109, 73, 23);
		contentPane.add(down_18);
		
//		down_17 = new JButton("DWON");
		down_17.setBackground(Color.WHITE);
		down_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(17,"DOWN");
				request.addRequest(pair);
				down_17.setBackground(Color.RED);
			}
		});
		down_17.setBounds(107, 141, 73, 23);
		contentPane.add(down_17);
		
//		down_16 = new JButton("DWON");
		down_16.setBackground(Color.WHITE);
		down_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(16,"DOWN");
				request.addRequest(pair);
				down_16.setBackground(Color.RED);
			}
		});
		down_16.setBounds(107, 173, 73, 23);
		contentPane.add(down_16);
		
//		down_15 = new JButton("DWON");
		down_15.setBackground(Color.WHITE);
		down_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(15,"DOWN");
				request.addRequest(pair);
				down_15.setBackground(Color.RED);
			}
		});
		down_15.setBounds(107, 205, 73, 23);
		contentPane.add(down_15);
		
//		down_14 = new JButton("DWON");
		down_14.setBackground(Color.WHITE);
		down_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(14,"DOWN");
				request.addRequest(pair);
				down_14.setBackground(Color.RED);
			}
		});
		down_14.setBounds(107, 237, 73, 23);
		contentPane.add(down_14);
		
//		down_13 = new JButton("DWON");
		down_13.setBackground(Color.WHITE);
		down_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(13,"DOWN");
				request.addRequest(pair);
				down_13.setBackground(Color.RED);
			}
		});
		down_13.setBounds(107, 269, 73, 23);
		contentPane.add(down_13);
		
//		down_12 = new JButton("DWON");
		down_12.setBackground(Color.WHITE);
		down_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(12,"DOWN");
				request.addRequest(pair);
				down_12.setBackground(Color.RED);
			}
		});
		down_12.setBounds(107, 301, 73, 23);
		contentPane.add(down_12);
		
//		down_11 = new JButton("DWON");
		down_11.setBackground(Color.WHITE);
		down_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(11,"DOWN");
				request.addRequest(pair);
				down_11.setBackground(Color.RED);
			}
		});
		down_11.setBounds(107, 333, 73, 23);
		contentPane.add(down_11);
		
//		down_10 = new JButton("DWON");
		down_10.setBackground(Color.WHITE);
		down_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(10,"DOWN");
				request.addRequest(pair);
				down_10.setBackground(Color.RED);
			}
		});
		down_10.setBounds(107, 365, 73, 23);
		contentPane.add(down_10);
		
//		down_9 = new JButton("DWON");
		down_9.setBackground(Color.WHITE);
		down_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(9,"DOWN");
				request.addRequest(pair);
				down_9.setBackground(Color.RED);
			}
		});
		down_9.setBounds(107, 397, 73, 23);
		contentPane.add(down_9);
		
//		down_8 = new JButton("DWON");
		down_8.setBackground(Color.WHITE);
		down_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(8,"DOWN");
				request.addRequest(pair);
				down_8.setBackground(Color.RED);
				System.out.println("事件发生了~");
			}
		});
		down_8.setBounds(107, 429, 73, 23);
		contentPane.add(down_8);
		
//		down_7 = new JButton("DWON");
		down_7.setBackground(Color.WHITE);
		down_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(7,"DOWN");
				request.addRequest(pair);
				down_7.setBackground(Color.RED);
			}
		});
		down_7.setBounds(107, 461, 73, 23);
		contentPane.add(down_7);
		
//		down_6 = new JButton("DWON");
		down_6.setBackground(Color.WHITE);
		down_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(6,"DOWN");
				request.addRequest(pair);
				down_6.setBackground(Color.RED);
			}
		});
		down_6.setBounds(107, 493, 73, 23);
		contentPane.add(down_6);
		
//		down_5 = new JButton("DWON");
		down_5.setBackground(Color.WHITE);
		down_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(5,"DOWN");
				request.addRequest(pair);
				down_5.setBackground(Color.RED);
			}
		});
		down_5.setBounds(107, 525, 73, 23);
		contentPane.add(down_5);
		
//		down_4 = new JButton("DWON");
		down_4.setBackground(Color.WHITE);
		down_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(4,"DOWN");
				request.addRequest(pair);
				down_4.setBackground(Color.RED);
			}
		});
		down_4.setBounds(107, 557, 73, 23);
		contentPane.add(down_4);
		
//		down_3 = new JButton("DWON");
		down_3.setBackground(Color.WHITE);
		down_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(3,"DOWN");
				request.addRequest(pair);
				down_3.setBackground(Color.RED);
			}
		});
		down_3.setBounds(107, 589, 73, 23);
		contentPane.add(down_3);
		
//		down_2 = new JButton("DWON");
		down_2.setBackground(Color.WHITE);
		down_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(2,"DOWN");
				request.addRequest(pair);
				down_2.setBackground(Color.RED);
			}
		});
		down_2.setBounds(107, 621, 73, 23);
		contentPane.add(down_2);
		
//		up_1  = new JButton("UP");
		up_1.setBackground(Color.WHITE);
		up_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(1,"UP");
				request.addRequest(pair);
				up_1.setBackground(Color.RED);
			}
		});
		up_1.setBounds(30, 653, 73, 23);
		contentPane.add(up_1);
		
//		up_2  = new JButton("UP");
		up_2.setBackground(Color.WHITE);
		up_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(2,"UP");
				request.addRequest(pair);
				up_2.setBackground(Color.RED);
			}
		});
		up_2.setBounds(30, 621, 73, 23);
		contentPane.add(up_2);
		
//		up_3  = new JButton("UP");
		up_3.setBackground(Color.WHITE);
		up_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(3,"UP");
				request.addRequest(pair);
				up_3.setBackground(Color.RED);
			}
		});
		up_3.setBounds(30, 589, 73, 23);
		contentPane.add(up_3);
		
//		up_4  = new JButton("UP");
		up_4.setBackground(Color.WHITE);
		up_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(4,"UP");
				request.addRequest(pair);
				up_4.setBackground(Color.RED);
			}
		});
		up_4.setBounds(30, 557, 73, 23);
		contentPane.add(up_4);
		
//		up_5  = new JButton("UP");
		up_5.setBackground(Color.WHITE);
		up_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(5,"UP");
				request.addRequest(pair);
				up_5.setBackground(Color.RED);
			}
		});
		up_5.setBounds(30, 525, 73, 23);
		contentPane.add(up_5);
		
//		up_6  = new JButton("UP");
		up_6.setBackground(Color.WHITE);
		up_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(6,"UP");
				request.addRequest(pair);
				up_6.setBackground(Color.RED);
			}
		});
		up_6.setBounds(30, 493, 73, 23);
		contentPane.add(up_6);
		
//		up_7  = new JButton("UP");
		up_7.setBackground(Color.WHITE);
		up_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(7,"UP");
				request.addRequest(pair);
				up_7.setBackground(Color.RED);
			}
		});
		up_7.setBounds(30, 461, 73, 23);
		contentPane.add(up_7);
		
//		up_8  = new JButton("UP");
		up_8.setBackground(Color.WHITE);
		up_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(8,"UP");
				request.addRequest(pair);
				up_8.setBackground(Color.RED);
			}
		});
		up_8.setBounds(30, 429, 73, 23);
		contentPane.add(up_8);
		
//		up_9  = new JButton("UP");
		up_9.setBackground(Color.WHITE);
		up_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(9,"UP");
				request.addRequest(pair);
				up_9.setBackground(Color.RED);
			}
		});
		up_9.setBounds(30, 397, 73, 23);
		contentPane.add(up_9);
		
//		up_10  = new JButton("UP");
		up_10.setBackground(Color.WHITE);
		up_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(10,"UP");
				request.addRequest(pair);
				up_10.setBackground(Color.RED);
			}
		});
		up_10.setBounds(30, 365, 73, 23);
		contentPane.add(up_10);
		
//		up_11  = new JButton("UP");
		up_11.setBackground(Color.WHITE);
		up_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(11,"UP");
				request.addRequest(pair);
				up_11.setBackground(Color.RED);
			}
		});
		up_11.setBounds(30, 333, 73, 23);
		contentPane.add(up_11);
		
//		up_12  = new JButton("UP");
		up_12.setBackground(Color.WHITE);
		up_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(12,"UP");
				request.addRequest(pair);
				up_12.setBackground(Color.RED);
			}
		});
		up_12.setBounds(30, 301, 73, 23);
		contentPane.add(up_12);
		
//		up_13  = new JButton("UP");
		up_13.setBackground(Color.WHITE);
		up_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(13,"UP");
				request.addRequest(pair);
				up_13.setBackground(Color.RED);
			}
		});
		up_13.setBounds(30, 269, 73, 23);
		contentPane.add(up_13);
		
//		up_14  = new JButton("UP");
		up_14.setBackground(Color.WHITE);
		up_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(14,"UP");
				request.addRequest(pair);
				up_14.setBackground(Color.RED);
			}
		});
		up_14.setBounds(30, 237, 73, 23);
		contentPane.add(up_14);
		
//		up_15  = new JButton("UP");
		up_15.setBackground(Color.WHITE);
		up_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(15,"UP");
				request.addRequest(pair);
				up_15.setBackground(Color.RED);
			}
		});
		up_15.setBounds(30, 205, 73, 23);
		contentPane.add(up_15);
		
//		up_16  = new JButton("UP");
		up_16.setBackground(Color.WHITE);
		up_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(16,"UP");
				request.addRequest(pair);
				up_16.setBackground(Color.RED);
			}
		});
		up_16.setBounds(30, 173, 73, 23);
		contentPane.add(up_16);
		
//		up_17  = new JButton("UP");
		up_17.setBackground(Color.WHITE);
		up_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(17,"UP");
				request.addRequest(pair);
				up_17.setBackground(Color.RED);
			}
		});
		up_17.setBounds(30, 141, 73, 23);
		contentPane.add(up_17);
		
//		up_18  = new JButton("UP");
		up_18.setBackground(Color.WHITE);
		up_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(18,"UP");
				request.addRequest(pair);
				up_18.setBackground(Color.RED);
			}
		});
		up_18.setBounds(30, 109, 73, 23);
		contentPane.add(up_18);
		up_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RequestPair pair = new RequestPair(19,"UP");
				request.addRequest(pair);
				up_19.setBackground(Color.RED);
				System.out.println("Count of listeners: " + ((JButton) e.getSource()).getMouseListeners().length);
			}
		});
		
//		up_19  = new JButton("UP");
		up_19.setBackground(Color.WHITE);
		up_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RequestPair pair = new RequestPair(19,"UP");
				request.addRequest(pair);
				up_19.setBackground(Color.RED);
				
			}
		});
		up_19.setBounds(30, 77, 73, 23);
		contentPane.add(up_19);
		
		
		request = new GetRequest();
		
		request.addObserver(checkRequest);
		
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
//		Main mainThread = new Main();
//		Main.Lift[] lift = new Main.Lift[] {mainThread.new Lift(lift1,lift1_Ctrl),
//				mainThread.new Lift(lift2,lift2_Ctrl),
//				mainThread.new Lift(lift3,lift3_Ctrl),
//				mainThread.new Lift(lift4,lift4_Ctrl),
//				mainThread.new Lift(lift5,lift5_Ctrl)};
		
		for (Lift lift2 : lift) {
			Thread thread = new Thread(lift2);
			thread.start();
		}
		
		Main frame = new Main();
		frame.setVisible(true);
		
		//每过一秒，去要一个请求
		Timer timer = new Timer(1*1000,new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
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
							} else {
								//电梯刚好在当前层，啥也不做~
							}
							
							lift[pair.getThreadIndex()].setState(state);
							
							
						}
					}
				}
			}
		});
		
		timer.start();
		timer.setRepeats(true);
		
	}
	
	class Lift implements Runnable{
		
		private String state;//电梯状态，UP，DOWN，或STATIC
		private int current;//目前层数
		private PriorityBlockingQueue<Integer> UpTask;//电梯的上升任务，为层数
		private PriorityBlockingQueue<Integer> DownTask;//电梯的下降任务，为层数
		private PriorityBlockingQueue<Integer> currentTask;//电梯当前任务，为UpTask或DownTask中一个，由state决定
		private JProgressBar[] lift;//楼层指示
		private Timer timer;//电梯的定时器
		private JComboBox<String> lift_ctrl;
		
		public Lift(JProgressBar[] lift,JComboBox<String> lift_Ctrl){
			state = "STATIC";
			
			current = 1;
			
			UpTask = new PriorityBlockingQueue<Integer>(20);//升序
			
			DownTask = new PriorityBlockingQueue<Integer>(20,Collections.reverseOrder());//降序
			
			currentTask = null;
			
			this.lift = lift;
			
			this.lift_ctrl = lift_Ctrl;
			
			timer = new Timer(1*1000, new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
//					System.out.println("state is " + state);
					
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
							
							if(state.equals("UP")){
								UpTask.remove();
							} else if(state.equals("DOWN")){
								DownTask.remove();
							}
//							currentTask.poll();//从任务中去除这一层
							
							System.out.println("currentTask里还剩：" + currentTask.size());
							System.out.println("UpTask里还剩：" + UpTask.size());
							System.out.println("DwonTask里还剩：" + DownTask.size());
						}
						
						if(!currentTask.isEmpty()){
							lift[current-1].setValue(0);//离开当前层，取消颜色
							
							if(current == 20){
								downButton[18].setBackground(Color.WHITE);
							} else if(current == 1){
								upButton[0].setBackground(Color.WHITE);
							} else {
								upButton[current-1].setBackground(Color.WHITE);
								downButton[current-2].setBackground(Color.WHITE);
							}
							
							//到达上/下一层
							if(state == "UP"){
								if(current < 20){
									lift[current++].setValue(1);
								}
							}
							else if(state == "DOWN"){
								if(current > 1){
									lift[current-2].setValue(1);
								}
								current--;
							}
						} else{
							if(state.equals("UP")){
								if(!DownTask.isEmpty()){
									currentTask = DownTask;
									state = "DOWN";
								} else if(!UpTask.isEmpty()){
									currentTask = UpTask;
								} else{
									state = "STATIC";//两个任务队列都为空，则置为停止状态
								}
							} else if(state.equals("DOWN")){
								if(!UpTask.isEmpty()){
									currentTask = UpTask;
									state = "UP";
								} else if(!DownTask.isEmpty()){
									currentTask = DownTask;
								} else{
									state = "STATIC";//两个任务队列都为空，则置为停止状态
									lift_ctrl.setSelectedItem("OPEN");
								}
							} 
						}
					} else{//在有电梯的楼层按下UP、DOWN按钮的情况
						if(current == 20){
							downButton[18].setBackground(Color.WHITE);
						} else if(current == 1){
							upButton[0].setBackground(Color.WHITE);
						} else {
							upButton[current-1].setBackground(Color.WHITE);
							downButton[current-2].setBackground(Color.WHITE);
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


