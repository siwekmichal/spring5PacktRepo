package org.packt.dissect.mvc.model.data;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;

@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class SalaryGrade {
    private String grade;
    private Double rate;
    private Date date;

    public SalaryGrade() {
        this.date = new Date();
    }

    public String getGrade() { return grade; }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getInstantiatedDate(){ return getDate(); }
}
