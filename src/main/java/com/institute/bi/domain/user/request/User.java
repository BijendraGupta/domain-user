/**

*

 */

package com.institute.bi.domain.user.request;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;

import lombok.AllArgsConstructor;

import lombok.Builder;

import lombok.Data;

import lombok.NoArgsConstructor;

/**
 * 
 * @author bijendra
 *
 * 
 * 
 */

@Builder
@Data
@AllArgsConstructor
@JsonInclude(Include.NON_EMPTY)
public class User {

	@ApiModelProperty(notes = "emailId", name = "emailId", required = true, value = "emailId")
	private String emailId;

	@ApiModelProperty(notes = "password", name = "password", required = true, value = "password")
	private String password;

	@ApiModelProperty(notes = "mobileNo", name = "mobileNo", required = true, value = "mobileNo")
	private String mobileNo;

	@ApiModelProperty(notes = "createdDate", name = "createdDate", required = true, value = "createdDate")
	private Timestamp createdDate;

	@ApiModelProperty(notes = "isActive", name = "isActive", required = true, value = "isActive")
	private boolean isActive;

}
