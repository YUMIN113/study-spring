package hollo.core;

import hollo.core.member.Grade;
import hollo.core.member.Member;
import hollo.core.member.MemberService;
import hollo.core.member.MemberServiceImpl;

// 정확히 실행되는지 확인
public class MemberApp {

    public static void main(String[] args) {
      MemberService memberService = new MemberServiceImpl();
      Member member = new Member(1L, "memberA", Grade.VIP);
      memberService.join(member);

      Member findMember = memberService.findMember(1L);
      System.out.println("new member = " + member.getName());
      System.out.println("find Member = " + findMember.getName());

    }
}
