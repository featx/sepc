package org.featx.jvmon.entity;

import java.io.Serializable;

/**
 * @since 2019/10/16
 * @author Excepts
 */
public interface Identifiable<I> extends Serializable {
    /**
     * get the id
     * @return the id
     */
    I getId();

    /**
     * Is current data created or retrieved from somewhere
     * @return true for created, and false for retrieved.
     */
    Boolean isNew();

    /**
     * Is current data has been deleted, invalid
     * @return true for 已经实效
     */
    Boolean getDeleted();
}
