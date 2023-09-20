package selectMenu;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

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
        setSize(500, 700);
        CafeDAO d1 = new CafeDAO();

        Choice choiceMenu = createChoiceMenu(category, d1);
        add(choiceMenu);
        Choice sortingPrice = createSortingChoice(category, d1);
        add(sortingPrice);

        createNavigationButtons();

        if (choiceMenu.getItemCount() > 0) {
            displayMenuItems(choiceMenu.getItem(0));
        }
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
        nextButton.setBounds(280, 600, 100, 30);
        nextButton.addActionListener(e -> goToNextPage());
        this.add(nextButton);

        prevButton = new JButton("이전");
        prevButton.setBounds(150, 600, 100, 30);
        prevButton.addActionListener(e -> goToPreviousPage());
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
        int yOffset = (displayedButtons.isEmpty()) ? 150
            : displayedButtons.get(displayedButtons.size() - 1).getY() + 110;
        button.setBounds(50, yOffset, 400, 100);
        this.add(button);
        displayedButtons.add(button);

        this.revalidate();
        this.repaint();
    }

    /**
     * 주어진 문자열에 대해 UI를 갖춘 버튼을 생성하고 반환.
     * @param choice 버튼에 표시될 문자열.
     * @return 생성된 JButton.
     */
    private JButton createButtonForChoice(String choice) {
        JButton button = new JButton(choice);
        button.setPreferredSize(new Dimension(400, 100));
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button.setBackground(new Color(220, 220, 220));
        button.setForeground(Color.BLACK);
        
     // ActionListener 추가
        button.addActionListener(e -> {
        	CafeDAO cd = new CafeDAO();
            FrameBase.getInstance2(new CafeInfo(cd.searchCafe(choice.split(" : ")[0])));
        });
        //choice.split(" : ")[0]
     // ':' 문자를 기준으로 분리하여 메뉴 이름만 출력
        
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(180, 180, 180));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(new Color(220, 220, 220));
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
            JButton button = createButtonForChoice(entry.getKey() + " : " + entry.getValue());
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
