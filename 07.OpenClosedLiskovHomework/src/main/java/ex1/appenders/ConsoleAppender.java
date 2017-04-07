package main.java.ex1.appenders;

import main.java.ex1.ReportLevel;
import main.java.ex1.contracts.Layout;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        super.setReportLevel(reportLevel);
    }


    @Override
    public void append(String timeAndDate, ReportLevel reportLevel, String errorMessage) {
        if (super.getReportLevel() != null && super.getReportLevel().ordinal() <= reportLevel.ordinal()) {
            System.out.println(super.getLayout().getFormattedMessage(timeAndDate,
                    reportLevel.name(),
                    errorMessage));
        }

        if (super.getReportLevel() == null){
            System.out.println(super.getLayout().getFormattedMessage(timeAndDate,
                    reportLevel.name(),
                    errorMessage));
        }
    }
}
