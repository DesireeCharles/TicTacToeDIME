package de.ls5.dywa.generated.util;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EnumMapping {

    @Id
    private long enumId;

    private long objectId;

    public EnumMapping() {}

    public EnumMapping(long enumId, long objectId) {
    this.enumId = enumId;
    this.objectId = objectId;
    }

    public long getEnumId() {
    return enumId;
    }

    public void setEnumId(long enumId) {
    this.enumId = enumId;
    }

    public long getObjectId() {
    return objectId;
    }

    public void setObjectId(long objectId) {
    this.objectId = objectId;
    }
}
