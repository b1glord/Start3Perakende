/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.set.start3perakende;

import javax.persistence.*;

@Entity
@Table(name="L_CAPIUSER")
public class User {
    
	@Column(name="NAME")
	private String NAME;
        
        public void setName(String name) {
	this.NAME = NAME;
	}
}