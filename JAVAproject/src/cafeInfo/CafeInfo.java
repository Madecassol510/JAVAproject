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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import cafeVO.Cafe;
import cafeVO.CafeDAO;
import search.SearchWindow;



//카페를 클릭했을 때 보여지는 상세정보 페이지


public class CafeInfo extends JPanel {
	
	public JFrame infoFrame = new JFrame("상세 정보");
	
	public CafeInfo(Cafe c) { //Cafe형 객체
		Toolkit tk = Toolkit.getDefaultToolkit();
		infoFrame.setBounds((int)tk.getScreenSize().getWidth()/2 -250,
				(int)tk.getScreenSize().getHeight()/2-300, 500,700);
		Dimension dim = new Dimension(500, 700);
		infoFrame.setSize(dim);
		infoFrame.setResizable(false);
		infoFrame.setUndecorated(true);
		
        
		//프레임의 배경화면 설정
		Container contentPane = infoFrame.getContentPane();
		ImageIcon imageicon = new ImageIcon("JAVAproject/src/soldesk_pro01_img/infobackground.jpg");
		
		
		ImageIcon resizedImageIcon = new ImageIcon(ImgTransSetting(imageicon, 500, 700, 0.1f));
		
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
		final int cafeNum = 1;
		int cafeFlag = -1;
		JPanel imgpanel = new JPanel();
		
		CafeDAO cd = new CafeDAO(); 
		CafeUrl cafeUrlInstance = new CafeUrl();
		
		
		imgpanel.setOpaque(false);
		ImageIcon[] cafeImg = new ImageIcon[cafeUrlInstance.getCafeUrls().length];
		String[] cafeimgname = new String[cafeUrlInstance.getCafeUrls().length];
		
		for(int i=0; i<cafeUrlInstance.getCafeUrls().length; i++)
		{
		cafeimgname[i]= cd.getList().get(i).getName();
		}
		
		//cafe 객체의 이름에 맞는 배열의 요소 찾기 if문
		
		//for (int i=0; i < cd.getList().size(); i++)
		//	if ( c.getName() == cafeimgname[i])
		//	{
		//			cafeFlag = i;					 
		//	}
		
		
		if ( c.getName() == cafeimgname[0])
		{
				cafeFlag = 0;					 
		}
		else if( c.getName() == cafeimgname[1]) {	
			cafeFlag = 1;					
		}
		else if( c.getName() == cafeimgname[2]) {	
			cafeFlag = 2;					
		}
		else if( c.getName() == cafeimgname[3]) {	
			cafeFlag = 3;					
		}
		else if( c.getName() == cafeimgname[4]) {	
			cafeFlag = 4;					
		}
		else if( c.getName() == cafeimgname[5]) {	
			cafeFlag = 5;					
		}	
		else if( c.getName() == cafeimgname[6]) {	
			cafeFlag = 6;					
		}
		else if( c.getName() == cafeimgname[7]) {	
			cafeFlag = 7;					
		}
		else if( c.getName() == cafeimgname[8]) {	
			cafeFlag = 8;					
		}
		else if( c.getName() == cafeimgname[9]) {	
			cafeFlag = 9;					
		}
		else if( c.getName() == cafeimgname[10]) {	
			cafeFlag = 10;					
		}
		else if( c.getName() == cafeimgname[11]) {	
			cafeFlag = 11;					
		}	
		else if( c.getName() == cafeimgname[12]) {	
			cafeFlag = 12;					
		}
		else if( c.getName() == cafeimgname[13]) {	
			cafeFlag = 13;					
		}
		else if( c.getName() == cafeimgname[14]) {	
			cafeFlag = 14;					
		}
		else if( c.getName() == cafeimgname[15]) {	
			cafeFlag = 15;					
		}
		else if( c.getName() == cafeimgname[16]) {	
			cafeFlag = 16;					
		}
		else if( c.getName() == cafeimgname[17]) {	
			cafeFlag = 17;					
		}
		else if( c.getName() == cafeimgname[18]) {	
			cafeFlag = 18;					
		}
		else if( c.getName() == cafeimgname[19]) {	
			cafeFlag = 19;					
		}
		else if( c.getName() == cafeimgname[20]) {	
			cafeFlag = 20;					
		}
		else if( c.getName() == cafeimgname[21]) {	
			cafeFlag = 21;					
		}
		else if( c.getName() == cafeimgname[22]) {	
			cafeFlag = 22;					
		}
		else if( c.getName() == cafeimgname[23]) {	
			cafeFlag = 23;					
		}
		else if( c.getName() == cafeimgname[24]) {	
			cafeFlag = 24;					
		}
		else if( c.getName() == cafeimgname[25]) {	
			cafeFlag = 25;					
		}
		else if( c.getName() == cafeimgname[26]) {	
			cafeFlag = 26;					
		}
		else if( c.getName() == cafeimgname[27]) {	
			cafeFlag = 27;					
		}
		else if( c.getName() == cafeimgname[28]) {	
			cafeFlag = 28;					
		}
		else if( c.getName() == cafeimgname[29]) {	
			cafeFlag = 29;					
		}
		
		//if(c.getName() != ){
		//	JLabel noImageLabel = new JLabel("이미지 없음");
		//	imgpanel.add(noImageLabel);
		//}
		
		// if로 이미지 삽입
		if (cafeFlag >= 0 && cafeFlag < cafeImg.length) {
			ImageIcon cafeIcon = new ImageIcon(cafeUrlInstance.getCafeUrls()[cafeFlag]);
			//Image scaledcafeIcon = cafeIcon.getImage().getScaledInstance(120, 80, Image.SCALE_SMOOTH);
			//cafeImg[cafeFlag] = new ImageIcon(scaledcafeIcon);
			cafeImg[cafeFlag]=cd.imageScaleChange(cafeIcon,150,100);
			JLabel img = new JLabel(cafeImg[cafeFlag]);
			imgpanel.add(img);
			imgpanel.setAlignmentX(1.0f);
			imgpanel.setVisible(true);
		} 
		else {
			JLabel noImageLabel = new JLabel("이미지 없음");
			imgpanel.add(noImageLabel);
		}

		//카페 제목 주소 부분
		JTextPane inform = new JTextPane();
		if(inform.getName() != null) {
			inform.setText("");
		} else {
		String text = "\n카페 제목: " + c.getName() + "\n주        소 : " +  c.getAdress();
		//inform.setPreferredSize(new Dimension(400,90));//(200,280)
		inform.setPreferredSize(new Dimension(270, 90));
		inform.setEditable(false);		
		inform.setText(text);
		inform.setOpaque(false); //투명하게 하는 메서드		
		StyledDocument doc = inform.getStyledDocument();
		SimpleAttributeSet left = new SimpleAttributeSet();
		StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT);
		doc.setParagraphAttributes(0, doc.getLength(), left, false);
		}
		
