package in.jsr.exclusive.persistence;

import in.jsr.exclusive.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
