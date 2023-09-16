package search;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ResultPanel extends JPanel{
	
	ArrayList<String> resultList;
	
	public ResultPanel() {
		
		
		setPreferredSize(new Dimension(300,230));
		setLayout(new BorderLayout());
		
		add(new ResultListPanel());
		add(new PageButtonPanel(), "South");
		
		
	}
	
	
	class ResultListPanel extends JPanel{		
		public ResultListPanel() {
			setLayout(new GridLayout(4,1));
			setBackground(Color.white);
			
			for(int i=0; i<4; i++) {
				if(ResultCheck.nowIndex == ResultCheck.resultCount) {
					add(new Result());		
				}
				else {
					add(new Result(ResultCheck.resultList.get(ResultCheck.nowIndex)));
					ResultCheck.nowIndex++;
				}
				
			}	
		}
		
		class Result extends JPanel {
			// 결과 패널
			public Result(String menuName) {
				//setLayout(new FlowLayout(FlowLayout.LEFT));
				
				setLayout(new BorderLayout());
				setBorder(new LineBorder(Color.black));
				JLabel resultImage = new JLabel();
				JLabel resultName = new JLabel();
				JPanel buttonPanel = new JPanel();
				
				ImageIcon resultIcon = new ImageIcon("CoffeeSearchIcon.png");
				Image img = resultIcon.getImage(); 
				Image chageImg = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
				ImageIcon chageIcon = new ImageIcon(chageImg);
				
				resultImage.setIcon(chageIcon);
				resultImage.setPreferredSize(new Dimension(20,10));
				
				
				
				resultName.setHorizontalTextPosition(JLabel.CENTER);
				resultName.setText(menuName);
				resultName.setBackground(Color.red);
				
				add(resultImage,"West");
				add(resultName,"Center");
				add(buttonPanel,"East");
				
				
				Button resultButton = new Button("이동");
				buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,10));
				buttonPanel.add(resultButton);
			}
			
			// 빈 결과 패널
			public Result() {
				
			}
			
			
		}	
	}
	
	class PageButtonPanel extends JPanel{
		public PageButtonPanel() {
			setPreferredSize(new Dimension(300,50));
			setBackground(Color.blue);
		}
	}
	
	
	
	
}
