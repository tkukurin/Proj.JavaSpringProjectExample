package co.kukurin.toptal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopTalentRepository extends JpaRepository<TopTalentEntity, Integer> {
}
