package fon.bg.ac.rs.masterApp.services;

import fon.bg.ac.rs.masterApp.dtos.TextileDto;

import java.util.List;

public interface TextileService {
    List<TextileDto> getTextiles();

    TextileDto saveTextile(TextileDto textile);

    TextileDto findById(int id);

    void deleteById(int id);
    List<TextileDto> findByPurpose(String purpose);
}
