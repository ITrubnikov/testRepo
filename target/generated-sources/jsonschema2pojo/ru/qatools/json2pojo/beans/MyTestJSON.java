
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
    "current_page",
    "rows_per_page",
    "page_count",
    "rows_count",
    "rows"
})
public class MyTestJSON {

    @JsonProperty("current_page")
    private Integer currentPage;
    @JsonProperty("rows_per_page")
    private Integer rowsPerPage;
    @JsonProperty("page_count")
    private Integer pageCount;
    @JsonProperty("rows_count")
    private Integer rowsCount;
    @JsonProperty("rows")
    private List<Row> rows = new ArrayList<Row>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("current_page")
    public Integer getCurrentPage() {
        return currentPage;
    }

    @JsonProperty("current_page")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public MyTestJSON withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    @JsonProperty("rows_per_page")
    public Integer getRowsPerPage() {
        return rowsPerPage;
    }

    @JsonProperty("rows_per_page")
    public void setRowsPerPage(Integer rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }

    public MyTestJSON withRowsPerPage(Integer rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
        return this;
    }

    @JsonProperty("page_count")
    public Integer getPageCount() {
        return pageCount;
    }

    @JsonProperty("page_count")
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public MyTestJSON withPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    @JsonProperty("rows_count")
    public Integer getRowsCount() {
        return rowsCount;
    }

    @JsonProperty("rows_count")
    public void setRowsCount(Integer rowsCount) {
        this.rowsCount = rowsCount;
    }

    public MyTestJSON withRowsCount(Integer rowsCount) {
        this.rowsCount = rowsCount;
        return this;
    }

    @JsonProperty("rows")
    public List<Row> getRows() {
        return rows;
    }

    @JsonProperty("rows")
    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public MyTestJSON withRows(List<Row> rows) {
        this.rows = rows;
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

    public MyTestJSON withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MyTestJSON.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currentPage");
        sb.append('=');
        sb.append(((this.currentPage == null)?"<null>":this.currentPage));
        sb.append(',');
        sb.append("rowsPerPage");
        sb.append('=');
        sb.append(((this.rowsPerPage == null)?"<null>":this.rowsPerPage));
        sb.append(',');
        sb.append("pageCount");
        sb.append('=');
        sb.append(((this.pageCount == null)?"<null>":this.pageCount));
        sb.append(',');
        sb.append("rowsCount");
        sb.append('=');
        sb.append(((this.rowsCount == null)?"<null>":this.rowsCount));
        sb.append(',');
        sb.append("rows");
        sb.append('=');
        sb.append(((this.rows == null)?"<null>":this.rows));
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
        result = ((result* 31)+((this.pageCount == null)? 0 :this.pageCount.hashCode()));
        result = ((result* 31)+((this.rowsCount == null)? 0 :this.rowsCount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.currentPage == null)? 0 :this.currentPage.hashCode()));
        result = ((result* 31)+((this.rows == null)? 0 :this.rows.hashCode()));
        result = ((result* 31)+((this.rowsPerPage == null)? 0 :this.rowsPerPage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MyTestJSON) == false) {
            return false;
        }
        MyTestJSON rhs = ((MyTestJSON) other);
        return (((((((this.pageCount == rhs.pageCount)||((this.pageCount!= null)&&this.pageCount.equals(rhs.pageCount)))&&((this.rowsCount == rhs.rowsCount)||((this.rowsCount!= null)&&this.rowsCount.equals(rhs.rowsCount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.currentPage == rhs.currentPage)||((this.currentPage!= null)&&this.currentPage.equals(rhs.currentPage))))&&((this.rows == rhs.rows)||((this.rows!= null)&&this.rows.equals(rhs.rows))))&&((this.rowsPerPage == rhs.rowsPerPage)||((this.rowsPerPage!= null)&&this.rowsPerPage.equals(rhs.rowsPerPage))));
    }

}
