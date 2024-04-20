package br.com.expanse.control.core.model;

import br.com.expanse.control.core.model.shared.AbstractModel;

import java.math.BigDecimal;
import java.util.Objects;

public class Budget extends AbstractModel<Long> {

    private User user;
    private SpendingCategory spendingCategory;
    private BigDecimal limitAmount;
    private BigDecimal alertThreshold;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SpendingCategory getSpendingCategory() {
        return spendingCategory;
    }

    public void setSpendingCategory(SpendingCategory spendingCategory) {
        this.spendingCategory = spendingCategory;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    public BigDecimal getAlertThreshold() {
        return alertThreshold;
    }

    public void setAlertThreshold(BigDecimal alertThreshold) {
        this.alertThreshold = alertThreshold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Budget budget)) return false;
        return Objects.equals(getUser(), budget.getUser()) && Objects.equals(getSpendingCategory(), budget.getSpendingCategory()) && Objects.equals(getLimitAmount(), budget.getLimitAmount()) && Objects.equals(getAlertThreshold(), budget.getAlertThreshold());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getSpendingCategory(), getLimitAmount(), getAlertThreshold());
    }

    @Override
    public String toString() {
        return "Budget{" +
                "user=" + user +
                ", spendingCategory=" + spendingCategory +
                ", limitAmount=" + limitAmount +
                ", alertThreshold=" + alertThreshold +
                '}';
    }
}
