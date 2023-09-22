package search;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cafeVO.CafeDAO;
import mainMenu.FrameBase;
import selectMenu.SelectMenu;
	
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
			setBackground(new Color(0xF2E9E4));
			
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
		
		
//=============================================================================================================
		class Result extends JPanel {
			// 결과 패널
			public Result(String menuName) {
				
				Font font = new Font("코트라 희망체",Font.PLAIN, 18);
							
				setBackground(new Color(0xF2E9E4));
				setLayout(new BorderLayout());

						
				JLabel imagePanel = new JLabel();
				JLabel resultName = new JLabel();
				JLabel buttonPanel = new JLabel();
				
				JLabel resultImage = new JLabel();
				ImageIcon resultIcon = null;
				
				// 카테고리별 아이콘 설정
				if(ResultCheck.resultCategory.equals("커피")) {
					resultIcon = CafeDAO.imageScaleChange(
							new ImageIcon("src/panelDesign/CoffeeSearch.png"), 25, 25);
				}
				else if(ResultCheck.resultCategory.equals("에이드")) {
					resultIcon = CafeDAO.imageScaleChange(
							new ImageIcon("src/panelDesign/AdeSearch.png"), 25, 25);
				}
				else if(ResultCheck.resultCategory.equals("스무디")) {
					resultIcon = CafeDAO.imageScaleChange(
							new ImageIcon("src/panelDesign/SmoothieSearch.png"), 25, 25);
				}
				else if(ResultCheck.resultCategory.equals("차")) {
					resultIcon = CafeDAO.imageScaleChange(
							new ImageIcon("src/panelDesign/TeaSearch.png"), 25, 25);
				}
				
				resultImage.setIcon(resultIcon);
				resultImage.setPreferredSize(new Dimension(25,25));
				//resultImage.setBorder(new LineBorder(Color.red));
				
				
				//imagePanel.setBorder(new LineBorder(Color.red));
				imagePanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,7));
				imagePanel.add(resultImage);
				imagePanel.setPreferredSize(new Dimension(40,0));
				
				
				
				
				resultName.setHorizontalTextPosition(JLabel.CENTER);
				resultName.setText(menuName);
				resultName.setBackground(Color.red);
				resultName.setFont(font);
				
				
				//buttonPanel.setBorder(new LineBorder(Color.red));
				JButton resultButton = new JButton((CafeDAO.imageScaleChange(new ImageIcon("src/panelDesign/MagnifySearch.png"), 30, 30)));
				resultButton.setPreferredSize(new Dimension(30,30));
				resultButton.setBorderPainted(false);
				resultButton.setContentAreaFilled(false);
				resultButton.setFocusPainted(false);
				
				
				buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
				buttonPanel.setPreferredSize(new Dimension(50,0));
				buttonPanel.add(resultButton);
				
				
				
				
				add(imagePanel,"West");
				add(resultName,"Center");
				add(buttonPanel,"East");
				
				
				resultButton.addActionListener(new ActionListener() {		
					@Override
					public void actionPerformed(ActionEvent e) {
						if(ResultCheck.resultCategory.equals("커피")) {
							FrameBase.getInstance(new SelectMenu("Coffee", menuName));
						}
						else if(ResultCheck.resultCategory.equals("에이드")) {
							FrameBase.getInstance(new SelectMenu("Ade", menuName));
						}
						else if(ResultCheck.resultCategory.equals("스무디")) {
							FrameBase.getInstance(new SelectMenu("Smoothie", menuName));
						}
						else if(ResultCheck.resultCategory.equals("차")) {
							FrameBase.getInstance(new SelectMenu("Tea", menuName));
						}
						
						
						for(int i=0; i<ResultCheck.resultPage.length; i++)
							ResultCheck.resultPage[i].dispose();
						
					}
				});
			}
			
			// 빈 결과 패널
			public Result() {
				setBackground(new Color(0xF2E9E4));
			}
			
			
		}	
	}
	
	class PageButtonPanel extends JPanel{
		public PageButtonPanel() {
			setPreferredSize(new Dimension(300,50));
			setBackground(new Color(0xF2E9E4));
			setLayout(new BorderLayout());
				
			SideButtonPanel leftButtonPanel = new SideButtonPanel("Left");	
			SideButtonPanel rightButtonPanel = new SideButtonPanel("Right");
		
			add(leftButtonPanel,"West");
			add(rightButtonPanel,"East");
			
		}
		
		class SideButtonPanel extends JLabel{
			public SideButtonPanel(String arrow) {
				
				JButton pageButton = null;
				
				if(arrow.equals("Left")) {
					pageButton = new JButton(CafeDAO.imageScaleChange(new ImageIcon("src/panelDesign/left-arrow.png"), 40, 30));
				}
				else if(arrow.equals("Right")) {
					pageButton = new JButton(CafeDAO.imageScaleChange(new ImageIcon("src/panelDesign/right-arrow.png"), 40, 30));
				}
				
				
				
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
				
				pageButton.setBorderPainted(false);
				pageButton.setContentAreaFilled(false);
				pageButton.setFocusPainted(false);
				
				
				
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
