package co.com.sofka.mentoring35.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Number {
    private Date date;
    @Id
    private String id;

    private Integer bignumer;

   private Integer smallnumber;
   private Integer columns;
   private int [] todoarmado;


    public Date getDate() {
        return this.date;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBignumer() {
        return this.bignumer;
    }

    public void setBignumer(Integer bignumer) {
        this.bignumer = bignumer;
    }

    public Integer getSmallnumber() {
        return this.smallnumber;
    }

    public void setSmallnumber(Integer smallnumber) {
        this.smallnumber = smallnumber;
    }

    public int [] getTodoarmado() {
        return this.todoarmado;
    }

    public void setTodoarmado(int [] todoarmado) {
        this.todoarmado = todoarmado;
    }

    public Object save() {
        return null;
    }


    
}
