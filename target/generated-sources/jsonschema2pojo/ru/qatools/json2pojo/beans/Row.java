
package ru.qatools.json2pojo.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "date",
    "k_all",
    "k_found",
    "newString",
    "type_name"
})
public class Row {

    @JsonProperty("number")
    private Integer number;
    @JsonProperty("date")
    private Integer date;
    @JsonProperty("k_all")
    private String kAll;
    @JsonProperty("k_found")
    private String kFound;
    @JsonProperty("newString")
    private String newString;
    @JsonProperty("type_name")
    private String typeName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    public Row withNumber(Integer number) {
        this.number = number;
        return this;
    }

    @JsonProperty("date")
    public Integer getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Integer date) {
        this.date = date;
    }

    public Row withDate(Integer date) {
        this.date = date;
        return this;
    }

    @JsonProperty("k_all")
    public String getkAll() {
        return kAll;
    }

    @JsonProperty("k_all")
    public void setkAll(String kAll) {
        this.kAll = kAll;
    }

    public Row withkAll(String kAll) {
        this.kAll = kAll;
        return this;
    }

    @JsonProperty("k_found")
    public String getkFound() {
        return kFound;
    }

    @JsonProperty("k_found")
    public void setkFound(String kFound) {
        this.kFound = kFound;
    }

    public Row withkFound(String kFound) {
        this.kFound = kFound;
        return this;
    }

    @JsonProperty("newString")
    public String getNewString() {
        return newString;
    }

    @JsonProperty("newString")
    public void setNewString(String newString) {
        this.newString = newString;
    }

    public Row withNewString(String newString) {
        this.newString = newString;
        return this;
    }

    @JsonProperty("type_name")
    public String getTypeName() {
        return typeName;
    }

    @JsonProperty("type_name")
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Row withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Row withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Row.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("kAll");
        sb.append('=');
        sb.append(((this.kAll == null)?"<null>":this.kAll));
        sb.append(',');
        sb.append("kFound");
        sb.append('=');
        sb.append(((this.kFound == null)?"<null>":this.kFound));
        sb.append(',');
        sb.append("newString");
        sb.append('=');
        sb.append(((this.newString == null)?"<null>":this.newString));
        sb.append(',');
        sb.append("typeName");
        sb.append('=');
        sb.append(((this.typeName == null)?"<null>":this.typeName));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.kFound == null)? 0 :this.kFound.hashCode()));
        result = ((result* 31)+((this.kAll == null)? 0 :this.kAll.hashCode()));
        result = ((result* 31)+((this.typeName == null)? 0 :this.typeName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.newString == null)? 0 :this.newString.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Row) == false) {
            return false;
        }
        Row rhs = ((Row) other);
        return ((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.kFound == rhs.kFound)||((this.kFound!= null)&&this.kFound.equals(rhs.kFound))))&&((this.kAll == rhs.kAll)||((this.kAll!= null)&&this.kAll.equals(rhs.kAll))))&&((this.typeName == rhs.typeName)||((this.typeName!= null)&&this.typeName.equals(rhs.typeName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.newString == rhs.newString)||((this.newString!= null)&&this.newString.equals(rhs.newString))));
    }

}
