package ananas.lib.jhrs.client;

import ananas.lib.jhrs.JHRSAddress;

public interface Endpoint {

	UserAgent getUserAgent();

	String getURL();

	JHRSAddress getAddress();

}
