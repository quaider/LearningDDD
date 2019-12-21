package org.example.userDDD.domain.entity;

import org.example.userDDD.domain.entity.valueObject.IdentityType;

public class UserLogin {
    private int id;
    private IdentityType identityType;
    private String identity;
    private String credential;

    public UserLogin(IdentityType identityType, String identity, String credential) {
        this.identityType = identityType;
        this.identity = identity;
        this.credential = credential;
    }

    public static UserLogin fromMobile(String mobile, String password) {
        return new UserLogin(IdentityType.MOBILE, mobile, password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IdentityType getIdentityType() {
        return identityType;
    }

    public void setIdentityType(IdentityType identityType) {
        this.identityType = identityType;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }
}
