package cafeVO;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.ImageIcon;

public class CafeDAO {
	private static ArrayList<Cafe> list;
	
	//==============================================================
	private static HashSet<Menu> totalMenu = new HashSet<>();
	
	private static ArrayList<String> coffeeCategory = new ArrayList<>();
	private static ArrayList<String> adeCategory = new ArrayList<>();
	private static ArrayList<String> smoothieCategory = new ArrayList<>();
	private static ArrayList<String> teaCategory = new ArrayList<>();
	
	public CafeDAO(){
		if (list == null) {
			init();
			setCategory();
		}
			
	}

	private void init() {
		list = new ArrayList<Cafe>();

		// #1-1 투썸플레이스 종각역점
		list.add(new Cafe("투썸플레이스 종각역점", "서울특별시 종로구 종로 72", new ImageIcon("src/soldesk_pro01_img/투썸_종각역1.jpg"), new Menu[] {

				// 커피
				new Coffee("아메리카노", 4500), new Coffee("카페라떼", 5000), new Coffee("카라멜마끼아또", 5900),
						new Coffee("카페모카", 5500), new Coffee("바닐라라떼", 5500),

				// 에이드
				new Ade("레몬에이드", 6500), 
						new Ade("자몽에이드", 5800), new Ade("복숭아 에이드", 6000), new Ade("샤인머스캣 청포도에이드", 6300),

				// 스무디
				new Smoothie("스트로베리피치 스무디", 5800), new Smoothie("요거트스무디", 5800),
						new Smoothie("망고스무디", 5300),

				// 차
				new Tea("제주유기농녹차", 4800), new Tea("허니레몬티", 6100), new Tea("캐모마일티", 5100),
						new Tea("얼그레이티", 5100), new Tea("오렌지자몽티", 5500)}));

		// #1-2 투썸플레이스 을지로점
		list.add(new Cafe("투썸플레이스 을지로점", "서울특별시 중구 남대문로10길 30", new ImageIcon("src/soldesk_pro01_img/투썸_을지로점_내부01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 4500), new Coffee("카페라떼", 5000), new Coffee("카라멜마끼아또", 5900),
						new Coffee("카페모카", 5500), new Coffee("바닐라라떼", 5500),

				// 에이드
				new Ade("레몬에이드", 6500), 
						new Ade("자몽에이드", 5800), new Ade("복숭아 에이드", 6000), new Ade("샤인머스캣 청포도에이드", 6300),

				// 스무디
				new Smoothie("스트로베리피치 스무디", 5800), new Smoothie("요거트스무디", 5800),
						new Smoothie("망고스무디", 5300),

				// 차
				new Tea("제주유기농녹차", 4800), new Tea("허니레몬티", 6100), new Tea("캐모마일티", 5100),
						new Tea("얼그레이티", 5100), new Tea("오렌지자몽티", 5500) }));

		// #1-3 투썸플레이스 청계천광교점
		list.add(new Cafe("투썸플레이스 청계천광교점", "서울특별시 중구 남대문로 120 대일빌딩 1층", new ImageIcon("src/soldesk_pro01_img/투썸청계천광교.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 4500), new Coffee("카페라떼", 5000), new Coffee("카라멜마끼아또", 5900),
						new Coffee("카페모카", 5500), new Coffee("바닐라라떼", 5500),

				// 에이드
				new Ade("레몬에이드", 6500), 
						new Ade("자몽에이드", 5800), new Ade("복숭아 에이드", 6000), new Ade("샤인머스캣 청포도에이드", 6300),

				// 스무디
				new Smoothie("스트로베리피치 스무디", 5800), new Smoothie("요거트스무디", 5800),
						new Smoothie("망고스무디", 5300),

				// 차
				 new Tea("제주유기농녹차", 4800), new Tea("허니레몬티", 6100), new Tea("캐모마일티", 5100),
						new Tea("얼그레이티", 5100), new Tea("오렌지자몽티", 5500) }));

		// #1-4 투썸플레이스 종로알파빌딩점
		list.add(new Cafe("투썸플레이스 종로알파빌딩점", "서울특별시 종로구 종로 34 알파빌딩 1층", new ImageIcon("src/soldesk_pro01_img/투썸_종로알파빌딩점01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 4500), new Coffee("카페라떼", 5000), new Coffee("카라멜마끼아또", 5900),
						new Coffee("카페모카", 5500), new Coffee("바닐라라떼", 5500),

				// 에이드
				new Ade("레몬에이드", 6500), new Ade("자몽에이드", 5800), new Ade("복숭아 에이드", 6000),
						new Ade("샤인머스캣 청포도에이드", 6300),

				// 스무디
				new Smoothie("스트로베리피치 스무디", 5800), new Smoothie("요거트스무디", 5800),
						new Smoothie("망고스무디", 5300),

				// 차
				new Tea("제주유기농녹차", 4800), new Tea("허니레몬티", 6100), new Tea("캐모마일티", 5100),
						new Tea("얼그레이티", 5100), new Tea("오렌지자몽티", 5500)}));

		// #1-5 투썸플레이스 서린동청계광장점
		list.add(new Cafe("투썸플레이스 서린동청계광장점", "서울특별시 종로구 청계천로 17 B1F~3F", new ImageIcon("src/soldesk_pro01_img/투썸_서린동청계광장점01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 4500), new Coffee("카페라떼", 5000), new Coffee("카라멜마끼아또", 5900),
						new Coffee("카페모카", 5500), new Coffee("바닐라라떼", 5500),

				// 에이드
				 new Ade("레몬에이드", 6500), 
						new Ade("자몽에이드", 5800), new Ade("복숭아 에이드", 6000), new Ade("샤인머스캣 청포도에이드", 6300),

				// 스무디
				new Smoothie("스트로베리피치 스무디", 5800), new Smoothie("요거트스무디", 5800),
						new Smoothie("망고스무디", 5300),

				// 차
				new Tea("제주유기농녹차", 4800), new Tea("허니레몬티", 6100), new Tea("캐모마일티", 5100),
						new Tea("얼그레이티", 5100), new Tea("오렌지자몽티", 5500) }));

		// #2-1 힘이나는커피생활 종로젊음의거리점
		list.add(new Cafe("힘이나는커피생활 종로젊음의거리점", "서울특별시 종로구 종로12길 15 종로코아빌딩 1층", new ImageIcon("src/soldesk_pro01_img/힘이나는커피생활_종로젊음의거리점01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 1800), new Coffee("카페라떼", 2900), new Coffee("카라멜마끼아또", 3700),
						new Coffee("카페모카", 3900), new Coffee("바닐라라떼", 3400),

				// 에이드
				new Ade("레몬에이드", 3700), new Ade("자몽에이드", 3700), new Ade("청포도에이드", 3700),

				// 스무디
				new Smoothie("딸기요거트스무디", 4200), new Smoothie("블루베리요거트스무디", 4200),
						new Smoothie("플레인요거트스무디", 4200), new Smoothie("망고요거트스무디", 4200),

				// 차
				new Tea("피치블랙티", 6000), new Tea("잉글리쉬브렉퍼스트", 5100), new Tea("제주유기농녹차", 4800),
						new Tea("캐모마일티", 5100), new Tea("얼그레이티", 5100) }));

		// 3-1 스타벅스 종각점 (3번내용 조사 x, 0번이랑 동일)
		list.add(new Cafe("스타벅스 종각점", "서울특별시 종로구 종로 64", new ImageIcon("src/soldesk_pro01_img/스타벅스_종각점01.PNG"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 1500), new Coffee("카페라떼", 2000), new Coffee("카라멜마끼아또", 2000),
						new Coffee("카페모카", 2000), new Coffee("바닐라라떼", 2000),

				// 에이드
				new Ade("유자패션피지오", 5900), new Ade("쿨라임피지오", 5900), new Ade("피치딸기피지오", 5700),

				// 스무디
				new Smoothie("망고바나나스무디", 6300), new Smoothie("피치요거트블렌디드", 6100),
						new Smoothie("망고패션티블렌디드", 5400), new Smoothie("딸기요거트스무디", 6300),
						new Smoothie("자몽허니스무디", 6300),

				// 차
				new Tea("제주유기녹차", 5300), new Tea("얼그레이티", 4500), new Tea("캐모마일티", 4500),
						new Tea("히비스커스티", 4500)}));

