package com.ljw.eureka.client.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codahale.metrics.annotation.Timed;

@FeignClient(value="noun", fallback = NounClientHystrix.class)
public interface NounClient {

	@Timed
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String getWord(@RequestParam("name") String name);
	
	@Timed
	@RequestMapping(value = "/hi0", method = RequestMethod.GET)
	public String getWord();
}
