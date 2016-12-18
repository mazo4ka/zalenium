package de.zalando.tip.zalenium.proxy;

import de.zalando.tip.zalenium.util.TestUtils;
import org.junit.Test;
import org.openqa.grid.common.RegistrationRequest;
import org.openqa.grid.internal.Registry;
import org.openqa.grid.internal.TestSession;
import org.openqa.grid.internal.utils.CapabilityMatcher;
import org.testng.Assert;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URL;

public class CloudTestingRemoteProxyTest {

    @Test
    public void defaultValuesAreAlwaysNull() {
        Registry registry = Registry.newInstance();
        RegistrationRequest request = TestUtils.getRegistrationRequestForTesting(30003,
                CloudTestingRemoteProxy.class.getCanonicalName());
        CloudTestingRemoteProxy proxy = CloudTestingRemoteProxy.getNewInstance(request, registry);

        Assert.assertNull(proxy.getAccessKeyProperty());
        Assert.assertNull(proxy.getAccessKeyValue());
        Assert.assertNull(proxy.getCloudTestingServiceUrl());
        Assert.assertNull(proxy.getUserNameProperty());
        Assert.assertNull(proxy.getUserNameValue());
        Assert.assertNull(proxy.getRemoteHost());
    }

}
