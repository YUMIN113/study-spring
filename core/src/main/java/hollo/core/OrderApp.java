package hollo.core;

import hollo.core.member.Grade;
import hollo.core.member.Member;
import hollo.core.member.MemberService;
import hollo.core.member.MemberServiceImpl;
import hollo.core.order.Order;
import hollo.core.order.OrderService;
import hollo.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
//      System.out.println("order.calculatePrice() = " + order.calculatePrice());
        
    }
}