		// 3-2 스타벅스 종로관철점
		list.add(new Cafe("스타벅스 종로관철점", "서울특별시 종로구 종로12길 21", new ImageIcon("src/soldesk_pro01_img/스타벅스_종로관철점03.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 1500), new Coffee("카페라떼", 2000), new Coffee("카라멜마끼아또", 2000),
						new Coffee("카페모카", 2000), new Coffee("바닐라라떼", 2000),

				// 에이드
				new Ade("유자패션피지오", 5900), new Ade("쿨라임피지오", 5900), new Ade("피치딸기피지오", 5700),

				// 스무디
				new Smoothie("망고바나나스무디", 6300), new Smoothie("피치요거트블렌디드", 6100),
						new Smoothie("망고패션티블렌디드", 5400), new Smoothie("딸기요거트스무디", 6300),
						new Smoothie("자몽허니스무디", 6300),

				// 차
				new Tea("제주유기녹차", 5300), new Tea("얼그레이티", 4500), new Tea("캐모마일티", 4500),
						new Tea("히비스커스티", 4500) }));

		// 3-3 스타벅스 종로R점
		list.add(new Cafe("스타벅스 종로R점", "서울특별시 종로구 종로 51", new ImageIcon("src/soldesk_pro01_img/스타벅스_종로R점01.jpg"),new Menu[] {

				// 커피
				 new Coffee("아메리카노", 1500), new Coffee("카페라떼", 2000), new Coffee("카라멜마끼아또", 2000),
						new Coffee("카페모카", 2000), new Coffee("바닐라라떼", 2000),

				// 에이드
				new Ade("유자패션피지오", 5900), new Ade("쿨라임피지오", 5900), new Ade("피치딸기피지오", 5700),

				// 스무디
				new Smoothie("망고바나나스무디", 6300), new Smoothie("피치요거트 블렌디드", 6100),
						new Smoothie("망고패션티 블렌디드", 5400), new Smoothie("딸기요거트스무디", 6300),
						new Smoothie("자몽허니스무디", 6300),

				// 차
				 new Tea("제주유기녹차", 5300), new Tea("얼그레이티", 4500), new Tea("캐모마일티", 4500),
						new Tea("히비스커스티", 4500)}));

