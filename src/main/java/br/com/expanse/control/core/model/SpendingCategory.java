package br.com.expanse.control.core.model;

import br.com.expanse.control.core.model.shared.AbstractModel;

import java.util.Objects;

public class SpendingCategory extends AbstractModel<Long> {

    private String name;
    private String description;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpendingCategory that = (SpendingCategory) o;
        return Objects.equals(this.getId(), that.getId()) && Objects.equals(name, that.name) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), name, description);
    }

    @Override
    public String toString() {
        return "SpendingCategory{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
