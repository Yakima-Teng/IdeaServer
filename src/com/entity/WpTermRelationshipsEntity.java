package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wp_term_relationships", schema = "orzzone", catalog = "")
@IdClass(WpTermRelationshipsEntityPK.class)
public class WpTermRelationshipsEntity {
    private long objectId;
    private long termTaxonomyId;
    private int termOrder;

    @Id
    @Column(name = "object_id", nullable = false)
    public long getObjectId() {
        return objectId;
    }

    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }

    @Id
    @Column(name = "term_taxonomy_id", nullable = false)
    public long getTermTaxonomyId() {
        return termTaxonomyId;
    }

    public void setTermTaxonomyId(long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }

    @Basic
    @Column(name = "term_order", nullable = false)
    public int getTermOrder() {
        return termOrder;
    }

    public void setTermOrder(int termOrder) {
        this.termOrder = termOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WpTermRelationshipsEntity that = (WpTermRelationshipsEntity) o;
        return objectId == that.objectId &&
                termTaxonomyId == that.termTaxonomyId &&
                termOrder == that.termOrder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, termTaxonomyId, termOrder);
    }
}
