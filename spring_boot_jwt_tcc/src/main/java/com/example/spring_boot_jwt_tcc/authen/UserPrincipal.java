package com.example.spring_boot_jwt_tcc.authen;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;




@Getter@Setter
public class UserPrincipal implements UserDetails {
    /**
	 * 
	 */
	private static final long serialVersionUID = -206338741896639452L;
	private Long userId;
    private String username;
    private String password;
    private Collection authorities;

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
