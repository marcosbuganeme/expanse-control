package br.com.expanse.control.core.model;

import br.com.expanse.control.core.model.shared.AbstractModel;

import java.math.BigDecimal;
import java.util.Objects;

public class Expense extends AbstractModel<Long> {

    private Budget budget;
    private String name;
    private BigDecimal cost;

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Expense expense)) return false;
        return Objects.equals(getBudget(), expense.getBudget()) && Objects.equals(getName(), expense.getName()) && Objects.equals(getCost(), expense.getCost());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBudget(), getName(), getCost());
    }

    @Override
    public String toString() {
        return "Expense{" +
                "budget=" + budget +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}