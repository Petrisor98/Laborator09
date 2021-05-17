package ro.pub.cs.systems.eim.lab09.ngnsip.general;

public interface Constants {

    String TAG = "[NgnSIP]";

    boolean DEBUG = true;

    // TODO exercise 4
    // fill in the USERNAME, IDENTITY_IMPI, IDENTITY_PASSWORD, DOMAIN, NETWORK_REALM
    String USERNAME = "ionut-petrisor";
    String IDENTITY_IMPI = "petrisorupb";
    String IDENTITY_PASSWORD = "xKJV68kMbMb2rHan";
    String DOMAIN = "petrisorupb.onsip.com";
    String NETWORK_PCSCF_HOST = "sip.onsip.com";
    int NETWORK_PCSCF_PORT = 5060;
    String NETWORK_REALM = "petrisorupb.onsip.com";

    boolean NETWORK_USE_3G = true;
    int NETWORK_REGISTRATION_TIMEOUT = 3600;

    String SIP_ADDRESS = "ro.pub.cs.systems.eim.lab09.ngnsip.SipAddress";

    int ACCEPT_CALL_DELAY_TIME = 2000;
}
