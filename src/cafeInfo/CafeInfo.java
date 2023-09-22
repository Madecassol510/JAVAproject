package cafeInfo;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;



import cafeVO.Cafe;
import cafeVO.CafeDAO;
import mainMenu.FrameBase;
import mainMenu.MainPanel;



//카페를 클릭했을 때 보여지는 상세정보 페이지


public class CafeInfo extends JPanel {
	JFrame infoFrame = new JFrame("상세 정보");
	int iNum;
	int width;
	int height;
	
	String str;
	public CafeInfo(Cafe c) { //Cafe형 객체
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		infoFrame.setBounds((int)tk.getScreenSize().getWidth()/2 -250,
				(int)tk.getScreenSize().getHeight()/2-350, 500,700);
		Dimension dim = new Dimension(500, 700);
		infoFrame.setSize(dim);
		infoFrame.setResizable(false);
		infoFrame.setUndecorated(false);
        
        
		//프레임의 배경화면 설정
		Container contentPane = infoFrame.getContentPane();
		ImageIcon imageicon = new ImageIcon("src/panelDesign/FrameBackground.jpg");
		
		
		ImageIcon resizedImageIcon = new ImageIcon(ImgTransSetting(imageicon, 500, 700, 0.5f));
		
		JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, infoFrame.getWidth(), infoFrame.getHeight());
		contentPane.add(backgroundLabel);
		
		
		//라벨 덧씌우기 (보더레이아웃 효과를 내기 위해 설정)
		JLabel backgroundLabel2 = new JLabel(resizedImageIcon);
		backgroundLabel2.setBounds(0, 0, backgroundLabel.getWidth(), backgroundLabel.getHeight());
		backgroundLabel2.setLayout(new BorderLayout());
		backgroundLabel2.setOpaque(false);
		backgroundLabel.add(backgroundLabel2);
		
		
		
		
		// JPanel

		// 이미지 할당하는 클래스 CafeIf 및 메서드 호출
		JPanel imgpanel = new JPanel();
		
		CafeDAO cd = new CafeDAO(); 
		
		
        
		imgpanel.setOpaque(false);
		
				
		
		JLabel img = new JLabel(cd.imageScaleChange(c.getImage(),170,120));
			imgpanel.add(img);
			imgpanel.setAlignmentX(1.0f);
			imgpanel.setVisible(true);

