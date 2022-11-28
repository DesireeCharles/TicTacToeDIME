// generated by SelectiveGenerator#generateFullSelective(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class TableRowSelective {

	public static void copy(
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow from,
		final de.ls5.dywa.generated.rest.types.TableRow to,
		final info.scce.dime.rest.ObjectCache objectCache) {


		if (objectCache.containsSelective(to, "TableRowSelective")) {
			return;
		}

		to.setDywaId(from.getDywaId());

		// put to cache, after id has been set
		objectCache.putSelective(to, "TableRowSelective");

		// non-transient objects can be fetched completely from the DB
		if (from.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
			return;
		}

		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());

		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRow effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.TableRow effectiveTo = to;
		final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry>
		 source = effectiveFrom.gettableEntry_TableEntry();
		final java.util.List<de.ls5.dywa.generated.rest.types.TableEntry>
		 target = new java.util.ArrayList<>(source.size());
		
		for (final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntry
		 s : source) {
			// original selective: TableEntrySelective
			de.ls5.dywa.generated.rest.types.TableEntry cached = objectCache.getRestTo(s);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.TableEntry.fromDywaEntity(s, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "TableEntrySelective")) {
				de.ls5.dywa.generated.rest.types.TableEntrySelective.copy(s, cached, objectCache);
			}
		
			target.add(cached);
		}
		
		effectiveTo.settableEntry_TableEntry(target);
		}
	}
}
