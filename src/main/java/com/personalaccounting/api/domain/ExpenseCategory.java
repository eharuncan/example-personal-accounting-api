package com.personalaccounting.api.domain;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "expenseCategories")
public class ExpenseCategory {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private Long userId;
    private String name;

    public ExpenseCategory() {}

    public ExpenseCategory(Long userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof ExpenseCategory))
            return false;
        ExpenseCategory expenseCategory = (ExpenseCategory) o;
        return Objects.equals(this.id, expenseCategory.id)
                && Objects.equals(this.userId, expenseCategory.userId)
                && Objects.equals(this.name, expenseCategory.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.userId, this.name);
    }

    @Override
    public String toString() {
        return "ExpenseCategory{" + "id=" + this.id + ", userId='" + this.userId + '\'' + ", name='" + this.name + '\'' + ", amount='" + '\'' + '}';
    }
}
