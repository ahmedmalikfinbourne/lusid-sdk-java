/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3445
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
import com.finbourne.lusid.model.PortfolioHolding;
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
import java.util.ArrayList;
import java.util.List;

/**
 * VersionedResourceListOfPortfolioHolding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VersionedResourceListOfPortfolioHolding {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<PortfolioHolding> values = new ArrayList<>();

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private String nextPage;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE = "previousPage";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE)
  private String previousPage;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public VersionedResourceListOfPortfolioHolding version(Version version) {
    this.version = version; 
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  public Version getVersion() {
    return version;
  }

  public void setVersion(Version version) {
    this.version = version;
  }


  public VersionedResourceListOfPortfolioHolding values(List<PortfolioHolding> values) {
    this.values = values; 
    return this;
  }

  public VersionedResourceListOfPortfolioHolding addValuesItem(PortfolioHolding valuesItem) {
   
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The resources to list.
   * @return values
  **/
  @ApiModelProperty(required = true, value = "The resources to list.")
  public List<PortfolioHolding> getValues() {
    return values;
  }

  public void setValues(List<PortfolioHolding> values) {
    this.values = values;
  }


  public VersionedResourceListOfPortfolioHolding href(URI href) {
    this.href = href; 
    return this;
  }

   /**
   * The URI of the resource list.
   * @return href
  **/
  @ApiModelProperty(value = "The URI of the resource list.")
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }


  public VersionedResourceListOfPortfolioHolding nextPage(String nextPage) {
    this.nextPage = nextPage; 
    return this;
  }

   /**
   * The next page of results.
   * @return nextPage
  **/
  @ApiModelProperty(value = "The next page of results.")
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  public VersionedResourceListOfPortfolioHolding previousPage(String previousPage) {
    this.previousPage = previousPage; 
    return this;
  }

   /**
   * The previous page of results.
   * @return previousPage
  **/
  @ApiModelProperty(value = "The previous page of results.")
  public String getPreviousPage() {
    return previousPage;
  }

  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }


  public VersionedResourceListOfPortfolioHolding links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public VersionedResourceListOfPortfolioHolding addLinksItem(Link linksItem) {
   
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
    sb.append("class VersionedResourceListOfPortfolioHolding {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
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
