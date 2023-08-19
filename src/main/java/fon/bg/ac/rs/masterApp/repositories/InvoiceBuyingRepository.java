package fon.bg.ac.rs.masterApp.repositories;

import fon.bg.ac.rs.masterApp.models.InvoiceBuying;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceBuyingRepository extends JpaRepository<InvoiceBuying, Integer> {
}