		// 이미지 패널과 상호주소 패널을 합친 카페 정보 패널
		JPanel cafeInfoPanel = new JPanel();
		cafeInfoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
		
		cafeInfoPanel.add(imgpanel);
		cafeInfoPanel.add(inform);
		cafeInfoPanel.setVisible(true);
		Dimension dimInfo = new Dimension(400, 150);
		cafeInfoPanel.setPreferredSize(dimInfo);
		cafeInfoPanel.setOpaque(false);
		
		

		// CafeInfoPanel cafeInfoPanel = new CafeInfoPanel(c);
		// cafeInfoPanel.setVisible(true);
		backgroundLabel2.add(cafeInfoPanel, BorderLayout.NORTH);
		backgroundLabel2.add(InfoP(), BorderLayout.SOUTH);// 정보창 버튼 패널 추가
		
		
		//카페 메뉴
		JPanel menuPanel = new JPanel();
		menuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
		menuPanel.setOpaque(false);
		
		backgroundLabel2.add(menuPanel, BorderLayout.CENTER);
		
		ImagePanel menuOut = new ImagePanel("JAVAproject/src/soldesk_pro01_img/menubackground.jpg");
		menuOut.setOpaque(false);
		menuPanel.add(menuOut);
		
		
		JPanel menu = new JPanel();
		menu.setOpaque(false);
		menu.setLayout(new GridBagLayout());
		GridBagConstraints cs = new GridBagConstraints();
		cs.fill = GridBagConstraints.BOTH;
		
		Dimension dimMenu = new Dimension(400, 300);
		menu.setPreferredSize(dimMenu);
		menu.setVisible(true);
		
		menuOut.add(menu);
		
		
		
		JTextArea CoffeeMenu = new JTextArea(" 커피\n");
		CoffeeMenu.setSize(125,150);
		cs.gridx =0;
		cs.gridy =75;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(CoffeeMenu, cs);
		
		JTextArea CoffeePrice = new JTextArea(" \n");
		CoffeePrice.setSize(75,150);
		cs.gridx =125;
		cs.gridy =75;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(CoffeePrice, cs);
		
		JTextArea AdeMenu = new JTextArea(" 에이드\n");
		AdeMenu.setSize(125,150);
		cs.gridx =200;
		cs.gridy =75;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(AdeMenu, cs);
		
		JTextArea AdePrice = new JTextArea("\n");
		AdePrice.setSize(75,150);
		cs.gridx =325;
		cs.gridy =75;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(AdePrice, cs);
		
