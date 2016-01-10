package in.jsr.exclusive.persistence;

import in.jsr.exclusive.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
