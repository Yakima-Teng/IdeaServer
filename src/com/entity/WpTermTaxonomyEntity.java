package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wp_term_taxonomy", schema = "orzzone", catalog = "")
public class WpTermTaxonomyEntity {
    private long termTaxonomyId;
    private long termId;
    private String taxonomy;
    private String description;
    private long parent;
    private long count;

    @Id
    @Column(name = "term_taxonomy_id", nullable = false)
    public long getTermTaxonomyId() {
        return termTaxonomyId;
    }

    public void setTermTaxonomyId(long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
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
    @Column(name = "taxonomy", nullable = false, length = 32)
    public String getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    @Basic
    @Column(name = "description", nullable = false, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "parent", nullable = false)
    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }

    @Basic
    @Column(name = "count", nullable = false)
    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WpTermTaxonomyEntity that = (WpTermTaxonomyEntity) o;
        return termTaxonomyId == that.termTaxonomyId &&
                termId == that.termId &&
                parent == that.parent &&
                count == that.count &&
                Objects.equals(taxonomy, that.taxonomy) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(termTaxonomyId, termId, taxonomy, description, parent, count);
    }
}