		// #4-1 메가MGC커피 종각역점
		list.add(new Cafe("메가MGC커피 종각역점", "서울특별시 종로구 종로 80-2 1층", new ImageIcon("src/soldesk_pro01_img/메가커피_종각역점01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 1500), new Coffee("카페라떼", 2900), // 커피
						new Coffee("카라멜마끼아또", 3700), new Coffee("카페모카", 3900), new Coffee("바닐라라떼", 3400),

				// 에이드
				new Ade("레몬에이드", 3500), new Ade("블루레몬에이드", 3500), new Ade("자몽에이드", 3500),
						new Ade("청포도에이드", 3500), new Ade("유니콘매직에이드", 3800),

				// 스무디
				new Smoothie("코코넛커피 스무디", 4800), new Smoothie("플레인요거트 스무디", 3900),
						new Smoothie("망고요거트 스무디", 3900), new Smoothie("딸기요거트스무디", 3900),

				// 차
				new Tea("복숭아아이스티", 3000), new Tea("허니자몽블랙티", 3700), new Tea("캐모마일티", 2500),
						new Tea("페퍼민트티", 2500), new Tea("얼그레이티", 2500) }));

		// #4-2 메가MGC커피 종로점
		list.add(new Cafe("메가MGC커피 종로점", "서울특별시 종로구 종로 122 1층", new ImageIcon("src/soldesk_pro01_img/메가커피_종로점01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 1500), new Coffee("카페라떼", 2900), // 커피
						new Coffee("카라멜마끼아또", 3700), new Coffee("카페모카", 3900), new Coffee("바닐라라떼", 3400),

				// 에이드
				new Ade("레몬에이드", 3500), new Ade("블루레몬에이드", 3500), new Ade("자몽에이드", 3500),
						new Ade("청포도에이드", 3500), new Ade("유니콘매직에이드", 3800),

				// 스무디
				new Smoothie("코코넛커피 스무디", 4800), new Smoothie("플레인요거트 스무디", 3900),
						new Smoothie("망고요거트 스무디", 3900), new Smoothie("딸기요거트스무디", 3900),

				// 차
				new Tea("복숭아아이스티", 3000), new Tea("허니자몽블랙티", 3700), new Tea("캐모마일티", 2500),
						new Tea("페퍼민트티", 2500), new Tea("얼그레이티", 2500) }));

