package com.Fortune500.Guohao_Frank_Wu.entity;

import lombok.*;

import javax.persistence.*;

//Employee Entity
@Entity //This will let Java know that this is an entity that we are going to map to a database table.
@Table(name = "company") //This is for the actual name of the database table we are mapping to the class.
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//@ToString

public class company {
    //defined field
    @Id //This will map the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This will auto increment your primary key
    @Column(name = "orders") //This is mapping the primary key to the id column in the table.
    private int orders;

    @Column(name = "rank") //This will map the rank field to the column named rank in the table.
    private int rank;

    @Column(name = "conpany") //This will map the companyName field to the column named conmany in the table.
    private String companyName;

    @Column(name = "revenue") //This will map the revenue field to the column named revenue in the table.
    private double revenue;

    @Column(name = "profit") //This will map the profit field to the column named profit in the table.
    private double profit;

    @Column(name = "year") //This will map the year field to the column named year in the table.
    private int year;

    //default constructor
    public company(){

    }

    //para constructor
    public company(int rank, String name, double revenue, double profit, int year){
        this.rank = rank;
        this.companyName = name;
        this.revenue = revenue;
        this.profit =profit;
        this.year = year;
    }


}
