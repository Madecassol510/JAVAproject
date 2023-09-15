package search;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cafeVO.CafeDAO;

public class ResultCheck {
	
	static int pageNum; 
	static int lastNum;
	static int totalNum;
	
	static ArrayList<String> resultList;
	
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
			
			if(resultList.size()/4>=1) { //3
				pageNum = (resultList.size()/4)+1;
			}
			else
				pageNum = resultList.size()/4;
			
			//lastNum = resultList.size() % 4; // 2		
			totalNum = resultList.size();   // 10
			
			
			
			ResultWindow[] rw = new ResultWindow[]{};
			
			for(int i=0; i<pageNum; i++) {
				int nowPage = i+1;
				//rw[i] = new ResultWindow(nowPage);	
			}
			rw[0].setVisible(true);
		}
	
	}
}
