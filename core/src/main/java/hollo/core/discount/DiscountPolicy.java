package hollo.core.discount;

import hollo.core.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인 대상 금액 (1000원이 할인 금액이면 1000원 return 함)
     */
    int discount(Member member, int price);
}
