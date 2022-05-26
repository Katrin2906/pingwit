package homework_21.task_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private static final Map<Long, Employee> EMPLOYEE_MAP = new HashMap<>();

    @PostConstruct
    public void init() {
        EMPLOYEE_MAP.put(1L, new Employee(1L, "Mick", 2L));
        EMPLOYEE_MAP.put(2L, new Employee(2L, "Kasey", 15L));
        EMPLOYEE_MAP.put(3L, new Employee(3L, "Pit", 0L));
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return EMPLOYEE_MAP.values().stream()
                .toList();
    }

    // у тебя скорее всего упало приложение при запуске, т.к. два одинаковых енд поинта у метода getAll() и getAllNames()
    // этот метод должен был фильтровать по имени + ratePerHour, а у тебя сортировка
    @GetMapping("/all")
    public List<Employee> getAllNames() {
        return EMPLOYEE_MAP.values().stream()
                .sorted(Comparator.comparing(Employee::name))
                .toList();
    }
}
