package ananas.lib.jhrs.client;

import java.util.Collection;

public interface ParameterList {

	String get(String key);

	void put(String key, String Value);

	Collection<String> keys();

}
