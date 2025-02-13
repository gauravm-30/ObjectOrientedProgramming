package com.java.equalsAndHashcode;

import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private Address address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person)o ;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, address);
    }

    private static class Address {
        private String houseNo;
        private String landmark;
        private String pincode;
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Address address = (Address) o;
            return Objects.equals(houseNo, address.houseNo) && Objects.equals(landmark, address.landmark) && Objects.equals(pincode, address.pincode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(houseNo, landmark, pincode);
        }

    }
}


