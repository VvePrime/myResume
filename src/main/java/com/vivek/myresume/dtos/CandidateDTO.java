package com.vivek.myresume.dtos;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class CandidateDTO {

	 	private String name;
	    
	    private String email;

	    private String summary;

	    private Integer experienceInMonths;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public Integer getExperienceInMonths() {
			return experienceInMonths;
		}

		public void setExperienceInMonths(Integer experienceInMonths) {
			this.experienceInMonths = experienceInMonths;
		}

		@Override
		public int hashCode() {
			return Objects.hash(email, experienceInMonths, name, summary);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CandidateDTO other = (CandidateDTO) obj;
			return Objects.equals(email, other.email) && Objects.equals(experienceInMonths, other.experienceInMonths)
					&& Objects.equals(name, other.name) && Objects.equals(summary, other.summary);
		}

		public CandidateDTO(String name, String email, String summary, Integer experienceInMonths) {
			super();
			this.name = name;
			this.email = email;
			this.summary = summary;
			this.experienceInMonths = experienceInMonths;
		}

		public CandidateDTO() {	}
	    
	    
	    
}
