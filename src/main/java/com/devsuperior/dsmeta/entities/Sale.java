package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sellerName;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    

    public Sale(){

    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the sellerName
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * @param sellerName the sellerName to set
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    /**
     * @return Integer return the visited
     */
    public Integer getVisited() {
        return visited;
    }

    /**
     * @param visited the visited to set
     */
    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    /**
     * @return Integer return the deals
     */
    public Integer getDeals() {
        return deals;
    }

    /**
     * @param deals the deals to set
     */
    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    /**
     * @return Double return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return LocalDate return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

}
