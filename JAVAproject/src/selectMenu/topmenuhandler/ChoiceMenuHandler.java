package selectMenu.topmenuhandler;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import selectMenu.SelectMenu;

public class ChoiceMenuHandler implements ItemListener {
    private String category;
    private SelectMenu parentPanel;  // 참조 유지

    public ChoiceMenuHandler(String category, SelectMenu parentPanel) {
        this.category = category;
        this.parentPanel = parentPanel;  // 부모 패널을 참조
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println((String)e.getItem());  // 로그 출력
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selectedItem = e.getItem().toString();
            parentPanel.resetCurrentPage();  // 페이지 초기화
            parentPanel.displayMenuItems(selectedItem);  // 해당 메뉴 아이템들을 화면에 표시
        }
    }
}
