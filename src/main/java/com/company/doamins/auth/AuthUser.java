package com.company.doamins.auth;


import com.company.doamins.Auditable;
import com.company.services.auth.AuthService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.jdbc.Work;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("auth_user")
@Table(name = "users", schema = "hr")
public class AuthUser extends Auditable {
    private String username;
    private String password;
    private Role role;
    private String email;
    private String imageUrl;
    @ManyToMany(targetEntity = AuthService.class,cascade = CascadeType.ALL)
    private List<AuthWorkSpace> workSpaceList = new ArrayList<>();
    @ManyToMany(targetEntity = AuthBoard.class,cascade = CascadeType.ALL)
    private List<AuthBoard> boardList = new ArrayList<>();
}
