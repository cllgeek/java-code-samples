package org.geekjc.jdbctemplate;

/**
 * @author ll
 * @date 2019年09月27日 11:32 AM
 */
public class Book {
    private Long id;
    private String address;
    private String username;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
