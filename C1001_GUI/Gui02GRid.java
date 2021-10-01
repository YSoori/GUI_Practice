package C1001_GUI;

import java.awt.*;
import javax.swing.*;

public class Gui02GRid {
	public static void main(String[] args) {
		
		//그리드 레이아웃은 자주 사용된다.
		JFrame frame = new JFrame("Grid Layout");
		frame.setLocation(500, 500);
		Container contentPane = frame.getContentPane();
		
		// 그리드는 생성할 떄 행과 열을 지정해줘야한다. (행의 수, 열의 수);
		GridLayout gl = new GridLayout(3, 2);
		contentPane.setLayout(gl);
		
		contentPane.add(new JButton("쥐"));
		contentPane.add(new JButton("소"));
		contentPane.add(new JButton("토끼"));
		contentPane.add(new JButton("말"));
		contentPane.add(new JButton("개"));
		contentPane.add(new JButton("고양이"));
		
		frame.pack();
		frame.setVisible(true);
	}
}
