package C1001_GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.*;

public class Gui05Table2 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Table Example02");
		frame.setPreferredSize(new Dimension(300, 150));
		frame.setLocation(500,400);
		Container ct = frame.getContentPane();
		
		String colNames[] = {"�̸�", "����", "����"};
		Object data[][] = { {"��ö��", 24, '��'},
							{"�̼���", 21, '��'},
							{"������", 26, '��'}
						};
		
		JTable table = new JTable(data, colNames);
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		ct.add(scrollPane,BorderLayout.CENTER);
		
		JButton button = new JButton("���");
		button.addActionListener(new PrintActionListener(table));
		
		ct.add(button, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
}

class PrintActionListener implements ActionListener{
	JTable table;
	
	public PrintActionListener(JTable t) {
		table = t;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TableModel model = table.getModel();
		int rowNum = model.getRowCount();
		int colNum = model.getColumnCount();
		
		for(int col=0;col<colNum;col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName+"\t");
		}
		System.out.println();
		for(int row=0;row<rowNum;row++) {
			for(int col=0;col<colNum;col++) {
				Object obj = model.getValueAt(row, col);
				System.out.print(obj+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
}

