/* generated by info.scce.dime.generator.scheme.ControllerGenerator */
package de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app;

import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Row;
import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.RowImpl;
import de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.RowSearch;

import java.util.Arrays;
import java.util.stream.Collectors;

@javax.enterprise.context.RequestScoped
public class RowControllerImpl implements RowController {
	private static final org.slf4j.Logger LOGGER =  org.slf4j.LoggerFactory.getLogger(RowController.class);

	@javax.persistence.PersistenceContext
	private javax.persistence.EntityManager entityManager;

	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;

@javax.inject.Inject //referenceMap
private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.TableController tableController;

    
    @Override
	public Row read(final java.lang.Long id) {

		 Row result = entityManager.find(RowImpl.class, id);
		 	// delegate read until entity is found;
		return result;
	}

    @Override
	public java.util.List<Row> findByProperties(Row searchObject) {
		if (searchObject instanceof RowSearch) {
			RowSearch casted = (RowSearch) searchObject;

			java.util.List<Row> list = buildSimpleQuery(casted.queryAttributes(), casted.queryListAttributes(), true).getResultList().stream().map(Row::casted).collect(Collectors.toList());

			return list;
		} else {
			throw new java.lang.IllegalArgumentException("Search object required.");
		}
	}

	@Override
	public Row findFirstByProperties(Row searchObject) {
		if (searchObject instanceof RowSearch) {
			RowSearch casted = (RowSearch) searchObject;
			java.util.List<Row> results = new java.util.ArrayList<Row>();
			results.addAll(buildSimpleQuery(casted.queryAttributes(), casted.queryListAttributes(),false).setMaxResults(1).getResultList());
			return results.isEmpty() ? null : results.get(0);
		} else throw new java.lang.IllegalArgumentException("Search object required.");
	}

	@Override
	public java.util.Set<Row> fetch() {
		return new java.util.HashSet<Row>(buildSimpleQuery(null, null,false).getResultList());
	}

	@Override
	public java.util.Set<Row> fetchByName(final java.lang.String name) {
		java.util.Map<String, Object> map = new java.util.HashMap<>();
		map.put("name_", name);
		java.util.HashSet<Row> result = new java.util.HashSet<>(buildSimpleQuery(map, null,false).getResultList());
		return result;
	}

		@Override
		public Row create(java.lang.String name) {
			RowImpl entity = new RowImpl();
			entity.setDywaName(name);
			entityManager.persist(entity);
			return entity;
		}

		@Override
		public Row createTransient(java.lang.String name) {
			RowImpl entity = new RowImpl();
			entity.setDywaName(name);
			return entity;
		}

	@Override
	public Row createSearchObject(java.lang.String name) {
		return new RowSearch(name);
	}

	@Override
	public java.util.Set<Row> fetchWithSubtypes() {
		java.util.Set<Row> list = buildSimpleQuery(null,null, true).getResultList().stream().map(Row::casted).collect(Collectors.toSet());

		return list;
	}

	@Override
	public void delete(Row entity) {

		if (entity instanceof RowImpl) {
			RowImpl impl = (RowImpl) entity;
			entityManager.remove(impl);
		}
		// delegate delete
	}
	
	@Override
	public void deleteWithIncomingReferences(Row entityToDelete) {

		
		// Delete references from type Table
			de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table searchTable;
			searchTable = new de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.TableSearch();	
				searchTable.setrow_Row(java.util.Arrays.asList(entityToDelete));
			for (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Table queryResult : this.tableController.findByProperties(searchTable)) {
				queryResult.getrow_Row().remove(entityToDelete);
			}
		delete(entityToDelete);
	}
	
	private javax.persistence.TypedQuery<RowImpl> buildSimpleQuery(java.util.Map<String, Object> attributeMap, java.util.Map<String, java.util.List> listAttributeMap, boolean withInherited) {
		java.lang.StringBuilder queryStr = new java.lang.StringBuilder("SELECT e FROM RowImpl e WHERE (true="+withInherited+" OR e.inheritance_ = false)");
		if (attributeMap != null) {
			for (java.util.Map.Entry<String, Object> entry : attributeMap.entrySet()) {
				queryStr.append(" AND e." + entry.getKey() + " = :" + entry.getKey().replaceAll("\\W", ""));
			}
		}
		if (listAttributeMap != null) {
			for (java.util.Map.Entry<String, java.util.List> entry : listAttributeMap.entrySet()) {
				if (entry.getValue() == null || entry.getValue().isEmpty()) {
					queryStr.append(" AND e." + entry.getKey() + " IS EMPTY");
				} else {
					String prefix = entry.getKey().replaceAll("\\W", "");
					for (int i = 0, s = entry.getValue().size(); i < s; i++) {
						queryStr.append(" AND :" + prefix + i + " MEMBER OF e." + entry.getKey());
					}
				}
			}
		}
		queryStr.append(" ORDER BY id_ DESC");
		javax.persistence.TypedQuery<RowImpl> query = entityManager.createQuery(queryStr.toString(), RowImpl.class);
		if (attributeMap != null) {
			for (java.util.Map.Entry<String, Object> entry : attributeMap.entrySet()) {
				query.setParameter(entry.getKey().replaceAll("\\W", ""), entry.getValue());
			}
		}
		if (listAttributeMap != null) {
			for (java.util.Map.Entry<String, java.util.List> entry : listAttributeMap.entrySet()) {
				if (entry.getValue() != null && !entry.getValue().isEmpty()) {
					String prefix = entry.getKey().replaceAll("\\W", "");
					for (int i = 0, s = entry.getValue().size(); i < s; i++) {
						query.setParameter(prefix + i, entry.getValue().get(i));
					}
				}
			}
		}
		query.setHint(org.hibernate.jpa.QueryHints.HINT_CACHEABLE,true);
		return query;
	}
}
