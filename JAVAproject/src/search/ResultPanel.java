package search;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import cafeVO.CafeDAO;

public class ResultPanel extends JPanel{
		
	
	int pageIndex;
	
	public ResultPanel(int pageIndex) {
		
		this.pageIndex = pageIndex;
		
		setPreferredSize(new Dimension(300,230));
		setLayout(new BorderLayout());
		
		add(new ResultListPanel());
		add(new PageButtonPanel(), "South");
	
	}
	
	
	class ResultListPanel extends JPanel{		
		public ResultListPanel() {
			setLayout(new GridLayout(4,1));
			setBackground(Color.white);
			
			// 결과 리스트 출력
			for(int i=0; i<4; i++) {
				if(ResultCheck.nowIndex == ResultCheck.resultCount) {
					add(new Result());		
				}
				else {
					add(new Result(ResultCheck.resultList.get(ResultCheck.nowIndex)));
					ResultCheck.nowIndex++; // 현재 인덱스 위치 변경
				}
				
			}	
		}
		
		class Result extends JPanel {
			// 결과 패널
			public Result(String menuName) {
				//setLayout(new FlowLayout(FlowLayout.LEFT));
				
				setLayout(new BorderLayout());
				setBorder(new LineBorder(Color.black));
				
				
				JPanel imagePanel = new JPanel();
				JLabel resultName = new JLabel();
				JPanel buttonPanel = new JPanel();
				
				JLabel resultImage = new JLabel();
				ImageIcon resultIcon = null;
				
				// 카테고리별 아이콘 설정
				if(ResultCheck.resultCategory.equals("커피")) {
					resultIcon = CafeDAO.imageScaleChange(
							new ImageIcon("CoffeeSearchIcon.png"), 20, 20);
				}
				else if(ResultCheck.resultCategory.equals("에이드")) {
					resultIcon = CafeDAO.imageScaleChange(
							new ImageIcon("CoffeeSearchIcon.png"), 20, 20);
				}
				else if(ResultCheck.resultCategory.equals("스무디")) {
					resultIcon = CafeDAO.imageScaleChange(
							new ImageIcon("CoffeeSearchIcon.png"), 20, 20);
				}
				else if(ResultCheck.resultCategory.equals("차")) {
					resultIcon = CafeDAO.imageScaleChange(
							new ImageIcon("CoffeeSearchIcon.png"), 20, 20);
				}
				
				resultImage.setIcon(resultIcon);
				resultImage.setPreferredSize(new Dimension(20,20));
				//resultImage.setBorder(new LineBorder(Color.red));
				
				
				//imagePanel.setBorder(new LineBorder(Color.red));
				imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,7));
				imagePanel.add(resultImage);
				imagePanel.setPreferredSize(new Dimension(40,0));
				
				resultName.setHorizontalTextPosition(JLabel.CENTER);
				resultName.setText(menuName);
				resultName.setBackground(Color.red);
				
				
				
				//buttonPanel.setBorder(new LineBorder(Color.red));
				Button resultButton = new Button("이동");
				resultButton.setPreferredSize(new Dimension(30,30));
				buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
				buttonPanel.setPreferredSize(new Dimension(50,0));
				buttonPanel.add(resultButton);
				
				add(imagePanel,"West");
				add(resultName,"Center");
				add(buttonPanel,"East");
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
			setLayout(new BorderLayout());
				
			SideButtonPanel leftButtonPanel = new SideButtonPanel("Left");	
			SideButtonPanel rightButtonPanel = new SideButtonPanel("Right");
		
			add(leftButtonPanel,"West");
			add(rightButtonPanel,"East");
			
		}
		
		class SideButtonPanel extends JPanel{
			public SideButtonPanel(String arrow) {
				setBorder(new LineBorder(Color.red));
				
				Button pageButton = new Button("페이지");
				
				setPreferredSize(new Dimension(70,0));
				setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
				
				pageButton.setPreferredSize(new Dimension(60,40));	
				add(pageButton);
				
				
				if(arrow.equals("Left")){
					if(pageIndex == 0)
						pageButton.setEnabled(false);
					else {
						pageButton.setEnabled(true);
					}
				}
				
				if(arrow.equals("Right")){
					if(pageIndex == ResultCheck.pageCount-1)
						pageButton.setEnabled(false);
					else {
						pageButton.setEnabled(true);
					}
				}
				
				pageButton.addActionListener(new ActionListener() {			
					@Override
					public void actionPerformed(ActionEvent e) {
						if(arrow.equals("Left")) {
							ResultCheck.resultPage[pageIndex].setVisible(false);	
							ResultCheck.resultPage[pageIndex-1].setVisible(true);
							
							
						}
						else if(arrow.equals("Right")) {
							ResultCheck.resultPage[pageIndex].setVisible(false);
							ResultCheck.resultPage[pageIndex+1].setVisible(true);
							
						}
					}
				});
			}
		}
	}
	
	
	
	
}
