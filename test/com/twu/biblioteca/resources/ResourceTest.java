package com.twu.biblioteca.resources;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by fmorais on 8/4/15.
 */
public class ResourceTest {
    @Test
    public void checkoutResource_ShouldReturnTrue_WhenTheResourceIsAvailable() throws Exception {
        Resource resource = getConcreteResource();
        assertTrue(resource.checkoutResource());
    }

    @Test
    public void checkoutResource_ShouldReturnFalse_WhenTheResourceIsNotAvailable() throws Exception {
        Resource resource = getConcreteResource();
        resource.checkoutResource();
        assertFalse(resource.checkoutResource());
    }

    @Test
    public void returnResource_ShouldReturnTrue_WhenTheResourceIsNotAvailable() throws Exception {
        Resource resource = getConcreteResource();
        resource.checkoutResource();
        assertTrue(resource.returnResource());
    }

    @Test
    public void returnResource_ShouldReturnFalse_WhenTheResourceIsAvailable() throws Exception {
        Resource resource = getConcreteResource();
        assertFalse(resource.returnResource());
    }

    private Resource getConcreteResource() {
        return new Resource("Harry Potter", 1997) {
            @Override
            public String showDetails() {
                return "";
            }
        };
    }
}
