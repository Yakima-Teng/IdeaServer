package com.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class WpTermRelationshipsEntityPK implements Serializable {
    private long objectId;
    private long termTaxonomyId;

    @Column(name = "object_id", nullable = false)
    @Id
    public long getObjectId() {
        return objectId;
    }

    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }

    @Column(name = "term_taxonomy_id", nullable = false)
    @Id
    public long getTermTaxonomyId() {
        return termTaxonomyId;
    }

    public void setTermTaxonomyId(long termTaxonomyId) {
        this.termTaxonomyId = termTaxonomyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WpTermRelationshipsEntityPK that = (WpTermRelationshipsEntityPK) o;
        return objectId == that.objectId &&
                termTaxonomyId == that.termTaxonomyId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, termTaxonomyId);
    }
}
