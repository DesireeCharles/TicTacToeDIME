package de.ls5.dywa.generated.util;

public class TypeInfo {
	private static java.util.Map<Long, java.lang.Class<?>> idToClassMap = new java.util.HashMap<>();
	private static java.util.Map<Long, java.util.Map<Long, String>> typeFieldNamesMap = new java.util.HashMap<>();
	private static java.util.Map<Long, String> typeNamesMap = new java.util.HashMap<>();
	private static java.util.Set<Long> enumTypes = new java.util.HashSet<>();
	private static java.util.Set<Long> allTypes = new java.util.HashSet<>();
	
	static {
		/* DBType _dh6bymwneewzvvv */
		typeNamesMap.put(0L, "ConcreteUser");
		idToClassMap.put(0L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUserImpl.class);
		allTypes.add(0L);
		java.util.Map<Long, String> map0 = new java.util.HashMap<Long, String>();
		map0.put(8L, "baseUser");
		map0.put(9L, "dywaSwitchedTo");
		typeFieldNamesMap.put(0L, map0);
		/* DBType _udys4mwneewzvvv */
		typeNamesMap.put(1L, "BaseUser");
		idToClassMap.put(1L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUserImpl.class);
		allTypes.add(1L);
		java.util.Map<Long, String> map1 = new java.util.HashMap<Long, String>();
		map1.put(10L, "concreteUser");
		map1.put(11L, "password");
		map1.put(12L, "image");
		map1.put(13L, "firstName");
		map1.put(14L, "lastName");
		map1.put(15L, "username");
		typeFieldNamesMap.put(1L, map1);
		/* DBType _jgykuw8qee2x_c6 */
		typeNamesMap.put(2L, "Table");
		idToClassMap.put(2L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableImpl.class);
		allTypes.add(2L);
		java.util.Map<Long, String> map2 = new java.util.HashMap<Long, String>();
		map2.put(16L, "tableRow");
		map2.put(17L, "turnState");
		map2.put(18L, "gameState");
		map2.put(19L, "moveCounter");
		map2.put(20L, "isWin");
		typeFieldNamesMap.put(2L, map2);
		/* DBType _j1likw8qee2x_c6 */
		typeNamesMap.put(3L, "TableRow");
		idToClassMap.put(3L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableRowImpl.class);
		allTypes.add(3L);
		java.util.Map<Long, String> map3 = new java.util.HashMap<Long, String>();
		map3.put(21L, "tableEntry");
		typeFieldNamesMap.put(3L, map3);
		/* DBType _kekm0w8qee2x_c6 */
		typeNamesMap.put(4L, "TableEntry");
		idToClassMap.put(4L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableEntryImpl.class);
		allTypes.add(4L);
		java.util.Map<Long, String> map4 = new java.util.HashMap<Long, String>();
		map4.put(22L, "value");
		map4.put(23L, "entryState");
		typeFieldNamesMap.put(4L, map4);
		/* DBType _m_tgwhkpee2rznr */
		typeNamesMap.put(5L, "EntryState");
		idToClassMap.put(5L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.EntryStateEntity.class);
		enumTypes.add(5L);
		allTypes.add(5L);
		java.util.Map<Long, String> map5 = new java.util.HashMap<Long, String>();
		map5.put(24L, "X");
		map5.put(25L, "O");
		map5.put(26L, "empty");
		map5.put(27L, "empty_dis");
		map5.put(28L, "dywaDisplayName");
		typeFieldNamesMap.put(5L, map5);
		/* DBType _x66fwxpoee2egku */
		typeNamesMap.put(6L, "TurnState");
		idToClassMap.put(6L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TurnStateEntity.class);
		enumTypes.add(6L);
		allTypes.add(6L);
		java.util.Map<Long, String> map6 = new java.util.HashMap<Long, String>();
		map6.put(29L, "X");
		map6.put(30L, "O");
		map6.put(31L, "dywaDisplayName");
		typeFieldNamesMap.put(6L, map6);
		/* DBType _rgqfqx0oee2_uri */
		typeNamesMap.put(7L, "GameState");
		idToClassMap.put(7L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.GameStateEntity.class);
		enumTypes.add(7L);
		allTypes.add(7L);
		java.util.Map<Long, String> map7 = new java.util.HashMap<Long, String>();
		map7.put(32L, "win");
		map7.put(33L, "tie");
		map7.put(34L, "progress");
		map7.put(35L, "dywaDisplayName");
		typeFieldNamesMap.put(7L, map7);
	}
	
	public static String getGeneratedClassName(Long typeId) {
		java.lang.Class<?> clazz =  idToClassMap.get(typeId);
		return clazz != null ? clazz.getName() : null;
	}
	
	public static java.lang.Class<?> getGeneratedClass(Long typeId) {
		return idToClassMap.get(typeId);
	}
	
	public static java.util.Collection<Class<?>> getAllGeneratedClasses() {
		return idToClassMap.values();
	}
	
	public static java.util.List<String> getAllGeneratedClassNames() {
		return idToClassMap.values().stream().map(Class::getName).collect(java.util.stream.Collectors.toList());
	}
	
	public static boolean isEnumerable(Long id) {
		return enumTypes.contains(id);
	}
	
	public static boolean typeInUse(Long typeId) {
		return allTypes.contains(typeId);
	}
	
	public static java.util.Map<Long, String> getTypeFieldNames(Long typeId) {
		return typeFieldNamesMap.get(typeId);
	}
	
	public static String getTypeName(Long id) {
		return typeNamesMap.get(id);
	}
}
