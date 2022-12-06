// generated by info.scce.dime.generator.rest.SelectiveControllerGenerator
package de.ls5.dywa.generated.rest.controller;

@javax.transaction.Transactional
@javax.enterprise.context.RequestScoped
public class EntryStateREST {

	@javax.inject.Inject
	private info.scce.dime.rest.ObjectCache objectCache;
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController DomainFileController;
	
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.EntryStateREST EntryStateREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.EntryStateController EntryStateController;


	
	public de.ls5.dywa.generated.rest.types.EntryState read_BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw(final long id) {
		
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState obj = this.EntryStateController.read(id);
		
		if (obj == null) {
			return null;
		}

		de.ls5.dywa.generated.rest.types.EntryState result = objectCache.getRestTo(obj);
		
		if (result == null) {
			result = de.ls5.dywa.generated.rest.types.EntryState.fromDywaEntity(obj, objectCache);
		}
		
		if (!objectCache.containsSelective(result, "BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw")) {
			de.ls5.dywa.generated.rest.types.BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw.copy(obj, result, objectCache);
		}

		return result;
	}

	public de.ls5.dywa.generated.rest.types.EntryState readTransient_BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw(final de.ls5.dywa.generated.rest.types.EntryState obj) {

		final de.ls5.dywa.generated.rest.types.EntryState result;
		
		if (this.objectCache.containsSelective(obj, "BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw")) {
			return obj;
		}
		else {
			result = obj;
			this.objectCache.putSelective(obj, "BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw");
		}

		// Update references to persistent objects

		return result;
	}

		public java.util.Set<de.ls5.dywa.generated.rest.types.EntryState> readAll_BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw() {
			
			final java.util.Set<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState> objs =
			new java.util.HashSet<>(java.util.Arrays.asList(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState.values()));
	
			final java.util.Set<de.ls5.dywa.generated.rest.types.EntryState> result = new java.util.HashSet<>();

			for (final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState s : objs) {
				de.ls5.dywa.generated.rest.types.EntryState cached = objectCache.getRestTo(s);
				
				if (cached == null) {
					cached = de.ls5.dywa.generated.rest.types.EntryState.fromDywaEntity(s, objectCache);
				}
				
				if (!objectCache.containsSelective(cached, "BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw")) {
					de.ls5.dywa.generated.rest.types.BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw.copy(s, cached, objectCache);
				}

				result.add(cached);
			}
			
			return result;
		}


	public void update_BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw(final de.ls5.dywa.generated.rest.types.EntryState value) {

		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState obj = this.EntryStateController.read(value.getDywaId());
		
		this.update_BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw(value, obj);
	}

	public void update_BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw(final de.ls5.dywa.generated.rest.types.EntryState value, final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState obj) {

		// for updates, consider a special selective so we don't clash with read-operations
		if (this.objectCache.containsSelective(obj, "BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw")) {
			// We are already getting updated by someone else
			return;
		}
		else {
			// we don't care for the actual value. key alone is sufficient enough for detection of cycles
			this.objectCache.putSelective(obj, "BadgeEntryStateSelectivex1x2x2_ZlXgoXKOEe2rzNRUfilttw");
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

	}
	public void update_EntryStateSelective(final de.ls5.dywa.generated.rest.types.EntryState value) {

		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState obj = this.EntryStateController.read(value.getDywaId());
		
		this.update_EntryStateSelective(value, obj);
	}

	public void update_EntryStateSelective(final de.ls5.dywa.generated.rest.types.EntryState value, final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState obj) {

		// for updates, consider a special selective so we don't clash with read-operations
		if (this.objectCache.containsSelective(obj, "EntryStateSelective")) {
			// We are already getting updated by someone else
			return;
		}
		else {
			// we don't care for the actual value. key alone is sufficient enough for detection of cycles
			this.objectCache.putSelective(obj, "EntryStateSelective");
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

		{
			final de.ls5.dywa.generated.rest.types.EntryState effectiveValue = value;
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState effectiveObj = obj;

		// If values were not specified, ignore them
		if (effectiveValue.isdywaDisplayNameSet()) {
			checkVersion(value, obj);
			effectiveObj.setdywaDisplayName(effectiveValue.getdywaDisplayName());
		}
	}
	}


	private void checkVersion(final de.ls5.dywa.generated.rest.types.EntryState value, final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState obj) {
		if (value.isDywaVersionSet() && value.getDywaVersion() != obj.getDywaVersion()) {
			throw new javax.persistence.OptimisticLockException(obj.getDywaName() + '[' + obj.getDywaId() + "] has been updated by other transaction");
		}
	}
}
