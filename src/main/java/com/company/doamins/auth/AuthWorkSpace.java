package com.company.doamins.auth;

import com.company.doamins.Auditable;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("auth_workspace")
public class AuthWorkSpace extends Auditable {
    private String title;
    @ManyToMany
    private List<AuthBoard> boardList = new ArrayList<>();
    @ManyToMany
    private List<AuthUser> userList = new ArrayList<>();
    private boolean isVisible;

}