		// #5-1 빽다방 종로관철점
		list.add(new Cafe("빽다방 종로관철점", "서울특별시 종로구 종로10길 21", new ImageIcon("src/soldesk_pro01_img/빽다방_종로관철점01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 1800), new Coffee("카페라떼", 3500),
						new Coffee("카라멜마끼아또", 4000), new Coffee("카페모카", 4000), new Coffee("바닐라라떼", 4200),

				// 에이드
				new Ade("레몬에이드", 4500), new Ade("복숭아 에이드", 4500), new Ade("깔라만시에이드", 4300),
						new Ade("자몽에이드", 4500), new Ade("청포도에이드", 4500),

				// 스무디
				new Smoothie("딸기빽스치노", 4300), new Smoothie("초코빽스치노", 4300),
						new Smoothie("민트초코빽스치노", 4300), new Smoothie("녹차빽스치노", 4500), new Smoothie("초코바나나빽스치노", 4300),
						new Smoothie("원조빽스치노", 3800),

				// 차
				new Tea("아이스티", 3000), new Tea("캐모마일티", 3000), new Tea("오렌지자몽블랙티", 4000),
						new Tea("페퍼민트티", 3000) }));

		// #5-2 빽다방 종로을지로입구역점
		list.add(new Cafe("빽다방 종로을지로입구역점", "서울특별시 중구 남대문로9길 10 1층", new ImageIcon("src/soldesk_pro01_img/빽다방_을지로입구역점_내부01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 1800), new Coffee("카페라떼", 3500), new Coffee("카라멜마끼아또", 4000),
						new Coffee("카페모카", 4000), new Coffee("바닐라라떼", 4200),

				// 에이드
				new Ade("레몬에이드", 4500), new Ade("복숭아 에이드", 4500), new Ade("깔라만시에이드", 4300),
						new Ade("자몽에이드", 4500), new Ade("청포도에이드", 4500),

				// 스무디
				new Smoothie("딸기빽스치노", 4300), new Smoothie("초코빽스치노", 4300),
						new Smoothie("민트초코빽스치노", 4300), new Smoothie("녹차빽스치노", 4500), new Smoothie("초코바나나빽스치노", 4300),
						new Smoothie("원조빽스치노", 3800),

				// 차
				new Tea("아이스티", 3000), new Tea("캐모마일티", 3000), new Tea("오렌지자몽블랙티", 4000),
						new Tea("페퍼민트티", 3000) }));

		// 6. 달콤커피 종로종각점
		list.add(new Cafe("달콤커피 종로종각점", "서울특별시 종로구 종로12길 16 1, 2, 3층", new ImageIcon("src/soldesk_pro01_img/달콤커피_종로종각점01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 4100), new Coffee("카페라떼", 4800), new Coffee("카라멜마끼아또", 5100),
						new Coffee("카페모카", 5100), new Coffee("바닐라라떼", 5100),

				// 에이드
				new Ade("깔라만시에이드", 4800), new Ade("레몬에이드", 4800),

				// 스무디
				new Smoothie("그린티스무디", 5500), new Smoothie("망고스무디", 6000), new Smoothie("딸기스무디", 6000),
						new Smoothie("플레인요거트스무디", 5800),

				// 차
				new Tea("얼그레이티", 4100), new Tea("캐모마일티", 4100), new Tea("하동녹차", 4100),
						new Tea("페퍼민트티", 4100) }));

		// 7. 커피스미스 종로점 가격표 최신화 요망
		list.add(new Cafe("커피스미스 종로점", "서울특별시 종로구 종로 85 (종로2가)", new ImageIcon("src/soldesk_pro01_img/커피스미스_종로점_01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 4500), new Coffee("카페라떼", 5000), new Coffee("카라멜마끼아또", 5400),
						new Coffee("카페모카", 5600), new Coffee("바닐라라떼", 5400),

				// 에이드
				new Ade("레몬에이드", 4800), new Ade("레드에이드", 4800), new Ade("블루에이드", 4800),

				// 스무디
				new Smoothie("요거트유자스무디", 6200), new Smoothie("블루베리요거트 스무디", 6200),
						new Smoothie("라즈베리요거트 스무디", 6200),

				// 차
				new Tea("얼그레이티", 5400), new Tea("스미스블랜드티", 5200), new Tea("카모마일티", 5400),
						new Tea("유자티", 5600), new Tea("페퍼민트티", 5400) }));

