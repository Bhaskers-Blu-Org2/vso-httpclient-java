/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.core.webapi.model;


/** 
 */
public enum ConnectedServiceKind {

    /**
    * Custom or unknown service
    */
    CUSTOM(0),
    /**
    * Azure Subscription
    */
    AZURE_SUBSCRIPTION(1),
    /**
    * Chef Connection
    */
    CHEF(2),
    /**
    * Generic Connection
    */
    GENERIC(3),
    ;

    private int value;

    private ConnectedServiceKind(final int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("CUSTOM")) { //$NON-NLS-1$
            return "custom"; //$NON-NLS-1$
        }

        if (name.equals("AZURE_SUBSCRIPTION")) { //$NON-NLS-1$
            return "azureSubscription"; //$NON-NLS-1$
        }

        if (name.equals("CHEF")) { //$NON-NLS-1$
            return "chef"; //$NON-NLS-1$
        }

        if (name.equals("GENERIC")) { //$NON-NLS-1$
            return "generic"; //$NON-NLS-1$
        }

        return null;
    }
}
