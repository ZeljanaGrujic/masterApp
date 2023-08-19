package fon.bg.ac.rs.masterApp.repositories;

import fon.bg.ac.rs.masterApp.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
