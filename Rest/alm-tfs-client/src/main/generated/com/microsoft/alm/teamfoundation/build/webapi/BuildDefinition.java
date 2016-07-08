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

package com.microsoft.alm.teamfoundation.build.webapi;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.microsoft.alm.visualstudio.services.webapi.PropertiesCollection;

/** 
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
@JsonSerialize(using = JsonSerializer.None.class)
public class BuildDefinition
    extends BuildDefinitionReference {

    /**
    * Indicates whether badges are enabled for this definition
    */
    private boolean badgeEnabled;
    private List<BuildDefinitionStep> build;
    /**
    * The build number format
    */
    private String buildNumberFormat;
    /**
    * The comment entered when saving the definition
    */
    private String comment;
    private List<Demand> demands;
    /**
    * The description
    */
    private String description;
    /**
    * The drop location for the definition
    */
    private String dropLocation;
    /**
    * Gets or sets the job authorization scope for builds which are queued against this definition
    */
    private BuildAuthorizationScope jobAuthorizationScope;
    /**
    * Gets or sets the job execution timeout in minutes for builds which are queued against this definition
    */
    private int jobTimeoutInMinutes;
    private List<BuildOption> options;
    private PropertiesCollection properties;
    /**
    * The repository
    */
    private BuildRepository repository;
    private List<RetentionPolicy> retentionRules;
    private List<BuildTrigger> triggers;
    private Map<String, BuildDefinitionVariable> variables;

    /**
    * Indicates whether badges are enabled for this definition
    */
    public boolean getBadgeEnabled() {
        return badgeEnabled;
    }

    /**
    * Indicates whether badges are enabled for this definition
    */
    public void setBadgeEnabled(final boolean badgeEnabled) {
        this.badgeEnabled = badgeEnabled;
    }

    @JsonProperty("build")
    public List<BuildDefinitionStep> getSteps() {
        return build;
    }

    @JsonProperty("build")
    public void setSteps(final List<BuildDefinitionStep> build) {
        this.build = build;
    }

    /**
    * The build number format
    */
    public String getBuildNumberFormat() {
        return buildNumberFormat;
    }

    /**
    * The build number format
    */
    public void setBuildNumberFormat(final String buildNumberFormat) {
        this.buildNumberFormat = buildNumberFormat;
    }

    /**
    * The comment entered when saving the definition
    */
    public String getComment() {
        return comment;
    }

    /**
    * The comment entered when saving the definition
    */
    public void setComment(final String comment) {
        this.comment = comment;
    }

    public List<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final List<Demand> demands) {
        this.demands = demands;
    }

    /**
    * The description
    */
    public String getDescription() {
        return description;
    }

    /**
    * The description
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * The drop location for the definition
    */
    public String getDropLocation() {
        return dropLocation;
    }

    /**
    * The drop location for the definition
    */
    public void setDropLocation(final String dropLocation) {
        this.dropLocation = dropLocation;
    }

    /**
    * Gets or sets the job authorization scope for builds which are queued against this definition
    */
    public BuildAuthorizationScope getJobAuthorizationScope() {
        return jobAuthorizationScope;
    }

    /**
    * Gets or sets the job authorization scope for builds which are queued against this definition
    */
    public void setJobAuthorizationScope(final BuildAuthorizationScope jobAuthorizationScope) {
        this.jobAuthorizationScope = jobAuthorizationScope;
    }

    /**
    * Gets or sets the job execution timeout in minutes for builds which are queued against this definition
    */
    public int getJobTimeoutInMinutes() {
        return jobTimeoutInMinutes;
    }

    /**
    * Gets or sets the job execution timeout in minutes for builds which are queued against this definition
    */
    public void setJobTimeoutInMinutes(final int jobTimeoutInMinutes) {
        this.jobTimeoutInMinutes = jobTimeoutInMinutes;
    }

    public List<BuildOption> getOptions() {
        return options;
    }

    public void setOptions(final List<BuildOption> options) {
        this.options = options;
    }

    public PropertiesCollection getProperties() {
        return properties;
    }

    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    /**
    * The repository
    */
    public BuildRepository getRepository() {
        return repository;
    }

    /**
    * The repository
    */
    public void setRepository(final BuildRepository repository) {
        this.repository = repository;
    }

    public List<RetentionPolicy> getRetentionRules() {
        return retentionRules;
    }

    public void setRetentionRules(final List<RetentionPolicy> retentionRules) {
        this.retentionRules = retentionRules;
    }

    public List<BuildTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(final List<BuildTrigger> triggers) {
        this.triggers = triggers;
    }

    public Map<String, BuildDefinitionVariable> getVariables() {
        return variables;
    }

    public void setVariables(final Map<String, BuildDefinitionVariable> variables) {
        this.variables = variables;
    }
}
