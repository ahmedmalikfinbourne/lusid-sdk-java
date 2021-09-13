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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The time invariant unique identifier of the quote. Combined with the effective datetime of the quote this  uniquely identifies the quote. This can be thought of as a unique identifier for a time series of quotes.
 */
@ApiModel(description = "The time invariant unique identifier of the quote. Combined with the effective datetime of the quote this  uniquely identifies the quote. This can be thought of as a unique identifier for a time series of quotes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuoteSeriesId {
  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_PRICE_SOURCE = "priceSource";
  @SerializedName(SERIALIZED_NAME_PRICE_SOURCE)
  private String priceSource;

  public static final String SERIALIZED_NAME_INSTRUMENT_ID = "instrumentId";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_ID)
  private String instrumentId;

  /**
   * The type of instrument identifier used to uniquely identify the instrument that the quote is for, e.g. &#39;Figi&#39;. The available values are: LusidInstrumentId, Figi, RIC, QuotePermId, Isin, CurrencyPair, ClientInternal
   */
  @JsonAdapter(InstrumentIdTypeEnum.Adapter.class)
  public enum InstrumentIdTypeEnum {
    LUSIDINSTRUMENTID("LusidInstrumentId"),
    
    FIGI("Figi"),
    
    RIC("RIC"),
    
    QUOTEPERMID("QuotePermId"),
    
    ISIN("Isin"),
    
    CURRENCYPAIR("CurrencyPair"),
    
    CLIENTINTERNAL("ClientInternal");

    private String value;

    InstrumentIdTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InstrumentIdTypeEnum fromValue(String value) {
      for (InstrumentIdTypeEnum b : InstrumentIdTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InstrumentIdTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstrumentIdTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstrumentIdTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InstrumentIdTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INSTRUMENT_ID_TYPE = "instrumentIdType";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_ID_TYPE)
  private InstrumentIdTypeEnum instrumentIdType;

  /**
   * The type of the quote. This allows for quotes other than prices e.g. rates or spreads to be used. The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront
   */
  @JsonAdapter(QuoteTypeEnum.Adapter.class)
  public enum QuoteTypeEnum {
    PRICE("Price"),
    
    SPREAD("Spread"),
    
    RATE("Rate"),
    
    LOGNORMALVOL("LogNormalVol"),
    
    NORMALVOL("NormalVol"),
    
    PARSPREAD("ParSpread"),
    
    ISDASPREAD("IsdaSpread"),
    
    UPFRONT("Upfront");

    private String value;

    QuoteTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QuoteTypeEnum fromValue(String value) {
      for (QuoteTypeEnum b : QuoteTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<QuoteTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QuoteTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QuoteTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QuoteTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUOTE_TYPE = "quoteType";
  @SerializedName(SERIALIZED_NAME_QUOTE_TYPE)
  private QuoteTypeEnum quoteType;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;


  public QuoteSeriesId provider(String provider) {
    this.provider = provider; 
    return this;
  }

   /**
   * The platform or vendor that provided the quote, e.g. &#39;DataScope&#39;, &#39;LUSID&#39; etc.
   * @return provider
  **/
  @ApiModelProperty(required = true, value = "The platform or vendor that provided the quote, e.g. 'DataScope', 'LUSID' etc.")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }


  public QuoteSeriesId priceSource(String priceSource) {
    this.priceSource = priceSource; 
    return this;
  }

   /**
   * The source or originator of the quote, e.g. a bank or financial institution.
   * @return priceSource
  **/
  @ApiModelProperty(value = "The source or originator of the quote, e.g. a bank or financial institution.")
  public String getPriceSource() {
    return priceSource;
  }

  public void setPriceSource(String priceSource) {
    this.priceSource = priceSource;
  }


  public QuoteSeriesId instrumentId(String instrumentId) {
    this.instrumentId = instrumentId; 
    return this;
  }

   /**
   * The value of the instrument identifier that uniquely identifies the instrument that the quote is for, e.g. &#39;BBG00JX0P539&#39;.
   * @return instrumentId
  **/
  @ApiModelProperty(required = true, value = "The value of the instrument identifier that uniquely identifies the instrument that the quote is for, e.g. 'BBG00JX0P539'.")
  public String getInstrumentId() {
    return instrumentId;
  }

  public void setInstrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
  }


  public QuoteSeriesId instrumentIdType(InstrumentIdTypeEnum instrumentIdType) {
    this.instrumentIdType = instrumentIdType; 
    return this;
  }

   /**
   * The type of instrument identifier used to uniquely identify the instrument that the quote is for, e.g. &#39;Figi&#39;. The available values are: LusidInstrumentId, Figi, RIC, QuotePermId, Isin, CurrencyPair, ClientInternal
   * @return instrumentIdType
  **/
  @ApiModelProperty(required = true, value = "The type of instrument identifier used to uniquely identify the instrument that the quote is for, e.g. 'Figi'. The available values are: LusidInstrumentId, Figi, RIC, QuotePermId, Isin, CurrencyPair, ClientInternal")
  public InstrumentIdTypeEnum getInstrumentIdType() {
    return instrumentIdType;
  }

  public void setInstrumentIdType(InstrumentIdTypeEnum instrumentIdType) {
    this.instrumentIdType = instrumentIdType;
  }


  public QuoteSeriesId quoteType(QuoteTypeEnum quoteType) {
    this.quoteType = quoteType; 
    return this;
  }

   /**
   * The type of the quote. This allows for quotes other than prices e.g. rates or spreads to be used. The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront
   * @return quoteType
  **/
  @ApiModelProperty(required = true, value = "The type of the quote. This allows for quotes other than prices e.g. rates or spreads to be used. The available values are: Price, Spread, Rate, LogNormalVol, NormalVol, ParSpread, IsdaSpread, Upfront")
  public QuoteTypeEnum getQuoteType() {
    return quoteType;
  }

  public void setQuoteType(QuoteTypeEnum quoteType) {
    this.quoteType = quoteType;
  }


  public QuoteSeriesId field(String field) {
    this.field = field; 
    return this;
  }

   /**
   * The field of the quote e.g. bid, mid, ask etc. This should be consistent across a time series of quotes. The allowed values are dependant on the specified Provider.
   * @return field
  **/
  @ApiModelProperty(required = true, value = "The field of the quote e.g. bid, mid, ask etc. This should be consistent across a time series of quotes. The allowed values are dependant on the specified Provider.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
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
    sb.append("class QuoteSeriesId {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    priceSource: ").append(toIndentedString(priceSource)).append("\n");
    sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
    sb.append("    instrumentIdType: ").append(toIndentedString(instrumentIdType)).append("\n");
    sb.append("    quoteType: ").append(toIndentedString(quoteType)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
