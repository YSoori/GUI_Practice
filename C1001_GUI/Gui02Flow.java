package C1001_GUI;

import java.awt.*;
import javax.swing.*;

public class Gui02Flow {
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Flow layout");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		
		//플로우는 그냥 레이아웃 인스턴스를 생성해주면 된다.
		FlowLayout layout = new FlowLayout();
		contentPane.setLayout(layout);

		contentPane.add(new JButton("사과"));
		contentPane.add(new JButton("파인애플"));
		contentPane.add(new JButton("오렌지"));
		contentPane.add(new JButton("포도"));
		contentPane.add(new JButton("레몬"));
		contentPane.add(new JButton("복숭아"));
		
		frame.pack();
		frame.setVisible(true);
	}
}
