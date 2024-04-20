package br.com.expanse.control.core.model.shared;

import java.io.Serializable;

public abstract class AbstractModel<PK extends Serializable> implements Serializable {
    private PK id;

    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }
}
