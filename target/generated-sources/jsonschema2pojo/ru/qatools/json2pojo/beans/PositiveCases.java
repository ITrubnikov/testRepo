
package ru.qatools.json2pojo.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "querystring",
    "statuses"
})
public class PositiveCases {

    @JsonProperty("querystring")
    private List<Querystring> querystring = new ArrayList<Querystring>();
    @JsonProperty("statuses")
    private List<Status> statuses = new ArrayList<Status>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("querystring")
    public List<Querystring> getQuerystring() {
        return querystring;
    }

    @JsonProperty("querystring")
    public void setQuerystring(List<Querystring> querystring) {
        this.querystring = querystring;
    }

    public PositiveCases withQuerystring(List<Querystring> querystring) {
        this.querystring = querystring;
        return this;
    }

    @JsonProperty("statuses")
    public List<Status> getStatuses() {
        return statuses;
    }

    @JsonProperty("statuses")
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public PositiveCases withStatuses(List<Status> statuses) {
        this.statuses = statuses;
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

    public PositiveCases withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositiveCases.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("querystring");
        sb.append('=');
        sb.append(((this.querystring == null)?"<null>":this.querystring));
        sb.append(',');
        sb.append("statuses");
        sb.append('=');
        sb.append(((this.statuses == null)?"<null>":this.statuses));
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
        result = ((result* 31)+((this.querystring == null)? 0 :this.querystring.hashCode()));
        result = ((result* 31)+((this.statuses == null)? 0 :this.statuses.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositiveCases) == false) {
            return false;
        }
        PositiveCases rhs = ((PositiveCases) other);
        return ((((this.querystring == rhs.querystring)||((this.querystring!= null)&&this.querystring.equals(rhs.querystring)))&&((this.statuses == rhs.statuses)||((this.statuses!= null)&&this.statuses.equals(rhs.statuses))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
