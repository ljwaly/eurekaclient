package com.ljw.eureka.client.remote;

import org.springframework.stereotype.Component;

@Component
public class NounClientHystrix implements NounClient{

	public String getWord(String name) {
		System.out.println("error");
		return null;
	}

	public String getWord() {
		System.out.println("error0");
		return null;
	}

}
