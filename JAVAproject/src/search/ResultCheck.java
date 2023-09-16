package search;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cafeVO.CafeDAO;


public class ResultCheck {
	
	static ArrayList<String> resultList; // 결과 리스트
	
	static int pageCount;  // 페이지 수
	static int resultCount; // 결과 값 개수
	static int nowIndex; // 현재 위치
	
	static ResultWindow[] resultPage; // 페이지들 
	
	
	public ResultCheck(String category, String text, JFrame searchWindow) {
		// 검색값 검색
		
		CafeDAO DB = new CafeDAO();
		resultList = new ArrayList<>();
		
		
		if(category.equals("커피")) {
			for(String str : DB.getCoffeeCategory()) {	
				if(str.replaceAll(" ", "").contains(text.replaceAll(" ", ""))){
					resultList.add(str);
				}				
			}
		}
		else if(category.equals("에이드")) {
			for(String str : DB.getAdeCategory()) {	
				if(str.replaceAll(" ", "").contains(text.replaceAll(" ", ""))){
					resultList.add(str);
				}				
			}
		}
		else if(category.equals("스무디")) {
			for(String str : DB.getSmoothieCategory()) {	
				if(str.replaceAll(" ", "").contains(text.replaceAll(" ", ""))){
					resultList.add(str);
				}				
			}
		}
		else if(category.equals("차")) {
			for(String str : DB.getTeaCategory()) {	
				if(str.replaceAll(" ", "").contains(text.replaceAll(" ", ""))){
					resultList.add(str);
				}				
			}
		}
	
		for(String str : resultList) {
			System.out.println(str);
		}
		
		if(resultList.isEmpty()) {
			JOptionPane.showMessageDialog(null, "해당하는 검색결과가 없습니다");
		}
		else {	
			searchWindow.setVisible(false);
			
			// 검색 개수와 현재 위치 초기화
			resultCount = resultList.size();
			nowIndex = 0;
			
			// 페이지 수 설정
			if(resultList.size()%4>=1) {
				pageCount = (resultList.size()/4)+1;
			}
			else
				pageCount = resultList.size()/4;
			
			
			// 페이지 수만큼 frame(해당 페이지의 페이지) 생성
			resultPage = new ResultWindow[pageCount];   
				
			for(int i=0; i<pageCount; i++) {
				resultPage[i] = new ResultWindow(i);
			}
					
			resultPage[1].setVisible(true);
		}
	
	}
}
