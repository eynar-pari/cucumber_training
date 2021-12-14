package localReport;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.checkerframework.checker.units.qual.C;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LocalReport {

    public static void main(String[]args) throws InterruptedException {
        Thread.sleep(6000);
        String path=new File("").getAbsolutePath()+"\\build\\reports\\cucumber\\";
        File report= new File(path+"NybbleGroupReport");

        List<String>jsons= new ArrayList<>();
        jsons.add(path+"report.json");

        Configuration configuration= new Configuration(report,"Training Cucumber");
        configuration.setBuildNumber("v001");
        configuration.addClassifications("OS","Windows");
        configuration.addClassifications("Branch","Sanity");
        configuration.addClassifications("Report","Local");

        ReportBuilder reportBuilder= new ReportBuilder(jsons,configuration);
        reportBuilder.generateReports();

    }
}
