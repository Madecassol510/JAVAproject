package selectMenu;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import cafeInfo.CafeInfo;
import cafeVO.CafeDAO;
import mainMenu.FrameBase;
import selectMenu.topmenuhandler.ChoiceMenuHandler;
import selectMenu.topmenuhandler.SortingHandler;

public class SelectMenu extends JPanel {
    private int currentPage = 0;
    private final int ITEMS_PER_PAGE = 4;
    private List<Map.Entry<String, Integer>> currentMenuList = new ArrayList<>();
    private List<JButton> displayedButtons = new ArrayList<>();
    private JButton nextButton;
    private JButton prevButton;
    private String currentMenuName;


    public SelectMenu(String category) {
        setBackground(new Color(255, 255, 255));
        setLayout(null);
        setSize(484,662);
        CafeDAO d1 = new CafeDAO();

        // Choice 메뉴들을 한 줄에 나란히 배치
        int choiceWidth = 150;  // 가정: choiceMenu와 sortingPrice의 너비는 각각 150
        int choiceHeight = 30;  // 가정: choiceMenu와 sortingPrice의 높이는 30
        int choiceSpacing = 20;  // 두 Choice 사이의 간격
        int totalChoiceWidth = (2 * choiceWidth) + choiceSpacing;  // 두 Choice의 총 너비
        
        int choiceY = 30;  // y 좌표 값을 조절하여 choiceMenu와 sortingPrice 위치를 위로 옮김

        Choice choiceMenu = createChoiceMenu(category, d1);
        choiceMenu.setBounds((484 - totalChoiceWidth) / 2, choiceY, choiceWidth, choiceHeight);
        add(choiceMenu);

        Choice sortingPrice = createSortingChoice(category, d1);
        sortingPrice.setBounds(choiceMenu.getX() + choiceWidth + choiceSpacing, choiceY, choiceWidth, choiceHeight);
        add(sortingPrice);
        
        // MenuPanel 객체 생성 및 설정
        SelectMenuPanel sp= new SelectMenuPanel();
        sp.setBounds(0, 542, 484, 120);
        add(sp);
        
        createNavigationButtons();

        // '이전' 및 '다음' 버튼을 중앙에 배치
        int menuButtonWidth = 400; // 'createButtonForChoice'에서 생성된 버튼의 너비
        int buttonWidth = 150;    // '이전' 및 '다음' 버튼의 너비
        int buttonHeight = 30;    // '이전' 및 '다음' 버튼의 높이
        int buttonSpacing = (menuButtonWidth - 2 * buttonWidth) / 2; // '이전'과 '다음' 버튼 사이의 간격

        // '이전' 버튼을 메뉴 버튼의 왼쪽 끝에 배치
        prevButton.setBounds(50, 510, buttonWidth, buttonHeight);

        // '다음' 버튼을 메뉴 버튼의 오른쪽 끝에 배치
        nextButton.setBounds(284, 510, buttonWidth, buttonHeight);
        
        add(prevButton);
        add(nextButton);

        if (choiceMenu.getItemCount() > 0) {
            displayMenuItems(choiceMenu.getItem(0));
        }
    }
    
    public SelectMenu(String category, String menuName) {
    	setBackground(new Color(255, 255, 255));
        setLayout(null);
        setSize(484,662);
        CafeDAO d1 = new CafeDAO();

        // Choice 메뉴들을 한 줄에 나란히 배치
        int choiceWidth = 150;  // 가정: choiceMenu와 sortingPrice의 너비는 각각 150
        int choiceHeight = 30;  // 가정: choiceMenu와 sortingPrice의 높이는 30
        int choiceSpacing = 20;  // 두 Choice 사이의 간격
        int totalChoiceWidth = (2 * choiceWidth) + choiceSpacing;  // 두 Choice의 총 너비
        
        int choiceY = 30;  // y 좌표 값을 조절하여 choiceMenu와 sortingPrice 위치를 위로 옮김

        Choice choiceMenu = createChoiceMenu(category, d1);
        choiceMenu.add("메뉴를 선택해주세요");	
        choiceMenu.select(menuName);
        choiceMenu.setBounds((484 - totalChoiceWidth) / 2, choiceY, choiceWidth, choiceHeight);
        add(choiceMenu);
        

        Choice sortingPrice = createSortingChoice(category, d1);
        sortingPrice.setBounds(choiceMenu.getX() + choiceWidth + choiceSpacing, choiceY, choiceWidth, choiceHeight);
        add(sortingPrice);
        
        // MenuPanel 객체 생성 및 설정
        SelectMenuPanel sp= new SelectMenuPanel();
        sp.setBounds(0, 542, 484, 120);
        add(sp);
        
        createNavigationButtons();

        // '이전' 및 '다음' 버튼을 중앙에 배치
        int menuButtonWidth = 400; // 'createButtonForChoice'에서 생성된 버튼의 너비
        int buttonWidth = 150;    // '이전' 및 '다음' 버튼의 너비
        int buttonHeight = 30;    // '이전' 및 '다음' 버튼의 높이
        int buttonSpacing = (menuButtonWidth - 2 * buttonWidth) / 2; // '이전'과 '다음' 버튼 사이의 간격

        // '이전' 버튼을 메뉴 버튼의 왼쪽 끝에 배치
        prevButton.setBounds(50, 510, buttonWidth, buttonHeight);

        // '다음' 버튼을 메뉴 버튼의 오른쪽 끝에 배치
        nextButton.setBounds(284, 510, buttonWidth, buttonHeight);
        
        add(prevButton);
        add(nextButton);

        displayMenuItems(menuName);
    }
    
