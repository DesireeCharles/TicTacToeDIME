package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Leaderboard extends info.scce.dime.rest.RESTBaseType  {

	java.lang.Long
	 getxWins();
	boolean isxWinsSet();

	void setxWins(final java.lang.Long
	 xWins);
	java.lang.Long
	 getoWins();
	boolean isoWinsSet();

	void setoWins(final java.lang.Long
	 oWins);

	public static Leaderboard fromDywaEntity(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Leaderboard result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Leaderboard) {
			result = new de.ls5.dywa.generated.rest.types.LeaderboardImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
