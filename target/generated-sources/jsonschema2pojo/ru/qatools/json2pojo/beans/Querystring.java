
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
    "location",
    "key",
    "radius",
    "rankby"
})
public class Querystring {

    @JsonProperty("location")
    private String location;
    @JsonProperty("key")
    private String key;
    @JsonProperty("radius")
    private String radius;
    @JsonProperty("rankby")
    private String rankby;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public Querystring withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public Querystring withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("radius")
    public String getRadius() {
        return radius;
    }

    @JsonProperty("radius")
    public void setRadius(String radius) {
        this.radius = radius;
    }

    public Querystring withRadius(String radius) {
        this.radius = radius;
        return this;
    }

    @JsonProperty("rankby")
    public String getRankby() {
        return rankby;
    }

    @JsonProperty("rankby")
    public void setRankby(String rankby) {
        this.rankby = rankby;
    }

    public Querystring withRankby(String rankby) {
        this.rankby = rankby;
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

    public Querystring withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Querystring.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("radius");
        sb.append('=');
        sb.append(((this.radius == null)?"<null>":this.radius));
        sb.append(',');
        sb.append("rankby");
        sb.append('=');
        sb.append(((this.rankby == null)?"<null>":this.rankby));
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
        result = ((result* 31)+((this.rankby == null)? 0 :this.rankby.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.radius == null)? 0 :this.radius.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Querystring) == false) {
            return false;
        }
        Querystring rhs = ((Querystring) other);
        return ((((((this.rankby == rhs.rankby)||((this.rankby!= null)&&this.rankby.equals(rhs.rankby)))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.radius == rhs.radius)||((this.radius!= null)&&this.radius.equals(rhs.radius))))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))));
    }

}
