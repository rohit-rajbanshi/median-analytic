package com.gslab.analytic;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.gslab.analytic.entry.MedianEntryPoint;

public class MedianAnalyticsTest {

	public static void main(String[] args) throws JsonProcessingException, IOException {
		MedianEntryPoint pt = new MedianEntryPoint();
		String res = pt.findMedian(
				"[\r\n\t{\r\n\t\t\"timestamp\": \"1488704460881\",\r\n\t\t\"value\": 35.126\r\n\t},\r\n\t{\r\n\t\"timestamp\": \"1488704460981\",\r\n\t\"value\": 31.126\r\n\t},\r\n\t{\r\n\t\t\"timestamp\":\"1488704460991\",\r\n\t\t\"value\":30.126\r\n\t},\r\n\t{\r\n\t\t\"timestamp\":\"1488704460995\",\r\n\t\t\"value\":32.126\r\n\t},\r\n\t{\r\n\t\t\"timestamp\":\"1488704460999\",\r\n\t\t\"value\":33.126\r\n\t}\r\n]\r\n\r\n");
		System.out.println(res);
	}

}
