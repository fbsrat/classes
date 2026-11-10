import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void testPunchIn() {
        Employee employee = new Employee();

        employee.punchIn(9);

        assertTrue(employee. isPunchedIn());
    }

    @Test
    public void testPunchOut() {
        Employee employee = new Employee();

        employee.punchIn(9);
        employee.punchOut(17);

        assertEquals(8.0, employee.getHoursWorked(), 0.001);
        assertFalse(employee.isPunchedOut());
    }
}
