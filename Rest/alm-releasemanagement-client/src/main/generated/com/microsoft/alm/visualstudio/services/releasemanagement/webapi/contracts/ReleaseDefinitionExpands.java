// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;


/** 
 */
public enum ReleaseDefinitionExpands {

    NONE(0),
    ENVIRONMENTS(2),
    ARTIFACTS(4),
    TRIGGERS(8),
    ;

    private int value;

    private ReleaseDefinitionExpands(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("ENVIRONMENTS")) { //$NON-NLS-1$
            return "environments"; //$NON-NLS-1$
        }

        if (name.equals("ARTIFACTS")) { //$NON-NLS-1$
            return "artifacts"; //$NON-NLS-1$
        }

        if (name.equals("TRIGGERS")) { //$NON-NLS-1$
            return "triggers"; //$NON-NLS-1$
        }

        return null;
    }
}
