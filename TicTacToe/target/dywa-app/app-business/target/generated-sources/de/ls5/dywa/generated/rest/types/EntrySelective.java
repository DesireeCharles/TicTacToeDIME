// generated by SelectiveGenerator#generateFullSelective(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class EntrySelective {

	public static void copy(
		final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Entry from,
		final de.ls5.dywa.generated.rest.types.Entry to,
		final info.scce.dime.rest.ObjectCache objectCache) {


		if (objectCache.containsSelective(to, "EntrySelective")) {
			return;
		}

		to.setDywaId(from.getDywaId());

		// put to cache, after id has been set
		objectCache.putSelective(to, "EntrySelective");

		// non-transient objects can be fetched completely from the DB
		if (from.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
			return;
		}

		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());

		{
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Entry effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Entry effectiveTo = to;
		effectiveTo.setcondition(effectiveFrom.getcondition());
		}
	}
}
