package fon.bg.ac.rs.masterApp.services;

import fon.bg.ac.rs.masterApp.dtos.SupplierDto;

import java.util.List;

public interface SupplierService {
    List<SupplierDto> getSuppliers();

    SupplierDto saveSupplier(SupplierDto supplier);

    SupplierDto findById(int id);

    void deleteById(int id);
}
