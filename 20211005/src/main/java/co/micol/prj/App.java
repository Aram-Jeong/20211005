package co.micol.prj;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.member.Member;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Member member;
		List<Member> members = new ArrayList<Member>();
		member = new Member("홍길동", "대구광역시", 20);
		members.add(member); // 리스트에 한 명의 데이터를 담는다.

		member = new Member("박승리", "대구광역시", 24);
		members.add(member);

		member = new Member("이기자", "대구광역시", 20);
		members.add(member);

		member = new Member("김기자", "대구광역시", 24);
		members.add(member);

		for (Member m : members) {
			m.toString();
		}
	}

}
