package info.scce.dime.process;

import info.scce.dime.rest.ObjectCache;

public interface DIMEProcessResult<T> {

    default T toJSON(ObjectCache objectCache) {
        throw new UnsupportedOperationException();
    }

}
