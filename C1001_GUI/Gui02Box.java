package C1001_GUI;

import java.awt.*;
import javax.swing.*;

public class Gui02Box {
	public static void main(String[] args) {
		
		//박스 레이아웃은 잘 사용하지 않는다.
		JFrame frame = new JFrame("Box layout");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		
		//방향을 어디로 할 건지 두번째 매게변수에 지정해 줘야 한다.
		BoxLayout layout = new BoxLayout(contentPane, BoxLayout.X_AXIS);
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("자바"));
		contentPane.add(new JButton("에스프레소"));
		contentPane.add(new JButton("카푸치노"));
		contentPane.add(new JButton("블루마운틴"));
		contentPane.add(new JButton("콜럼비아"));
		
		frame.pack();
		frame.setVisible(true);
	}
}
