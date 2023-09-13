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
		// #4-2 메가MGC커피 종로점 
		list.add(new Cafe("메가MGC커피 종로점", "서울 종로구 종로 122 1층",
				
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
		
		//#5-1 빽다방 종로관철점 완
		list.add(new Cafe("빽다방 종로관철점", "서울 종로구 종로10길 21",
				
				// 커피
				new Coffee[]{new Coffee("아메리카노", 1800), new Coffee("카페라떼", 3500)	, 													// 커피
						new Coffee("카라멜마끼아또", 4000), new Coffee("카페모카", 4000), new Coffee("바닐라라떼", 4200)},
						
				// 에이드
				new Ade[] {new Ade("레몬에이드",4500), 																					// 에이드
						new Ade("디아블로 에너지 드링크",4300), new Ade("복숭아에이드",4500), new Ade("깔라만시에이드",4300), 
						new Ade("자몽에이드",4500), new Ade("청포도에이드",4500)}, 
						
				// 스무디
				new Smoothie[] {new Smoothie("딸기빽스치노",4300), new Smoothie("초코빽스치노",4300), new Smoothie("민트초코빽스치노",4300), // 스무디
						new Smoothie("녹차빽스치노",4500), new Smoothie("초코바나나빽스치노",4300), new Smoothie("원조빽스치노",3800)},
						
				// 차
				new Tea[] {new Tea("콤부차 패션후르츠",3500), new Tea("달콤아이스티",3000), new Tea("깔라만시티",3500), new Tea("레몬티",4000)
						 ,new Tea("자몽티",4000), new Tea("유자티",4000), new Tea("피치우롱스위티",3500), new Tea("레몬얼그레이티",4000), new Tea("황금캐모마일티",3000)
						,new Tea("오렌지자몽블랙티",4000), new Tea("페퍼민트티",3000)})		// 차
				);
		
		//#5-2 빽다방 을지로입구역점 (주소 상호명 제외 동일)
		list.add(new Cafe("빽다방 을지로입구역점", "서울 중구 남대문로9길 10 1층",
				
				// 커피
				new Coffee[]{new Coffee("아메리카노", 1800), new Coffee("카페라떼", 3500)	, 													// 커피
						new Coffee("카라멜마끼아또", 4000), new Coffee("카페모카", 4000), new Coffee("바닐라라떼", 4200)},
						
				// 에이드
				new Ade[] {new Ade("레몬에이드",4500), 																					// 에이드
						new Ade("디아블로 에너지 드링크",4300), new Ade("복숭아에이드",4500), new Ade("깔라만시에이드",4300), 
						new Ade("자몽에이드",4500), new Ade("청포도에이드",4500)}, 
						
				// 스무디
				new Smoothie[] {new Smoothie("딸기빽스치노",4300), new Smoothie("초코빽스치노",4300), new Smoothie("민트초코빽스치노",4300), // 스무디
						new Smoothie("녹차빽스치노",4500), new Smoothie("초코바나나빽스치노",4300), new Smoothie("원조빽스치노",3800)},
						
				// 차
				new Tea[] {new Tea("콤부차 패션후르츠",3500), new Tea("달콤아이스티",3000), new Tea("깔라만시티",3500), new Tea("레몬티",4000)
						 ,new Tea("자몽티",4000), new Tea("유자티",4000), new Tea("피치우롱스위티",3500), new Tea("레몬얼그레이티",4000), new Tea("황금캐모마일티",3000)
						,new Tea("오렌지자몽블랙티",4000), new Tea("페퍼민트티",3000)})		// 차
				);
		
		//6. 달콤커피 종로종각점
		list.add(new Cafe("달콤커피 종로종각점", "서울 종로구 종로12길 16 1, 2, 3층",
				
				// 커피
				new Coffee[]{new Coffee("아메리카노", 4100), new Coffee("카페라떼", 4800)	, 													// 커피
						new Coffee("카라멜마끼아또", 5100), new Coffee("카페모카", 5100), new Coffee("바닐라라떼", 5100)},
						
				// 에이드
				new Ade[] {new Ade("깔라만시에이드",4800), 																				// 에이드
					 		new Ade("레몬에이드",4800)}, 
						
				// 스무디
				new Smoothie[] {new Smoothie("바닐라스무디",5500), new Smoothie("초콜릿스무디",5500), new Smoothie("그린티스무디",5500), // 스무디
						new Smoothie("망고스무디",6000), new Smoothie("딸기스무디",6000), new Smoothie("플레인요거트스무디",5800)},
						
				// 차
				new Tea[] {new Tea("얼그레이티",4100), new Tea("캐모마일티",4100), new Tea("유자티",4500), new Tea("하동녹차",4100)
						 , new Tea("페퍼민트티",4100)})		// 차
				);

		//7. 커피스미스 종로점 가격표 최신화 요망
		list.add(new Cafe("커피스미스 종로점", "서울 종로구 종로 85 (종로2가)",
		
		// 커피
		new Coffee[]{new Coffee("아메리카노", 4500), new Coffee("카페라떼", 5000)	, 													// 커피
				new Coffee("카라멜마끼아또", 5400), new Coffee("카페모카", 5600), new Coffee("바닐라라떼", 5400)},
				
		// 에이드
		new Ade[] {new Ade("레몬에이드",4800), 																					// 에이드
				new Ade("레드에이드",4800), new Ade("블루에이드",4800)}, 
				
		// 스무디
		new Smoothie[] {new Smoothie("요거트유자스무디",6200),  // 스무디
				new Smoothie("요거트블루베리스무디",6200), new Smoothie("요거트라즈베리스무디",6200)},
				
		// 차
		new Tea[] {new Tea("얼그레이티",5400), new Tea("스미스블랜드티",5200), new Tea("카모마일티",5400), new Tea("유자티",5600)
				 , new Tea("페퍼민트티",5400)})		// 차
		);

		//8. 커스텀커피 을지로점
		list.add(new Cafe("커스텀커피 을지로점", "서울 종로구 삼일대로17길 51 1층",
		
		// 커피
		new Coffee[]{new Coffee("아메리카노", 3800), new Coffee("카페라떼", 4800)	, 													// 커피
				new Coffee("카라멜마끼아또", 5300), new Coffee("카페모카", 5300), new Coffee("바닐라라떼", 5300)},
				
		// 에이드
		new Ade[] {new Ade("블루레몬에이드",5000), 										// 에이드
				new Ade("청포도에이드",5000), new Ade("자몽에이드",5000)}, 
				
		// 스무디
		new Smoothie[] {new Smoothie("딸기스무디",5500), new Smoothie("블루베리스무디",5500), new Smoothie("메론스무디",5500), // 스무디
				new Smoothie("망고스무디",5500)},
				
		// 차
		new Tea[] {new Tea("얼그레이티",5500), new Tea("캐모마일티",5500), new Tea("유자티",5500), new Tea("복숭아아이스티",3500)
				 , new Tea("페퍼민트티",5500)})		// 차
		);

		//9. 커피앳웍스 센터원점 
		list.add(new Cafe("커피앳웍스 센터원점 ", "서울 중구 을지로5길 26 1층 104호 (미래에셋 센터원빌딩)",
		
		// 커피
		new Coffee[]{new Coffee("아메리카노", 4800), new Coffee("카페라떼", 5800)	, 													// 커피
				new Coffee("카라멜마끼아또", 4800), new Coffee("카페모카", 5300), new Coffee("바닐라라떼", 6200)},
				
		// 에이드
		new Ade[] {new Ade("시트러스애플사이더",6500), new Ade("키위",6800), 										// 에이드
				new Ade("모히또",6500), new Ade("오렌지",7200)}, 
				
		// 스무디
		new Smoothie[] {new Smoothie("플럼요거트스무디",6500), new Smoothie("블루베리스무디",5500), new Smoothie("메론스무디",5500), // 스무디
				new Smoothie("망고스무디",6500)},
				
		// 차
		new Tea[] {new Tea("애플유자선셋티",6200), new Tea("홍차",4800), new Tea("밀크티",5800), new Tea("녹차",4800)
				 , new Tea("캐모마일티",4800)})		// 차
		);

		//10. 밀크홀 1937 종로점 
		list.add(new Cafe("밀크홀 1937 종로점", "서울 종로구 종로 86-1 1층~5층",
		
		// 커피
		new Coffee[]{new Coffee("아메리카노", 2500), new Coffee("카페라떼", 2800)	, 													// 커피
				new Coffee("아포가토", 5500), new Coffee("돌체연유라떼", 5300), new Coffee("코코넛아이스블렌디드라떼", 6300)},
				
		// 에이드
		new Ade[] {new Ade("레몬에이드",5800), new Ade("자몽에이드",5800)}, 
				
		// 스무디 (없음)
		
				
		// 차
		new Tea[] {new Tea("자몽청티",4800), new Tea("유자청티",4800), new Tea("밀크티",4800), new Tea("호지밀크티",5800)
				 , new Tea("캐모마일티",4300)})		// 차
		);
	}
}
