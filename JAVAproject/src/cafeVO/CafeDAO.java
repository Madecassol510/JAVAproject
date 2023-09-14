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
		
		// #4-1 메가MGC커피 종각역점 (4-2도 상호명 주소 제외 동일)
		list.add(new Cafe("메가MGC커피 종각역점", "서울 종로구 종로 80-2 1층",
						
				// 커피
				new Coffee[]{new Coffee("아메리카노", 1500), new Coffee("카페라떼", 2900)	, 													// 커피
						new Coffee("카라멜마끼아또", 3700), new Coffee("카페모카", 3900), new Coffee("바닐라라떼", 3400)},
						
				// 에이드
				new Ade[] {new Ade("보성 녹차레몬콤부에이드",3900), 																					// 에이드
						new Ade("고흥 유자 하이볼에이드",3800), new Ade("체리콕",3300), new Ade("레몬에이드",3500), new Ade("블루레몬에이드",3500), 
						new Ade("자몽에이드",3500), new Ade("청포도에이드",3500), new Ade("메가에이드",3900), new Ade("유니콘매직에이드(핑크)",3800), 
						new Ade("유니콘매직에이드(블루)",3800),new Ade("라임모히또",3800)}, 
						
				// 스무디
				new Smoothie[] {new Smoothie("고흥 유자망고 스무디",3900), new Smoothie("나주 플럼코트 스무디",3900), new Smoothie("코코넛커피 스무디",4800), // 스무디
						new Smoothie("플레인요거트스무디",3900), new Smoothie("망고요거트스무디",3900), new Smoothie("딸기요거트스무디",3900)},
						
				// 차
				new Tea[] {new Tea("청송 애플 선셋 티플레저",3900), new Tea("복숭아아이스티",3000), new Tea("사과유자차",3500), new Tea("허니자몽블랙티",3700)
						 ,new Tea("자몽차",3300), new Tea("유자차",3300), new Tea("레몬차",3300), new Tea("녹차",2500), new Tea("캐모마일",2500)
						,new Tea("페퍼민트",2500), new Tea("얼그레이",2500)})		// 차
				);	
	}
}
