package br.com.expanse.control.core.model;

import br.com.expanse.control.core.model.shared.AbstractModel;

import java.math.BigDecimal;
import java.util.Objects;

public class Income extends AbstractModel<Long> {

    private Budget budget;
    private String name;
    private BigDecimal revenue;

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

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Income income)) return false;
        return Objects.equals(getBudget(), income.getBudget()) && Objects.equals(getName(), income.getName()) && Objects.equals(getRevenue(), income.getRevenue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBudget(), getName(), getRevenue());
    }

    @Override
    public String toString() {
        return "Income{" +
                "budget=" + budget +
                ", name='" + name + '\'' +
                ", revenue=" + revenue +
                '}';
    }
}
