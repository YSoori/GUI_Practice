package C1001_GUI;

import java.awt.*;
import javax.swing.*;

public class Gui03PanelRayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Panel layout");
		frame.setPreferredSize(new Dimension(250, 150));
		frame.setLocation(500, 500);
		Container ct = frame.getContentPane();
		
		// 패널을 생성한다.
		// 패널 안에 새로운 패널을 넣을 수 도 있다.
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		
//		JPanel panel = new JPanel(new GridLayout(3,2)); 위와 같은 형태이다.
		
		//컴포넌트를 생성하여 패널에 추가
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("주소"));
		panel.add(text2);
		panel.add(new JLabel("전화번호"));
		panel.add(text3);
		
		ct.add(panel); //패널을 컨테이너에 추가
		ct.add(new JButton("확인"), BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
		
	}
}
