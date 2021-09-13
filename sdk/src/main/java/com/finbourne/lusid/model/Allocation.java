/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) | 
 *
 * The version of the OpenAPI document: 0.11.3484
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.CurrencyAndAmount;
import com.finbourne.lusid.model.Link;
import com.finbourne.lusid.model.PerpetualProperty;
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * An Allocation of a certain quantity of a specific instrument against an originating  Order.
 */
@ApiModel(description = "An Allocation of a certain quantity of a specific instrument against an originating  Order.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Allocation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_ALLOCATED_ORDER_ID = "allocatedOrderId";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_ORDER_ID)
  private ResourceId allocatedOrderId;

  public static final String SERIALIZED_NAME_PORTFOLIO_ID = "portfolioId";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_ID)
  private ResourceId portfolioId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS = "instrumentIdentifiers";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_IDENTIFIERS)
  private Map<String, String> instrumentIdentifiers = new HashMap<>();

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PerpetualProperty> properties = null;

  public static final String SERIALIZED_NAME_LUSID_INSTRUMENT_ID = "lusidInstrumentId";
  @SerializedName(SERIALIZED_NAME_LUSID_INSTRUMENT_ID)
  private String lusidInstrumentId;

  public static final String SERIALIZED_NAME_PLACEMENT_IDS = "placementIds";
  @SerializedName(SERIALIZED_NAME_PLACEMENT_IDS)
  private List<ResourceId> placementIds = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private String side;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SETTLEMENT_DATE = "settlementDate";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_DATE)
  private OffsetDateTime settlementDate;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private CurrencyAndAmount price;

  public static final String SERIALIZED_NAME_SETTLEMENT_CURRENCY = "settlementCurrency";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_CURRENCY)
  private String settlementCurrency;

  public static final String SERIALIZED_NAME_SETTLEMENT_CURRENCY_FX_RATE = "settlementCurrencyFxRate";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_CURRENCY_FX_RATE)
  private Double settlementCurrencyFxRate;

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private String counterparty;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public Allocation id(ResourceId id) {
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


  public Allocation allocatedOrderId(ResourceId allocatedOrderId) {
    this.allocatedOrderId = allocatedOrderId; 
    return this;
  }

   /**
   * Get allocatedOrderId
   * @return allocatedOrderId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getAllocatedOrderId() {
    return allocatedOrderId;
  }

  public void setAllocatedOrderId(ResourceId allocatedOrderId) {
    this.allocatedOrderId = allocatedOrderId;
  }


  public Allocation portfolioId(ResourceId portfolioId) {
    this.portfolioId = portfolioId; 
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(ResourceId portfolioId) {
    this.portfolioId = portfolioId;
  }


  public Allocation quantity(Integer quantity) {
    this.quantity = quantity; 
    return this;
  }

   /**
   * The quantity of given instrument allocated.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The quantity of given instrument allocated.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public Allocation instrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers; 
    return this;
  }

  public Allocation putInstrumentIdentifiersItem(String key, String instrumentIdentifiersItem) {
    this.instrumentIdentifiers.put(key, instrumentIdentifiersItem);
    return this;
  }

   /**
   * The instrument allocated.
   * @return instrumentIdentifiers
  **/
  @ApiModelProperty(required = true, value = "The instrument allocated.")
  public Map<String, String> getInstrumentIdentifiers() {
    return instrumentIdentifiers;
  }

  public void setInstrumentIdentifiers(Map<String, String> instrumentIdentifiers) {
    this.instrumentIdentifiers = instrumentIdentifiers;
  }


  public Allocation version(Version version) {
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


  public Allocation properties(Map<String, PerpetualProperty> properties) {
    this.properties = properties; 
    return this;
  }

  public Allocation putPropertiesItem(String key, PerpetualProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Client-defined properties associated with this allocation.
   * @return properties
  **/
  @ApiModelProperty(value = "Client-defined properties associated with this allocation.")
  public Map<String, PerpetualProperty> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, PerpetualProperty> properties) {
    this.properties = properties;
  }


  public Allocation lusidInstrumentId(String lusidInstrumentId) {
    this.lusidInstrumentId = lusidInstrumentId; 
    return this;
  }

   /**
   * The LUSID instrument id for the instrument allocated.
   * @return lusidInstrumentId
  **/
  @ApiModelProperty(required = true, value = "The LUSID instrument id for the instrument allocated.")
  public String getLusidInstrumentId() {
    return lusidInstrumentId;
  }

  public void setLusidInstrumentId(String lusidInstrumentId) {
    this.lusidInstrumentId = lusidInstrumentId;
  }


  public Allocation placementIds(List<ResourceId> placementIds) {
    this.placementIds = placementIds; 
    return this;
  }

  public Allocation addPlacementIdsItem(ResourceId placementIdsItem) {
   
    if (this.placementIds == null) {
      this.placementIds = new ArrayList<>();
    }
    this.placementIds.add(placementIdsItem);
    return this;
  }

   /**
   * A placement - also known as an order placed in the market - associated with this allocation.
   * @return placementIds
  **/
  @ApiModelProperty(value = "A placement - also known as an order placed in the market - associated with this allocation.")
  public List<ResourceId> getPlacementIds() {
    return placementIds;
  }

  public void setPlacementIds(List<ResourceId> placementIds) {
    this.placementIds = placementIds;
  }


  public Allocation state(String state) {
    this.state = state; 
    return this;
  }

   /**
   * The state of this allocation.
   * @return state
  **/
  @ApiModelProperty(value = "The state of this allocation.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Allocation side(String side) {
    this.side = side; 
    return this;
  }

   /**
   * The side of this allocation (examples: Buy, Sell, ...).
   * @return side
  **/
  @ApiModelProperty(value = "The side of this allocation (examples: Buy, Sell, ...).")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }


  public Allocation type(String type) {
    this.type = type; 
    return this;
  }

   /**
   * The type of order associated with this allocation (examples: Limit, Market, ...).
   * @return type
  **/
  @ApiModelProperty(value = "The type of order associated with this allocation (examples: Limit, Market, ...).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Allocation settlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate; 
    return this;
  }

   /**
   * The settlement date for this allocation.
   * @return settlementDate
  **/
  @ApiModelProperty(value = "The settlement date for this allocation.")
  public OffsetDateTime getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(OffsetDateTime settlementDate) {
    this.settlementDate = settlementDate;
  }


  public Allocation date(OffsetDateTime date) {
    this.date = date; 
    return this;
  }

   /**
   * The date of this allocation.
   * @return date
  **/
  @ApiModelProperty(value = "The date of this allocation.")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public Allocation price(CurrencyAndAmount price) {
    this.price = price; 
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public CurrencyAndAmount getPrice() {
    return price;
  }

  public void setPrice(CurrencyAndAmount price) {
    this.price = price;
  }


  public Allocation settlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency; 
    return this;
  }

   /**
   * The settlement currency of this allocation.
   * @return settlementCurrency
  **/
  @ApiModelProperty(value = "The settlement currency of this allocation.")
  public String getSettlementCurrency() {
    return settlementCurrency;
  }

  public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }


  public Allocation settlementCurrencyFxRate(Double settlementCurrencyFxRate) {
    this.settlementCurrencyFxRate = settlementCurrencyFxRate; 
    return this;
  }

   /**
   * The settlement currency to allocation currency FX rate.
   * @return settlementCurrencyFxRate
  **/
  @ApiModelProperty(value = "The settlement currency to allocation currency FX rate.")
  public Double getSettlementCurrencyFxRate() {
    return settlementCurrencyFxRate;
  }

  public void setSettlementCurrencyFxRate(Double settlementCurrencyFxRate) {
    this.settlementCurrencyFxRate = settlementCurrencyFxRate;
  }


  public Allocation counterparty(String counterparty) {
    this.counterparty = counterparty; 
    return this;
  }

   /**
   * The counterparty for this allocation.
   * @return counterparty
  **/
  @ApiModelProperty(value = "The counterparty for this allocation.")
  public String getCounterparty() {
    return counterparty;
  }

  public void setCounterparty(String counterparty) {
    this.counterparty = counterparty;
  }


  public Allocation links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public Allocation addLinksItem(Link linksItem) {
   
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
    sb.append("class Allocation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    allocatedOrderId: ").append(toIndentedString(allocatedOrderId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    instrumentIdentifiers: ").append(toIndentedString(instrumentIdentifiers)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    lusidInstrumentId: ").append(toIndentedString(lusidInstrumentId)).append("\n");
    sb.append("    placementIds: ").append(toIndentedString(placementIds)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
    sb.append("    settlementCurrencyFxRate: ").append(toIndentedString(settlementCurrencyFxRate)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
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
