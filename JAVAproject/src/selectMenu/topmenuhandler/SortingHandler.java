package selectMenu.topmenuhandler;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.util.Map;

import cafeVO.CafeDAO;
import selectMenu.SelectMenu;

public class SortingHandler implements ItemListener {
    private SelectMenu parentPanel;
    private CafeDAO dao;
    private String currentCategory;

    public SortingHandler(SelectMenu parentPanel, CafeDAO d1, String currentCategory) {
        this.parentPanel = parentPanel;
        this.dao = d1;
        this.currentCategory = currentCategory;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
        	parentPanel.removeDisplayedButtons();
            String selectedItem = e.getItem().toString();
            List<Map.Entry<String, Integer>> sortedMenuList;
            
            // SelectMenu에서 선택된 메뉴 이름을 가져옴
            String currentMenuName = parentPanel.getCurrentMenuName();

            if("낮은가격순 정렬".equals(selectedItem)) {
                sortedMenuList = dao.sortMenu(currentMenuName);
            } else {
                sortedMenuList = dao.sortMenuDesc(currentMenuName);
            }

            parentPanel.setCurrentMenuList(sortedMenuList);
            
            // 페이지 인덱스 초기화
            parentPanel.resetCurrentPage();
            
            // 정렬된 메뉴 리스트의 첫 페이지를 표시
            parentPanel.displayPage(0);  

            // 이전/다음 버튼의 상태 갱신
            parentPanel.updateNavigationButtons();
        }
    }
}