package hello.core.order;
import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository; //얘 는 웬만하면 세팅을 해줘!
    private final DiscountPolicy discountPolicy; // final 이 있으면 무조건 값이 있어야 된다는 것임, 그렇게 지정한거임
    //생성자 주입은 자바코드
    //orderserviceimpl 객체를 생성해서 스프링에 등록해야돼서
    //new spring 도 new orderserviceimpl을 호출해야하니 생성자가필요함
    //spring containerㅇ서 orderserviceimpl(memberRepository discountPolicy)찾아서 호출하기때문에
    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) { // 생성자가 하나이기 때문에 자동으로 의존관계 주빙 ㅣ일어남
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
        
    }
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}