		// 8. 커스텀커피 을지로점
		list.add(new Cafe("커스텀커피 을지로점", "서울특별시 종로구 삼일대로17길 51 1층", new ImageIcon("src/soldesk_pro01_img/커스텀커피_을지로점03.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 3800), new Coffee("카페라떼", 4800), 
						new Coffee("카라멜마끼아또", 5300), new Coffee("카페모카", 5300), new Coffee("바닐라라떼", 5300),

				// 에이드
				new Ade("블루레몬에이드", 5000), new Ade("청포도에이드", 5000), new Ade("자몽에이드", 5000),

				// 스무디
				new Smoothie("딸기스무디", 5500), new Smoothie("블루베리스무디", 5500),
						new Smoothie("메론스무디", 5500), new Smoothie("망고스무디", 5500),

				// 차
				new Tea("얼그레이티", 5500), new Tea("캐모마일티", 5500), new Tea("복숭아아이스티", 3500),
						new Tea("페퍼민트티", 5500) }));

		// 9. 커피앳웍스 센터원점
		list.add(new Cafe("커피앳웍스 센터원점 ", "서울특별시 중구 을지로5길 26 1층 104호(미래에셋 센터원빌딩)", new ImageIcon("src/soldesk_pro01_img/커피앤웍스_센터원점_01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 4800), new Coffee("카페라떼", 5800), new Coffee("카라멜마끼아또", 4800),
						new Coffee("카페모카", 5300), new Coffee("바닐라라떼", 6200),

				// 에이드
				new Ade("시트러스애플사이더", 6500), new Ade("키위에이드", 6800), new Ade("오렌지에이드", 7200),

				// 스무디
				new Smoothie("블루베리스무디", 5500), new Smoothie("메론스무디", 5500),
						new Smoothie("망고스무디", 6500),

				// 차
				new Tea("홍차", 4800), new Tea("녹차", 4800), new Tea("캐모마일티", 4800) }));

		// 10. 밀크홀 1937 종로점 *스무디없음
		list.add(new Cafe("밀크홀 1937 종로점", "서울특별시 종로구 종로 86-1 1층~5층", new ImageIcon("src/soldesk_pro01_img/밀크홀1937_종로점_01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 2500), new Coffee("카페라떼", 2800), new Coffee("아포가토", 5500),
						new Coffee("돌체라떼", 5300), new Coffee("코코넛아이스 블렌디드 라떼", 6300),

				// 에이드
				new Ade("레몬에이드", 5800), new Ade("자몽에이드", 5800),

				// 스무디 (없음)
				

				// 차
				new Tea("자몽청티", 4800), new Tea("유자청티", 4800), new Tea("밀크티", 4800), new Tea("호지밀크티", 5800),
						new Tea("캐모마일티", 4300) }) // 차
		);

		// #11. (11-1) 할리스 종각역점
		list.add(new Cafe("할리스 종각역점", "서울특별시 종로구 종로 60-1 1층 할리스 종각역점", new ImageIcon("src/soldesk_pro01_img/할리스_종각역점_내부01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 4500), new Coffee("카페라떼", 5000), new Coffee("카라멜마끼아또", 5900),
						new Coffee("카페모카", 5500), new Coffee("바닐라라떼", 5800),

				// 에이드
				new Ade("청포도에이드", 5800), new Ade("복숭아자두에이드", 5800), new Ade("유자몽에이드", 5800),

				// 스무디
				new Smoothie("딸기치즈케익할리치노", 5900), new Smoothie("민트초코칩할리치노", 5900),
						new Smoothie("다크초코칩할라치노", 6300), new Smoothie("딸기스무디", 6000), new Smoothie("애플망고스무디", 6000),

				// 차
				new Tea("해남녹차", 4500), new Tea("얼그레이티", 4500), new Tea("캐모마일티", 4500),
						new Tea("페퍼민트티", 4500) }));
		
		// #11. (11-2) 할리스 청계천점
		list.add(new Cafe("할리스 청계천점", "서울특별시 종로구 청계천로 81", new ImageIcon("src/soldesk_pro01_img/할리스_청계천점_03.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 4500), new Coffee("카페라떼", 5000), new Coffee("카라멜마끼아또", 5900),
						new Coffee("카페모카", 5500), new Coffee("바닐라라떼", 5800),

				// 에이드
				new Ade("청포도에이드", 5800), new Ade("복숭아자두에이드", 5800), new Ade("유자몽에이드", 5800),

				// 스무디
				new Smoothie("딸기치즈케익할리치노", 5900), new Smoothie("민트초코칩할리치노", 5900),
						new Smoothie("다크초코칩할라치노", 6300), new Smoothie("딸기스무디", 6000), new Smoothie("애플망고스무디", 6000),

				// 차
				new Tea("해남녹차", 4500), new Tea("얼그레이티", 4500), new Tea("캐모마일티", 4500),
						new Tea("페퍼민트티", 4500) }));
			

