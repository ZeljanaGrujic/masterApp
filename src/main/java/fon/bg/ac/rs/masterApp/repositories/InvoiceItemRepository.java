package fon.bg.ac.rs.masterApp.repositories;

import fon.bg.ac.rs.masterApp.models.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Integer> {
    List<InvoiceItem> findByInvoiceSellingId(int id);



//    @Query(
//            value="DELETE * FROM invoice_item WHERE invoicesellingid= ?1 AND textileid= ?2",
//            nativeQuery = true
//
//    )
//    void deleteByTextileId(int invoicesellingid, int textileid);
}
