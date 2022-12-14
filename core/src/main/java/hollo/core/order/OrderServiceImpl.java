package hollo.core.order;

import hollo.core.discount.DiscountPolicy;
import hollo.core.discount.FixDiscountPolicy;
import hollo.core.member.Member;
import hollo.core.member.MemberRepository;
import hollo.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String intemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, intemName, itemPrice, discountPrice);
    }
}
