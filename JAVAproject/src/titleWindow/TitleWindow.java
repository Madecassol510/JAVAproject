package titleWindow;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import mainMenu.FrameBase;
import mainMenu.MainPanel;

public class TitleWindow extends JPanel{
	public TitleWindow() {
		setSize(484,662);
		
		
		setLayout(new FlowLayout(FlowLayout.CENTER,0,500));
		
		JButton startBt = new JButton("START");
		startBt.setPreferredSize(new Dimension(200,70));
		
		add(startBt);
		
		
		startBt.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new MainPanel());
				
			}
		});
	}
}
