/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;

public class TableEntrySearch implements TableEntry {
	private static final com.google.common.collect.BiMap<Long, String> dywaIdToJpqlAttr = com.google.common.collect.HashBiMap.create();
	private final java.util.Map<String, Object> attributeMap = new java.util.HashMap<>();
	private final java.util.Map<String, java.util.List> listAttributeMap = new java.util.HashMap<>();
	private java.lang.String searchObjectName;

	/**XXX: remove after benchmark is done*/
	private final boolean fromSuper;
	
	static {
		java.lang.Class<?> targetClass = TableEntryImpl.class;
		
		// Scan attributes directly declared as fields
		for (java.lang.reflect.Field field : targetClass.getDeclaredFields()) {
			if (field.isAnnotationPresent(de.ls5.dywa.annotations.IdRef.class)) {
				dywaIdToJpqlAttr.put(field.getDeclaredAnnotation(de.ls5.dywa.annotations.IdRef.class).id(), field.getName());
			}
		}
		
		// Scan delegated attributes
		for (java.lang.reflect.Method method : targetClass.getDeclaredMethods()) {
			if (method.isAnnotationPresent(de.ls5.dywa.generated.util.Delegation.class)) {
				de.ls5.dywa.generated.util.Delegation annotation = method.getDeclaredAnnotation(de.ls5.dywa.generated.util.Delegation.class);
				java.lang.StringBuilder builder = new java.lang.StringBuilder(annotation.attributeName());
				Long fieldId = method.getDeclaredAnnotation(de.ls5.dywa.annotations.IdRef.class).id();
				boolean inheritanceAvailable;
				do {
					java.lang.Class<?> currentClass = annotation.attributeClass();
					try {
						java.lang.reflect.Method targetMethod = currentClass.getDeclaredMethod(method.getName(), method.getParameterTypes());
						if (inheritanceAvailable = targetMethod.isAnnotationPresent(de.ls5.dywa.generated.util.Delegation.class)) {
							annotation = targetMethod.getDeclaredAnnotation(de.ls5.dywa.generated.util.Delegation.class);
							builder.append('.').append(annotation.attributeName());
						} else { // declared in field: end of iterative search
							for (java.lang.reflect.Field field2 : currentClass.getDeclaredFields()) {
								if (field2.isAnnotationPresent(de.ls5.dywa.annotations.IdRef.class) && field2.getDeclaredAnnotation(de.ls5.dywa.annotations.IdRef.class).id() == fieldId) {
									builder.append('.').append(field2.getName());
									break;
								}
							}
						}
					} catch (java.lang.NoSuchMethodException e) {
						e.printStackTrace();
						break;
					}
				} while(inheritanceAvailable);
				
				dywaIdToJpqlAttr.put(method.getDeclaredAnnotation(de.ls5.dywa.annotations.IdRef.class).id(), builder.toString());
			}
			else if(targetClass.isInterface()){
				dywaIdToJpqlAttr.putIfAbsent(method.getDeclaredAnnotation(de.ls5.dywa.annotations.IdRef.class).id(), method.getDeclaredAnnotation(de.ls5.dywa.annotations.OriginalName.class).name());
			}
		}
	}
	public TableEntrySearch() {
		this((java.lang.String  )null);
	}
	
	public TableEntrySearch(java.lang.String name) {
		this.searchObjectName = name;
		this.fromSuper = false;
	}

	public final boolean isFromSuper(){
		return this.fromSuper;
	}
	
	public java.lang.String getSearchObjectName_() {
		return this.searchObjectName;
	}
	
	public void setSearchObjectName_(java.lang.String name) {
		this.searchObjectName = name;
	}

	public java.lang.String getDywaName() {
		return (java.lang.String) this.attributeMap.get("name_");
	}

	public void setDywaName(java.lang.String name) {
		this.attributeMap.put("name_", name);
	}

	public long getDywaId() {
		return (long) this.attributeMap.get("dywaId_");
	}

	public long getDywaVersion() {
		return (long) this.attributeMap.get("version");
	}

	public void setDywaVersion(long version) {
		this.attributeMap.put("version_", version);
	}

	@java.lang.Override
	public java.lang.String getvalue() {
		return (java.lang.String) this.attributeMap.get(dywaIdToJpqlAttr.get(18L));
	}
	public void setvalue
	(java.lang.String object) {
			
				if (! (object instanceof java.lang.String)) {
							throw new java.lang.RuntimeException("Wrong type");
				}
			this.attributeMap.put(dywaIdToJpqlAttr.get(18L), object);
	}
	@java.lang.Override
	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState getentryState() {
		return de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState.forId(((de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity) this.attributeMap.get(dywaIdToJpqlAttr.get(19L))).getDywaId());
	}
	public void setentryState
	(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState object) {
			
				if (! (object instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState)) {
							throw new java.lang.RuntimeException("Wrong type");
				}
			this.attributeMap.put(dywaIdToJpqlAttr.get(19L), object != null ? object.getEntityAs(EntryStateEntity.class)/*1*/ : null);
	}

	// EXTENSION ATTRIBUTES

	public java.util.Map<String, Object> queryAttributes() {
		return this.attributeMap;
	}
	
	public java.util.Map<String, java.util.List> queryListAttributes() {
		return this.listAttributeMap;
	}
	public Long getMappedIdFromKey(String key){
		 return dywaIdToJpqlAttr.inverse().get(key);
	}
}
