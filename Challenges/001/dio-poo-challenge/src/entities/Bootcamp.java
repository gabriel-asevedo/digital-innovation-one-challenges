package entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String name;
	private String description;
	private final LocalDate initialDate = LocalDate.now();
	private final LocalDate finalDate = initialDate.plusDays(45);
	private Set<Dev> subscribedDevelopers = new HashSet<>();
	private Set<Content> contents = new LinkedHashSet<>();

	public Bootcamp() {
	}

	public Bootcamp(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Dev> getSubscribedDevelopers() {
		return subscribedDevelopers;
	}

	public void setSubscribedDevelopers(Set<Dev> subscribedDevelopers) {
		this.subscribedDevelopers = subscribedDevelopers;
	}

	public Set<Content> getContents() {
		return contents;
	}

	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}

	public LocalDate getInitialDate() {
		return initialDate;
	}

	public LocalDate getFinalDate() {
		return finalDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contents, description, finalDate, initialDate, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(description, other.description)
				&& Objects.equals(finalDate, other.finalDate) && Objects.equals(initialDate, other.initialDate)
				&& Objects.equals(name, other.name);
	}

}
