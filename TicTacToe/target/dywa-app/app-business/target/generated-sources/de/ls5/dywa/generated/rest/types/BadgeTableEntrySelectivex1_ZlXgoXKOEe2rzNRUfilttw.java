// generated by SelectiveGenerator#generate(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class BadgeTableEntrySelectivex1_ZlXgoXKOEe2rzNRUfilttw {

	public static void copy(
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry from,
		final de.ls5.dywa.generated.rest.types.TableEntry to,
		final info.scce.dime.rest.ObjectCache objectCache) {
	
	
	
		if (objectCache.containsSelective(to, "BadgeTableEntrySelectivex1_ZlXgoXKOEe2rzNRUfilttw")) {
			return;
		}
	
		to.setDywaId(from.getDywaId());
		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());
	
		// put to cache, after id has been set
		objectCache.putSelective(to, "BadgeTableEntrySelectivex1_ZlXgoXKOEe2rzNRUfilttw");
	
		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.TableEntry effectiveTo = to;
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryState
		 source = effectiveFrom.getentryState();
		if (source != null) {
			// original selective: BadgeEntryStateSelectivex1x1x1_ZlXgoXKOEe2rzNRUfilttw
			de.ls5.dywa.generated.rest.types.EntryState cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.EntryState.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "BadgeEntryStateSelectivex1x1x1_ZlXgoXKOEe2rzNRUfilttw")) {
				de.ls5.dywa.generated.rest.types.BadgeEntryStateSelectivex1x1x1_ZlXgoXKOEe2rzNRUfilttw.copy(source, cached, objectCache);
			}
		
			effectiveTo.setentryState(cached);
		}
		}
	}
}
