package week8.Ex9;

import java.util.Objects;

public class RegistrationPlate {
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.country = country;
        this.regCode = regCode;
    }

    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof RegistrationPlate)) return false;
        RegistrationPlate other = (RegistrationPlate) obj;
        return this.country.equals(other.country) && this.regCode.equals(other.regCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, regCode);
    }
}
