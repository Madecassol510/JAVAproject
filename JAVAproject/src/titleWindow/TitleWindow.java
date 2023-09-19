package titleWindow;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import cafeVO.CafeDAO;
import image.ImagePanel;
import mainMenu.FrameBase;
import mainMenu.MainPanel;
import search.ResultCheck;

public class TitleWindow extends JPanel{
	public TitleWindow() {
		setSize(485,662);

		JButton startBt = new JButton("START");
		setLayout(new FlowLayout(FlowLayout.CENTER,0,500));
		startBt.setPreferredSize(new Dimension(200,70));
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
		ImageIcon image = CafeDAO.imageScaleChange(new ImageIcon("61.jpg"), d.width, d.height);
		g.drawImage(image.getImage(), 0, 0, d.width, d.height, null);
		setOpaque(false);
	}
}
