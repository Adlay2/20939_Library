package Library.Model;
// Generated May 7, 2020 5:59:21 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Report generated by hbm2java
 */
public class Report  implements java.io.Serializable {


     private int reportnbr;
     private String option;
     private String bookname;
     private Date fromdate;
     private Date todate;

    public Report() {
    }

	
    public Report(int reportnbr) {
        this.reportnbr = reportnbr;
    }
    public Report(int reportnbr, String option, String bookname, Date fromdate, Date todate) {
       this.reportnbr = reportnbr;
       this.option = option;
       this.bookname = bookname;
       this.fromdate = fromdate;
       this.todate = todate;
    }
   
    public int getReportnbr() {
        return this.reportnbr;
    }
    
    public void setReportnbr(int reportnbr) {
        this.reportnbr = reportnbr;
    }
    public String getOption() {
        return this.option;
    }
    
    public void setOption(String option) {
        this.option = option;
    }
    public String getBookname() {
        return this.bookname;
    }
    
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public Date getFromdate() {
        return this.fromdate;
    }
    
    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }
    public Date getTodate() {
        return this.todate;
    }
    
    public void setTodate(Date todate) {
        this.todate = todate;
    }




}


