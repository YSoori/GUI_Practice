package C1001_GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Gui01Example {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Hello, GUI"); //프레임을 만든다. 괄호안에 입력하는 문자는 Title명이 된다.
		Container ct = jf.getContentPane(); //콘텐츠 팬을 리턴하는 메소드
		JLabel lb = new JLabel("Hello!"); //텍스트파일이 입력되는 공간.
		
		JTextField jt = new JTextField(); //텍스트 입력창 생성
		JButton jb = new JButton("확인"); //버튼을 생성
		
		//BorderLayout 에는 CENTER EAST WEST SOUTH NORTH 이렇게 있다.
		//하지만 보더 레이아웃은 잘 쓰지 않는다. 기본형이기 때문.
		GridLayout gr = new GridLayout(1,3); 
		
		 
		//콘텐츠 팬에 데이터를 집허넣는 메소드
//		ct.add(lb);
		ct.add(jt, BorderLayout.CENTER);
		ct.add(jb, BorderLayout.EAST);
		ct.add(lb, BorderLayout.SOUTH);
		

		jf.setLocation(500, 500); //프로그램 시작 시 위치 지정

		// 크기를 먼저 지정해주고 팩! 해야한다.
		jf.setPreferredSize(new Dimension(200, 100)); // 프레임의 크기를 변경하는 메소드
		jf.pack(); //프레임 위치를 정해주면 팩을 밑에 작성해줘야한다!
		jf.setVisible(true); //프로그램을 눈에 보이도록 해줌. false (안보임) / true (보임)
		
		//버튼에 이번트를 추가하는 메소드
		ActionListener al = new ConfirmButtonListener(jt, lb);
		jb.addActionListener(al);
		
	}
	
}

//이벤트를 처리하는 클래스. 원하는 기능을 직접 제작해줘야한다! ActionListener 인터페이스를 활용해야함.
class ConfirmButtonListener implements ActionListener{
	JTextField jt;
	JLabel jl; 
	
	public ConfirmButtonListener(JTextField t, JLabel l) {
		jt = t;
		jl = l;
	}
	
	//작동시킬 기능을 정의해줘야 한다
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = jt.getText();
		jl.setText("Hello! "+name);
		
	}
}