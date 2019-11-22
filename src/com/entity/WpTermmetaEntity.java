package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wp_termmeta", schema = "orzzone", catalog = "")
public class WpTermmetaEntity {
    private long metaId;
    private long termId;
    private String metaKey;
    private String metaValue;

    @Id
    @Column(name = "meta_id", nullable = false)
    public long getMetaId() {
        return metaId;
    }

    public void setMetaId(long metaId) {
        this.metaId = metaId;
    }

    @Basic
    @Column(name = "term_id", nullable = false)
    public long getTermId() {
        return termId;
    }

    public void setTermId(long termId) {
        this.termId = termId;
    }

    @Basic
    @Column(name = "meta_key", nullable = true, length = 255)
    public String getMetaKey() {
        return metaKey;
    }

    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    @Basic
    @Column(name = "meta_value", nullable = true, length = -1)
    public String getMetaValue() {
        return metaValue;
    }

    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WpTermmetaEntity that = (WpTermmetaEntity) o;
        return metaId == that.metaId &&
                termId == that.termId &&
                Objects.equals(metaKey, that.metaKey) &&
                Objects.equals(metaValue, that.metaValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metaId, termId, metaKey, metaValue);
    }
}
