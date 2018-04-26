package com.ljw.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ljw.eureka.client.remote.NounClient;

@RestController
public class SentenceController {

	@Autowired
	private NounClient nounClient;

	@RequestMapping("/sentence")
	public @ResponseBody String getSentence(String name) {
		return "<h3>造句:</h3><br/>" + buildSentence(name) + "<br/><br/>" + buildSentence(name) + "<br/><br/>" + buildSentence(name)
				+ "<br/><br/>" + buildSentence() + "<br/><br/>" + buildSentence(name) + "<br/><br/>";
	}

	public String buildSentence(String name) {
		String sentence = "There was a problem assembling the sentence!";
		try {
			sentence = nounClient.getWord(name);
		} catch (Exception e) {
			System.out.println(e);
		}
		return sentence;
	}
	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		try {
			sentence = nounClient.getWord();
		} catch (Exception e) {
			System.out.println(e);
		}
		return sentence;
	}
}
