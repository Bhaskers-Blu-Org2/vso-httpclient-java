package com.microsoft.alm.client.apiversion;

import junit.framework.TestCase;

import com.microsoft.alm.client.model.ApiResourceVersion;
import com.microsoft.alm.client.model.ApiResourceVersion.Version;

public class ApiVersionTest
        extends TestCase {
    public void testApiVersion() {
        testApiVersion("1.0"); //$NON-NLS-1$
        testApiVersion("2.3"); //$NON-NLS-1$
        testApiVersion("3", "3.0"); //$NON-NLS-1$ //$NON-NLS-2$
    }

    private void testApiVersion(final String apiVersion) {
        assertEquals(apiVersion, (new Version(apiVersion)).toString());
    }

    private void testApiVersion(final String apiVersion, final String expectedVersion) {
        assertEquals(expectedVersion, (new Version(apiVersion)).toString());
    }

    public void testApiResourceVersion() {
        testApiResourceVersion("1.0"); //$NON-NLS-1$
        testApiResourceVersion("2.3"); //$NON-NLS-1$
        testApiResourceVersion("3", "3.0"); //$NON-NLS-1$ //$NON-NLS-2$
        testApiResourceVersion("2.0-preview"); //$NON-NLS-1$
        testApiResourceVersion("2.0-preview.3"); //$NON-NLS-1$
    }

    private void testApiResourceVersion(final String apiResourceVersion) {
        assertEquals(apiResourceVersion, (new ApiResourceVersion(apiResourceVersion)).toString());
    }

    private void testApiResourceVersion(final String apiVersion, final String expectedVersion) {
        assertEquals(expectedVersion, (new ApiResourceVersion(apiVersion)).toString());
    }
}
