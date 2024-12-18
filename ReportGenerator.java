package reports;

public class ReportGenerator {
    public void generateSummaryReport() {
        System.out.println("Generating Summary Report...");
        // Logic to aggregate and display summary data
    }

    public void generateMemberReport(int memberId) {
        System.out.println("Generating Member Report for ID: " + memberId);
        // Fetch and display data for the given member
    }

    public void generateProviderReport(int providerId) {
        System.out.println("Generating Provider Report for ID: " + providerId);
        // Fetch and display data for the given provider
    }

    public void generateProviderDirectory() {
        System.out.println("Generating Provider Directory...");
        // List all providers
    }
}

