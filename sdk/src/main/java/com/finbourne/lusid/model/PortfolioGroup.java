/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3515
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.ResourceId;
import com.finbourne.lusid.model.Version;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * PortfolioGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortfolioGroup {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_PORTFOLIOS = "portfolios";
  @SerializedName(SERIALIZED_NAME_PORTFOLIOS)
  private List<ResourceId> portfolios = null;

  public static final String SERIALIZED_NAME_SUB_GROUPS = "subGroups";
  @SerializedName(SERIALIZED_NAME_SUB_GROUPS)
  private List<ResourceId> subGroups = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public PortfolioGroup href(URI href) {
    this.href = href; 
    return this;
  }

   /**
   * The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.
   * @return href
  **/
  @ApiModelProperty(value = "The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime.")
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }


  public PortfolioGroup id(ResourceId id) {
    this.id = id; 
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getId() {
    return id;
  }

  public void setId(ResourceId id) {
    this.id = id;
  }


  public PortfolioGroup displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * The name of the portfolio group.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The name of the portfolio group.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public PortfolioGroup description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The long form description of the portfolio group.
   * @return description
  **/
  @ApiModelProperty(value = "The long form description of the portfolio group.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public PortfolioGroup created(OffsetDateTime created) {
    this.created = created; 
    return this;
  }

   /**
   * The effective datetime at which the portfolio group was created. No portfolios or sub groups can be added to the group before this date.
   * @return created
  **/
  @ApiModelProperty(value = "The effective datetime at which the portfolio group was created. No portfolios or sub groups can be added to the group before this date.")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public PortfolioGroup portfolios(List<ResourceId> portfolios) {
    this.portfolios = portfolios; 
    return this;
  }

  public PortfolioGroup addPortfoliosItem(ResourceId portfoliosItem) {
   
    if (this.portfolios == null) {
      this.portfolios = new ArrayList<>();
    }
    this.portfolios.add(portfoliosItem);
    return this;
  }

   /**
   * The collection of resource identifiers for the portfolios contained in the portfolio group.
   * @return portfolios
  **/
  @ApiModelProperty(value = "The collection of resource identifiers for the portfolios contained in the portfolio group.")
  public List<ResourceId> getPortfolios() {
    return portfolios;
  }

  public void setPortfolios(List<ResourceId> portfolios) {
    this.portfolios = portfolios;
  }


  public PortfolioGroup subGroups(List<ResourceId> subGroups) {
    this.subGroups = subGroups; 
    return this;
  }

  public PortfolioGroup addSubGroupsItem(ResourceId subGroupsItem) {
   
    if (this.subGroups == null) {
      this.subGroups = new ArrayList<>();
    }
    this.subGroups.add(subGroupsItem);
    return this;
  }

   /**
   * The collection of resource identifiers for the portfolio groups contained in the portfolio group as sub groups.
   * @return subGroups
  **/
  @ApiModelProperty(value = "The collection of resource identifiers for the portfolio groups contained in the portfolio group as sub groups.")
  public List<ResourceId> getSubGroups() {
    return subGroups;
  }

  public void setSubGroups(List<ResourceId> subGroups) {
    this.subGroups = subGroups;
  }


  public PortfolioGroup version(Version version) {
    this.version = version; 
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }


  public PortfolioGroup links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public PortfolioGroup addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Collection of links.
   * @return links
  **/
  @ApiModelProperty(value = "Collection of links.")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioGroup {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    portfolios: ").append(toIndentedString(portfolios)).append("\n");
    sb.append("    subGroups: ").append(toIndentedString(subGroups)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
