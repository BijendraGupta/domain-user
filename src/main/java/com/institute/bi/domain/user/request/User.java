/**

*

 */

package com.institute.bi.domain.user.request;

import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;

import lombok.AllArgsConstructor;

import lombok.Builder;

import lombok.Data;

import lombok.NoArgsConstructor;

/**
 * 
 * @author gupbi001
 *
 * 
 * 
 */

@Builder
@Data
@AllArgsConstructor
@JsonInclude(Include.NON_EMPTY)
public class User {

	@ApiModelProperty(notes = "User Id", name = "userId", required = true, value = "Userid/email Id")
	private String userId;

	private String emailId;

	private String password;

	private String userName;

}