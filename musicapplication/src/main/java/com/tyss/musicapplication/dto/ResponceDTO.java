package com.tyss.musicapplication.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("response")
@JsonPropertyOrder()
@XmlRootElement(name = "response")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponceDTO {
	@JsonProperty("status")
	@XmlElement(name = "status-code")
	private int statusCode;
	
	private String message;
	@JsonProperty("songs_info")
	@XmlElement(name = "songs_info")
	private List<MusicPlayerResponce> data;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<MusicPlayerResponce> getData() {
		return data;
	}
	public void setData(List<MusicPlayerResponce> data) {
		this.data = data;
	}
	

}
