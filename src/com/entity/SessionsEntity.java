package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sessions", schema = "orzzone", catalog = "")
public class SessionsEntity {
    private String sessionId;
    private int expires;
    private String data;

    @Id
    @Column(name = "session_id", nullable = false, length = 128)
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Basic
    @Column(name = "expires", nullable = false)
    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    @Basic
    @Column(name = "data", nullable = true, length = -1)
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SessionsEntity that = (SessionsEntity) o;
        return expires == that.expires &&
                Objects.equals(sessionId, that.sessionId) &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, expires, data);
    }
}
