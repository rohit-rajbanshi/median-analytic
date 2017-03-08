package com.gslab.analytic.entry;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.gslab.analytic.response.MedianResponse;

/**
 * @author Rohit Rajbanshi
 */

public class MedianEntryPoint {

	Logger LOG = LoggerFactory.getLogger(MedianEntryPoint.class);
	ObjectMapper mapper = new ObjectMapper();

	public String findMedian(String jsonStr) throws JsonProcessingException, IOException {

		List<TimeseriesData> data = mapper.readValue(jsonStr, mapper.getTypeFactory().constructCollectionType(List.class, TimeseriesData.class));
		Collections.sort(data);
		Double value = 0.0;
		String ts = "";

		ts = data.get(data.size() / 2).getTimestamp();
		value = data.get(data.size() / 2).getValue();

		MedianResponse response = new MedianResponse();
		response.setTstamp(ts);
		response.setMed_value(value);

		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		return mapper.writeValueAsString(response);
	}
}
