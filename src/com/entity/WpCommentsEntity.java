package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wp_comments", schema = "orzzone", catalog = "")
public class WpCommentsEntity {
    private long commentId;
    private long commentPostId;
    private Object commentAuthor;
    private String commentAuthorEmail;
    private String commentAuthorUrl;
    private String commentAuthorIp;
    private Timestamp commentDate;
    private Timestamp commentDateGmt;
    private String commentContent;
    private int commentKarma;
    private String commentApproved;
    private String commentAgent;
    private String commentType;
    private long commentParent;
    private long userId;
    private byte commentMailNotify;

    @Id
    @Column(name = "comment_ID", nullable = false)
    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "comment_post_ID", nullable = false)
    public long getCommentPostId() {
        return commentPostId;
    }

    public void setCommentPostId(long commentPostId) {
        this.commentPostId = commentPostId;
    }

    @Basic
    @Column(name = "comment_author", nullable = false, length = -1)
    public Object getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(Object commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    @Basic
    @Column(name = "comment_author_email", nullable = false, length = 100)
    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail;
    }

    @Basic
    @Column(name = "comment_author_url", nullable = false, length = 200)
    public String getCommentAuthorUrl() {
        return commentAuthorUrl;
    }

    public void setCommentAuthorUrl(String commentAuthorUrl) {
        this.commentAuthorUrl = commentAuthorUrl;
    }

    @Basic
    @Column(name = "comment_author_IP", nullable = false, length = 100)
    public String getCommentAuthorIp() {
        return commentAuthorIp;
    }

    public void setCommentAuthorIp(String commentAuthorIp) {
        this.commentAuthorIp = commentAuthorIp;
    }

    @Basic
    @Column(name = "comment_date", nullable = false)
    public Timestamp getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Timestamp commentDate) {
        this.commentDate = commentDate;
    }

    @Basic
    @Column(name = "comment_date_gmt", nullable = false)
    public Timestamp getCommentDateGmt() {
        return commentDateGmt;
    }

    public void setCommentDateGmt(Timestamp commentDateGmt) {
        this.commentDateGmt = commentDateGmt;
    }

    @Basic
    @Column(name = "comment_content", nullable = false, length = -1)
    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    @Basic
    @Column(name = "comment_karma", nullable = false)
    public int getCommentKarma() {
        return commentKarma;
    }

    public void setCommentKarma(int commentKarma) {
        this.commentKarma = commentKarma;
    }

    @Basic
    @Column(name = "comment_approved", nullable = false, length = 20)
    public String getCommentApproved() {
        return commentApproved;
    }

    public void setCommentApproved(String commentApproved) {
        this.commentApproved = commentApproved;
    }

    @Basic
    @Column(name = "comment_agent", nullable = false, length = 255)
    public String getCommentAgent() {
        return commentAgent;
    }

    public void setCommentAgent(String commentAgent) {
        this.commentAgent = commentAgent;
    }

    @Basic
    @Column(name = "comment_type", nullable = false, length = 20)
    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    @Basic
    @Column(name = "comment_parent", nullable = false)
    public long getCommentParent() {
        return commentParent;
    }

    public void setCommentParent(long commentParent) {
        this.commentParent = commentParent;
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
    @Column(name = "comment_mail_notify", nullable = false)
    public byte getCommentMailNotify() {
        return commentMailNotify;
    }

    public void setCommentMailNotify(byte commentMailNotify) {
        this.commentMailNotify = commentMailNotify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WpCommentsEntity that = (WpCommentsEntity) o;
        return commentId == that.commentId &&
                commentPostId == that.commentPostId &&
                commentKarma == that.commentKarma &&
                commentParent == that.commentParent &&
                userId == that.userId &&
                commentMailNotify == that.commentMailNotify &&
                Objects.equals(commentAuthor, that.commentAuthor) &&
                Objects.equals(commentAuthorEmail, that.commentAuthorEmail) &&
                Objects.equals(commentAuthorUrl, that.commentAuthorUrl) &&
                Objects.equals(commentAuthorIp, that.commentAuthorIp) &&
                Objects.equals(commentDate, that.commentDate) &&
                Objects.equals(commentDateGmt, that.commentDateGmt) &&
                Objects.equals(commentContent, that.commentContent) &&
                Objects.equals(commentApproved, that.commentApproved) &&
                Objects.equals(commentAgent, that.commentAgent) &&
                Objects.equals(commentType, that.commentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, commentPostId, commentAuthor, commentAuthorEmail, commentAuthorUrl, commentAuthorIp, commentDate, commentDateGmt, commentContent, commentKarma, commentApproved, commentAgent, commentType, commentParent, userId, commentMailNotify);
    }
}
