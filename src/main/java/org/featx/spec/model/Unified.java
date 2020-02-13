package org.featx.spec.model;

import java.io.Serializable;

/**
 * @author Excepts
 * @since 2019/10/30 17:31
 */
public interface Unified extends Serializable {
    /**
     * Get code of this object
     * @return The code of this object
     */
    String getCode();
    /**
     * Get name of this object
     * @return The name of this object
     */
    String getName();
    /**
     * Get type of this object
     * @return The type of this object
     */
    Integer getType();
}