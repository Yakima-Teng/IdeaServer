package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wp_usermeta", schema = "orzzone", catalog = "")
public class WpUsermetaEntity {
    private long umetaId;
    private long userId;
    private String metaKey;
    private String metaValue;

    @Id
    @Column(name = "umeta_id", nullable = false)
    public long getUmetaId() {
        return umetaId;
    }

    public void setUmetaId(long umetaId) {
        this.umetaId = umetaId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
        WpUsermetaEntity that = (WpUsermetaEntity) o;
        return umetaId == that.umetaId &&
                userId == that.userId &&
                Objects.equals(metaKey, that.metaKey) &&
                Objects.equals(metaValue, that.metaValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(umetaId, userId, metaKey, metaValue);
    }
}
