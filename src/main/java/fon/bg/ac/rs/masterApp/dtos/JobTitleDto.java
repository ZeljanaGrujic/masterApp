package fon.bg.ac.rs.masterApp.dtos;

//import javax.persistence.Entity;
//import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
//@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class JobTitleDto extends CommonObjectDto {
    public JobTitleDto() {
    }

    public JobTitleDto(Integer id, String description, String details) {
        super(id, description, details);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }

    @Override
    public void setDetails(String details) {
        super.setDetails(details);
    }

    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String description;
//    private String details;

}
