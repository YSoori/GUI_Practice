package C1001_GUI;

import java.awt.*;
import javax.swing.*;

public class Gui02GRid {
	public static void main(String[] args) {
		
		//�׸��� ���̾ƿ��� ���� ���ȴ�.
		JFrame frame = new JFrame("Grid Layout");
		frame.setLocation(500, 500);
		Container contentPane = frame.getContentPane();
		
		// �׸���� ������ �� ��� ���� ����������Ѵ�. (���� ��, ���� ��);
		GridLayout gl = new GridLayout(3, 2);
		contentPane.setLayout(gl);
		
		contentPane.add(new JButton("��"));
		contentPane.add(new JButton("��"));
		contentPane.add(new JButton("�䳢"));
		contentPane.add(new JButton("��"));
		contentPane.add(new JButton("��"));
		contentPane.add(new JButton("�����"));
		
		frame.pack();
		frame.setVisible(true);
	}
}
