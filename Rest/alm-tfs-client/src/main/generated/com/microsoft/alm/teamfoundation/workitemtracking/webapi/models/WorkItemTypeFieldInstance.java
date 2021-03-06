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

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;


/** 
 */
public class WorkItemTypeFieldInstance
    extends WorkItemFieldReference {

    private boolean alwaysRequired;
    private WorkItemFieldReference field;
    private String helpText;

    public boolean getAlwaysRequired() {
        return alwaysRequired;
    }

    public void setAlwaysRequired(final boolean alwaysRequired) {
        this.alwaysRequired = alwaysRequired;
    }

    public WorkItemFieldReference getField() {
        return field;
    }

    public void setField(final WorkItemFieldReference field) {
        this.field = field;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(final String helpText) {
        this.helpText = helpText;
    }
}
