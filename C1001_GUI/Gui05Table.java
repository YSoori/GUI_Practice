package C1001_GUI;

import java.awt.*;
import javax.swing.*;

public class Gui05Table {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Table Example01");
		frame.setPreferredSize(new Dimension(300, 150));
		frame.setLocation(500,400);
		Container ct = frame.getContentPane();
		
		String colNames[] = {"이름", "나이", "성별"};
		Object data[][] = { {"김철수", 24, '남'},
							{"이순희", 21, '여'},
							{"박지영", 26, '여'}
						};
		
		JTable table = new JTable(data, colNames);
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		ct.add(scrollPane,BorderLayout.CENTER);
		
		JButton button = new JButton("출력");
		ct.add(button, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
}

