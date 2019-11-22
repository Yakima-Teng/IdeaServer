package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wp_terms", schema = "orzzone", catalog = "")
public class WpTermsEntity {
    private long termId;
    private String name;
    private String slug;
    private long termGroup;

    @Id
    @Column(name = "term_id", nullable = false)
    public long getTermId() {
        return termId;
    }

    public void setTermId(long termId) {
        this.termId = termId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "slug", nullable = false, length = 200)
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Basic
    @Column(name = "term_group", nullable = false)
    public long getTermGroup() {
        return termGroup;
    }

    public void setTermGroup(long termGroup) {
        this.termGroup = termGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WpTermsEntity that = (WpTermsEntity) o;
        return termId == that.termId &&
                termGroup == that.termGroup &&
                Objects.equals(name, that.name) &&
                Objects.equals(slug, that.slug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(termId, name, slug, termGroup);
    }
}
