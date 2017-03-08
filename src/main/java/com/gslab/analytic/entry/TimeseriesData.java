package com.gslab.analytic.entry;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "timestamp", "value" })
public class TimeseriesData implements Comparable<TimeseriesData> {

	@JsonProperty("timestamp")
	String timestamp;

	@JsonProperty("value")
	Double value;

	@JsonProperty("timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@JsonProperty("value")
	public Double getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public int compareTo(TimeseriesData ts) {
		if (this.value > ts.getValue())
			return 1;
		else if (this.value < ts.getValue())
			return -1;
		else
			return 0;
	}

}
