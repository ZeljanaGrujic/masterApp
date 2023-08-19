package fon.bg.ac.rs.masterApp.repositories;

import fon.bg.ac.rs.masterApp.models.InvoiceSelling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceSellingRepository extends JpaRepository<InvoiceSelling, Integer> {
}
