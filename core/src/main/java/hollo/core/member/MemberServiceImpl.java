package hollo.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    // 추상화에도 의존하며 구체화에도 의존하고 있다. DIP 위반하고 있으므로 바람직하지 않다.

    @Override
    public void join(Member member) {
       memberRepository.save(member); // 다형성에 의해 MemoryMemberRepository 의 save() 호출 함
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
