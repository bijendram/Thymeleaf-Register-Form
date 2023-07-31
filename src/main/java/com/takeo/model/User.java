package com.takeo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*@Setter
@Getter
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
private int id;

private String firstName;
private String lastName;
private String email;
private String userName;
private String passWord;


}
