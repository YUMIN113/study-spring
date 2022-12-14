package hollo.core.order;

public interface OrderService {

    Order createOrder(Long memberId, String intemName, int itemPrice);
}
