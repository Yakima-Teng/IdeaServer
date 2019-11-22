package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wp_links", schema = "orzzone", catalog = "")
public class WpLinksEntity {
    private long linkId;
    private String linkUrl;
    private String linkName;
    private String linkImage;
    private String linkTarget;
    private String linkDescription;
    private String linkVisible;
    private long linkOwner;
    private int linkRating;
    private Timestamp linkUpdated;
    private String linkRel;
    private String linkNotes;
    private String linkRss;

    @Id
    @Column(name = "link_id", nullable = false)
    public long getLinkId() {
        return linkId;
    }

    public void setLinkId(long linkId) {
        this.linkId = linkId;
    }

    @Basic
    @Column(name = "link_url", nullable = false, length = 255)
    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    @Basic
    @Column(name = "link_name", nullable = false, length = 255)
    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    @Basic
    @Column(name = "link_image", nullable = false, length = 255)
    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    @Basic
    @Column(name = "link_target", nullable = false, length = 25)
    public String getLinkTarget() {
        return linkTarget;
    }

    public void setLinkTarget(String linkTarget) {
        this.linkTarget = linkTarget;
    }

    @Basic
    @Column(name = "link_description", nullable = false, length = 255)
    public String getLinkDescription() {
        return linkDescription;
    }

    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription;
    }

    @Basic
    @Column(name = "link_visible", nullable = false, length = 20)
    public String getLinkVisible() {
        return linkVisible;
    }

    public void setLinkVisible(String linkVisible) {
        this.linkVisible = linkVisible;
    }

    @Basic
    @Column(name = "link_owner", nullable = false)
    public long getLinkOwner() {
        return linkOwner;
    }

    public void setLinkOwner(long linkOwner) {
        this.linkOwner = linkOwner;
    }

    @Basic
    @Column(name = "link_rating", nullable = false)
    public int getLinkRating() {
        return linkRating;
    }

    public void setLinkRating(int linkRating) {
        this.linkRating = linkRating;
    }

    @Basic
    @Column(name = "link_updated", nullable = false)
    public Timestamp getLinkUpdated() {
        return linkUpdated;
    }

    public void setLinkUpdated(Timestamp linkUpdated) {
        this.linkUpdated = linkUpdated;
    }

    @Basic
    @Column(name = "link_rel", nullable = false, length = 255)
    public String getLinkRel() {
        return linkRel;
    }

    public void setLinkRel(String linkRel) {
        this.linkRel = linkRel;
    }

    @Basic
    @Column(name = "link_notes", nullable = false, length = -1)
    public String getLinkNotes() {
        return linkNotes;
    }

    public void setLinkNotes(String linkNotes) {
        this.linkNotes = linkNotes;
    }

    @Basic
    @Column(name = "link_rss", nullable = false, length = 255)
    public String getLinkRss() {
        return linkRss;
    }

    public void setLinkRss(String linkRss) {
        this.linkRss = linkRss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WpLinksEntity that = (WpLinksEntity) o;
        return linkId == that.linkId &&
                linkOwner == that.linkOwner &&
                linkRating == that.linkRating &&
                Objects.equals(linkUrl, that.linkUrl) &&
                Objects.equals(linkName, that.linkName) &&
                Objects.equals(linkImage, that.linkImage) &&
                Objects.equals(linkTarget, that.linkTarget) &&
                Objects.equals(linkDescription, that.linkDescription) &&
                Objects.equals(linkVisible, that.linkVisible) &&
                Objects.equals(linkUpdated, that.linkUpdated) &&
                Objects.equals(linkRel, that.linkRel) &&
                Objects.equals(linkNotes, that.linkNotes) &&
                Objects.equals(linkRss, that.linkRss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkId, linkUrl, linkName, linkImage, linkTarget, linkDescription, linkVisible, linkOwner, linkRating, linkUpdated, linkRel, linkNotes, linkRss);
    }
}
