//package vp.compshop.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import vp.compshop.model.user.SecurityUser;
//import vp.compshop.repository.UserRepository;
//
//import java.util.Collections;
//import java.util.List;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
//        final SecurityUser user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException(String.format("No user found with username '%s'.", username)));
//        final List<GrantedAuthority> grantedAuthorities = Collections.singletonList(new SimpleGrantedAuthority(user.getRole().name()));
//
//        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
//    }
//
//}
