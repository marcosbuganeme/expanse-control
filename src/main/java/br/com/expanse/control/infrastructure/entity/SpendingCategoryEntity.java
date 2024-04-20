package br.com.expanse.control.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Getter
@Setter
@Entity
@Table(name = "tb_spending_category")
public class SpendingCategoryEntity extends AbstractPersistable<Long> {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;
}