package cafeVO;

import java.util.ArrayList;

public class CafeDAO {
	private static ArrayList<Cafe> list;
	
	public CafeDAO() {
		if (list == null) 
			init();
	}
		
	private void init() {
		list = new ArrayList<Cafe>();
		
		// #1 스타벅스종로관수점
		list.add(new Cafe("스타벅스종로관수점", "서울특별시 종로구 삼일대로20길 13",
				
				// 커피
				new Coffee[]{new Coffee("아메리카노", 1500), new Coffee("카페라떼", 2000)	, 													// 커피
						new Coffee("카라멜마끼아또", 2000), new Coffee("카페모카", 2000), new Coffee("바닐라라떼", 2000)},
				
				// 에이드
				new Ade[] {new Ade("유자패션피지오",5900), 																					// 에이드
						new Ade("쿨라임피지오",5900), new Ade("피치딸기피지오",5700)},
				
				// 스무디
				new Smoothie[] {new Smoothie("망고바나나스무디",6300), new Smoothie("피치요거트블렌디드",6100), new Smoothie("망고패션티블렌디드",5400), // 스무디
						new Smoothie("딸기요거트스무디",6300), new Smoothie("자몽허니스무디",6300)},
				
				// 차
				new Tea[] {new Tea("제주유기녹차",5300), new Tea("얼그레이티",4500), new Tea("캐모마일티",4500), new Tea("히비스커스티",4500)})		// 차
				);	
	}
}
