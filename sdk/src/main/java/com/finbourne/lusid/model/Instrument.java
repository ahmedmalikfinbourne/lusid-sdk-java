/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3491
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
import com.finbourne.lusid.model.LusidInstrument;
import com.finbourne.lusid.model.Property;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A list of instruments.
 */
@ApiModel(description = "A list of instruments.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Instrument {
  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_LUSID_INSTRUMENT_ID = "lusidInstrumentId";
  @SerializedName(SERIALIZED_NAME_LUSID_INSTRUMENT_ID)
  private String lusidInstrumentId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private Map<String, String> identifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<Property> properties = null;

  public static final String SERIALIZED_NAME_LOOKTHROUGH_PORTFOLIO = "lookthroughPortfolio";
  @SerializedName(SERIALIZED_NAME_LOOKTHROUGH_PORTFOLIO)
  private ResourceId lookthroughPortfolio;

  public static final String SERIALIZED_NAME_INSTRUMENT_DEFINITION = "instrumentDefinition";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_DEFINITION)
  private LusidInstrument instrumentDefinition;

  /**
   * The state of of the instrument at the asAt datetime of this version of the instrument definition. The available values are: Active, Inactive
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("Active"),
    
    INACTIVE("Inactive");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public Instrument href(URI href) {
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


  public Instrument lusidInstrumentId(String lusidInstrumentId) {
    this.lusidInstrumentId = lusidInstrumentId; 
    return this;
  }

   /**
   * The unique LUSID Instrument Identifier (LUID) of the instrument.
   * @return lusidInstrumentId
  **/
  @ApiModelProperty(required = true, value = "The unique LUSID Instrument Identifier (LUID) of the instrument.")
  public String getLusidInstrumentId() {
    return lusidInstrumentId;
  }

  public void setLusidInstrumentId(String lusidInstrumentId) {
    this.lusidInstrumentId = lusidInstrumentId;
  }


  public Instrument version(Version version) {
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


  public Instrument name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * The name of the instrument.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the instrument.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Instrument identifiers(Map<String, String> identifiers) {
    this.identifiers = identifiers; 
    return this;
  }

  public Instrument putIdentifiersItem(String key, String identifiersItem) {
    this.identifiers.put(key, identifiersItem);
    return this;
  }

   /**
   * The set of identifiers that can be used to identify the instrument.
   * @return identifiers
  **/
  @ApiModelProperty(required = true, value = "The set of identifiers that can be used to identify the instrument.")
  public Map<String, String> getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(Map<String, String> identifiers) {
    this.identifiers = identifiers;
  }


  public Instrument properties(List<Property> properties) {
    this.properties = properties; 
    return this;
  }

  public Instrument addPropertiesItem(Property propertiesItem) {
   
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * The requested instrument properties. These will be from the &#39;Instrument&#39; domain.
   * @return properties
  **/
  @ApiModelProperty(value = "The requested instrument properties. These will be from the 'Instrument' domain.")
  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }


  public Instrument lookthroughPortfolio(ResourceId lookthroughPortfolio) {
    this.lookthroughPortfolio = lookthroughPortfolio; 
    return this;
  }

   /**
   * Get lookthroughPortfolio
   * @return lookthroughPortfolio
  **/
  @ApiModelProperty(value = "")
  public ResourceId getLookthroughPortfolio() {
    return lookthroughPortfolio;
  }

  public void setLookthroughPortfolio(ResourceId lookthroughPortfolio) {
    this.lookthroughPortfolio = lookthroughPortfolio;
  }


  public Instrument instrumentDefinition(LusidInstrument instrumentDefinition) {
    this.instrumentDefinition = instrumentDefinition; 
    return this;
  }

   /**
   * Get instrumentDefinition
   * @return instrumentDefinition
  **/
  @ApiModelProperty(value = "")
  public LusidInstrument getInstrumentDefinition() {
    return instrumentDefinition;
  }

  public void setInstrumentDefinition(LusidInstrument instrumentDefinition) {
    this.instrumentDefinition = instrumentDefinition;
  }


  public Instrument state(StateEnum state) {
    this.state = state; 
    return this;
  }

   /**
   * The state of of the instrument at the asAt datetime of this version of the instrument definition. The available values are: Active, Inactive
   * @return state
  **/
  @ApiModelProperty(required = true, value = "The state of of the instrument at the asAt datetime of this version of the instrument definition. The available values are: Active, Inactive")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  public Instrument links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public Instrument addLinksItem(Link linksItem) {
   
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
    sb.append("class Instrument {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    lusidInstrumentId: ").append(toIndentedString(lusidInstrumentId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    lookthroughPortfolio: ").append(toIndentedString(lookthroughPortfolio)).append("\n");
    sb.append("    instrumentDefinition: ").append(toIndentedString(instrumentDefinition)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