		//카페 제목 주소 부분
		JTextPane inform = new JTextPane();
		if(inform.getName() != null) {
			inform.setText("");
		} else {
		String text = "상호명 :  " + c.getName() + "\n주     소 :  " +  c.getAdress();
		//inform.setPreferredSize(new Dimension(400,90));//(200,280)
		inform.setPreferredSize(new Dimension(250, 110));
		inform.setEditable(false);		
		inform.setText(text);
		inform.setOpaque(false); //투명하게 하는 메서드		
		StyledDocument doc = inform.getStyledDocument();
		SimpleAttributeSet attributes = new SimpleAttributeSet();
		StyleConstants.setFontFamily(attributes, "코트라 희망체"); // 원하는 폰트 이름으로 변경
		StyleConstants.setFontSize(attributes, 20); // 원하는 폰트 크기로 변경
		

		// 스타일을 텍스트에 적용합니다.
		doc.setCharacterAttributes(0, doc.getLength(), attributes, true);
		
		SimpleAttributeSet left = new SimpleAttributeSet();
		StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT);
		doc.setParagraphAttributes(0, doc.getLength(), left, false);
		}
		
		// 이미지 패널과 상호주소 패널을 합친 카페 정보 패널
		JPanel cafeInfoPanel = new JPanel();
		cafeInfoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
		
		cafeInfoPanel.add(imgpanel);
		cafeInfoPanel.add(inform);
		cafeInfoPanel.setVisible(true);
		Dimension dimInfo = new Dimension(450, 180);
		cafeInfoPanel.setPreferredSize(dimInfo);
		cafeInfoPanel.setOpaque(false);
		
		

		// CafeInfoPanel cafeInfoPanel = new CafeInfoPanel(c);
		// cafeInfoPanel.setVisible(true);
		backgroundLabel2.add(cafeInfoPanel, BorderLayout.NORTH);
		backgroundLabel2.add(InfoP(), BorderLayout.SOUTH);// 정보창 버튼 패널 추가
		
		
		
		
		
		//카페 메뉴
		JPanel menuPanel = new JPanel();
		menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		menuPanel.setOpaque(false);
		
		backgroundLabel2.add(menuPanel, BorderLayout.CENTER);
		
		JPanel menuOut = new JPanel();
		menuOut.setOpaque(false);
		menuPanel.add(menuOut);
		
		
		JPanel menu = new JPanel();
		menu.setOpaque(false);
		menu.setLayout(new GridBagLayout());
		GridBagConstraints cs = new GridBagConstraints();
		cs.fill = GridBagConstraints.BOTH;
		
		Dimension dimMenu = new Dimension(450, 340);
		menu.setPreferredSize(dimMenu);
		menu.setVisible(true);
		
		menuOut.add(menu);
		
		
		
		JTextArea CoffeeMenu = new JTextArea("     커피\n");
		CoffeeMenu.setSize(185,170);
		cs.gridx =0;
		cs.gridy =85;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(CoffeeMenu, cs);
		
		JTextArea CoffeePrice = new JTextArea(" \n");
		CoffeePrice.setSize(40,170);
		cs.gridx =185;
		cs.gridy =85;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(CoffeePrice, cs);
		
		JTextArea AdeMenu = new JTextArea("     에이드\n");
		AdeMenu.setSize(185,170);
		cs.gridx =225;
		cs.gridy =85;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(AdeMenu, cs);
		
		JTextArea AdePrice = new JTextArea("\n");
		AdePrice.setSize(40,170);
		cs.gridx =410;
		cs.gridy =85;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(AdePrice, cs);
		
		JTextArea SmoothieMenu = new JTextArea("     스무디\n");
		SmoothieMenu.setSize(185,170);
		cs.gridx =0;
		cs.gridy =-85;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(SmoothieMenu, cs);
		
		JTextArea SmoothiePrice = new JTextArea("\n");
		SmoothiePrice.setSize(40,170);
		cs.gridx =185;
		cs.gridy =-85;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(SmoothiePrice, cs);
		
		JTextArea TeaMenu = new JTextArea("     차\n");
		TeaMenu.setSize(185,170);
		cs.gridx =225;
		cs.gridy =-85;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(TeaMenu, cs);
		
		JTextArea TeaPrice = new JTextArea(" \n");
		TeaPrice.setSize(40,170);
		cs.gridx =410;
		cs.gridy =-85;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(TeaPrice, cs);
		
		for(int i =0; i< c.getCoffeeMenu().size(); i++) {
			String add = CoffeeMenu.getText();
			add += "\n     "+c.getCoffeeMenu().get(i).getName();
			CoffeeMenu.setText(add);
		}
		for(int i =0; i< c.getCoffeeMenu().size(); i++) {
			String add = CoffeePrice.getText();
			add += "\n     "+c.getCoffeeMenu().get(i).getPrice();
			CoffeePrice.setText(add);
		}
		for(int i =0; i< c.getAdeMenu().size(); i++) {
			String add = AdeMenu.getText();
			add += "\n     "+c.getAdeMenu().get(i).getName();
			AdeMenu.setText(add);
		}
		for(int i =0; i< c.getAdeMenu().size(); i++) {
			String add = AdePrice.getText();
			add += "\n     "+c.getAdeMenu().get(i).getPrice();
			AdePrice.setText(add);
		}
		for(int i =0; i< c.getSmoothieMenu().size(); i++) {
			String add = SmoothieMenu.getText();
			add += "\n     "+c.getSmoothieMenu().get(i).getName();
			SmoothieMenu.setText(add);
		}
		for(int i =0; i< c.getSmoothieMenu().size(); i++) {
			String add = SmoothiePrice.getText();
			add += "\n     "+c.getSmoothieMenu().get(i).getPrice();
			SmoothiePrice.setText(add);
		}
		for(int i =0; i< c.getTeaMenu().size(); i++) {
			String add = TeaMenu.getText();
			add += "\n     "+c.getTeaMenu().get(i).getName();
			TeaMenu.setText(add);
		}
		for(int i =0; i< c.getTeaMenu().size(); i++) {
			String add = TeaPrice.getText();
			add += "\n     "+c.getTeaMenu().get(i).getPrice();
			TeaPrice.setText(add);
		}
		
		
		TASettings(CoffeeMenu);
		TASettings(CoffeePrice);
		TASettings(AdeMenu);
		TASettings(AdePrice);
		TASettings(SmoothieMenu);
		TASettings(SmoothiePrice);
		TASettings(TeaMenu);
		TASettings(TeaPrice);
        
		iNum = cd.searchCafeI(c.getName());
		
     // 카페메뉴 끝
        infoFrame.setVisible(true); //프레임 on
        
	}    

	private static void TASettings(JTextArea textArea) { //textarea 전체에 디자인하는 메서드
		textArea.setEditable(false);
		textArea.setOpaque(false);
		Font font = new Font("코트라 희망체", Font.PLAIN, 18); 
		textArea.setFont(font);
	}
	
	class ImagePanel extends JPanel {
	    private BufferedImage backgroundImage;

	    public ImagePanel(String imagePath) {
	        try {
	            backgroundImage = ImageIO.read(new File(imagePath));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        if (backgroundImage != null) {
	            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
	        }
	    }
	}
	
	private static BufferedImage ImgTransSetting(ImageIcon imageicon, int width, int height, float trans) {
		Image image = imageicon.getImage();
		
		// 새로운 이미지 생성
        BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2dNew = newImage.createGraphics();

        // 투명도 조절 (0.0에서 1.0 사이의 값, 0.5는 반투명)
        float transparency = trans;
        AlphaComposite alpha = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, transparency);
        g2dNew.setComposite(alpha);
        
        // 원본 이미지를 새 이미지에 그립니다.
        g2dNew.drawImage(image, 0, 0, width, height, null);

        // 그래픽 컨텍스트를 해제합니다.
        g2dNew.dispose();
        
        return newImage;
	}
			
	
	public JPanel InfoP() {
		
	      JPanel InfoPanel = new JPanel();
	      InfoPanel.setPreferredSize(new Dimension(500, 150));
	      InfoPanel.setBackground(Color.green);
	      InfoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));
	      InfoPanel.setOpaque(false);
	      ArrayList<JButton> menuButtons = new ArrayList<JButton>();

	      // 버튼 생성 및 이미지 아이콘 설정
	      ImageIcon roadIcon = new ImageIcon("src/soldesk_pro01_img/road.png");
	      roadIcon.setImage(CafeDAO.imageScaleChange(roadIcon, 80, 80).getImage());
	      
	      ImageIcon homeIcon = new ImageIcon("src/soldesk_pro01_img/house.png");
	      homeIcon.setImage(CafeDAO.imageScaleChange(homeIcon, 80, 80).getImage());

	
	      ImageIcon returnIcon = new ImageIcon("src/soldesk_pro01_img/return.png");
	      returnIcon.setImage(CafeDAO.imageScaleChange(returnIcon, 80, 80).getImage());
	      
	      JButton roadbt=new JButton(roadIcon);
	      roadbt.setOpaque(false);
	      roadbt.setContentAreaFilled(false);
	      roadbt.setBorderPainted(false);
	      
	      JButton homebt=new JButton(homeIcon);
	      homebt.setOpaque(false);
	      homebt.setContentAreaFilled(false);
	      homebt.setBorderPainted(false);
	      
	      JButton returnbt=new JButton(returnIcon);
	      returnbt.setOpaque(false);
	      returnbt.setContentAreaFilled(false);
	      returnbt.setBorderPainted(false);
	      
	      menuButtons.add(roadbt);
	      menuButtons.add(homebt);
	      menuButtons.add(returnbt);

	      for (JButton button : menuButtons) {
	    	    InfoPanel.add(button);
	    	    button.setPreferredSize(new Dimension(120, 80));
	    	    button.addActionListener(new ActionListener() {
	    	    	
	    	        @Override
	    	        public void actionPerformed(ActionEvent e) {
	    	            if (button.getIcon() == homeIcon) { // 이미지 아이콘을 비교합니다
	    	                infoFrame.dispose();
	    	                FrameBase.getInstance(new MainPanel());
	    	            } else if (button.getIcon() == returnIcon) { // 이미지 아이콘을 비교합니다
	    	                infoFrame.dispose();
	    	            }else if (button.getIcon() == roadIcon) { // 이미지 아이콘을 비교합니다
	    	            	SwingUtilities.invokeLater(new Runnable() {
		                        @Override
		                        public void run() {
		                            roadpanel(); // 이미지를 표시하거나 업데이트
		                        }
		                    });
	    	            }
	    	        }    
	    	   });    
	      }   
	      
	    	return InfoPanel;
	   }

	 
	
	public JPanel roadpanel() {
		str = "src/roadview/" + (iNum + 1) + ".png";
	    ImageIcon icon = new ImageIcon(str);
	    
	    CafeDAO cdo = new CafeDAO();
	    ImageIcon reicon = cdo.imageScaleChange(icon, 484, 662);
	    
	    
		
	    JFrame roadView = new JFrame("길찾기"); 
	    roadView.setLayout(new BorderLayout());
	    Toolkit t = Toolkit.getDefaultToolkit();
	    roadView.setBounds((int) t.getScreenSize().getWidth() / 2 - 250,
	            (int) t.getScreenSize().getHeight() / 2 - 350, 500, 700);

	    JLabel roadLabel = new JLabel();
	    roadLabel.setSize(484, 662);
	    roadLabel.setIcon(icon);

	    JPanel roadpanel = new JPanel();
	    roadpanel.setPreferredSize(new Dimension(484, 662));
	    roadpanel.setOpaque(false);

	    roadLabel.setIcon(reicon);

	    roadpanel.setOpaque(true);

	    roadView.setVisible(true);
	    roadView.add(roadpanel, BorderLayout.CENTER);
	    roadpanel.add(roadLabel);
	    roadView.setResizable(false);
	    return roadpanel;
	}
}