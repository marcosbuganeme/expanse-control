package br.com.expanse.control.infrastructure.entity;

import br.com.expanse.control.core.model.Budget;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tb_expense")
public class ExpenseEntity extends AbstractPersistable<Long> {

    @ManyToOne()
    @JoinColumn(name = "budget_id", nullable = false)
    private BudgetEntity budget;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal cost;
}