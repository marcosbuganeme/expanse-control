package br.com.expanse.control.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tb_budget")
public class BudgetEntity extends AbstractPersistable<Long> {

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "spending_category_id", nullable = false)
    private SpendingCategoryEntity spendingCategory;

    @Column(name = "limit_amount", nullable = false)
    private BigDecimal limitAmount;

    @Column(name = "alert_threshold", nullable = false)
    private BigDecimal alertThreshold;

    @OneToMany(mappedBy = "budget", fetch = FetchType.LAZY)
    private List<ExpenseEntity> expenses;

    @OneToMany(mappedBy = "budget", fetch = FetchType.LAZY)
    private List<IncomeEntity> incomes;
}