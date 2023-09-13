package Map;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvent implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("리스트")) {
			
		}
		else if(e.getActionCommand().equals("게임")) {
			
		}
		
		else if(e.getActionCommand().equals("종료")) {
			System.exit(0);
		}

	}
}
