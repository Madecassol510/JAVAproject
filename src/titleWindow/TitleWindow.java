package titleWindow;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cafeVO.CafeDAO;
import mainMenu.FrameBase;
import mainMenu.MainPanel;

public class TitleWindow extends JPanel{
	public TitleWindow() {
		setSize(485,662);
		setLayout(new GridLayout(2,1));
		
		JLabel titleLabel = new JLabel("<html>싸 <span style=\"font-size: 30px;\">게파는</span>   " + "커<span style=\"font-size: 30px;\">피</span></html>");
		titleLabel.setHorizontalAlignment(JLabel.CENTER); // 가로 정렬
		titleLabel.setVerticalAlignment(JLabel.CENTER);  // 세로 정렬
		titleLabel.setFont(new Font("코트라 희망체", Font.PLAIN, 100));
		

		int labelWidth = 484;  // 패널의 너비와 동일하게 설정
		int labelHeight = 30;  // 레이블의 높이 (원하는 높이로 설정 가능)
		int labelX = 0;  // 레이블의 x 좌표 (패널의 왼쪽 끝에서 시작)
		int labelY = (662 - labelHeight) / 2;  // 레이블을 패널의 중앙에 배치하기 위한 y 좌표

		titleLabel.setBounds(labelX, labelY, labelWidth, labelHeight);
		add(titleLabel);
		
		JButton startBt = new JButton("S T A R T");
		startBt.setFont(new Font("코트라 희망체", Font.PLAIN, 40));
		startBt.setPreferredSize(new Dimension(200,70));
		startBt.setBounds(0,-200, 200, 70);
		startBt.setOpaque(false);
		
		
		
		
		add(startBt);
		
		startBt.setBorderPainted(false);
		startBt.setContentAreaFilled(false);
		
	
		startBt.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {

				FrameBase.getInstance(new MainPanel());

			}
			
		});	
		
		
	}
	
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		ImageIcon image = CafeDAO.imageScaleChange(new ImageIcon("src/panelDesign/FrameBackground.jpg"), d.width, d.height);
		g.drawImage(image.getImage(), 0, 0, d.width, d.height, null);
		setOpaque(false);
	}
}
