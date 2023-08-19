package fon.bg.ac.rs.masterApp.repositories;

import fon.bg.ac.rs.masterApp.models.TextileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextileModelRepository extends JpaRepository<TextileModel, Integer> {
}
