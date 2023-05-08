/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * NullableClass
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NullableClass {
  public static final String SERIALIZED_NAME_INTEGER_PROP = "integer_prop";
  @SerializedName(SERIALIZED_NAME_INTEGER_PROP)
  private Integer integerProp;

  public static final String SERIALIZED_NAME_NUMBER_PROP = "number_prop";
  @SerializedName(SERIALIZED_NAME_NUMBER_PROP)
  private BigDecimal numberProp;

  public static final String SERIALIZED_NAME_BOOLEAN_PROP = "boolean_prop";
  @SerializedName(SERIALIZED_NAME_BOOLEAN_PROP)
  private Boolean booleanProp;

  public static final String SERIALIZED_NAME_STRING_PROP = "string_prop";
  @SerializedName(SERIALIZED_NAME_STRING_PROP)
  private String stringProp;

  public static final String SERIALIZED_NAME_DATE_PROP = "date_prop";
  @SerializedName(SERIALIZED_NAME_DATE_PROP)
  private LocalDate dateProp;

  public static final String SERIALIZED_NAME_DATETIME_PROP = "datetime_prop";
  @SerializedName(SERIALIZED_NAME_DATETIME_PROP)
  private OffsetDateTime datetimeProp;

  public static final String SERIALIZED_NAME_ARRAY_NULLABLE_PROP = "array_nullable_prop";
  @SerializedName(SERIALIZED_NAME_ARRAY_NULLABLE_PROP)
  private List<Object> arrayNullableProp;

  public static final String SERIALIZED_NAME_ARRAY_AND_ITEMS_NULLABLE_PROP = "array_and_items_nullable_prop";
  @SerializedName(SERIALIZED_NAME_ARRAY_AND_ITEMS_NULLABLE_PROP)
  private List<Object> arrayAndItemsNullableProp;

  public static final String SERIALIZED_NAME_ARRAY_ITEMS_NULLABLE = "array_items_nullable";
  @SerializedName(SERIALIZED_NAME_ARRAY_ITEMS_NULLABLE)
  private List<Object> arrayItemsNullable;

  public static final String SERIALIZED_NAME_OBJECT_NULLABLE_PROP = "object_nullable_prop";
  @SerializedName(SERIALIZED_NAME_OBJECT_NULLABLE_PROP)
  private Map<String, Object> objectNullableProp;

  public static final String SERIALIZED_NAME_OBJECT_AND_ITEMS_NULLABLE_PROP = "object_and_items_nullable_prop";
  @SerializedName(SERIALIZED_NAME_OBJECT_AND_ITEMS_NULLABLE_PROP)
  private Map<String, Object> objectAndItemsNullableProp;

  public static final String SERIALIZED_NAME_OBJECT_ITEMS_NULLABLE = "object_items_nullable";
  @SerializedName(SERIALIZED_NAME_OBJECT_ITEMS_NULLABLE)
  private Map<String, Object> objectItemsNullable = new HashMap<>();

  public NullableClass() {
  }

  public NullableClass integerProp(Integer integerProp) {
    
    this.integerProp = integerProp;
    return this;
  }

   /**
   * Get integerProp
   * @return integerProp
  **/
  @javax.annotation.Nullable
  public Integer getIntegerProp() {
    return integerProp;
  }


  public void setIntegerProp(Integer integerProp) {
    this.integerProp = integerProp;
  }


  public NullableClass numberProp(BigDecimal numberProp) {
    
    this.numberProp = numberProp;
    return this;
  }

   /**
   * Get numberProp
   * @return numberProp
  **/
  @javax.annotation.Nullable
  public BigDecimal getNumberProp() {
    return numberProp;
  }


  public void setNumberProp(BigDecimal numberProp) {
    this.numberProp = numberProp;
  }


  public NullableClass booleanProp(Boolean booleanProp) {
    
    this.booleanProp = booleanProp;
    return this;
  }

   /**
   * Get booleanProp
   * @return booleanProp
  **/
  @javax.annotation.Nullable
  public Boolean getBooleanProp() {
    return booleanProp;
  }


  public void setBooleanProp(Boolean booleanProp) {
    this.booleanProp = booleanProp;
  }


  public NullableClass stringProp(String stringProp) {
    
    this.stringProp = stringProp;
    return this;
  }

   /**
   * Get stringProp
   * @return stringProp
  **/
  @javax.annotation.Nullable
  public String getStringProp() {
    return stringProp;
  }


  public void setStringProp(String stringProp) {
    this.stringProp = stringProp;
  }


  public NullableClass dateProp(LocalDate dateProp) {
    
    this.dateProp = dateProp;
    return this;
  }

   /**
   * Get dateProp
   * @return dateProp
  **/
  @javax.annotation.Nullable
  public LocalDate getDateProp() {
    return dateProp;
  }


  public void setDateProp(LocalDate dateProp) {
    this.dateProp = dateProp;
  }


  public NullableClass datetimeProp(OffsetDateTime datetimeProp) {
    
    this.datetimeProp = datetimeProp;
    return this;
  }

   /**
   * Get datetimeProp
   * @return datetimeProp
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDatetimeProp() {
    return datetimeProp;
  }


  public void setDatetimeProp(OffsetDateTime datetimeProp) {
    this.datetimeProp = datetimeProp;
  }


  public NullableClass arrayNullableProp(List<Object> arrayNullableProp) {
    
    this.arrayNullableProp = arrayNullableProp;
    return this;
  }

  public NullableClass addArrayNullablePropItem(Object arrayNullablePropItem) {
    if (this.arrayNullableProp == null) {
      this.arrayNullableProp = new ArrayList<>();
    }
    this.arrayNullableProp.add(arrayNullablePropItem);
    return this;
  }

   /**
   * Get arrayNullableProp
   * @return arrayNullableProp
  **/
  @javax.annotation.Nullable
  public List<Object> getArrayNullableProp() {
    return arrayNullableProp;
  }


  public void setArrayNullableProp(List<Object> arrayNullableProp) {
    this.arrayNullableProp = arrayNullableProp;
  }


  public NullableClass arrayAndItemsNullableProp(List<Object> arrayAndItemsNullableProp) {
    
    this.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
    return this;
  }

  public NullableClass addArrayAndItemsNullablePropItem(Object arrayAndItemsNullablePropItem) {
    if (this.arrayAndItemsNullableProp == null) {
      this.arrayAndItemsNullableProp = new ArrayList<>();
    }
    this.arrayAndItemsNullableProp.add(arrayAndItemsNullablePropItem);
    return this;
  }

   /**
   * Get arrayAndItemsNullableProp
   * @return arrayAndItemsNullableProp
  **/
  @javax.annotation.Nullable
  public List<Object> getArrayAndItemsNullableProp() {
    return arrayAndItemsNullableProp;
  }


  public void setArrayAndItemsNullableProp(List<Object> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
  }


  public NullableClass arrayItemsNullable(List<Object> arrayItemsNullable) {
    
    this.arrayItemsNullable = arrayItemsNullable;
    return this;
  }

  public NullableClass addArrayItemsNullableItem(Object arrayItemsNullableItem) {
    if (this.arrayItemsNullable == null) {
      this.arrayItemsNullable = new ArrayList<>();
    }
    this.arrayItemsNullable.add(arrayItemsNullableItem);
    return this;
  }

   /**
   * Get arrayItemsNullable
   * @return arrayItemsNullable
  **/
  @javax.annotation.Nullable
  public List<Object> getArrayItemsNullable() {
    return arrayItemsNullable;
  }


  public void setArrayItemsNullable(List<Object> arrayItemsNullable) {
    this.arrayItemsNullable = arrayItemsNullable;
  }


  public NullableClass objectNullableProp(Map<String, Object> objectNullableProp) {
    
    this.objectNullableProp = objectNullableProp;
    return this;
  }

  public NullableClass putObjectNullablePropItem(String key, Object objectNullablePropItem) {
    if (this.objectNullableProp == null) {
      this.objectNullableProp = new HashMap<>();
    }
    this.objectNullableProp.put(key, objectNullablePropItem);
    return this;
  }

   /**
   * Get objectNullableProp
   * @return objectNullableProp
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getObjectNullableProp() {
    return objectNullableProp;
  }


  public void setObjectNullableProp(Map<String, Object> objectNullableProp) {
    this.objectNullableProp = objectNullableProp;
  }


  public NullableClass objectAndItemsNullableProp(Map<String, Object> objectAndItemsNullableProp) {
    
    this.objectAndItemsNullableProp = objectAndItemsNullableProp;
    return this;
  }

  public NullableClass putObjectAndItemsNullablePropItem(String key, Object objectAndItemsNullablePropItem) {
    if (this.objectAndItemsNullableProp == null) {
      this.objectAndItemsNullableProp = new HashMap<>();
    }
    this.objectAndItemsNullableProp.put(key, objectAndItemsNullablePropItem);
    return this;
  }

   /**
   * Get objectAndItemsNullableProp
   * @return objectAndItemsNullableProp
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getObjectAndItemsNullableProp() {
    return objectAndItemsNullableProp;
  }


  public void setObjectAndItemsNullableProp(Map<String, Object> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = objectAndItemsNullableProp;
  }


  public NullableClass objectItemsNullable(Map<String, Object> objectItemsNullable) {
    
    this.objectItemsNullable = objectItemsNullable;
    return this;
  }

  public NullableClass putObjectItemsNullableItem(String key, Object objectItemsNullableItem) {
    if (this.objectItemsNullable == null) {
      this.objectItemsNullable = new HashMap<>();
    }
    this.objectItemsNullable.put(key, objectItemsNullableItem);
    return this;
  }

   /**
   * Get objectItemsNullable
   * @return objectItemsNullable
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getObjectItemsNullable() {
    return objectItemsNullable;
  }


  public void setObjectItemsNullable(Map<String, Object> objectItemsNullable) {
    this.objectItemsNullable = objectItemsNullable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NullableClass nullableClass = (NullableClass) o;
    return Objects.equals(this.integerProp, nullableClass.integerProp) &&
        Objects.equals(this.numberProp, nullableClass.numberProp) &&
        Objects.equals(this.booleanProp, nullableClass.booleanProp) &&
        Objects.equals(this.stringProp, nullableClass.stringProp) &&
        Objects.equals(this.dateProp, nullableClass.dateProp) &&
        Objects.equals(this.datetimeProp, nullableClass.datetimeProp) &&
        Objects.equals(this.arrayNullableProp, nullableClass.arrayNullableProp) &&
        Objects.equals(this.arrayAndItemsNullableProp, nullableClass.arrayAndItemsNullableProp) &&
        Objects.equals(this.arrayItemsNullable, nullableClass.arrayItemsNullable) &&
        Objects.equals(this.objectNullableProp, nullableClass.objectNullableProp) &&
        Objects.equals(this.objectAndItemsNullableProp, nullableClass.objectAndItemsNullableProp) &&
        Objects.equals(this.objectItemsNullable, nullableClass.objectItemsNullable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(integerProp, numberProp, booleanProp, stringProp, dateProp, datetimeProp, arrayNullableProp, arrayAndItemsNullableProp, arrayItemsNullable, objectNullableProp, objectAndItemsNullableProp, objectItemsNullable);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullableClass {\n");
    sb.append("    integerProp: ").append(toIndentedString(integerProp)).append("\n");
    sb.append("    numberProp: ").append(toIndentedString(numberProp)).append("\n");
    sb.append("    booleanProp: ").append(toIndentedString(booleanProp)).append("\n");
    sb.append("    stringProp: ").append(toIndentedString(stringProp)).append("\n");
    sb.append("    dateProp: ").append(toIndentedString(dateProp)).append("\n");
    sb.append("    datetimeProp: ").append(toIndentedString(datetimeProp)).append("\n");
    sb.append("    arrayNullableProp: ").append(toIndentedString(arrayNullableProp)).append("\n");
    sb.append("    arrayAndItemsNullableProp: ").append(toIndentedString(arrayAndItemsNullableProp)).append("\n");
    sb.append("    arrayItemsNullable: ").append(toIndentedString(arrayItemsNullable)).append("\n");
    sb.append("    objectNullableProp: ").append(toIndentedString(objectNullableProp)).append("\n");
    sb.append("    objectAndItemsNullableProp: ").append(toIndentedString(objectAndItemsNullableProp)).append("\n");
    sb.append("    objectItemsNullable: ").append(toIndentedString(objectItemsNullable)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("integer_prop");
    openapiFields.add("number_prop");
    openapiFields.add("boolean_prop");
    openapiFields.add("string_prop");
    openapiFields.add("date_prop");
    openapiFields.add("datetime_prop");
    openapiFields.add("array_nullable_prop");
    openapiFields.add("array_and_items_nullable_prop");
    openapiFields.add("array_items_nullable");
    openapiFields.add("object_nullable_prop");
    openapiFields.add("object_and_items_nullable_prop");
    openapiFields.add("object_items_nullable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NullableClass
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NullableClass.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NullableClass is not found in the empty JSON string", NullableClass.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NullableClass.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NullableClass` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("string_prop") != null && !jsonObj.get("string_prop").isJsonNull()) && !jsonObj.get("string_prop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `string_prop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string_prop").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_nullable_prop") != null && !jsonObj.get("array_nullable_prop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_nullable_prop` to be an array in the JSON string but got `%s`", jsonObj.get("array_nullable_prop").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_and_items_nullable_prop") != null && !jsonObj.get("array_and_items_nullable_prop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_and_items_nullable_prop` to be an array in the JSON string but got `%s`", jsonObj.get("array_and_items_nullable_prop").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_items_nullable") != null && !jsonObj.get("array_items_nullable").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_items_nullable` to be an array in the JSON string but got `%s`", jsonObj.get("array_items_nullable").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NullableClass.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NullableClass' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NullableClass> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NullableClass.class));

       return (TypeAdapter<T>) new TypeAdapter<NullableClass>() {
           @Override
           public void write(JsonWriter out, NullableClass value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NullableClass read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NullableClass given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NullableClass
  * @throws IOException if the JSON string is invalid with respect to NullableClass
  */
  public static NullableClass fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NullableClass.class);
  }

 /**
  * Convert an instance of NullableClass to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

