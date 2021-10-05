package co.micol.prj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateTest {
	private Date date;
	private Calendar now;
	private SimpleDateFormat sd;

	void dateTest() {
//		sd = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss"); // 날짜 표현 형식 정의
//		M은 월 /  m은 분
//		sd=new SimpleDateFormat("yyyy년 MM월 dd일");
		sd=new SimpleDateFormat("현재시간 hh:mm:ss");
		date = new Date(); // 새로운 날짜 객체를 생성
		
		System.out.println(sd.format(date));

	}
	void calendatTest() {
		now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1;
		System.out.println(month);
	}

}
