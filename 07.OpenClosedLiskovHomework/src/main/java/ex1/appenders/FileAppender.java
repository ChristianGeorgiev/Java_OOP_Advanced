package main.java.ex1.appenders;

import main.java.ex1.ReportLevel;
import main.java.ex1.contracts.Layout;
import main.java.ex1.contracts.File;

public class FileAppender extends BaseAppender {
    private File file;

    public FileAppender(Layout layout) {
        super(layout);
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        super.setReportLevel(reportLevel);
    }

    @Override
    public void append(String timeAndDate, ReportLevel reportLevel, String errorMessage) {
        if (super.getReportLevel() != null || super.getReportLevel().ordinal() <= reportLevel.ordinal()) {
            this.file.write(super.getLayout().getFormattedMessage(timeAndDate,
                    reportLevel.name(),
                    errorMessage));
        }

        if (super.getReportLevel() == null){
            this.file.write(super.getLayout().getFormattedMessage(timeAndDate,
                    reportLevel.name(),
                    errorMessage));
        }
    }
}
