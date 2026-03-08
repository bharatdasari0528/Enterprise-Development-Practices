@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {
    // Audit fields: createdAt, createdBy, updatedAt, updatedBy, version
    // Soft delete support with isDeleted flag
}