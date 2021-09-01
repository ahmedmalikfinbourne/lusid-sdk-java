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
import com.finbourne.lusid.model.AccessControlledAction;
import com.finbourne.lusid.model.IdentifierPartSchema;
import com.finbourne.lusid.model.Link;
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
 * A resource to which access can be controlled
 */
@ApiModel(description = "A resource to which access can be controlled")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessControlledResource {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<AccessControlledAction> actions = new ArrayList<>();

  public static final String SERIALIZED_NAME_IDENTIFIER_PARTS = "identifierParts";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER_PARTS)
  private List<IdentifierPartSchema> identifierParts = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public AccessControlledResource application(String application) {
    this.application = application; 
    return this;
  }

   /**
   * The application to which this resource belongs
   * @return application
  **/
  @ApiModelProperty(value = "The application to which this resource belongs")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }


  public AccessControlledResource name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * The display name of the resource
   * @return name
  **/
  @ApiModelProperty(value = "The display name of the resource")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessControlledResource description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The description of the resource
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the resource")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AccessControlledResource actions(List<AccessControlledAction> actions) {
    this.actions = actions; 
    return this;
  }

  public AccessControlledResource addActionsItem(AccessControlledAction actionsItem) {
   
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * The actions acceptable for this type of resource
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "The actions acceptable for this type of resource")
  public List<AccessControlledAction> getActions() {
    return actions;
  }

  public void setActions(List<AccessControlledAction> actions) {
    this.actions = actions;
  }


  public AccessControlledResource identifierParts(List<IdentifierPartSchema> identifierParts) {
    this.identifierParts = identifierParts; 
    return this;
  }

  public AccessControlledResource addIdentifierPartsItem(IdentifierPartSchema identifierPartsItem) {
   
    if (this.identifierParts == null) {
      this.identifierParts = new ArrayList<>();
    }
    this.identifierParts.add(identifierPartsItem);
    return this;
  }

   /**
   * The constituent parts of a valid identifier for this resource
   * @return identifierParts
  **/
  @ApiModelProperty(value = "The constituent parts of a valid identifier for this resource")
  public List<IdentifierPartSchema> getIdentifierParts() {
    return identifierParts;
  }

  public void setIdentifierParts(List<IdentifierPartSchema> identifierParts) {
    this.identifierParts = identifierParts;
  }


  public AccessControlledResource links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public AccessControlledResource addLinksItem(Link linksItem) {
   
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
    sb.append("class AccessControlledResource {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    identifierParts: ").append(toIndentedString(identifierParts)).append("\n");
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