		// #11. (11-3) 할리스 아카데미
		list.add(new Cafe("할리스 아카데미", "서울특별시 종로구 삼일대로 395 5층", new ImageIcon("src/soldesk_pro01_img/할리스_아카데미_03.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 4500), new Coffee("카페라떼", 5000), new Coffee("카라멜마끼아또", 5900),
						new Coffee("카페모카", 5500), new Coffee("바닐라라떼", 5800),

				// 에이드
				new Ade("청포도에이드", 5800), new Ade("복숭아자두에이드", 5800), new Ade("유자몽에이드", 5800),

				// 스무디
				new Smoothie("딸기치즈케익할리치노", 5900), new Smoothie("민트초코칩할리치노", 5900),
								new Smoothie("다크초코칩할라치노", 6300), new Smoothie("딸기스무디", 6000), new Smoothie("애플망고스무디", 6000),

				// 차
				new Tea("해남녹차", 4500), new Tea("얼그레이티", 4500), new Tea("캐모마일티", 4500),
						new Tea("페퍼민트티", 4500) }));			
				
				
		// #12. (12-1) 이디야 삼일빌딩점
		list.add(new Cafe("이디야 삼일빌딩점", "서울특별시 종로구 삼일대로15길 13", new ImageIcon("src/soldesk_pro01_img/이디야_삼일빌딩점_내부01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 3200), new Coffee("카페라떼", 4200), new Coffee("카라멜마끼아또", 4500),
						new Coffee("카페모카", 4500), new Coffee("바닐라라떼", 4500),

				// 에이드
				new Ade("청포도에이드", 4200), new Ade("레몬에이드", 4200), new Ade("자몽에이드", 4200),

				// 스무디
				new Smoothie("딸기요거트스무디", 4700), new Smoothie("블루베리요거트스무디", 4700),
						new Smoothie("플레인요거트스무디", 4500), new Smoothie("망고스무디", 3900), new Smoothie("꿀복숭아스무디", 3900),

				// 차
				new Tea("해남녹차", 4500), new Tea("얼그레이티", 4500), new Tea("캐모마일티", 4500),
						new Tea("페퍼민트티", 4500) }));
		
		// #12. (12-2) 이디야 종로삼일대로점
		list.add(new Cafe("이디야 종로삼일대로점", "서울특별시 종로구 삼일대로 390-1", new ImageIcon("src/soldesk_pro01_img/이디야_종로삼일대로점_02.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 3200), new Coffee("카페라떼", 4200), new Coffee("카라멜마끼아또", 4500),
						new Coffee("카페모카", 4500), new Coffee("바닐라라떼", 4500),

				// 에이드
				new Ade("청포도에이드", 4200), new Ade("레몬에이드", 4200), new Ade("자몽에이드", 4200),
				
				// 스무디
				new Smoothie("딸기요거트스무디", 4700), new Smoothie("블루베리요거트스무디", 4700),
						new Smoothie("플레인요거트스무디", 4500), new Smoothie("망고스무디", 3900), new Smoothie("꿀복숭아스무디", 3900),

				// 차
				new Tea("해남녹차", 4500), new Tea("얼그레이티", 4500), new Tea("캐모마일티", 4500),
						new Tea("페퍼민트티", 4500) }));
		
		// #13. (13-1) 카페스윗백년관점
		list.add(new Cafe("카페스윗 백년관점", "서울특별시 중구 남대문로10길 29 신한은행 백년관 1층", new ImageIcon("src/soldesk_pro01_img/카페스윗_백년관점_01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 1500), new Coffee("카페라떼", 2000), new Coffee("브라운슈가마끼아또", 2800),
						new Coffee("카페모카", 2700), new Coffee("바닐라라떼", 2300),

				// 에이드
				new Ade("청포도에이드", 3000), new Ade("레몬에이드", 3000), new Ade("자몽에이드", 3000),

				// 스무디
				new Smoothie("피치요거트스무디", 3800), new Smoothie("오미자셔벗크러쉬", 3800),
						new Smoothie("플레인요거트스무디", 3500),

				// 차
				new Tea("페퍼민트티", 2500), new Tea("루이보스티", 2500), new Tea("캐모마일티", 2500),
						new Tea("히비스커스티", 2500) }));

