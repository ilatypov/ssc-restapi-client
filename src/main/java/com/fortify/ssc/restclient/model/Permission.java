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
import com.fortify.ssc.restclient.model.Permission;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A permission in the server
 */
@ApiModel(description = "A permission in the server")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class Permission {
  @SerializedName("assignByDefault")
  private Boolean assignByDefault = null;

  @SerializedName("dependsOnPermission")
  private List<Permission> dependsOnPermission = new ArrayList<Permission>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("permittedActions")
  private List<String> permittedActions = new ArrayList<String>();

  @SerializedName("userOnly")
  private Boolean userOnly = null;

  public Permission assignByDefault(Boolean assignByDefault) {
    this.assignByDefault = assignByDefault;
    return this;
  }

   /**
   * Get assignByDefault
   * @return assignByDefault
  **/
  @ApiModelProperty(value = "")
  public Boolean isAssignByDefault() {
    return assignByDefault;
  }

  public void setAssignByDefault(Boolean assignByDefault) {
    this.assignByDefault = assignByDefault;
  }

  public Permission dependsOnPermission(List<Permission> dependsOnPermission) {
    this.dependsOnPermission = dependsOnPermission;
    return this;
  }

  public Permission addDependsOnPermissionItem(Permission dependsOnPermissionItem) {
    this.dependsOnPermission.add(dependsOnPermissionItem);
    return this;
  }

   /**
   * Set of permissions this permission requires
   * @return dependsOnPermission
  **/
  @ApiModelProperty(required = true, value = "Set of permissions this permission requires")
  public List<Permission> getDependsOnPermission() {
    return dependsOnPermission;
  }

  public void setDependsOnPermission(List<Permission> dependsOnPermission) {
    this.dependsOnPermission = dependsOnPermission;
  }

   /**
   * Permission description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Permission description")
  public String getDescription() {
    return description;
  }

   /**
   * Permission id
   * @return id
  **/
  @ApiModelProperty(value = "Permission id")
  public String getId() {
    return id;
  }

   /**
   * Permission name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Permission name")
  public String getName() {
    return name;
  }

  public Permission permittedActions(List<String> permittedActions) {
    this.permittedActions = permittedActions;
    return this;
  }

  public Permission addPermittedActionsItem(String permittedActionsItem) {
    this.permittedActions.add(permittedActionsItem);
    return this;
  }

   /**
   * Actions this permission is allowed to perform
   * @return permittedActions
  **/
  @ApiModelProperty(required = true, value = "Actions this permission is allowed to perform")
  public List<String> getPermittedActions() {
    return permittedActions;
  }

  public void setPermittedActions(List<String> permittedActions) {
    this.permittedActions = permittedActions;
  }

   /**
   * Flag is true if this permission can only be assigned to users, and not groups or organizations
   * @return userOnly
  **/
  @ApiModelProperty(example = "false", required = true, value = "Flag is true if this permission can only be assigned to users, and not groups or organizations")
  public Boolean isUserOnly() {
    return userOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(this.assignByDefault, permission.assignByDefault) &&
        Objects.equals(this.dependsOnPermission, permission.dependsOnPermission) &&
        Objects.equals(this.description, permission.description) &&
        Objects.equals(this.id, permission.id) &&
        Objects.equals(this.name, permission.name) &&
        Objects.equals(this.permittedActions, permission.permittedActions) &&
        Objects.equals(this.userOnly, permission.userOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignByDefault, dependsOnPermission, description, id, name, permittedActions, userOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    
    sb.append("    assignByDefault: ").append(toIndentedString(assignByDefault)).append("\n");
    sb.append("    dependsOnPermission: ").append(toIndentedString(dependsOnPermission)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permittedActions: ").append(toIndentedString(permittedActions)).append("\n");
    sb.append("    userOnly: ").append(toIndentedString(userOnly)).append("\n");
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

