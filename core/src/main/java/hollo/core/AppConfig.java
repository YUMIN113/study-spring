package hollo.core;

import hollo.core.discount.DiscountPolicy;
import hollo.core.discount.RateDiscountPolicy;
import hollo.core.member.MemberRepository;
import hollo.core.member.MemberService;
import hollo.core.member.MemberServiceImpl;
import hollo.core.member.MemoryMemberRepository;
import hollo.core.order.OrderService;
import hollo.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정 정보
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