		// #14. (14-1) 프롬하츠커피 청계종각점
		list.add(new Cafe("프롬하츠커피 청계종각점", "서울특별시 종로구 청계천로 53 1층 프롬하츠커피 청계종각점", new ImageIcon("src/soldesk_pro01_img/프롬하츠커피_청계종각점_02.jpg"), new Menu[] {

				// 커피
				new Coffee("아메리카노", 4800), new Coffee("카페라떼", 5300), new Coffee("카라멜마끼아또", 6000),
						new Coffee("카페모카", 5800), new Coffee("바닐라라떼", 5800),

				// 에이드
				new Ade("청포도에이드", 6500), new Ade("레몬에이드", 6500), new Ade("자몽에이드", 6500),

				// 스무디
				new Smoothie("플레인요거트스무디", 6000), new Smoothie("블루베리요거트스무디", 6500),
						new Smoothie("딸기요거트스무디", 6500),

				// 차
				new Tea("페퍼민트티", 5000), new Tea("루이보스티", 5000), new Tea("캐모마일티", 5000),
						new Tea("하동녹차", 5000) }));

		// #14. (14-2) 프롬하츠커피종로점
		list.add(new Cafe("프롬하츠커피 종로점", "서울특별시 종로구 삼일대로 396 1층", new ImageIcon("src/soldesk_pro01_img/프롬하츠커피_종로점_01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 4800), new Coffee("카페라떼", 5300), new Coffee("카라멜마끼아또", 6000),
						new Coffee("카페모카", 5800), new Coffee("바닐라라떼", 5800),

				// 에이드
				new Ade("청포도에이드", 6500), new Ade("레몬에이드", 6500), new Ade("자몽에이드", 6500),

				// 스무디
				new Smoothie("플레인요거트스무디", 6000), new Smoothie("블루베리요거트스무디", 6500),
						new Smoothie("딸기요거트스무디", 6500),

				// 차
				new Tea("페퍼민트티", 5000), new Tea("루이보스티", 5000), new Tea("캐모마일티", 5000),
						new Tea("하동녹차", 5000) }));
		
		// #15. (15-1) 일립스커피
		list.add(new Cafe("일립스커피", "서울특별시 종로구 종로9길 8 일립스커피",new ImageIcon("src/soldesk_pro01_img/일립스커피_01.PNG"), new Menu[] {

				// 커피
				new Coffee("아메리카노", 3800), new Coffee("카페라떼", 4300), new Coffee("아인슈페너", 4300),
						new Coffee("콜드브루", 3500), new Coffee("바닐라라떼", 4800),

				// 에이드
				new Ade("패션후르츠에이드", 4800),

				// 스무디
				new Smoothie("플레인요거트스무디", 6000), new Smoothie("블루베리요거트스무디", 6500),
						new Smoothie("딸기요거트스무디", 6500),

				// 차
				new Tea("유자피치그린티", 4800), new Tea("허브티", 4800) }));


		// #16. (16-1) 커피디엔에이
		list.add(new Cafe("커피디엔에이 광화문점", "서울특별시 종로구 종로 33 1층", new ImageIcon("src/soldesk_pro01_img/커피디엔에이_광화문_02.jpg"),new Menu[] {

				// 커피
				 new Coffee("아메리카노", 4000), new Coffee("카페라떼", 4500), new Coffee("월남라떼", 6000),
						new Coffee("카페모카", 5000), new Coffee("바닐라라떼", 5000),

				// 에이드
				 new Ade("청포도에이드", 6500), new Ade("레몬에이드", 6500), new Ade("자몽에이드", 6500),

				// 스무디
				 new Smoothie("플레인요거트스무디", 6000), new Smoothie("블루베리요거트스무디", 6500),
						new Smoothie("딸기요거트스무디", 6500),

				// 차
				new Tea("페퍼민트티", 5000), new Tea("레드넥타허브티", 5000), new Tea("히비스커스티", 5000),
						new Tea("포틀랜드 블랙퍼스트홍차", 5000) }));

