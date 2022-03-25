package co.com.sofka.mentoring35.model;

public class NumbersDTO {
    private Integer smallnumber;
    private Integer bignumber;
    private Integer columns;
    private int[] list;
    public Integer getSmallnumber() {
        return this.smallnumber;
    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public void setSmallnumber(Integer smallnumber) {
        this.smallnumber = smallnumber;
    }

    public Integer getBignumber() {
        return this.bignumber;
    }

    public void setBignumber(Integer bignumber) {
        this.bignumber = bignumber;
    }

    public Integer getColumns() {
        return this.columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }
 
}