    private Choice findChoiceMenu() {
        for (Component component : getComponents()) {
            if (component instanceof Choice) {
                return (Choice) component;
            }
        }
        return null;
    }
    
    // 백그라운드 이미지
    public void paintComponent(Graphics g) {
		Dimension d = getSize();
		ImageIcon image = CafeDAO.imageScaleChange(
				new ImageIcon("src/panelDesign/FrameBackground.jpg"), d.width, d.height);
		g.drawImage(image.getImage(),0,0,d.width,d.height,null);
	}
    
    /**
     * 아이템 카테고리를 선택하기 위한 드롭다운 메뉴 생성.
     * @param category 현재 카테고리명.
     * @param d1 데이터를 가져오기 위한 CafeDAO 인스턴스.
     * @return 아이템 카테고리로 채워진 Choice 컴포넌트.
     */
    private Choice createChoiceMenu(String category, CafeDAO d1) {
        Choice choiceMenu = new Choice();
        choiceMenu.addItemListener(new ChoiceMenuHandler(category, this));
        choiceMenu.setSize(200, 0);
        choiceMenu.setLocation(30, 50);

        List<String> items = new ArrayList<>();
        switch (category) {
            case "Coffee":
                items = d1.getCoffeeCategory();
                break;
            case "Ade":
                items = d1.getAdeCategory();
                break;
            case "Smoothie":
                items = d1.getSmoothieCategory();
                break;
            case "Tea":
                items = d1.getTeaCategory();
                break;
        }
        choiceMenu.add("메뉴를 선택해주세요");	
        for (String item : items) {
            choiceMenu.add(item);
        }

        return choiceMenu;
    }

    /**
     * 아이템을 정렬하기 위한 드롭다운 메뉴 생성.
     * @param currentCategory 현재 카테고리명.
     * @param d1 데이터를 가져오기 위한 CafeDAO 인스턴스.
     * @return 정렬 옵션으로 채워진 Choice 컴포넌트.
     */
    private Choice createSortingChoice(String currentCategory, CafeDAO d1) {
        Choice sortingChoice = new Choice();
        sortingChoice.addItemListener(new SortingHandler(this, d1, currentCategory));
        sortingChoice.setSize(200, 0);
        sortingChoice.setLocation(280, 50);
        sortingChoice.add("낮은가격순 정렬");
        sortingChoice.add("높은가격순 정렬");
        return sortingChoice;
    }

    /**
     * '다음' 및 '이전' 버튼 생성 및 패널에 추가.
     */
    private void createNavigationButtons() {
        nextButton = new JButton("다음");
        nextButton.setFont(new Font("코트라 희망체", Font.PLAIN, 18));
        nextButton.setBounds(280, 600, 100, 30);
        nextButton.setBackground(new Color(0xF2E9E4));
        nextButton.addActionListener(e -> goToNextPage());
        this.add(nextButton);

        prevButton = new JButton("이전");
        prevButton .setFont(new Font("코트라 희망체", Font.PLAIN, 18));
        prevButton.setBounds(150, 600, 100, 30);
        prevButton.addActionListener(e -> goToPreviousPage());
        prevButton.setBackground(new Color(0xF2E9E4));
        this.add(prevButton);
    }

    /**
     * 더 보여줄 항목이 있으면 다음 페이지로 이동.
     */
    private void goToNextPage() {
        if ((currentPage + 1) * ITEMS_PER_PAGE < currentMenuList.size()) {
            currentPage++;
            displayPage(currentPage);
        }
    }

    /**
     * 현재 페이지가 첫 페이지가 아니면 이전 페이지로 이동.
     */
    private void goToPreviousPage() {
        if (currentPage > 0) {
            currentPage--;
            displayPage(currentPage);
        }
    }

    /**
     * 현재 페이지와 전체 항목을 기반으로 '다음' 및 '이전' 버튼의 활성 상태를 업데이트.
     */
    public void updateNavigationButtons() {
        nextButton.setEnabled((currentPage + 1) * ITEMS_PER_PAGE < currentMenuList.size());
        prevButton.setEnabled(currentPage > 0);
    }

