package info.scce.dime.rest;

import de.ls5.dywa.generated.util.Identifiable;

import javax.enterprise.context.RequestScoped;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RequestScoped
public class ObjectCache {

	/**
	 * Cache for mapping dywaTos to RestTOs.
	 */
	private Map<Identifiable, RESTBaseType> restCache;

	/**
	 * Cache for caching (rest) objects, when resolving cyclic references when receiving information from the client
	 */
	private Map<RESTBaseType, Set<String>> selectiveReadCache;

	/**
	 * Cache for caching transient DyWA-TOs that have been created from REST TOs.
	 */
	private Map<RESTBaseType, Identifiable> transientCache;

	/**
	 * Cache for caching which selectives were already written through, to the dywa objects
	 */
	private Map<Identifiable, Set<String>> selectiveWriteCache;

	private final static int initialSize = 100;


	public ObjectCache() {
		this.restCache = new HashMap<>(initialSize);
		this.selectiveReadCache = new HashMap<>(initialSize);
		this.selectiveWriteCache = new HashMap<>(initialSize);
		this.transientCache = new HashMap<>(initialSize);
	}

	/**
	 * @see ObjectCache#restCache
	 */
	public <T extends RESTBaseType> T getRestTo(final Identifiable identifiable) {
		return (T) this.restCache.get(identifiable);
	}


	/**
	 * @see ObjectCache#restCache
	 */
	public boolean containsRestTo(final Identifiable identifiable) {
		return this.restCache.containsKey(identifiable);
	}

	/**
	 * @see ObjectCache#selectiveReadCache
	 */
	public boolean containsSelective(final RESTBaseType restTo, final String selective) {
		return this.selectiveReadCache.getOrDefault(restTo, Collections.emptySet()).contains(selective);
	}

	/**
	 * @see ObjectCache#selectiveWriteCache
	 */
	public boolean containsSelective(final Identifiable restTo, final String selective) {
		return this.selectiveWriteCache.getOrDefault(restTo, Collections.emptySet()).contains(selective);
	}

	/**
	 * @see ObjectCache#transientCache
	 */
	public boolean containsTransient(final RESTBaseType restTo) {
		return this.transientCache.containsKey(restTo);
	}

	/**
	 * @see ObjectCache#transientCache
	 */
	public <T extends Identifiable> T getTransient(final RESTBaseType restTo) {
		return (T)  this.transientCache.get(restTo);
	}

	/**
	 * @see ObjectCache#transientCache
	 */
	public void putTransient(final RESTBaseType restTo, final Identifiable identifiable) {
		this.transientCache.put(restTo, identifiable);
	}


	/**
	 * @see ObjectCache#restCache
	 */
	public <T extends RESTBaseType> void putRestTo(final Identifiable identifiable, final T obj) {
		this.restCache.put(identifiable, obj);
	}

	/**
	 * @see ObjectCache#selectiveReadCache
	 */
	public void putSelective(final RESTBaseType restTo, final String selective) {
		this.putInternal(this.selectiveReadCache, restTo, selective);
	}

	/**
	 * @see ObjectCache#selectiveWriteCache
	 */
	public void putSelective(final Identifiable restTo, final String selective) {
		this.putInternal(this.selectiveWriteCache, restTo, selective);
	}

	private <T> void putInternal(final Map<T, Set<String>> cache, final T key, final String selective) {
		cache.putIfAbsent(key, new HashSet<>());
		cache.get(key).add(selective);
	}

}
