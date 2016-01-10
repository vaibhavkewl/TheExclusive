package in.jsr.exclusive.persistence;

import in.jsr.exclusive.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
