package fon.bg.ac.rs.masterApp.servicesImpl;

import fon.bg.ac.rs.masterApp.dtos.InvoiceStatusDto;
import fon.bg.ac.rs.masterApp.models.InvoiceStatus;
import fon.bg.ac.rs.masterApp.repositories.InvoiceStatusRepository;
import fon.bg.ac.rs.masterApp.services.InvoiceStatusService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvoiceStatusServiceImpl implements InvoiceStatusService {

    @Autowired
    private InvoiceStatusRepository invoiceStatusRepository;

    @Override
    public List<InvoiceStatusDto> getInvoiceStatuses() {
        List<InvoiceStatus> all = invoiceStatusRepository.findAll();
        List<InvoiceStatusDto> dtos = all.stream()
                .map(d -> new InvoiceStatusDto(d.getId(),
                        d.getDescription(),
                        d.getDetails())).collect(Collectors.toList());

        return dtos;
    }

    @Override
    public InvoiceStatusDto saveInvoiceStatus(InvoiceStatusDto invoiceStatus) {

        InvoiceStatus d = new InvoiceStatus();
        BeanUtils.copyProperties(invoiceStatus, d);

        InvoiceStatus saved = invoiceStatusRepository.save(d);
        invoiceStatus.setId(saved.getId());
        return invoiceStatus;
    }

    @Override
    public InvoiceStatusDto findById(int id) {



        InvoiceStatus find=invoiceStatusRepository.findById(id).get();
        InvoiceStatusDto d= new InvoiceStatusDto();
        BeanUtils.copyProperties(find, d);

        return d;
    }
}
