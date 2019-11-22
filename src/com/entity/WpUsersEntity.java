package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wp_users", schema = "orzzone", catalog = "")
public class WpUsersEntity {
    private long id;
    private String userLogin;
    private String userPass;
    private String userNicename;
    private String userEmail;
    private String userUrl;
    private Timestamp userRegistered;
    private String userActivationKey;
    private int userStatus;
    private String displayName;

    @Id
    @Column(name = "ID", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_login", nullable = false, length = 60)
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    @Basic
    @Column(name = "user_pass", nullable = false, length = 255)
    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Basic
    @Column(name = "user_nicename", nullable = false, length = 50)
    public String getUserNicename() {
        return userNicename;
    }

    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename;
    }

    @Basic
    @Column(name = "user_email", nullable = false, length = 100)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_url", nullable = false, length = 100)
    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    @Basic
    @Column(name = "user_registered", nullable = false)
    public Timestamp getUserRegistered() {
        return userRegistered;
    }

    public void setUserRegistered(Timestamp userRegistered) {
        this.userRegistered = userRegistered;
    }

    @Basic
    @Column(name = "user_activation_key", nullable = false, length = 255)
    public String getUserActivationKey() {
        return userActivationKey;
    }

    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey;
    }

    @Basic
    @Column(name = "user_status", nullable = false)
    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    @Basic
    @Column(name = "display_name", nullable = false, length = 250)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WpUsersEntity that = (WpUsersEntity) o;
        return id == that.id &&
                userStatus == that.userStatus &&
                Objects.equals(userLogin, that.userLogin) &&
                Objects.equals(userPass, that.userPass) &&
                Objects.equals(userNicename, that.userNicename) &&
                Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(userUrl, that.userUrl) &&
                Objects.equals(userRegistered, that.userRegistered) &&
                Objects.equals(userActivationKey, that.userActivationKey) &&
                Objects.equals(displayName, that.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userLogin, userPass, userNicename, userEmail, userUrl, userRegistered, userActivationKey, userStatus, displayName);
    }
}
