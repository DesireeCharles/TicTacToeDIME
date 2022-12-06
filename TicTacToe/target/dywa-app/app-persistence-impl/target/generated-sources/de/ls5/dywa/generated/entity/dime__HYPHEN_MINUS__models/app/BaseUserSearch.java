/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;

public class BaseUserSearch implements BaseUser {
	private static final com.google.common.collect.BiMap<Long, String> dywaIdToJpqlAttr = com.google.common.collect.HashBiMap.create();
	private final java.util.Map<String, Object> attributeMap = new java.util.HashMap<>();
	private final java.util.Map<String, java.util.List> listAttributeMap = new java.util.HashMap<>();
	private java.lang.String searchObjectName;

	/**XXX: remove after benchmark is done*/
	private final boolean fromSuper;
	
	static {
		java.lang.Class<?> targetClass = BaseUserImpl.class;
		
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
	public BaseUserSearch() {
		this((java.lang.String  )null);
	}
	
	public BaseUserSearch(java.lang.String name) {
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
	public java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser> getconcreteUser_ConcreteUser() {
		return (java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser>) this.listAttributeMap.get(dywaIdToJpqlAttr.get(9L));
	}
	public void setconcreteUser_ConcreteUser
	(java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser> object) {
			
				for(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser p: object){
					 if (! (p instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser)) {
							throw new java.lang.RuntimeException("Wrong type");
				}
				}
			this.listAttributeMap.put(dywaIdToJpqlAttr.get(9L), object);
	}
	@java.lang.Override
	public java.lang.String getpassword() {
		return (java.lang.String) this.attributeMap.get(dywaIdToJpqlAttr.get(10L));
	}
	public void setpassword
	(java.lang.String object) {
			
				if (! (object instanceof java.lang.String)) {
							throw new java.lang.RuntimeException("Wrong type");
				}
			this.attributeMap.put(dywaIdToJpqlAttr.get(10L), object);
	}
	@java.lang.Override
	public de.ls5.dywa.generated.util.FileReference getimage() {
		return new de.ls5.dywa.generated.util.FileReference((de.ls5.dywa.generated.util.DomainFile) this.attributeMap.get(dywaIdToJpqlAttr.get(11L)));
	}
	public void setimage
	(de.ls5.dywa.generated.util.FileReference object) {
			
				if (! (object instanceof de.ls5.dywa.generated.util.FileReference)) {
							throw new java.lang.RuntimeException("Wrong type");
				}
			this.attributeMap.put(dywaIdToJpqlAttr.get(11L), object != null ? object.getDelegate() : null);
	}
	@java.lang.Override
	public java.lang.String getfirstName() {
		return (java.lang.String) this.attributeMap.get(dywaIdToJpqlAttr.get(12L));
	}
	public void setfirstName
	(java.lang.String object) {
			
				if (! (object instanceof java.lang.String)) {
							throw new java.lang.RuntimeException("Wrong type");
				}
			this.attributeMap.put(dywaIdToJpqlAttr.get(12L), object);
	}
	@java.lang.Override
	public java.lang.String getlastName() {
		return (java.lang.String) this.attributeMap.get(dywaIdToJpqlAttr.get(13L));
	}
	public void setlastName
	(java.lang.String object) {
			
				if (! (object instanceof java.lang.String)) {
							throw new java.lang.RuntimeException("Wrong type");
				}
			this.attributeMap.put(dywaIdToJpqlAttr.get(13L), object);
	}
	@java.lang.Override
	public java.lang.String getusername() {
		return (java.lang.String) this.attributeMap.get(dywaIdToJpqlAttr.get(14L));
	}
	public void setusername
	(java.lang.String object) {
			
				if (! (object instanceof java.lang.String)) {
							throw new java.lang.RuntimeException("Wrong type");
				}
			this.attributeMap.put(dywaIdToJpqlAttr.get(14L), object);
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
