package C1001_GUI;

import java.awt.*;
import javax.swing.*;

public class Gui03PanelRayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Panel layout");
		frame.setPreferredSize(new Dimension(250, 150));
		frame.setLocation(500, 500);
		Container ct = frame.getContentPane();
		
		// �г��� �����Ѵ�.
		// �г� �ȿ� ���ο� �г��� ���� �� �� �ִ�.
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		
//		JPanel panel = new JPanel(new GridLayout(3,2)); ���� ���� �����̴�.
		
		//������Ʈ�� �����Ͽ� �гο� �߰�
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		panel.add(new JLabel("�̸�"));
		panel.add(text1);
		panel.add(new JLabel("�ּ�"));
		panel.add(text2);
		panel.add(new JLabel("��ȭ��ȣ"));
		panel.add(text3);
		
		ct.add(panel); //�г��� �����̳ʿ� �߰�
		ct.add(new JButton("Ȯ��"), BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
		
	}
}
