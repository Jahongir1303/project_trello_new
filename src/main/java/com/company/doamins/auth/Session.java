package com.company.doamins.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Session {
    public static SessionUser sessionUser;

    public static void setSessionUser(UserDTO session) {
        sessionUser = new SessionUser(session);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SessionUser {
        private Long id;
        private String email;
        private String role;

        public SessionUser(UserDTO session) {
            this.id = session.getId();
            this.email = session.getEmail();
            this.role = session.getRole();
        }
    }
}
