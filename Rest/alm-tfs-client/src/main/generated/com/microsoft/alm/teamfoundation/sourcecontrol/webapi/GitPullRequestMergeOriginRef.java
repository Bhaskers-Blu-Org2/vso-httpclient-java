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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;


/** 
 */
public class GitPullRequestMergeOriginRef
    extends GitMergeOriginRef {

    private int pullRequestId;

    public int getPullRequestId() {
        return pullRequestId;
    }

    public void setPullRequestId(final int pullRequestId) {
        this.pullRequestId = pullRequestId;
    }
}
