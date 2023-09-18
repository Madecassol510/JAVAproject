package cafeInfo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

import cafeVO.Cafe;
import cafeVO.CafeDAO;

import cafeVO.Menu;
import mainMenu.MenuPanel;



//카페를 클릭했을 때 보여지는 상세정보 페이지
public class CafeInfo extends JPanel {
	
	static JFrame infoFrame = new JFrame("상세 정보");
	
	public CafeInfo(Cafe c) { //Cafe형 객체
		CafeDAO cd = new CafeDAO(); //cafe db 객체 선언
	
		Toolkit tk = Toolkit.getDefaultToolkit();
		infoFrame.setBounds((int)tk.getScreenSize().getWidth()/2 -250,
				(int)tk.getScreenSize().getHeight()/2-300, 500,700);
		Dimension dim = new Dimension(500, 700);
		infoFrame.setSize(dim);
		infoFrame.setLayout(new BorderLayout());

		// JPanel

		// 이미지 부분
		JPanel imgpanel = new JPanel();
		final int cafeNum = 1;
		int cafeFlag = -1;

		
		CafeUrl cafeUrlInstance = new CafeUrl();

		//String[] Cafeurl = { "soldesk_pro01_img/투썸_종각역1.jpg","말할수없는비밀2.jpg", "인사이드아웃2.png", "겨울왕국2.png", "당신거기있어줄래요2.png", "스파이더맨2.png",
			//	"어벤져스2.png", "부산행2.png" };

		ImageIcon[] cafeImg = new ImageIcon[cafeUrlInstance.getCafeUrls().length];
		String[] cafeimgname = new String[cafeUrlInstance.getCafeUrls().length];
		
		//cafe 이름에 맞는 이미지를 할당하기 위한 배열에 이름 할당 for문
		for(int i=0; i<cafeUrlInstance.getCafeUrls().length; i++)
		{
		cafeimgname[i]= cd.getList().get(i).getName();
		}
		
		//cafe 객체의 이름에 맞는 배열의 요소 찾기 if문
	
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
		else {
			JLabel noImageLabel = new JLabel("이미지 없음");
			imgpanel.add(noImageLabel);
		}
		
		// if로 이미지 삽입
		if (cafeFlag >= 0 && cafeFlag < cafeImg.length) {
			ImageIcon cafeIcon = new ImageIcon(cafeUrlInstance.getCafeUrls()[cafeFlag]);
			//Image scaledcafeIcon = cafeIcon.getImage().getScaledInstance(120, 80, Image.SCALE_SMOOTH);
			//cafeImg[cafeFlag] = new ImageIcon(scaledcafeIcon);
			cafeImg[cafeFlag]=cd.imageScaleChange(cafeIcon,120,80);
			JLabel img = new JLabel(cafeImg[cafeFlag]);
			imgpanel.add(img);
		} 
		else {
			JLabel noImageLabel = new JLabel("이미지 없음");
			imgpanel.add(noImageLabel);
		}
	
		

		// 카페 관련 상호&주소 패널
		JPanel cafeNameAdPanel = new JPanel();
		cafeNameAdPanel.setLayout(new BoxLayout(cafeNameAdPanel, BoxLayout.Y_AXIS));

		// 상호명 패널
		JPanel namepanel = new JPanel();
		JLabel namelabel = new JLabel("상호명: " + c.getName() + "\n");
		namepanel.add(namelabel);

		namepanel.setAlignmentX(1.0f);
		namepanel.setVisible(true);

		// 주소 패널
		JPanel adresspanel = new JPanel();
		adresspanel.add(new JLabel("주	 소: " + c.getAdress()));
		adresspanel.setVisible(true);

		// 상호 주소 패널을 정보 패널에 추가
		cafeNameAdPanel.add(namepanel);
		cafeNameAdPanel.add(adresspanel);
		cafeNameAdPanel.setVisible(true);

		// 이미지 패널과 상호주소 패널을 합친 카페 정보 패널
		JPanel cafeInfoPanel = new JPanel();
		cafeInfoPanel.setLayout(new FlowLayout());
		cafeInfoPanel.add(imgpanel);
		cafeInfoPanel.add(cafeNameAdPanel);
		cafeInfoPanel.setVisible(true);

		// CafeInfoPanel cafeInfoPanel = new CafeInfoPanel(c);
		// cafeInfoPanel.setVisible(true);
		infoFrame.add(cafeInfoPanel, BorderLayout.NORTH);

		infoFrame.add(new InfoPanel(), BorderLayout.SOUTH);// 정보창 버튼 패널 추가
		infoFrame.setVisible(true);
		
		//카페 메뉴
		JPanel menuOut = new JPanel();
		infoFrame.add(menuOut, BorderLayout.CENTER);
	
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout(2,4));
		menu.setBackground(Color.green);
		Dimension dimMenu = new Dimension(400, 400);
		menu.setPreferredSize(dimMenu);
		menu.setVisible(true);
		menu.setFont(new Font(Font.DIALOG, Font.PLAIN, 20));
		
		menuOut.add(menu);
		c.CafeMenu();
		
		
		JTextArea CoffeeMenu = new JTextArea(" 커피");
		JTextArea AdeMenu = new JTextArea(" 에이드");
		JTextArea SmoothieMenu = new JTextArea(" 스무디");
		JTextArea TeaMenu = new JTextArea(" 차");
		JTextArea CoffeePrice = new JTextArea(" 가격");
		JTextArea AdePrice = new JTextArea(" 가격");
		JTextArea SmoothiePrice = new JTextArea(" 가격");
		JTextArea TeaPrice = new JTextArea(" 가격");
		
		
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
		
		Border customBorder = new CustomBorder(Color.BLACK, 1, false, false, false, true);
		CoffeePrice.setBorder(customBorder);
		SmoothiePrice.setBorder(customBorder);
		
		
		TASettings(CoffeeMenu);
		TASettings(CoffeePrice);
		TASettings(AdeMenu);
		TASettings(AdePrice);
		TASettings(SmoothieMenu);
		TASettings(SmoothiePrice);
		TASettings(TeaMenu);
		TASettings(TeaPrice);
        
        menu.add(CoffeeMenu);
        menu.add(CoffeePrice);
        menu.add(AdeMenu);
        menu.add(AdePrice);
        menu.add(SmoothieMenu);
        menu.add(SmoothiePrice);
        menu.add(TeaMenu);
        menu.add(TeaPrice);
	}    // 카페메뉴 끝
	
		
	
		

	private static void TASettings(JTextArea textArea) { //textarea 전체에 디자인하는 메서드
		textArea.setEditable(false);
		
	}
	class CustomBorder extends MatteBorder {
		public CustomBorder(Color color, int thickness, boolean top, boolean left, boolean bottom, boolean right) {
        super(top ? thickness : 0, left ? thickness : 0, bottom ? thickness : 0, right ? thickness : 0, color);
			}
		}
}