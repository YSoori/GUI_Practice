package C1001_GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Gui01Example {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Hello, GUI"); //�������� �����. ��ȣ�ȿ� �Է��ϴ� ���ڴ� Title���� �ȴ�.
		Container ct = jf.getContentPane(); //������ ���� �����ϴ� �޼ҵ�
		JLabel lb = new JLabel("Hello!"); //�ؽ�Ʈ������ �ԷµǴ� ����.
		
		JTextField jt = new JTextField(); //�ؽ�Ʈ �Է�â ����
		JButton jb = new JButton("Ȯ��"); //��ư�� ����
		
		//BorderLayout ���� CENTER EAST WEST SOUTH NORTH �̷��� �ִ�.
		//������ ���� ���̾ƿ��� �� ���� �ʴ´�. �⺻���̱� ����.
		GridLayout gr = new GridLayout(1,3); 
		
		 
		//������ �ҿ� �����͸� ����ִ� �޼ҵ�
//		ct.add(lb);
		ct.add(jt, BorderLayout.CENTER);
		ct.add(jb, BorderLayout.EAST);
		ct.add(lb, BorderLayout.SOUTH);
		

		jf.setLocation(500, 500); //���α׷� ���� �� ��ġ ����

		// ũ�⸦ ���� �������ְ� ��! �ؾ��Ѵ�.
		jf.setPreferredSize(new Dimension(200, 100)); // �������� ũ�⸦ �����ϴ� �޼ҵ�
		jf.pack(); //������ ��ġ�� �����ָ� ���� �ؿ� �ۼ�������Ѵ�!
		jf.setVisible(true); //���α׷��� ���� ���̵��� ����. false (�Ⱥ���) / true (����)
		
		//��ư�� �̹�Ʈ�� �߰��ϴ� �޼ҵ�
		ActionListener al = new ConfirmButtonListener(jt, lb);
		jb.addActionListener(al);
		
	}
	
}

//�̺�Ʈ�� ó���ϴ� Ŭ����. ���ϴ� ����� ���� ����������Ѵ�! ActionListener �������̽��� Ȱ���ؾ���.
class ConfirmButtonListener implements ActionListener{
	JTextField jt;
	JLabel jl; 
	
	public ConfirmButtonListener(JTextField t, JLabel l) {
		jt = t;
		jl = l;
	}
	
	//�۵���ų ����� ��������� �Ѵ�
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = jt.getText();
		jl.setText("Hello! "+name);
		
	}
}