    /**
     * 버튼을 패널에 추가. 만약 버튼이 없다면 시작 위치에 추가하고, 있다면 마지막 버튼 다음에 추가.
     * @param button 추가할 JButton.
     */
    public void addButtonToPanel(JButton button) {
         int yOffset = (displayedButtons.isEmpty()) ? 70 : displayedButtons.get(displayedButtons.size() - 1).getY() + 110;
        button.setBounds(50, yOffset, 384, 100);
        this.add(button);
        displayedButtons.add(button);

        this.revalidate();
        this.repaint();
    }

    // 키값(가게명)으로 해당 int value(가게가격) 반환 메서드
    private int getMenuPrice(String choice) {
    	for(int i=0; i<currentMenuList.size(); i++) {
    		if(currentMenuList.get(i).getKey().equals(choice)) {
    			return currentMenuList.get(i).getValue();
    		} 
    	} return 0;
    }
    // 키값(가게명)으로 해당 이미지 반환 메서드
    private ImageIcon getCafeIcon(String choice) {
    	CafeDAO d1 = new CafeDAO();
    	for(int i=0; i<d1.getList().size(); i++) {
    		if(d1.getList().get(i).getName().equals(choice)) {
    			return d1.getList().get(i).getImage();
    		}
    	} return null;
    }

    /**
     * 주어진 문자열에 대해 UI를 갖춘 버튼을 생성하고 반환.
     * @param choice 버튼에 표시될 문자열.
     * @return 생성된 JButton.
     */
    private JButton createButtonForChoice(String choice) {
        JButton button = new JButton(choice);
        
     // 이미지 로드 및 크기 조절
        ImageIcon originalIcon = getCafeIcon(choice);
        Image scaledImage = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        
        // 버튼에 이미지 및 텍스트 설정
        button.setIcon(scaledIcon);
        button.setFont(new Font("코트라 희망체", Font.PLAIN, 18));
        button.setText("<html>가게명 : " + choice + "<br>가&nbsp&nbsp&nbsp 격 : " +  getMenuPrice(choice)+ "</html>");
        button.setFocusPainted(false);
        
        button.setHorizontalTextPosition(SwingConstants.RIGHT);
        button.setHorizontalAlignment(SwingConstants.LEFT);

        // 나머지 UI 설정들
        button.setPreferredSize(new Dimension(384, 100));
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button.setBackground(new Color(0xF2E9E4));
        button.setForeground(Color.BLACK);
        
        // ActionListener 추가
        button.addActionListener(e -> {
            CafeDAO cd = new CafeDAO();
            FrameBase.getInstance2(new CafeInfo(cd.searchCafe(choice.split(" : ")[0])));
        	System.out.println(choice.split(" : ")[0]);
        });

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(180, 180, 180));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(0xF2E9E4));
            }
        });
        return button;
    }

    /**
     * 지정된 메뉴명의 메뉴 항목을 가져와서 첫 페이지부터 화면에 표시.
     * @param menuName 화면에 표시할 메뉴의 이름.
     */
    public void displayMenuItems(String menuName) {
        currentMenuName = menuName;
        currentMenuList = CafeDAO.sortMenu(menuName);
        currentPage = 0;
        displayPage(0);
    }

    /**
     * 메뉴 항목의 특정 페이지를 화면에 표시.
     * @param pageIndex 화면에 표시할 페이지 번호.
     */
    public void displayPage(int pageIndex) {
        clearButtons();

        int start = pageIndex * ITEMS_PER_PAGE;
        for (int i = start; i < start + ITEMS_PER_PAGE && i < currentMenuList.size(); i++) {
            Map.Entry<String, Integer> entry = currentMenuList.get(i);
            JButton button = createButtonForChoice(entry.getKey());
            addButtonToPanel(button);
        }
        updateNavigationButtons();  // 버튼 상태 갱신
    }

    /**
     * 화면에 표시된 모든 버튼을 패널에서 제거.
     */
    private void clearButtons() {
        for (JButton btn : displayedButtons) {
            this.remove(btn);
        }
        displayedButtons.clear();
        this.revalidate();
        this.repaint();
    }

    /**
     * 화면에 표시된 모든 버튼을 패널에서 제거 (clearButtons와 동일한 기능).
     */
    public void removeDisplayedButtons() {
        clearButtons();
    }

    public String getCurrentMenuName() {
        return currentMenuName;
    }

    public void setCurrentMenuList(List<Map.Entry<String, Integer>> updatedList) {
        this.currentMenuList = updatedList;
    }

    /**
     * 현재 페이지 번호를 첫 페이지로 재설정.
     */
    public void resetCurrentPage() {
        this.currentPage = 0;
    }
}
