package com.application.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseDto {

	private String msg;
	private Date timestamp;

	public ResponseDto(String m, Date d) {
		msg = m;
		timestamp = d;
	}

}
