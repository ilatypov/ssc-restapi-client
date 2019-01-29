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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LdapServerDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class LdapServerDto {
  @SerializedName("attributeDistinguishedName")
  private String attributeDistinguishedName = null;

  @SerializedName("attributeEmail")
  private String attributeEmail = null;

  @SerializedName("attributeFirstName")
  private String attributeFirstName = null;

  @SerializedName("attributeGroupname")
  private String attributeGroupname = null;

  @SerializedName("attributeLastName")
  private String attributeLastName = null;

  @SerializedName("attributeMember")
  private String attributeMember = null;

  @SerializedName("attributeMemberOf")
  private String attributeMemberOf = null;

  @SerializedName("attributeObjectClass")
  private String attributeObjectClass = null;

  @SerializedName("attributeObjectSid")
  private String attributeObjectSid = null;

  @SerializedName("attributeOrgunitName")
  private String attributeOrgunitName = null;

  @SerializedName("attributePassword")
  private String attributePassword = null;

  @SerializedName("attributeThumbnailMimeDefault")
  private String attributeThumbnailMimeDefault = null;

  @SerializedName("attributeThumbnailPhoto")
  private String attributeThumbnailPhoto = null;

  @SerializedName("attributeUserName")
  private String attributeUserName = null;

  /**
   * Gets or Sets authenticatorType
   */
  @JsonAdapter(AuthenticatorTypeEnum.Adapter.class)
  public enum AuthenticatorTypeEnum {
    BIND_AUTHENTICATOR("BIND_AUTHENTICATOR"),
    
    PASSWORD_COMPARISON_AUTHENTICATOR("PASSWORD_COMPARISON_AUTHENTICATOR");

    private String value;

    AuthenticatorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticatorTypeEnum fromValue(String text) {
      for (AuthenticatorTypeEnum b : AuthenticatorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthenticatorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticatorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticatorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthenticatorTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("authenticatorType")
  private AuthenticatorTypeEnum authenticatorType = null;

  @SerializedName("baseDn")
  private String baseDn = null;

  @SerializedName("baseObjectSid")
  private String baseObjectSid = null;

  @SerializedName("cacheEnabled")
  private Boolean cacheEnabled = null;

  @SerializedName("cacheEvictionTime")
  private Integer cacheEvictionTime = null;

  @SerializedName("cacheExecutorPoolSize")
  private Integer cacheExecutorPoolSize = null;

  @SerializedName("cacheExecutorPoolSizeMax")
  private Integer cacheExecutorPoolSizeMax = null;

  @SerializedName("cacheMaxThreadsPerCache")
  private Integer cacheMaxThreadsPerCache = null;

  @SerializedName("checkSslHostname")
  private Boolean checkSslHostname = null;

  @SerializedName("checkSslTrust")
  private Boolean checkSslTrust = null;

  @SerializedName("classGroup")
  private String classGroup = null;

  @SerializedName("classOrgunit")
  private String classOrgunit = null;

  @SerializedName("classUser")
  private String classUser = null;

  @SerializedName("defaultServer")
  private Boolean defaultServer = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("ignorePartialResultException")
  private Boolean ignorePartialResultException = null;

  @SerializedName("nestedGroupsEnabled")
  private Boolean nestedGroupsEnabled = null;

  @SerializedName("objectVersion")
  private Integer objectVersion = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("pagingEnabled")
  private Boolean pagingEnabled = null;

  /**
   * Gets or Sets passwordEncoderType
   */
  @JsonAdapter(PasswordEncoderTypeEnum.Adapter.class)
  public enum PasswordEncoderTypeEnum {
    NOT_SET("NOT_SET"),
    
    LDAP_SHA_PASSWORD_ENCODER("LDAP_SHA_PASSWORD_ENCODER"),
    
    MD4_PASSWORD_ENCODER("MD4_PASSWORD_ENCODER"),
    
    MD5_PASSWORD_ENCODER("MD5_PASSWORD_ENCODER"),
    
    SHA_PASSWORD_ENCODER("SHA_PASSWORD_ENCODER");

    private String value;

    PasswordEncoderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PasswordEncoderTypeEnum fromValue(String text) {
      for (PasswordEncoderTypeEnum b : PasswordEncoderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PasswordEncoderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PasswordEncoderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PasswordEncoderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PasswordEncoderTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("passwordEncoderType")
  private PasswordEncoderTypeEnum passwordEncoderType = null;

  /**
   * Gets or Sets referralsProcessingStrategy
   */
  @JsonAdapter(ReferralsProcessingStrategyEnum.Adapter.class)
  public enum ReferralsProcessingStrategyEnum {
    IGNORE("ignore"),
    
    FOLLOW("follow");

    private String value;

    ReferralsProcessingStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReferralsProcessingStrategyEnum fromValue(String text) {
      for (ReferralsProcessingStrategyEnum b : ReferralsProcessingStrategyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReferralsProcessingStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReferralsProcessingStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReferralsProcessingStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReferralsProcessingStrategyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("referralsProcessingStrategy")
  private ReferralsProcessingStrategyEnum referralsProcessingStrategy = null;

  @SerializedName("saveWithoutValidation")
  private Boolean saveWithoutValidation = null;

  @SerializedName("searchDns")
  private String searchDns = null;

  @SerializedName("serverName")
  private String serverName = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("userDn")
  private String userDn = null;

  @SerializedName("userPassword")
  private String userPassword = null;

  @SerializedName("userPhotoEnabled")
  private Boolean userPhotoEnabled = null;

  @SerializedName("validationIdleTime")
  private Integer validationIdleTime = null;

  @SerializedName("validationTimeLimit")
  private Integer validationTimeLimit = null;

  public LdapServerDto attributeDistinguishedName(String attributeDistinguishedName) {
    this.attributeDistinguishedName = attributeDistinguishedName;
    return this;
  }

   /**
   * Get attributeDistinguishedName
   * @return attributeDistinguishedName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttributeDistinguishedName() {
    return attributeDistinguishedName;
  }

  public void setAttributeDistinguishedName(String attributeDistinguishedName) {
    this.attributeDistinguishedName = attributeDistinguishedName;
  }

  public LdapServerDto attributeEmail(String attributeEmail) {
    this.attributeEmail = attributeEmail;
    return this;
  }

   /**
   * Get attributeEmail
   * @return attributeEmail
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttributeEmail() {
    return attributeEmail;
  }

  public void setAttributeEmail(String attributeEmail) {
    this.attributeEmail = attributeEmail;
  }

  public LdapServerDto attributeFirstName(String attributeFirstName) {
    this.attributeFirstName = attributeFirstName;
    return this;
  }

   /**
   * Get attributeFirstName
   * @return attributeFirstName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttributeFirstName() {
    return attributeFirstName;
  }

  public void setAttributeFirstName(String attributeFirstName) {
    this.attributeFirstName = attributeFirstName;
  }

  public LdapServerDto attributeGroupname(String attributeGroupname) {
    this.attributeGroupname = attributeGroupname;
    return this;
  }

   /**
   * Get attributeGroupname
   * @return attributeGroupname
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttributeGroupname() {
    return attributeGroupname;
  }

  public void setAttributeGroupname(String attributeGroupname) {
    this.attributeGroupname = attributeGroupname;
  }

  public LdapServerDto attributeLastName(String attributeLastName) {
    this.attributeLastName = attributeLastName;
    return this;
  }

   /**
   * Get attributeLastName
   * @return attributeLastName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttributeLastName() {
    return attributeLastName;
  }

  public void setAttributeLastName(String attributeLastName) {
    this.attributeLastName = attributeLastName;
  }

  public LdapServerDto attributeMember(String attributeMember) {
    this.attributeMember = attributeMember;
    return this;
  }

   /**
   * Get attributeMember
   * @return attributeMember
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttributeMember() {
    return attributeMember;
  }

  public void setAttributeMember(String attributeMember) {
    this.attributeMember = attributeMember;
  }

  public LdapServerDto attributeMemberOf(String attributeMemberOf) {
    this.attributeMemberOf = attributeMemberOf;
    return this;
  }

   /**
   * Get attributeMemberOf
   * @return attributeMemberOf
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttributeMemberOf() {
    return attributeMemberOf;
  }

  public void setAttributeMemberOf(String attributeMemberOf) {
    this.attributeMemberOf = attributeMemberOf;
  }

  public LdapServerDto attributeObjectClass(String attributeObjectClass) {
    this.attributeObjectClass = attributeObjectClass;
    return this;
  }

   /**
   * Get attributeObjectClass
   * @return attributeObjectClass
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttributeObjectClass() {
    return attributeObjectClass;
  }

  public void setAttributeObjectClass(String attributeObjectClass) {
    this.attributeObjectClass = attributeObjectClass;
  }

  public LdapServerDto attributeObjectSid(String attributeObjectSid) {
    this.attributeObjectSid = attributeObjectSid;
    return this;
  }

   /**
   * Get attributeObjectSid
   * @return attributeObjectSid
  **/
  @ApiModelProperty(value = "")
  public String getAttributeObjectSid() {
    return attributeObjectSid;
  }

  public void setAttributeObjectSid(String attributeObjectSid) {
    this.attributeObjectSid = attributeObjectSid;
  }

  public LdapServerDto attributeOrgunitName(String attributeOrgunitName) {
    this.attributeOrgunitName = attributeOrgunitName;
    return this;
  }

   /**
   * Get attributeOrgunitName
   * @return attributeOrgunitName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttributeOrgunitName() {
    return attributeOrgunitName;
  }

  public void setAttributeOrgunitName(String attributeOrgunitName) {
    this.attributeOrgunitName = attributeOrgunitName;
  }

  public LdapServerDto attributePassword(String attributePassword) {
    this.attributePassword = attributePassword;
    return this;
  }

   /**
   * Get attributePassword
   * @return attributePassword
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttributePassword() {
    return attributePassword;
  }

  public void setAttributePassword(String attributePassword) {
    this.attributePassword = attributePassword;
  }

  public LdapServerDto attributeThumbnailMimeDefault(String attributeThumbnailMimeDefault) {
    this.attributeThumbnailMimeDefault = attributeThumbnailMimeDefault;
    return this;
  }

   /**
   * Get attributeThumbnailMimeDefault
   * @return attributeThumbnailMimeDefault
  **/
  @ApiModelProperty(value = "")
  public String getAttributeThumbnailMimeDefault() {
    return attributeThumbnailMimeDefault;
  }

  public void setAttributeThumbnailMimeDefault(String attributeThumbnailMimeDefault) {
    this.attributeThumbnailMimeDefault = attributeThumbnailMimeDefault;
  }

  public LdapServerDto attributeThumbnailPhoto(String attributeThumbnailPhoto) {
    this.attributeThumbnailPhoto = attributeThumbnailPhoto;
    return this;
  }

   /**
   * Get attributeThumbnailPhoto
   * @return attributeThumbnailPhoto
  **/
  @ApiModelProperty(value = "")
  public String getAttributeThumbnailPhoto() {
    return attributeThumbnailPhoto;
  }

  public void setAttributeThumbnailPhoto(String attributeThumbnailPhoto) {
    this.attributeThumbnailPhoto = attributeThumbnailPhoto;
  }

  public LdapServerDto attributeUserName(String attributeUserName) {
    this.attributeUserName = attributeUserName;
    return this;
  }

   /**
   * Get attributeUserName
   * @return attributeUserName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAttributeUserName() {
    return attributeUserName;
  }

  public void setAttributeUserName(String attributeUserName) {
    this.attributeUserName = attributeUserName;
  }

  public LdapServerDto authenticatorType(AuthenticatorTypeEnum authenticatorType) {
    this.authenticatorType = authenticatorType;
    return this;
  }

   /**
   * Get authenticatorType
   * @return authenticatorType
  **/
  @ApiModelProperty(required = true, value = "")
  public AuthenticatorTypeEnum getAuthenticatorType() {
    return authenticatorType;
  }

  public void setAuthenticatorType(AuthenticatorTypeEnum authenticatorType) {
    this.authenticatorType = authenticatorType;
  }

  public LdapServerDto baseDn(String baseDn) {
    this.baseDn = baseDn;
    return this;
  }

   /**
   * Distinguished name (DN) of root (base) LDAP entity SSC has access to. If value is set to not empty entity&#39;s DN, SSC has access only to this entity and all its children. If value of this attribute is an empty string, SSC has access to whole LDAP entities tree
   * @return baseDn
  **/
  @ApiModelProperty(required = true, value = "Distinguished name (DN) of root (base) LDAP entity SSC has access to. If value is set to not empty entity's DN, SSC has access only to this entity and all its children. If value of this attribute is an empty string, SSC has access to whole LDAP entities tree")
  public String getBaseDn() {
    return baseDn;
  }

  public void setBaseDn(String baseDn) {
    this.baseDn = baseDn;
  }

  public LdapServerDto baseObjectSid(String baseObjectSid) {
    this.baseObjectSid = baseObjectSid;
    return this;
  }

   /**
   * Get baseObjectSid
   * @return baseObjectSid
  **/
  @ApiModelProperty(value = "")
  public String getBaseObjectSid() {
    return baseObjectSid;
  }

  public void setBaseObjectSid(String baseObjectSid) {
    this.baseObjectSid = baseObjectSid;
  }

  public LdapServerDto cacheEnabled(Boolean cacheEnabled) {
    this.cacheEnabled = cacheEnabled;
    return this;
  }

   /**
   * Get cacheEnabled
   * @return cacheEnabled
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isCacheEnabled() {
    return cacheEnabled;
  }

  public void setCacheEnabled(Boolean cacheEnabled) {
    this.cacheEnabled = cacheEnabled;
  }

  public LdapServerDto cacheEvictionTime(Integer cacheEvictionTime) {
    this.cacheEvictionTime = cacheEvictionTime;
    return this;
  }

   /**
   * Get cacheEvictionTime
   * @return cacheEvictionTime
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCacheEvictionTime() {
    return cacheEvictionTime;
  }

  public void setCacheEvictionTime(Integer cacheEvictionTime) {
    this.cacheEvictionTime = cacheEvictionTime;
  }

  public LdapServerDto cacheExecutorPoolSize(Integer cacheExecutorPoolSize) {
    this.cacheExecutorPoolSize = cacheExecutorPoolSize;
    return this;
  }

   /**
   * Get cacheExecutorPoolSize
   * @return cacheExecutorPoolSize
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCacheExecutorPoolSize() {
    return cacheExecutorPoolSize;
  }

  public void setCacheExecutorPoolSize(Integer cacheExecutorPoolSize) {
    this.cacheExecutorPoolSize = cacheExecutorPoolSize;
  }

  public LdapServerDto cacheExecutorPoolSizeMax(Integer cacheExecutorPoolSizeMax) {
    this.cacheExecutorPoolSizeMax = cacheExecutorPoolSizeMax;
    return this;
  }

   /**
   * Get cacheExecutorPoolSizeMax
   * @return cacheExecutorPoolSizeMax
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCacheExecutorPoolSizeMax() {
    return cacheExecutorPoolSizeMax;
  }

  public void setCacheExecutorPoolSizeMax(Integer cacheExecutorPoolSizeMax) {
    this.cacheExecutorPoolSizeMax = cacheExecutorPoolSizeMax;
  }

  public LdapServerDto cacheMaxThreadsPerCache(Integer cacheMaxThreadsPerCache) {
    this.cacheMaxThreadsPerCache = cacheMaxThreadsPerCache;
    return this;
  }

   /**
   * Get cacheMaxThreadsPerCache
   * @return cacheMaxThreadsPerCache
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCacheMaxThreadsPerCache() {
    return cacheMaxThreadsPerCache;
  }

  public void setCacheMaxThreadsPerCache(Integer cacheMaxThreadsPerCache) {
    this.cacheMaxThreadsPerCache = cacheMaxThreadsPerCache;
  }

  public LdapServerDto checkSslHostname(Boolean checkSslHostname) {
    this.checkSslHostname = checkSslHostname;
    return this;
  }

   /**
   * Get checkSslHostname
   * @return checkSslHostname
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isCheckSslHostname() {
    return checkSslHostname;
  }

  public void setCheckSslHostname(Boolean checkSslHostname) {
    this.checkSslHostname = checkSslHostname;
  }

  public LdapServerDto checkSslTrust(Boolean checkSslTrust) {
    this.checkSslTrust = checkSslTrust;
    return this;
  }

   /**
   * Get checkSslTrust
   * @return checkSslTrust
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isCheckSslTrust() {
    return checkSslTrust;
  }

  public void setCheckSslTrust(Boolean checkSslTrust) {
    this.checkSslTrust = checkSslTrust;
  }

  public LdapServerDto classGroup(String classGroup) {
    this.classGroup = classGroup;
    return this;
  }

   /**
   * Get classGroup
   * @return classGroup
  **/
  @ApiModelProperty(required = true, value = "")
  public String getClassGroup() {
    return classGroup;
  }

  public void setClassGroup(String classGroup) {
    this.classGroup = classGroup;
  }

  public LdapServerDto classOrgunit(String classOrgunit) {
    this.classOrgunit = classOrgunit;
    return this;
  }

   /**
   * Get classOrgunit
   * @return classOrgunit
  **/
  @ApiModelProperty(required = true, value = "")
  public String getClassOrgunit() {
    return classOrgunit;
  }

  public void setClassOrgunit(String classOrgunit) {
    this.classOrgunit = classOrgunit;
  }

  public LdapServerDto classUser(String classUser) {
    this.classUser = classUser;
    return this;
  }

   /**
   * Get classUser
   * @return classUser
  **/
  @ApiModelProperty(required = true, value = "")
  public String getClassUser() {
    return classUser;
  }

  public void setClassUser(String classUser) {
    this.classUser = classUser;
  }

  public LdapServerDto defaultServer(Boolean defaultServer) {
    this.defaultServer = defaultServer;
    return this;
  }

   /**
   * Boolean flag that marks LDAP server as default. Default means the server which configuration was imported from ldap.properties legacy configuration file
   * @return defaultServer
  **/
  @ApiModelProperty(example = "false", required = true, value = "Boolean flag that marks LDAP server as default. Default means the server which configuration was imported from ldap.properties legacy configuration file")
  public Boolean isDefaultServer() {
    return defaultServer;
  }

  public void setDefaultServer(Boolean defaultServer) {
    this.defaultServer = defaultServer;
  }

  public LdapServerDto enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Flag that marks server as enabled. All enabled servers are used by SSC. Server can be temporary disabled if it is temporary down.
   * @return enabled
  **/
  @ApiModelProperty(example = "false", required = true, value = "Flag that marks server as enabled. All enabled servers are used by SSC. Server can be temporary disabled if it is temporary down.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

   /**
   * LDAP Server id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "LDAP Server id")
  public Long getId() {
    return id;
  }

  public LdapServerDto ignorePartialResultException(Boolean ignorePartialResultException) {
    this.ignorePartialResultException = ignorePartialResultException;
    return this;
  }

   /**
   * Get ignorePartialResultException
   * @return ignorePartialResultException
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isIgnorePartialResultException() {
    return ignorePartialResultException;
  }

  public void setIgnorePartialResultException(Boolean ignorePartialResultException) {
    this.ignorePartialResultException = ignorePartialResultException;
  }

  public LdapServerDto nestedGroupsEnabled(Boolean nestedGroupsEnabled) {
    this.nestedGroupsEnabled = nestedGroupsEnabled;
    return this;
  }

   /**
   * Get nestedGroupsEnabled
   * @return nestedGroupsEnabled
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isNestedGroupsEnabled() {
    return nestedGroupsEnabled;
  }

  public void setNestedGroupsEnabled(Boolean nestedGroupsEnabled) {
    this.nestedGroupsEnabled = nestedGroupsEnabled;
  }

   /**
   * Version of the LDAP server entity to support editing LDAP server entity by multiply administrators
   * @return objectVersion
  **/
  @ApiModelProperty(required = true, value = "Version of the LDAP server entity to support editing LDAP server entity by multiply administrators")
  public Integer getObjectVersion() {
    return objectVersion;
  }

  public LdapServerDto pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public LdapServerDto pagingEnabled(Boolean pagingEnabled) {
    this.pagingEnabled = pagingEnabled;
    return this;
  }

   /**
   * Get pagingEnabled
   * @return pagingEnabled
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isPagingEnabled() {
    return pagingEnabled;
  }

  public void setPagingEnabled(Boolean pagingEnabled) {
    this.pagingEnabled = pagingEnabled;
  }

  public LdapServerDto passwordEncoderType(PasswordEncoderTypeEnum passwordEncoderType) {
    this.passwordEncoderType = passwordEncoderType;
    return this;
  }

   /**
   * Get passwordEncoderType
   * @return passwordEncoderType
  **/
  @ApiModelProperty(required = true, value = "")
  public PasswordEncoderTypeEnum getPasswordEncoderType() {
    return passwordEncoderType;
  }

  public void setPasswordEncoderType(PasswordEncoderTypeEnum passwordEncoderType) {
    this.passwordEncoderType = passwordEncoderType;
  }

  public LdapServerDto referralsProcessingStrategy(ReferralsProcessingStrategyEnum referralsProcessingStrategy) {
    this.referralsProcessingStrategy = referralsProcessingStrategy;
    return this;
  }

   /**
   * Get referralsProcessingStrategy
   * @return referralsProcessingStrategy
  **/
  @ApiModelProperty(required = true, value = "")
  public ReferralsProcessingStrategyEnum getReferralsProcessingStrategy() {
    return referralsProcessingStrategy;
  }

  public void setReferralsProcessingStrategy(ReferralsProcessingStrategyEnum referralsProcessingStrategy) {
    this.referralsProcessingStrategy = referralsProcessingStrategy;
  }

  public LdapServerDto saveWithoutValidation(Boolean saveWithoutValidation) {
    this.saveWithoutValidation = saveWithoutValidation;
    return this;
  }

   /**
   * Get saveWithoutValidation
   * @return saveWithoutValidation
  **/
  @ApiModelProperty(value = "")
  public Boolean isSaveWithoutValidation() {
    return saveWithoutValidation;
  }

  public void setSaveWithoutValidation(Boolean saveWithoutValidation) {
    this.saveWithoutValidation = saveWithoutValidation;
  }

  public LdapServerDto searchDns(String searchDns) {
    this.searchDns = searchDns;
    return this;
  }

   /**
   * Get searchDns
   * @return searchDns
  **/
  @ApiModelProperty(value = "")
  public String getSearchDns() {
    return searchDns;
  }

  public void setSearchDns(String searchDns) {
    this.searchDns = searchDns;
  }

  public LdapServerDto serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * Name of the LDAP server to distinguish it from other servers
   * @return serverName
  **/
  @ApiModelProperty(required = true, value = "Name of the LDAP server to distinguish it from other servers")
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public LdapServerDto url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public LdapServerDto userDn(String userDn) {
    this.userDn = userDn;
    return this;
  }

   /**
   * Get userDn
   * @return userDn
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUserDn() {
    return userDn;
  }

  public void setUserDn(String userDn) {
    this.userDn = userDn;
  }

  public LdapServerDto userPassword(String userPassword) {
    this.userPassword = userPassword;
    return this;
  }

   /**
   * Get userPassword
   * @return userPassword
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public LdapServerDto userPhotoEnabled(Boolean userPhotoEnabled) {
    this.userPhotoEnabled = userPhotoEnabled;
    return this;
  }

   /**
   * Get userPhotoEnabled
   * @return userPhotoEnabled
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isUserPhotoEnabled() {
    return userPhotoEnabled;
  }

  public void setUserPhotoEnabled(Boolean userPhotoEnabled) {
    this.userPhotoEnabled = userPhotoEnabled;
  }

  public LdapServerDto validationIdleTime(Integer validationIdleTime) {
    this.validationIdleTime = validationIdleTime;
    return this;
  }

   /**
   * Get validationIdleTime
   * @return validationIdleTime
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getValidationIdleTime() {
    return validationIdleTime;
  }

  public void setValidationIdleTime(Integer validationIdleTime) {
    this.validationIdleTime = validationIdleTime;
  }

  public LdapServerDto validationTimeLimit(Integer validationTimeLimit) {
    this.validationTimeLimit = validationTimeLimit;
    return this;
  }

   /**
   * Get validationTimeLimit
   * @return validationTimeLimit
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getValidationTimeLimit() {
    return validationTimeLimit;
  }

  public void setValidationTimeLimit(Integer validationTimeLimit) {
    this.validationTimeLimit = validationTimeLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapServerDto ldapServerDto = (LdapServerDto) o;
    return Objects.equals(this.attributeDistinguishedName, ldapServerDto.attributeDistinguishedName) &&
        Objects.equals(this.attributeEmail, ldapServerDto.attributeEmail) &&
        Objects.equals(this.attributeFirstName, ldapServerDto.attributeFirstName) &&
        Objects.equals(this.attributeGroupname, ldapServerDto.attributeGroupname) &&
        Objects.equals(this.attributeLastName, ldapServerDto.attributeLastName) &&
        Objects.equals(this.attributeMember, ldapServerDto.attributeMember) &&
        Objects.equals(this.attributeMemberOf, ldapServerDto.attributeMemberOf) &&
        Objects.equals(this.attributeObjectClass, ldapServerDto.attributeObjectClass) &&
        Objects.equals(this.attributeObjectSid, ldapServerDto.attributeObjectSid) &&
        Objects.equals(this.attributeOrgunitName, ldapServerDto.attributeOrgunitName) &&
        Objects.equals(this.attributePassword, ldapServerDto.attributePassword) &&
        Objects.equals(this.attributeThumbnailMimeDefault, ldapServerDto.attributeThumbnailMimeDefault) &&
        Objects.equals(this.attributeThumbnailPhoto, ldapServerDto.attributeThumbnailPhoto) &&
        Objects.equals(this.attributeUserName, ldapServerDto.attributeUserName) &&
        Objects.equals(this.authenticatorType, ldapServerDto.authenticatorType) &&
        Objects.equals(this.baseDn, ldapServerDto.baseDn) &&
        Objects.equals(this.baseObjectSid, ldapServerDto.baseObjectSid) &&
        Objects.equals(this.cacheEnabled, ldapServerDto.cacheEnabled) &&
        Objects.equals(this.cacheEvictionTime, ldapServerDto.cacheEvictionTime) &&
        Objects.equals(this.cacheExecutorPoolSize, ldapServerDto.cacheExecutorPoolSize) &&
        Objects.equals(this.cacheExecutorPoolSizeMax, ldapServerDto.cacheExecutorPoolSizeMax) &&
        Objects.equals(this.cacheMaxThreadsPerCache, ldapServerDto.cacheMaxThreadsPerCache) &&
        Objects.equals(this.checkSslHostname, ldapServerDto.checkSslHostname) &&
        Objects.equals(this.checkSslTrust, ldapServerDto.checkSslTrust) &&
        Objects.equals(this.classGroup, ldapServerDto.classGroup) &&
        Objects.equals(this.classOrgunit, ldapServerDto.classOrgunit) &&
        Objects.equals(this.classUser, ldapServerDto.classUser) &&
        Objects.equals(this.defaultServer, ldapServerDto.defaultServer) &&
        Objects.equals(this.enabled, ldapServerDto.enabled) &&
        Objects.equals(this.id, ldapServerDto.id) &&
        Objects.equals(this.ignorePartialResultException, ldapServerDto.ignorePartialResultException) &&
        Objects.equals(this.nestedGroupsEnabled, ldapServerDto.nestedGroupsEnabled) &&
        Objects.equals(this.objectVersion, ldapServerDto.objectVersion) &&
        Objects.equals(this.pageSize, ldapServerDto.pageSize) &&
        Objects.equals(this.pagingEnabled, ldapServerDto.pagingEnabled) &&
        Objects.equals(this.passwordEncoderType, ldapServerDto.passwordEncoderType) &&
        Objects.equals(this.referralsProcessingStrategy, ldapServerDto.referralsProcessingStrategy) &&
        Objects.equals(this.saveWithoutValidation, ldapServerDto.saveWithoutValidation) &&
        Objects.equals(this.searchDns, ldapServerDto.searchDns) &&
        Objects.equals(this.serverName, ldapServerDto.serverName) &&
        Objects.equals(this.url, ldapServerDto.url) &&
        Objects.equals(this.userDn, ldapServerDto.userDn) &&
        Objects.equals(this.userPassword, ldapServerDto.userPassword) &&
        Objects.equals(this.userPhotoEnabled, ldapServerDto.userPhotoEnabled) &&
        Objects.equals(this.validationIdleTime, ldapServerDto.validationIdleTime) &&
        Objects.equals(this.validationTimeLimit, ldapServerDto.validationTimeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeDistinguishedName, attributeEmail, attributeFirstName, attributeGroupname, attributeLastName, attributeMember, attributeMemberOf, attributeObjectClass, attributeObjectSid, attributeOrgunitName, attributePassword, attributeThumbnailMimeDefault, attributeThumbnailPhoto, attributeUserName, authenticatorType, baseDn, baseObjectSid, cacheEnabled, cacheEvictionTime, cacheExecutorPoolSize, cacheExecutorPoolSizeMax, cacheMaxThreadsPerCache, checkSslHostname, checkSslTrust, classGroup, classOrgunit, classUser, defaultServer, enabled, id, ignorePartialResultException, nestedGroupsEnabled, objectVersion, pageSize, pagingEnabled, passwordEncoderType, referralsProcessingStrategy, saveWithoutValidation, searchDns, serverName, url, userDn, userPassword, userPhotoEnabled, validationIdleTime, validationTimeLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapServerDto {\n");
    
    sb.append("    attributeDistinguishedName: ").append(toIndentedString(attributeDistinguishedName)).append("\n");
    sb.append("    attributeEmail: ").append(toIndentedString(attributeEmail)).append("\n");
    sb.append("    attributeFirstName: ").append(toIndentedString(attributeFirstName)).append("\n");
    sb.append("    attributeGroupname: ").append(toIndentedString(attributeGroupname)).append("\n");
    sb.append("    attributeLastName: ").append(toIndentedString(attributeLastName)).append("\n");
    sb.append("    attributeMember: ").append(toIndentedString(attributeMember)).append("\n");
    sb.append("    attributeMemberOf: ").append(toIndentedString(attributeMemberOf)).append("\n");
    sb.append("    attributeObjectClass: ").append(toIndentedString(attributeObjectClass)).append("\n");
    sb.append("    attributeObjectSid: ").append(toIndentedString(attributeObjectSid)).append("\n");
    sb.append("    attributeOrgunitName: ").append(toIndentedString(attributeOrgunitName)).append("\n");
    sb.append("    attributePassword: ").append(toIndentedString(attributePassword)).append("\n");
    sb.append("    attributeThumbnailMimeDefault: ").append(toIndentedString(attributeThumbnailMimeDefault)).append("\n");
    sb.append("    attributeThumbnailPhoto: ").append(toIndentedString(attributeThumbnailPhoto)).append("\n");
    sb.append("    attributeUserName: ").append(toIndentedString(attributeUserName)).append("\n");
    sb.append("    authenticatorType: ").append(toIndentedString(authenticatorType)).append("\n");
    sb.append("    baseDn: ").append(toIndentedString(baseDn)).append("\n");
    sb.append("    baseObjectSid: ").append(toIndentedString(baseObjectSid)).append("\n");
    sb.append("    cacheEnabled: ").append(toIndentedString(cacheEnabled)).append("\n");
    sb.append("    cacheEvictionTime: ").append(toIndentedString(cacheEvictionTime)).append("\n");
    sb.append("    cacheExecutorPoolSize: ").append(toIndentedString(cacheExecutorPoolSize)).append("\n");
    sb.append("    cacheExecutorPoolSizeMax: ").append(toIndentedString(cacheExecutorPoolSizeMax)).append("\n");
    sb.append("    cacheMaxThreadsPerCache: ").append(toIndentedString(cacheMaxThreadsPerCache)).append("\n");
    sb.append("    checkSslHostname: ").append(toIndentedString(checkSslHostname)).append("\n");
    sb.append("    checkSslTrust: ").append(toIndentedString(checkSslTrust)).append("\n");
    sb.append("    classGroup: ").append(toIndentedString(classGroup)).append("\n");
    sb.append("    classOrgunit: ").append(toIndentedString(classOrgunit)).append("\n");
    sb.append("    classUser: ").append(toIndentedString(classUser)).append("\n");
    sb.append("    defaultServer: ").append(toIndentedString(defaultServer)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignorePartialResultException: ").append(toIndentedString(ignorePartialResultException)).append("\n");
    sb.append("    nestedGroupsEnabled: ").append(toIndentedString(nestedGroupsEnabled)).append("\n");
    sb.append("    objectVersion: ").append(toIndentedString(objectVersion)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pagingEnabled: ").append(toIndentedString(pagingEnabled)).append("\n");
    sb.append("    passwordEncoderType: ").append(toIndentedString(passwordEncoderType)).append("\n");
    sb.append("    referralsProcessingStrategy: ").append(toIndentedString(referralsProcessingStrategy)).append("\n");
    sb.append("    saveWithoutValidation: ").append(toIndentedString(saveWithoutValidation)).append("\n");
    sb.append("    searchDns: ").append(toIndentedString(searchDns)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userDn: ").append(toIndentedString(userDn)).append("\n");
    sb.append("    userPassword: ").append(toIndentedString(userPassword)).append("\n");
    sb.append("    userPhotoEnabled: ").append(toIndentedString(userPhotoEnabled)).append("\n");
    sb.append("    validationIdleTime: ").append(toIndentedString(validationIdleTime)).append("\n");
    sb.append("    validationTimeLimit: ").append(toIndentedString(validationTimeLimit)).append("\n");
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
