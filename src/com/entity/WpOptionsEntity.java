package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wp_options", schema = "orzzone", catalog = "")
public class WpOptionsEntity {
    private long optionId;
    private String optionName;
    private String optionValue;
    private String autoload;

    @Id
    @Column(name = "option_id", nullable = false)
    public long getOptionId() {
        return optionId;
    }

    public void setOptionId(long optionId) {
        this.optionId = optionId;
    }

    @Basic
    @Column(name = "option_name", nullable = false, length = 191)
    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    @Basic
    @Column(name = "option_value", nullable = false, length = -1)
    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    @Basic
    @Column(name = "autoload", nullable = false, length = 20)
    public String getAutoload() {
        return autoload;
    }

    public void setAutoload(String autoload) {
        this.autoload = autoload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WpOptionsEntity that = (WpOptionsEntity) o;
        return optionId == that.optionId &&
                Objects.equals(optionName, that.optionName) &&
                Objects.equals(optionValue, that.optionValue) &&
                Objects.equals(autoload, that.autoload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optionId, optionName, optionValue, autoload);
    }
}
