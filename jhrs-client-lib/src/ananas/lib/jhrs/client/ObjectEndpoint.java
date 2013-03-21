package ananas.lib.jhrs.client;

import ananas.lib.jhrs.JHRSObject;

public interface ObjectEndpoint extends Invokable, Endpoint {

	JHRSObject getJHRSObject();

}