		// #17. (17-1) 퀸카페종각
		list.add(new Cafe("퀸카페 종각점", "서울특별시 종로구 청계천로 35 1층 관정빌딩", new ImageIcon("src/soldesk_pro01_img/퀸카페_종각_01.jpg"),new Menu[] {

				// 커피
				new Coffee("아메리카노", 1500), new Coffee("카페라떼", 2500), new Coffee("카라멜마끼아또", 2900),
						new Coffee("카페모카", 2900), new Coffee("바닐라라떼", 2900),

				// 에이드
				new Ade("레몬에이드", 3500), new Ade("제주청귤에이드", 3500), new Ade("자몽에이드", 3500),

				// 스무디
				new Smoothie("딸기요거트스무디", 3900), new Smoothie("블루베리요거트스무디", 3900),
						new Smoothie("플레인요거트스무디", 3500), new Smoothie("패션후르츠스무디", 3900),

				// 차
				new Tea("자스민티", 2500), new Tea("페퍼민트티", 2500), new Tea("복숭아아이스티", 2500)}));

		
		
	}

				
	// 카테고리분류별 메뉴 초기화 메소드
	private void setCategory() {
		for(Menu menu : totalMenu) {
			if(menu instanceof Coffee) {
				coffeeCategory.add(menu.getName());
			}
			else if(menu instanceof Ade) {
				Ade obj = (Ade) menu;
				adeCategory.add(menu.getName());
			}
			else if(menu instanceof Smoothie) {
				Smoothie obj = (Smoothie) menu;
				smoothieCategory.add(menu.getName());
			}
			else if(menu instanceof Tea) {
				Tea obj = (Tea) menu;
				teaCategory.add(menu.getName());
			}
		}
	}
	
	// 키워드 포함시 keyword 반환 메서드
	   public static String findKeyword(String text, String keyword) {
	      if (text.contains(keyword)) {
	         return keyword;
	      } else {
	         return null;
	      }
	   }

	// 가격순 정렬 메서드
	      public static ArrayList<Map.Entry<String, Integer>> sortMenu (String menuName) {
	          
	            TreeMap<String, Integer> cafeList = new  TreeMap<>();
	               
	            for(int i=0; i<list.size(); i++){
	               for(int y=0; y<list.get(i).getCafeMenu().size(); y++) {
	                  if(list.get(i).getCafeMenu().get(y).getName().equals(menuName)){
	                     
	                  // menuName와 똑같은 메뉴를 가진 카페이름과 그메뉴의 가격을 cafeList에 추가
	                  cafeList.put(list.get(i).getName(), list.get(i).getCafeMenu().get(y).getPrice());

	               }
	            }
	         }

	         ArrayList<Map.Entry<String, Integer>> priceList = new ArrayList<>(cafeList.entrySet());
	         Collections.sort(priceList, Map.Entry.comparingByValue());
	         return priceList;
	      }
	      
	   // 가격 내림차순 정렬 메서드
	      public static ArrayList<Map.Entry<String, Integer>> sortMenuDesc(String menuName) {
	          TreeMap<String, Integer> cafeList = new TreeMap<>(Collections.reverseOrder());
	              
	          for(int i=0; i<list.size(); i++) {
	              for(int y=0; y<list.get(i).getCafeMenu().size(); y++) {
	                  if(list.get(i).getCafeMenu().get(y).getName().equals(menuName)){
	                      cafeList.put(list.get(i).getName(), list.get(i).getCafeMenu().get(y).getPrice());
	                  }
	              }
	          }

	          ArrayList<Map.Entry<String, Integer>> priceList = new ArrayList<>(cafeList.entrySet());
	          Collections.sort(priceList, Map.Entry.<String, Integer>comparingByValue().reversed());
	          return priceList;
	      }
	
	
	
	
	
	// Image 크기 변환 메소드
	public static ImageIcon imageScaleChange (ImageIcon image, int xSize, int ySize) {
		Image img = image.getImage();
		Image chageImg = img.getScaledInstance(xSize, ySize, Image.SCALE_SMOOTH);
		ImageIcon chageIcon = new ImageIcon(chageImg);
		
		return chageIcon;
	}
	
	public static Cafe searchCafe(String name) { //카페 이름 찾기 메서드 정보창 호출때문에 임시로 만듬
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).getName().equals(name)) {
				
				return list.get(i);
				
			}
		}
		return null;
	}
	
	public int searchCafeI(String name) { //카페 이름 찾기 메서드 정보창 호출때문에 임시로 만듬
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).getName().equals(name)) {
				
				return i;
				
			}
		}
		return (Integer) null;
	}
	public static ArrayList<Cafe> getList() {
		return list;
	}
	
	public static HashSet<Menu> getTotalMenu() {
		return totalMenu;
	}

	public static ArrayList<String> getCoffeeCategory() {
		return coffeeCategory;
	}

	public static ArrayList<String> getAdeCategory() {
		return adeCategory;
	}

	public static ArrayList<String> getSmoothieCategory() {
		return smoothieCategory;
	}

	public static ArrayList<String> getTeaCategory() {
		return teaCategory;
	}
}