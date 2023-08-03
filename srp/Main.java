
public class Main {
    public static void main(String[] args) {
        int[] leavesLeftPreviously = {10, 12, 8}; 
        Employee employee = new Employee(101, 5000.0, "samriddhi", "123 Main St", "Thane", "India", 5, leavesLeftPreviously);
        EmployeeHtmlFormatter formatter = new EmployeeHtmlFormatter();
        String html = formatter.toHtml(employee);
        System.out.println(html);
    }
}
