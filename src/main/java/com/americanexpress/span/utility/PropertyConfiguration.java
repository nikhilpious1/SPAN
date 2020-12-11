package com.americanexpress.span.utility;

import com.americanexpress.span.constants.SPANConstants;

/***
 *  This functional interface is used to assign application profile.
 *  User can override default method if the file name is predefined.
 */

public interface PropertyConfiguration {

    default String getFileName() {
        return SPANConstants.EMPTY_STRING;
    }

    String getAppProfile();
}
