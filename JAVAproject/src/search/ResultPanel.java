package search;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ResultPanel extends JPanel{
	
	ArrayList<String> resultList;
	
	public ResultPanel() {
		
		
		setPreferredSize(new Dimension(300,230));
		setLayout(new BorderLayout());
		
		add(new ListPanel());
		add(new PageButtonPanel(), "South");
		
		
	}
	
	
	class ListPanel extends JPanel{
		
		A[] a = new A[]{};
		
		public ListPanel() {
			setLayout(new GridLayout(1,4));
			setBackground(Color.white);
			
		
			for(int i=0; i<4; i++) {
				if(ResultCheck.totalNum == 0)
					break;
				a[i] = new A();
				ResultCheck.resultList.remove(0);
				ResultCheck.totalNum--;
			}
			
			for(int i=0; i<a.length; i++) {
				add(a[i]);
			}
		}
	}
	
	class PageButtonPanel extends JPanel{
		public PageButtonPanel() {
			setPreferredSize(new Dimension(300,50));
			setBackground(Color.blue);
		}
	}
	
	class A extends JPanel{
		public A() {
			
		}
	}
}
