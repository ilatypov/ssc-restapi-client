/*
 * Fortify Software Security Center API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1:18.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fortify.ssc.restclient.model;

import java.util.Objects;
import com.fortify.ssc.restclient.model.Project;
import com.fortify.ssc.restclient.model.ProjectVersionState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * A version of a project or application on the server
 */
@ApiModel(description = "A version of a project or application on the server")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class ProjectVersion {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("assignedIssuesCount")
  private Long assignedIssuesCount = null;

  @SerializedName("attachmentsOutOfDate")
  private Boolean attachmentsOutOfDate = null;

  @SerializedName("autoPredict")
  private Boolean autoPredict = null;

  @SerializedName("bugTrackerEnabled")
  private Boolean bugTrackerEnabled = null;

  @SerializedName("bugTrackerPluginId")
  private String bugTrackerPluginId = null;

  @SerializedName("committed")
  private Boolean committed = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("creationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("currentState")
  private ProjectVersionState currentState = null;

  @SerializedName("customTagValuesAutoApply")
  private Boolean customTagValuesAutoApply = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("issueTemplateId")
  private String issueTemplateId = null;

  @SerializedName("issueTemplateModifiedTime")
  private Long issueTemplateModifiedTime = null;

  @SerializedName("issueTemplateName")
  private String issueTemplateName = null;

  @SerializedName("latestScanId")
  private Long latestScanId = null;

  @SerializedName("loadProperties")
  private String loadProperties = null;

  @SerializedName("masterAttrGuid")
  private String masterAttrGuid = null;

  @SerializedName("migrationVersion")
  private Float migrationVersion = null;

  /**
   * Gets or Sets mode
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    NONE("NONE"),
    
    ASSESSMENT("ASSESSMENT"),
    
    BASIC("BASIC"),
    
    FULL("FULL");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mode")
  private ModeEnum mode = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("obfuscatedId")
  private String obfuscatedId = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("project")
  private Project project = null;

  @SerializedName("refreshRequired")
  private Boolean refreshRequired = null;

  @SerializedName("securityGroup")
  private String securityGroup = null;

  @SerializedName("serverVersion")
  private Float serverVersion = null;

  @SerializedName("siteId")
  private String siteId = null;

  @SerializedName("snapshotOutOfDate")
  private Boolean snapshotOutOfDate = null;

  @SerializedName("sourceBasePath")
  private String sourceBasePath = null;

  @SerializedName("staleIssueTemplate")
  private Boolean staleIssueTemplate = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    DELETING("DELETING"),
    
    ARCHIVED("ARCHIVED"),
    
    COPYING_ISSUES("COPYING_ISSUES");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("tracesOutOfDate")
  private Boolean tracesOutOfDate = null;

  public ProjectVersion active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * True if this version is active
   * @return active
  **/
  @ApiModelProperty(example = "false", required = true, value = "True if this version is active")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public ProjectVersion assignedIssuesCount(Long assignedIssuesCount) {
    this.assignedIssuesCount = assignedIssuesCount;
    return this;
  }

   /**
   * Get assignedIssuesCount
   * @return assignedIssuesCount
  **/
  @ApiModelProperty(value = "")
  public Long getAssignedIssuesCount() {
    return assignedIssuesCount;
  }

  public void setAssignedIssuesCount(Long assignedIssuesCount) {
    this.assignedIssuesCount = assignedIssuesCount;
  }

  public ProjectVersion attachmentsOutOfDate(Boolean attachmentsOutOfDate) {
    this.attachmentsOutOfDate = attachmentsOutOfDate;
    return this;
  }

   /**
   * Get attachmentsOutOfDate
   * @return attachmentsOutOfDate
  **/
  @ApiModelProperty(value = "")
  public Boolean isAttachmentsOutOfDate() {
    return attachmentsOutOfDate;
  }

  public void setAttachmentsOutOfDate(Boolean attachmentsOutOfDate) {
    this.attachmentsOutOfDate = attachmentsOutOfDate;
  }

  public ProjectVersion autoPredict(Boolean autoPredict) {
    this.autoPredict = autoPredict;
    return this;
  }

   /**
   * true if auto-prediction is enabled for this project version; false otherwise. This property modification is protected by AUDITASSISTANT_MANAGE permission.
   * @return autoPredict
  **/
  @ApiModelProperty(example = "false", value = "true if auto-prediction is enabled for this project version; false otherwise. This property modification is protected by AUDITASSISTANT_MANAGE permission.")
  public Boolean isAutoPredict() {
    return autoPredict;
  }

  public void setAutoPredict(Boolean autoPredict) {
    this.autoPredict = autoPredict;
  }

  public ProjectVersion bugTrackerEnabled(Boolean bugTrackerEnabled) {
    this.bugTrackerEnabled = bugTrackerEnabled;
    return this;
  }

   /**
   * true if the bug tracker plugin assigned to the application version is currently enabled in the system
   * @return bugTrackerEnabled
  **/
  @ApiModelProperty(example = "false", required = true, value = "true if the bug tracker plugin assigned to the application version is currently enabled in the system")
  public Boolean isBugTrackerEnabled() {
    return bugTrackerEnabled;
  }

  public void setBugTrackerEnabled(Boolean bugTrackerEnabled) {
    this.bugTrackerEnabled = bugTrackerEnabled;
  }

  public ProjectVersion bugTrackerPluginId(String bugTrackerPluginId) {
    this.bugTrackerPluginId = bugTrackerPluginId;
    return this;
  }

   /**
   * identifier of the bug tracker plugin (if any) assigned to this application version
   * @return bugTrackerPluginId
  **/
  @ApiModelProperty(required = true, value = "identifier of the bug tracker plugin (if any) assigned to this application version")
  public String getBugTrackerPluginId() {
    return bugTrackerPluginId;
  }

  public void setBugTrackerPluginId(String bugTrackerPluginId) {
    this.bugTrackerPluginId = bugTrackerPluginId;
  }

  public ProjectVersion committed(Boolean committed) {
    this.committed = committed;
    return this;
  }

   /**
   * True if this version is committed and ready to be used
   * @return committed
  **/
  @ApiModelProperty(example = "false", required = true, value = "True if this version is committed and ready to be used")
  public Boolean isCommitted() {
    return committed;
  }

  public void setCommitted(Boolean committed) {
    this.committed = committed;
  }

  public ProjectVersion createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * User that created this version
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "User that created this version")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ProjectVersion creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Date this version was created
   * @return creationDate
  **/
  @ApiModelProperty(required = true, value = "Date this version was created")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ProjectVersion currentState(ProjectVersionState currentState) {
    this.currentState = currentState;
    return this;
  }

   /**
   * Get currentState
   * @return currentState
  **/
  @ApiModelProperty(value = "")
  public ProjectVersionState getCurrentState() {
    return currentState;
  }

  public void setCurrentState(ProjectVersionState currentState) {
    this.currentState = currentState;
  }

  public ProjectVersion customTagValuesAutoApply(Boolean customTagValuesAutoApply) {
    this.customTagValuesAutoApply = customTagValuesAutoApply;
    return this;
  }

   /**
   * true if custom tag values auto-apply is enabled for this project version; false otherwise. This property modification is protected by AUDITASSISTANT_MANAGE permission.
   * @return customTagValuesAutoApply
  **/
  @ApiModelProperty(example = "false", value = "true if custom tag values auto-apply is enabled for this project version; false otherwise. This property modification is protected by AUDITASSISTANT_MANAGE permission.")
  public Boolean isCustomTagValuesAutoApply() {
    return customTagValuesAutoApply;
  }

  public void setCustomTagValuesAutoApply(Boolean customTagValuesAutoApply) {
    this.customTagValuesAutoApply = customTagValuesAutoApply;
  }

  public ProjectVersion description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public Long getId() {
    return id;
  }

  public ProjectVersion issueTemplateId(String issueTemplateId) {
    this.issueTemplateId = issueTemplateId;
    return this;
  }

   /**
   * Id of the Issue Template used by this version
   * @return issueTemplateId
  **/
  @ApiModelProperty(required = true, value = "Id of the Issue Template used by this version")
  public String getIssueTemplateId() {
    return issueTemplateId;
  }

  public void setIssueTemplateId(String issueTemplateId) {
    this.issueTemplateId = issueTemplateId;
  }

  public ProjectVersion issueTemplateModifiedTime(Long issueTemplateModifiedTime) {
    this.issueTemplateModifiedTime = issueTemplateModifiedTime;
    return this;
  }

   /**
   * Last time the Issue Template was modified
   * @return issueTemplateModifiedTime
  **/
  @ApiModelProperty(required = true, value = "Last time the Issue Template was modified")
  public Long getIssueTemplateModifiedTime() {
    return issueTemplateModifiedTime;
  }

  public void setIssueTemplateModifiedTime(Long issueTemplateModifiedTime) {
    this.issueTemplateModifiedTime = issueTemplateModifiedTime;
  }

  public ProjectVersion issueTemplateName(String issueTemplateName) {
    this.issueTemplateName = issueTemplateName;
    return this;
  }

   /**
   * Name of the Issue Template used by this version
   * @return issueTemplateName
  **/
  @ApiModelProperty(required = true, value = "Name of the Issue Template used by this version")
  public String getIssueTemplateName() {
    return issueTemplateName;
  }

  public void setIssueTemplateName(String issueTemplateName) {
    this.issueTemplateName = issueTemplateName;
  }

  public ProjectVersion latestScanId(Long latestScanId) {
    this.latestScanId = latestScanId;
    return this;
  }

   /**
   * id of the latest scan uploaded to application version
   * @return latestScanId
  **/
  @ApiModelProperty(required = true, value = "id of the latest scan uploaded to application version")
  public Long getLatestScanId() {
    return latestScanId;
  }

  public void setLatestScanId(Long latestScanId) {
    this.latestScanId = latestScanId;
  }

  public ProjectVersion loadProperties(String loadProperties) {
    this.loadProperties = loadProperties;
    return this;
  }

   /**
   * Get loadProperties
   * @return loadProperties
  **/
  @ApiModelProperty(value = "")
  public String getLoadProperties() {
    return loadProperties;
  }

  public void setLoadProperties(String loadProperties) {
    this.loadProperties = loadProperties;
  }

  public ProjectVersion masterAttrGuid(String masterAttrGuid) {
    this.masterAttrGuid = masterAttrGuid;
    return this;
  }

   /**
   * Guid of the primary custom tag for this version
   * @return masterAttrGuid
  **/
  @ApiModelProperty(required = true, value = "Guid of the primary custom tag for this version")
  public String getMasterAttrGuid() {
    return masterAttrGuid;
  }

  public void setMasterAttrGuid(String masterAttrGuid) {
    this.masterAttrGuid = masterAttrGuid;
  }

  public ProjectVersion migrationVersion(Float migrationVersion) {
    this.migrationVersion = migrationVersion;
    return this;
  }

   /**
   * Get migrationVersion
   * @return migrationVersion
  **/
  @ApiModelProperty(value = "")
  public Float getMigrationVersion() {
    return migrationVersion;
  }

  public void setMigrationVersion(Float migrationVersion) {
    this.migrationVersion = migrationVersion;
  }

  public ProjectVersion mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(value = "")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public ProjectVersion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectVersion obfuscatedId(String obfuscatedId) {
    this.obfuscatedId = obfuscatedId;
    return this;
  }

   /**
   * Get obfuscatedId
   * @return obfuscatedId
  **/
  @ApiModelProperty(value = "")
  public String getObfuscatedId() {
    return obfuscatedId;
  }

  public void setObfuscatedId(String obfuscatedId) {
    this.obfuscatedId = obfuscatedId;
  }

  public ProjectVersion owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Owner of this version
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "Owner of this version")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ProjectVersion project(Project project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public ProjectVersion refreshRequired(Boolean refreshRequired) {
    this.refreshRequired = refreshRequired;
    return this;
  }

   /**
   * Get refreshRequired
   * @return refreshRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isRefreshRequired() {
    return refreshRequired;
  }

  public void setRefreshRequired(Boolean refreshRequired) {
    this.refreshRequired = refreshRequired;
  }

  public ProjectVersion securityGroup(String securityGroup) {
    this.securityGroup = securityGroup;
    return this;
  }

   /**
   * Get securityGroup
   * @return securityGroup
  **/
  @ApiModelProperty(value = "")
  public String getSecurityGroup() {
    return securityGroup;
  }

  public void setSecurityGroup(String securityGroup) {
    this.securityGroup = securityGroup;
  }

  public ProjectVersion serverVersion(Float serverVersion) {
    this.serverVersion = serverVersion;
    return this;
  }

   /**
   * Server version this version&#39;s data supports
   * @return serverVersion
  **/
  @ApiModelProperty(required = true, value = "Server version this version's data supports")
  public Float getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(Float serverVersion) {
    this.serverVersion = serverVersion;
  }

  public ProjectVersion siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @ApiModelProperty(value = "")
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public ProjectVersion snapshotOutOfDate(Boolean snapshotOutOfDate) {
    this.snapshotOutOfDate = snapshotOutOfDate;
    return this;
  }

   /**
   * True if the most recent snapshot is not accurate
   * @return snapshotOutOfDate
  **/
  @ApiModelProperty(example = "false", required = true, value = "True if the most recent snapshot is not accurate")
  public Boolean isSnapshotOutOfDate() {
    return snapshotOutOfDate;
  }

  public void setSnapshotOutOfDate(Boolean snapshotOutOfDate) {
    this.snapshotOutOfDate = snapshotOutOfDate;
  }

  public ProjectVersion sourceBasePath(String sourceBasePath) {
    this.sourceBasePath = sourceBasePath;
    return this;
  }

   /**
   * Get sourceBasePath
   * @return sourceBasePath
  **/
  @ApiModelProperty(value = "")
  public String getSourceBasePath() {
    return sourceBasePath;
  }

  public void setSourceBasePath(String sourceBasePath) {
    this.sourceBasePath = sourceBasePath;
  }

  public ProjectVersion staleIssueTemplate(Boolean staleIssueTemplate) {
    this.staleIssueTemplate = staleIssueTemplate;
    return this;
  }

   /**
   * True if this version&#39;s Issue Template has changed or been modified
   * @return staleIssueTemplate
  **/
  @ApiModelProperty(example = "false", required = true, value = "True if this version's Issue Template has changed or been modified")
  public Boolean isStaleIssueTemplate() {
    return staleIssueTemplate;
  }

  public void setStaleIssueTemplate(Boolean staleIssueTemplate) {
    this.staleIssueTemplate = staleIssueTemplate;
  }

  public ProjectVersion status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ProjectVersion tracesOutOfDate(Boolean tracesOutOfDate) {
    this.tracesOutOfDate = tracesOutOfDate;
    return this;
  }

   /**
   * Get tracesOutOfDate
   * @return tracesOutOfDate
  **/
  @ApiModelProperty(value = "")
  public Boolean isTracesOutOfDate() {
    return tracesOutOfDate;
  }

  public void setTracesOutOfDate(Boolean tracesOutOfDate) {
    this.tracesOutOfDate = tracesOutOfDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectVersion projectVersion = (ProjectVersion) o;
    return Objects.equals(this.active, projectVersion.active) &&
        Objects.equals(this.assignedIssuesCount, projectVersion.assignedIssuesCount) &&
        Objects.equals(this.attachmentsOutOfDate, projectVersion.attachmentsOutOfDate) &&
        Objects.equals(this.autoPredict, projectVersion.autoPredict) &&
        Objects.equals(this.bugTrackerEnabled, projectVersion.bugTrackerEnabled) &&
        Objects.equals(this.bugTrackerPluginId, projectVersion.bugTrackerPluginId) &&
        Objects.equals(this.committed, projectVersion.committed) &&
        Objects.equals(this.createdBy, projectVersion.createdBy) &&
        Objects.equals(this.creationDate, projectVersion.creationDate) &&
        Objects.equals(this.currentState, projectVersion.currentState) &&
        Objects.equals(this.customTagValuesAutoApply, projectVersion.customTagValuesAutoApply) &&
        Objects.equals(this.description, projectVersion.description) &&
        Objects.equals(this.id, projectVersion.id) &&
        Objects.equals(this.issueTemplateId, projectVersion.issueTemplateId) &&
        Objects.equals(this.issueTemplateModifiedTime, projectVersion.issueTemplateModifiedTime) &&
        Objects.equals(this.issueTemplateName, projectVersion.issueTemplateName) &&
        Objects.equals(this.latestScanId, projectVersion.latestScanId) &&
        Objects.equals(this.loadProperties, projectVersion.loadProperties) &&
        Objects.equals(this.masterAttrGuid, projectVersion.masterAttrGuid) &&
        Objects.equals(this.migrationVersion, projectVersion.migrationVersion) &&
        Objects.equals(this.mode, projectVersion.mode) &&
        Objects.equals(this.name, projectVersion.name) &&
        Objects.equals(this.obfuscatedId, projectVersion.obfuscatedId) &&
        Objects.equals(this.owner, projectVersion.owner) &&
        Objects.equals(this.project, projectVersion.project) &&
        Objects.equals(this.refreshRequired, projectVersion.refreshRequired) &&
        Objects.equals(this.securityGroup, projectVersion.securityGroup) &&
        Objects.equals(this.serverVersion, projectVersion.serverVersion) &&
        Objects.equals(this.siteId, projectVersion.siteId) &&
        Objects.equals(this.snapshotOutOfDate, projectVersion.snapshotOutOfDate) &&
        Objects.equals(this.sourceBasePath, projectVersion.sourceBasePath) &&
        Objects.equals(this.staleIssueTemplate, projectVersion.staleIssueTemplate) &&
        Objects.equals(this.status, projectVersion.status) &&
        Objects.equals(this.tracesOutOfDate, projectVersion.tracesOutOfDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, assignedIssuesCount, attachmentsOutOfDate, autoPredict, bugTrackerEnabled, bugTrackerPluginId, committed, createdBy, creationDate, currentState, customTagValuesAutoApply, description, id, issueTemplateId, issueTemplateModifiedTime, issueTemplateName, latestScanId, loadProperties, masterAttrGuid, migrationVersion, mode, name, obfuscatedId, owner, project, refreshRequired, securityGroup, serverVersion, siteId, snapshotOutOfDate, sourceBasePath, staleIssueTemplate, status, tracesOutOfDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectVersion {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    assignedIssuesCount: ").append(toIndentedString(assignedIssuesCount)).append("\n");
    sb.append("    attachmentsOutOfDate: ").append(toIndentedString(attachmentsOutOfDate)).append("\n");
    sb.append("    autoPredict: ").append(toIndentedString(autoPredict)).append("\n");
    sb.append("    bugTrackerEnabled: ").append(toIndentedString(bugTrackerEnabled)).append("\n");
    sb.append("    bugTrackerPluginId: ").append(toIndentedString(bugTrackerPluginId)).append("\n");
    sb.append("    committed: ").append(toIndentedString(committed)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    currentState: ").append(toIndentedString(currentState)).append("\n");
    sb.append("    customTagValuesAutoApply: ").append(toIndentedString(customTagValuesAutoApply)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueTemplateId: ").append(toIndentedString(issueTemplateId)).append("\n");
    sb.append("    issueTemplateModifiedTime: ").append(toIndentedString(issueTemplateModifiedTime)).append("\n");
    sb.append("    issueTemplateName: ").append(toIndentedString(issueTemplateName)).append("\n");
    sb.append("    latestScanId: ").append(toIndentedString(latestScanId)).append("\n");
    sb.append("    loadProperties: ").append(toIndentedString(loadProperties)).append("\n");
    sb.append("    masterAttrGuid: ").append(toIndentedString(masterAttrGuid)).append("\n");
    sb.append("    migrationVersion: ").append(toIndentedString(migrationVersion)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    obfuscatedId: ").append(toIndentedString(obfuscatedId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    refreshRequired: ").append(toIndentedString(refreshRequired)).append("\n");
    sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    snapshotOutOfDate: ").append(toIndentedString(snapshotOutOfDate)).append("\n");
    sb.append("    sourceBasePath: ").append(toIndentedString(sourceBasePath)).append("\n");
    sb.append("    staleIssueTemplate: ").append(toIndentedString(staleIssueTemplate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tracesOutOfDate: ").append(toIndentedString(tracesOutOfDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

