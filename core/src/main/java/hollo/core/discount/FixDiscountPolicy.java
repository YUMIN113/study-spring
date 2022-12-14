package hollo.core.discount;

import hollo.core.member.Grade;
import hollo.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAccount = 1000; // 정액 할인 (1000원)

    @Override
    public int discount(Member member, int price) {

        // ENUM 은 "==" 사용 한다.
        if(member.getGrade() == Grade.VIP) {
            return discountFixAccount;
        } else {
            return 0;
        }
    }
}