		JTextArea SmoothieMenu = new JTextArea(" 스무디\n");
		SmoothieMenu.setSize(125,150);
		cs.gridx =0;
		cs.gridy =-75;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(SmoothieMenu, cs);
		
		JTextArea SmoothiePrice = new JTextArea(" \n");
		SmoothiePrice.setSize(75,150);
		cs.gridx =125;
		cs.gridy =-75;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(SmoothiePrice, cs);
		
		JTextArea TeaMenu = new JTextArea(" 차\n");
		TeaMenu.setSize(125,150);
		cs.gridx =200;
		cs.gridy =-75;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(TeaMenu, cs);
		
		JTextArea TeaPrice = new JTextArea(" \n");
		TeaPrice.setSize(75,150);
		cs.gridx =325;
		cs.gridy =-75;
		cs.gridwidth =1;
		cs.gridheight =1;
		cs.weightx = 1.0;
		cs.weighty = 1.0;
		menu.add(TeaPrice, cs);
		
		for(int i =0; i< c.getCoffeeMenu().size(); i++) {
			String add = CoffeeMenu.getText();
			add += "\n "+c.getCoffeeMenu().get(i).getName();
			CoffeeMenu.setText(add);
		}
		for(int i =0; i< c.getCoffeeMenu().size(); i++) {
			String add = CoffeePrice.getText();
			add += "\n "+c.getCoffeeMenu().get(i).getPrice();
			CoffeePrice.setText(add);
		}
		for(int i =0; i< c.getAdeMenu().size(); i++) {
			String add = AdeMenu.getText();
			add += "\n "+c.getAdeMenu().get(i).getName();
			AdeMenu.setText(add);
		}
		for(int i =0; i< c.getAdeMenu().size(); i++) {
			String add = AdePrice.getText();
			add += "\n "+c.getAdeMenu().get(i).getPrice();
			AdePrice.setText(add);
		}
		for(int i =0; i< c.getSmoothieMenu().size(); i++) {
			String add = SmoothieMenu.getText();
			add += "\n "+c.getSmoothieMenu().get(i).getName();
			SmoothieMenu.setText(add);
		}
		for(int i =0; i< c.getSmoothieMenu().size(); i++) {
			String add = SmoothiePrice.getText();
			add += "\n "+c.getSmoothieMenu().get(i).getPrice();
			SmoothiePrice.setText(add);
		}
		for(int i =0; i< c.getTeaMenu().size(); i++) {
			String add = TeaMenu.getText();
			add += "\n "+c.getTeaMenu().get(i).getName();
			TeaMenu.setText(add);
		}
		for(int i =0; i< c.getTeaMenu().size(); i++) {
			String add = TeaPrice.getText();
			add += "\n "+c.getTeaMenu().get(i).getPrice();
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
        
		
     // 카페메뉴 끝
        infoFrame.setVisible(true); //프레임 on
        
	}    

	private static void TASettings(JTextArea textArea) { //textarea 전체에 디자인하는 메서드
		textArea.setEditable(false);
		textArea.setOpaque(false);
		Font font = new Font("카페24 슈퍼매직 OTF Regular", 15, 15); //폰트 적용 x
		textArea.setFont(font);
	}
	/*
	class CustomBorder extends MatteBorder {
		public CustomBorder(Color color, int thickness, boolean top, boolean left, boolean bottom, boolean right) {
        super(top ? thickness : 0, left ? thickness : 0, bottom ? thickness : 0, right ? thickness : 0, color);
			}
		}
	*/ 
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
		InfoPanel.setPreferredSize(new Dimension(484, 120));
		InfoPanel.setBackground(Color.green);
		InfoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 35, 0));
		InfoPanel.setOpaque(false);
		ArrayList<JButton> menuButtons = new ArrayList<JButton>();

		// 버튼 생성 및 이미지 아이콘 설정
		menuButtons.add(new JButton("검색"));
		menuButtons.add(new JButton("게임"));
		menuButtons.add(new JButton("홈"));

		for (JButton button : menuButtons) {
			InfoPanel.add(button);
			button.setPreferredSize(new Dimension(120, 80));
			button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	if (e.getActionCommand().equals("검색")) {
	        			SearchWindow sw = new SearchWindow();

	        		} else if (e.getActionCommand().equals("게임")) {
	        			
	        		}

	        		else if (e.getActionCommand().equals("홈")) {
	        			
	        			infoFrame.dispose();
	        		}
	            }
			});
			// button.setHorizontalAlignment(SwingConstants.CENTER);
			
		}
		return InfoPanel;
	}
	
}