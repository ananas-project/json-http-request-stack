package ananas.lib.jhrs.client;

import ananas.lib.jhrs.JHRSAddressComponent;

public interface Endpoint {

	UserAgent getUserAgent();

	String getURL();

	JHRSAddressComponent getAddress();

}
