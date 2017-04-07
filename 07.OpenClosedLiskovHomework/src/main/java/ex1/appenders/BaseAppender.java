package main.java.ex1.appenders;

import main.java.ex1.ReportLevel;
import main.java.ex1.contracts.Appender;
import main.java.ex1.contracts.Layout;

public abstract class BaseAppender implements Appender {
    private Layout layout;
    private ReportLevel reportLevel;

    protected BaseAppender(Layout layout) {
        this.layout = layout;
    }

    protected Layout getLayout(){
        return this.layout;
    }

    public void setReportLevel(ReportLevel reportLevel){
        this.reportLevel = reportLevel;
    }

    public ReportLevel getReportLevel(){
        return this.reportLevel;
    }
}