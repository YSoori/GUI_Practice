package C1001_GUI;

import java.awt.*;
import javax.swing.*;

public class Gui02Box {
	public static void main(String[] args) {
		
		//�ڽ� ���̾ƿ��� �� ������� �ʴ´�.
		JFrame frame = new JFrame("Box layout");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		
		//������ ���� �� ���� �ι�° �ŰԺ����� ������ ��� �Ѵ�.
		BoxLayout layout = new BoxLayout(contentPane, BoxLayout.X_AXIS);
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("�ڹ�"));
		contentPane.add(new JButton("����������"));
		contentPane.add(new JButton("īǪġ��"));
		contentPane.add(new JButton("��縶��ƾ"));
		contentPane.add(new JButton("�ݷ����"));
		
		frame.pack();
		frame.setVisible(true);
	}
}
