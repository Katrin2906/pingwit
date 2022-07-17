package project.cosmetology.service;

import org.springframework.stereotype.Component;
import project.cosmetology.dto.EmployeeDto;
import project.cosmetology.dto.ProcedureDto;
import project.cosmetology.entity.Employee;
import project.cosmetology.entity.Procedure;

import java.util.List;

@Component
public class EmployeeConverter {

    private final ProcedureConverter procedureConverter;

    public EmployeeConverter(ProcedureConverter procedureConverter) {
        this.procedureConverter = procedureConverter;
    }

    public EmployeeDto toFront(Employee employee) {
        if (employee == null) {
            return null;
        }
        List<ProcedureDto> procedureDtos = procedureConverter.toFront(employee.getProcedures());
        return new EmployeeDto(employee.getId(), employee.getName(), procedureDtos);
    }

    public Employee toLocal(EmployeeDto dto) {
        if (dto == null) {
            return null;
        }

        Employee employee = new Employee();
        employee.setId(dto.id());
        employee.setName(dto.name());

        List<Procedure> procedures = procedureConverter.toLocal(dto.procedureDtos());
        employee.setProcedures(procedures);

        return employee;
    }

}
