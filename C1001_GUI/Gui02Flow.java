package C1001_GUI;

import java.awt.*;
import javax.swing.*;

public class Gui02Flow {
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Flow layout");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		
		//�÷ο�� �׳� ���̾ƿ� �ν��Ͻ��� �������ָ� �ȴ�.
		FlowLayout layout = new FlowLayout();
		contentPane.setLayout(layout);

		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("���ξ���"));
		contentPane.add(new JButton("������"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("������"));
		
		frame.pack();
		frame.setVisible(true);
	}
}
